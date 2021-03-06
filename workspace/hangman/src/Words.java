import java.io.*;
import java.util.*;


public class Words {
	
	public static String word;
	public static String blanks;
	
	public static void text() throws IOException {
		
		 BufferedReader reader = new BufferedReader(new FileReader("D:\\Java\\words.txt"));
		 String line = reader.readLine();
		 List<String> words = new ArrayList<String>();
		 while(line != null) {
		     String[] wordsLine = line.split(" ");
		      for(String word : wordsLine) {
		          words.add(word);
		      }
		      line = reader.readLine();
			}
			Random rand = new Random(System.currentTimeMillis());
			String randomWord = words.get(rand.nextInt(words.size()));
			
			word = randomWord;
	
			blanks =  new String (new char [word.length()]).replace("\0", "-");
			Scanner userInput = new Scanner(System.in);
			
			while (Hangman.count < 4 && blanks.contains("-")) {
				System.out.println("Please inter a letter");
				System.out.println(blanks);
				//System.out.println(word);
				String expect = userInput.next();
				Expect.letter(expect);
			}
			userInput.close();
			
		    reader.close();
	}

}
