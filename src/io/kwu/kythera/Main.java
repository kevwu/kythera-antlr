package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraBaseVisitor;
import io.kwu.kythera.antlr.KytheraLexer;
import io.kwu.kythera.antlr.KytheraParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

public class Main {
	public static void main(String[] args) {
		if(args.length == 1) {
			try {
				KytheraLexer lexer = new KytheraLexer(new ANTLRFileStream(args[0]));
				lexer.addErrorListener(new ANTLRErrorListener() {
					@Override
					public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
						System.out.println("Token error.");
					}

					@Override
					public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
						System.out.println("Token ambiguity.");
					}

					@Override
					public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

					}

					@Override
					public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

					}
				});
				CommonTokenStream tokenStream = new CommonTokenStream(lexer);
				KytheraParser parser = new KytheraParser(tokenStream);
				parser.addErrorListener(new ANTLRErrorListener() {
					@Override
					public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
						System.out.println("Parse error.");
					}

					@Override
					public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
						System.out.println("Parse ambiguity: ");
//						System.out.println(dfa.toString(parser.getVocabulary()));
						Token decisionStart = parser.getInputStream().get(i);
						Token ambiguityStart = parser.getInputStream().get(i1);

						System.out.println("Decision start: " + decisionStart.getText() + " at " + decisionStart.getLine() + "," + decisionStart.getCharPositionInLine());
						System.out.println("Ambiguity start: " + ambiguityStart.getText() + " at " + decisionStart.getLine() + "," + decisionStart.getCharPositionInLine());
						System.out.println();
					}

					@Override
					public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

					}

					@Override
					public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

					}
				});
				ParserRuleContext tree = parser.program();
				KytheraBaseVisitor visitor = new KytheraVisitor(parser);
				System.out.println(tree.toStringTree(parser));
				visitor.visit(tree);
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Usage: kythera [program.ky]");
		}
	}
}
