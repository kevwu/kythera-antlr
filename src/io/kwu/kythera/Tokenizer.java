package io.kwu.kythera;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creates a stream of tokens.
 */
public class Tokenizer {
	CharStreamReader cStream;

	public Tokenizer(String filePath) {
		cStream = new CharStreamReader(filePath);
	}

	/**
	 * @return the next token in the feed, or null if it's the end.
	 */
	public Token read_token() {
		if (this.cStream.eof) {
			return null;
		}

		char c = this.cStream.next();
		String cs; // cs = character as string

		// consumables (text that isn't turned into a token)
		while (c == ' ' || c == '\t' || c == '\n' || c == '/') {
			// consume whitespace
			if (c == ' ' || c == '\t' || c == '\n') {
				c = this.cStream.next();
				while (c == ' ' || c == '\t' || c == '\n') {
					c = this.cStream.next();
				}
			} else // single-line comment
				if (c == '/' && this.cStream.peek() == '/') {
					c = this.cStream.next();
					while (c != '\n') {
						c = this.cStream.next();
					}

					// consume the newline as well
					c = this.cStream.next();
				} else
					// multi-line comment
					if (c == '/' && this.cStream.peek() == '*') {
						// consume until */ found
						c = this.cStream.next();
						while (!(c == '*' && this.cStream.peek() == '/')) {
							c = this.cStream.next();
						}

						// advance past the closing */
						c = this.cStream.next();

						// consume newline
						c = this.cStream.next();
					}
		}

		// set cs after consuming has been done. (whitespace/comment consumption does not need the String form)
		cs = Character.toString(c);

		// newline
		if (c == '\n') {
			return new Token(TokenKind.EOL, cs);
		}

		// punctuation
		if (("[]{}()").contains(cs)) {
			return new Token(TokenKind.PUNCT, cs);
		}

		// operator
		if (("<>=!+-/*%").contains(cs)) {
			String opString;

			char p = this.cStream.peek();
			// as it turns out, every single one of these characters could be followed by = to make a valid operator.

			if (p == '=') {
				this.cStream.next();
				return new Token(TokenKind.OPERATOR, cs + p);
			} else {
				return new Token(TokenKind.OPERATOR, cs);
			}
		}

		// number
		if (("0123456789").contains(cs)) {
			String numString = cs;

			// whether a decimal has been encountered
			boolean decimalSeen = false;

			// keep reading until we get something that's not a number
			if (!this.cStream.eof) {
				char n = this.cStream.next();
				while (!this.cStream.eof && (("0123456789").contains(Character.toString(n)) || (n == '.' && !decimalSeen))) {
					numString = numString.concat(Character.toString(n));
					n = this.cStream.next();
				}
			}
			return new Token(TokenKind.NUMBER, numString);
		}

		// string
		if (c == '"') {
			// wheeeeee
			String stringString = cs;

			// keep reading until unescaped
			if (!this.cStream.eof) {
				char n = this.cStream.next();
				while (!this.cStream.eof && n != '"') {
					stringString = stringString.concat(Character.toString(n));
					n = this.cStream.next();
				}

				// grab closing brace
				if (!this.cStream.eof) {
					stringString = stringString.concat(Character.toString(n));
				} else {
					// unexpected EOF
					// TODO standardize token errors
					System.out.println("Error: Unexpected EOF");
				}
			}

			// consume closing bracket

			return new Token(TokenKind.STRING, stringString);
		}

		// TODO keywords need to be defined elsewhere. This is not the place for that.
		final List<String> keywords = new ArrayList<>(Arrays.asList(
			"true", "false",
			"type", "typeof",
			"int", "float", "str", "fn", "obj",
			"let", "new", "name",
			"if", "for", "while",
			"extends", "implements", "interface",
			"import", "export", "include",
			"return"
		));

		String word = cs;

		// either a keyword or an identifier. Read in the whole thing

		if (!this.cStream.eof) {
			char n = this.cStream.next();
			while (!this.cStream.eof && !("[]{}()<>=+-/*% \t\n").contains(Character.toString(n))) {
				word = word.concat(Character.toString(n));
				n = this.cStream.next();
			}
		}

		if (keywords.contains(word)) {
			return new Token(TokenKind.KEYWORD, word);
		} else {
			return new Token(TokenKind.VARIABLE, word);
		}
	}

	/**
	 * stream-like behavior for handling the input file.
	 */
	public class CharStreamReader {
		private String raw;
		private int pos = 0;
		private int col = 0;
		private int line = 1;
		private boolean eof = false;

		public CharStreamReader(String filePath) {
			// plain and simple, will worry about using streams for bigger files later
			try {
				raw = new String(Files.readAllBytes(Paths.get(filePath)));
			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
				System.out.println(e);
			} catch (IOException e) {
				System.out.println(e);
			}
		}

		public char peek() {
			if (eof) {
				System.out.println("Cannot peek, EOF!");
				System.out.println(raw.length() + "," + pos);
				return (char) -1;
			}
//			System.out.println("Peeking " + raw.charAt(pos));
			return raw.charAt(pos);
		}

		public char next() {
			if (eof) {
				System.out.println("Cannot next, EOF!");
				System.out.println(raw.length() + "," + pos);
				return (char) -1;
			}

			char c = raw.charAt(pos);
//			System.out.println("Nexting " + c);

			if (c == '\n') {
				line += 1;
				col = 0;
			} else {
				col += 1;
			}

			pos += 1;

			if (pos >= raw.length()) {
//				System.out.println("Reached EOF.");
				eof = true;
			}

			return c;
		}

		public boolean eof() {
			return eof;
		}

		public String loc() {
			return "pos: " + pos + ", line " + line + " col " + col;
		}
	}

}
