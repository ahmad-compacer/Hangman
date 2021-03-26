
public class Attempts {
		public static void attempts() {
			for(int i = 0; i < 4; i++ ) {
				if (Hangman.count == i) {
					int x = 4;
					System.out.println("Wrong letter, you have "+ (x--) +" try again");
				}
				if (Hangman.count == 4) {
					System.out.println("GAME OVER! The word was " + Words.word);
					break;
				}
			}
		}
}
