
public class Attempts {
		public static void attempts() {
			
				if (Hangman.count == 1) {
					System.out.println("Wrong letter, you have 3 attempts remaning");
				}
				if (Hangman.count == 2) {
					System.out.println("Wrong letter, you have 2 attempts remaning");
				}
				if (Hangman.count == 3) {
					System.out.println("Wrong letter, you have 1 attempts remaning");
				}
				if (Hangman.count == 4) {
					System.out.println("GAME OVER! The word was " + Words.word);
				}
		}
}
