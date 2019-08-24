package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustomMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			for (int i = s.length()-1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}, "reverse");

		// 3. Call the printCustomMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					System.out.print(("" + s.charAt(i)).toLowerCase());
				} else {
					System.out.print(("" + s.charAt(i)).toUpperCase());
				}
			}
			System.out.println();
		}, "mixed case");

		// 4. Call the printCustomMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length()-1; i++) {
				System.out.print(s.charAt(i)+".");
			}
			System.out.println(s.charAt(s.length()-1));
		}, "periods");
		
		// 5. Call the printCustomMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				if (!"aeiou".contains(""+s.charAt(i))) {
					System.out.print(s.charAt(i));
				}
			}
			System.out.println();
		}, "vowelless");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
