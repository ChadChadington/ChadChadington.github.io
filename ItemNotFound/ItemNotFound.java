import java.util.Scanner;

public class ItemNotFound {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] heroes = {
			"Abderus", "Achilles", "Aenaeas", "Ajax", "Amphitryon",
			"Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
			"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
			"Meleager", "Odysseus", "Orpheus", "Perseues", "Theseus" 
		};
		String guess;
		boolean found;
		
		System.out.print( "Pop Quiz! Name any mortal hero from Greek mythology: ");
		guess = keyboard.next();
		
		found = false; //This string is placed as the flag --> observe the flag before and after to see if anything changes. Only changes if the trigger occurs
		for ( String hero : heroes ) {
			if ( guess.equals(hero) ) {
				System.out.println( "That's correct!" );
				found = true; 
			}
		}
		
		if ( found == false) {
			System.out.println( "No, " + guess + " wasn't a Greek mortal hero.");
		}  
	}
}