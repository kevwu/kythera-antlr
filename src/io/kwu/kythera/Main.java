package io.kwu.kythera;

public class Main {
    public static void main(String[] args) {
	    System.out.println("kythera interpreter 0.0.01");
	    if(args.length == 1) {
			Tokenizer t = new Tokenizer();
			t.read(args[0]);
	    } else {
    		System.out.println("Usage: kythera [program.ky]");
	    }
    }
}
