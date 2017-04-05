package io.kwu.kythera;

public class Main {
    public static void main(String[] args) {
	    System.out.println("kythera interpreter 0.0.01");
	    if(args.length == 1) {
			Tokenizer tokenizer = new Tokenizer(args[0]);
			Token t;
			while((t = tokenizer.read_token())!= null) {
				System.out.println(t);
			}
	    } else {
    		System.out.println("Usage: kythera [program.ky]");
	    }
    }
}
