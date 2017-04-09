package io.kwu.kythera;

import io.kwu.kythera.antlr.KytheraLexer;
import io.kwu.kythera.antlr.KytheraParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
	public static void main(String[] args) {
		if(args.length == 1) {
			try {
				KytheraLexer lexer = new KytheraLexer(new ANTLRFileStream(args[0]));
				CommonTokenStream tokenStream = new CommonTokenStream(lexer);
				KytheraParser parser = new KytheraParser(tokenStream);
				ParserRuleContext tree = parser.program();
//				ParseTreeWalker walker = new ParseTreeWalker();
				ParseTreeWalker.DEFAULT.walk(new KytheraWalker(parser), tree);
			} catch(Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("Usage: kythera [program.ky]");
		}
	}
}
