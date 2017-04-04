package io.kwu.kythera;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Tokenizer {
	CharStreamReader cStream;

	public Tokenizer() {

	}

	public void read(String filePath) {
		cStream = new CharStreamReader(filePath);
	}

	public Token read_token() {
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
