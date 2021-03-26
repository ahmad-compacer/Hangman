
public class Expect {
	
		public static void letter(String expect) {
			String newLetter = "";
			for (int i = 0; i < Words.word.length(); i++) {
				if (Words.word.charAt(i) == expect.charAt(0)) {
					newLetter += expect.charAt(0);
				} 
				else if (Words.blanks.charAt(i) != '-') {
						newLetter += Words.word.charAt(i);
				} 
				else {
					newLetter += "-";
				}
			}
			
			
			if (Words.blanks.equals(newLetter)) {
				Hangman.count++;
				Attempts.attempts();
			} 
			else {
				Words.blanks = newLetter;
			}
			if (Words.blanks.equals(Words.word)) {
				System.out.println("You win! The word was " + Words.word);
			}
		}
}
