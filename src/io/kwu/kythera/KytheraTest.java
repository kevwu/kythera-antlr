package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraLexer;
import io.kwu.kythera.antlr.KytheraParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;

public class KytheraTest {
	@Before
	public void setUp() {

	}

	@After
	public void tearDown() {

	}

	/**
	 * Simple literals of all kinds
	 */
	@Test
	public void literalTest() {
		try {
			KytheraLexer lexer = new KytheraLexer(CharStreams.fromFileName("tests/literals.ky"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			KytheraParser parser = new KytheraParser(tokenStream);
			parser.addErrorListener(new TestErrorListener());

			KytheraVisitor visitor = new KytheraVisitor(parser);

			KytheraParser.ProgramContext program = parser.program();

			int i = 0;

			// int literal
			assertEquals(new Value.IntVal(10), program.expression(i++).accept(visitor));
			assertEquals(new Value.TypeVal(Type.intType), program.expression(i++).accept(visitor));

			// float literal
			assertEquals(new Value.FloatVal(3.14159), program.expression(i++).accept(visitor));
			assertEquals(new Value.TypeVal(Type.floatType), program.expression(i++).accept(visitor));

			// null literal
			assertEquals(new Value.Null(), program.expression(i++).accept(visitor));
			assertEquals(new Value.TypeVal(Type.nullType), program.expression(i++).accept(visitor));

			// string literal
			assertEquals(new Value.StrVal("hello"), program.expression(i++).accept(visitor));
			assertEquals(new Value.TypeVal(Type.strType), program.expression(i++).accept(visitor));

			// obj literal
			// skip for now
			i += 2;

			// arithmetic
			assertEquals(new Value.IntVal(4), program.expression(i++).accept(visitor));
			assertEquals(new Value.FloatVal(5.85987), program.expression(i++).accept(visitor));

			// boolean operations
			assertEquals(Values.TRUE, program.expression(i++).accept(visitor));
			assertEquals(Values.FALSE, program.expression(i++).accept(visitor));

			assertEquals(Values.TRUE, program.expression(i++).accept(visitor));
			assertEquals(Values.FALSE, program.expression(i++).accept(visitor));

			assertEquals(Values.TRUE, program.expression(i++).accept(visitor));
			assertEquals(Values.TRUE, program.expression(i++).accept(visitor));

		} catch(IOException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests basic operations of variables - assignment, retrieval, typing
	 */
	@Test
	public void varTest() {
		try {
			KytheraLexer lexer = new KytheraLexer(CharStreams.fromFileName("tests/vars.ky"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			KytheraParser parser = new KytheraParser(tokenStream);
			parser.addErrorListener(new TestErrorListener());

			KytheraVisitor visitor = new KytheraVisitor(parser);

			KytheraParser.ProgramContext program = parser.program();

			int i = 0;
			/* bool variable */
			// result of declaration
			assertEquals(new Value.BoolVal(false), program.expression(i++).accept(visitor));

			// read
			assertEquals(new Value.BoolVal(false), program.expression(i++).accept(visitor));

			// result of assignment
			assertEquals(new Value.BoolVal(true), program.expression(i++).accept(visitor));

			// read
			assertEquals(new Value.BoolVal(true), program.expression(i++).accept(visitor));

			/* int variable */
			// result of declaration
			assertEquals(new Value.IntVal(99), program.expression(i++).accept(visitor));

			// read
			assertEquals(new Value.IntVal(99), program.expression(i++).accept(visitor));

			// in-place arithmetic
			assertEquals(new Value.IntVal(109), program.expression(i++).accept(visitor));

			// assignment
			assertEquals(new Value.IntVal(3), program.expression(i++).accept(visitor));

			/* float variable */
			// result of declaration
			assertEquals(new Value.FloatVal(3.14159), program.expression(i++).accept(visitor));

			// read
			assertEquals(new Value.FloatVal(3.14159), program.expression(i++).accept(visitor));

			/* str variable */
			// declaration
			assertEquals(new Value.StrVal("hello"), program.expression(i++).accept(visitor));

			// read
			assertEquals(new Value.StrVal("hello"), program.expression(i++).accept(visitor));

			/* null */
			assertEquals(Values.NULL, program.expression(i++).accept(visitor));
			assertEquals(Values.NULL, program.expression(i++).accept(visitor));

			// while we're here - let's make sure that all null values are the same
			assertEquals(new Value.Null(), Values.NULL);

			/* fn variable */
			// skip for now
			i += 1;

			/* Using "new" */
			assertEquals(new Value.IntVal(0), program.expression(i++).accept(visitor));
			assertEquals(new Value.FloatVal(0.0), program.expression(i++).accept(visitor));
			assertEquals(new Value.BoolVal(false), program.expression(i++).accept(visitor));
			assertEquals(new Value.StrVal(""), program.expression(i++).accept(visitor));

			// TODO test for proper exception thrown for wrong assignment
		} catch(IOException e) {
			e.printStackTrace();
			fail();
		}

	}

	/**
	 * Test type equality and comparison
	 */
	@Test
	public void typeTest() {
		try {
			KytheraLexer lexer = new KytheraLexer(CharStreams.fromFileName("tests/types.ky"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			KytheraParser parser = new KytheraParser(tokenStream);
			parser.addErrorListener(new TestErrorListener());

			KytheraVisitor visitor = new KytheraVisitor(parser);
			KytheraTypeVisitor typeVisitor = new KytheraTypeVisitor(visitor);

			KytheraParser.ProgramContext program = parser.program();

			int i = 0;

			// basic TypeVisitor functionality
			assertEquals(Type.intType, program.expression(i++).type().accept(typeVisitor));
			assertEquals(Type.floatType, program.expression(i++).type().accept(typeVisitor));
			assertEquals(Type.strType, program.expression(i++).type().accept(typeVisitor));
			assertEquals(Type.nullType, program.expression(i++).type().accept(typeVisitor));


			assertEquals(new Value.TypeVal(Type.intType), program.expression(i++).accept(visitor));
			assertEquals(new Value.TypeVal(new Type.FnType(
				new ArrayList(Arrays.asList(Type.intType)),
				Type.strType
			)), program.expression(i++).accept(visitor));
			assertEquals(new Value.TypeVal(new Type.ObjRigidType(
				new HashSet<Identifier>(
					Arrays.asList(
						new Identifier("a", Type.intType),
						new Identifier("b", Type.strType)
					)
				)
			)), program.expression(i++).accept(visitor));
		} catch(IOException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Object type casting and type comparison
	 */
	@Test
	public void objTypeTest() {
		try {
			KytheraLexer lexer = new KytheraLexer(CharStreams.fromFileName("tests/objtypes.ky"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			KytheraParser parser = new KytheraParser(tokenStream);
			parser.addErrorListener(new TestErrorListener());

			KytheraVisitor visitor = new KytheraVisitor(parser);

			KytheraParser.ProgramContext program = parser.program();
		} catch(IOException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Function behavior, calls, and scoping
	 */
	@Test
	public void fnTest() {
		try {
			KytheraLexer lexer = new KytheraLexer(CharStreams.fromFileName("tests/fn.ky"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			KytheraParser parser = new KytheraParser(tokenStream);
			parser.addErrorListener(new TestErrorListener());

			KytheraVisitor visitor = new KytheraVisitor(parser);

			KytheraParser.ProgramContext program = parser.program();
		} catch(IOException e) {
			e.printStackTrace();
			fail();
		}
	}

	private static class TestErrorListener implements ANTLRErrorListener {
		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
			System.out.println("Parse error.");
			fail();
		}

		@Override
		public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
			System.out.println("Parse ambiguity: ");
			System.out.println(dfa.toString(parser.getVocabulary()));
		}

		@Override
		public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

		}

		@Override
		public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

		}
	}
}
