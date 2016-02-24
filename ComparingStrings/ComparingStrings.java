 import java.util.Scanner;
 
 public class ComparingStrings
 {
     public static void main( String[] args )
     {
 		Scanner keyboard = new Scanner(System.in);
 		String word;
 		boolean yep, nope;
 		
 		System.out.println( "Type the word \"weasel\", please. ");
 		word = keyboard.next();
 		
 		//METHOD 1 WORKS
 		//yep = word.equals("weasel");
 		//nope = !word.equals("weasel");
 
 		//METHOD 2 WORKS
		yep = "weasel".equals(word);
 		nope = !"weasel".equals(word);
 
 		System.out.println(" You typed what was requested: " + yep );
 		System.out.println(" You ignored polite instructions: " + nope );
 
      }
 }