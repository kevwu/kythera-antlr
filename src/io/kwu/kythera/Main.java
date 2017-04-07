package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraLexer;
import io.kwu.kythera.antlr.KytheraParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
	public static void main(String[] args) {
		if(args.length == 1) {
			try {
//				KytheraLexer lexer = new KytheraLexer(new ANTLRFileStream(args[0]));
				KytheraLexer lexer = new KytheraLexer(new ANTLRInputStream("let a = 0"));
				CommonTokenStream tokenStream = new CommonTokenStream(lexer);
				KytheraParser parser = new KytheraParser(tokenStream);
				ParseTree t = parser.expression();
			} catch(Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("Usage: kythera [program.ky]");
		}
	}
}
