package main;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		List<String> sentences = new ArrayList<String>();
		sentences.add("Hi, this is your son school. We're having some computer trouble.");
		sentences.add("Oh, dear - did he break something?");
		sentences.add("In a way.");
		sentences.add("Did you really name your son Robert'); DROP TABLE Students;--?");
		sentences.add("Oh, yes. Little Bobby Tables we call him.");
		sentences.add("Well, we've lost this year's students records. I hope you're happy.");
		sentences.add("And I hope you'bve learned to sanitize your datbase inputs.");
		sentences.forEach((sentence) -> System.out.printf("%s " + sentence + "%s", "-", "\n"));
	}
}
