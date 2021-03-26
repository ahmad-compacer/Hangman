import java.util.*;


public class Hangman {
	
	public static int count = 0;
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		while (count < 4 && (Words.blanks).contains("-")) {
			System.out.println("Please inter a letter");
			System.out.println(Words.blanks);
			String expect = userInput.next();
			Expect.letter(expect);
		}
		userInput.close();
	}
}