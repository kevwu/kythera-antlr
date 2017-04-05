package io.kwu.kythera;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

/**
 * Creates a stream of tokens.
 */
public class Tokenizer {
	CharStreamReader cStream;

	public Tokenizer() {

	}

	public void read(String filePath) {
		cStream = new CharStreamReader(filePath);
	}

	/**
	 *
	 * @return the next token in the feed, or null if it's the end.
	 */
	public Token read_token() {
		if(this.cStream.eof) {
			System.out.println("End of file.");
			return null;
		}

		// TODO I know there must be better ways to do this, I just want it to work first.

		char c = this.cStream.next();
		System.out.println("Got " + c);

		String cs = Character.toString(c);

		// punctuation
		if(("[]{}()").contains(cs)) {

			return new Token(TokenKind.PUNC, cs);
		}

		// operator
		if(("<>=!+-/*%").contains(cs)) {

		}

		// number
		if(("0123456789").contains(cs)) {
			// number

			// whether a decimal has been encountered
			boolean decimal = false;

			// keep reading until we get something that's not a number
		}

		// string
		if(c == '"') {
			// keep reading until unescaped "
		}

		// TODO keywords need to be defined elsewhere. This is not the place for that.
		final String keywords = "true false type typeof let if for while extends implements interface import export include";

		// keyword
		if(keywords.contains(cs)) {

		}

		// identifier
		if(("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").contains(cs)) {

			// keep reading as long as it's alphanumeric, including - or _
		}


		return null;
	}


	/**
	 * For handling stream-like behavior for the input file.
	 */
	public class CharStreamReader {
		private String raw;
		private int pos = 0;
		private int col = 0;
		private int line = 0;
		private boolean eof;

		public CharStreamReader(String filePath) {
			// plain and simple, will worry about using streams for bigger files later
			try {
				raw = new String(Files.readAllBytes(Paths.get(filePath)));
			} catch(FileNotFoundException e) {
				System.out.println("File not found.");
				System.out.println(e);
			} catch(IOException e) {
				System.out.println(e);
			}
		}

		public char peek() {
			return raw.charAt(pos);
		}

		public char next() {
			char c = raw.charAt(pos);

			if(c == '\n') {
				line += 1;
				col = 0;
			} else {
				col += 1;
			}

			pos += 1;
			return c;
		}

		public boolean eof() {
			return pos == raw.length();
		}

		public String loc() {
			return "pos: " + pos + ", line " + line + " col " + col;
		}
	}

}
