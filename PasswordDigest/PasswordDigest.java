import java.util.Scanner;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class PasswordDigest
{
	public static void main( String[] args ) throws Exception //throws, forces the execution even if the programm will crash...
	{
		Scanner keyboard = new Scanner(System.in);
		
		String pw, hash;
		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		
		System.out.print("Password: ");
		pw = keyboard.nextLine();
		
		digest.update( pw.getBytes("UTF-8") );
		hash = DatatypeConverter.printBase64Binary( digest.digest() );
		
		System.out.println( hash );
	}
	//preview all Java Classes...the standard library is huge...
	//Use existing documentation to find functions and methods to get cool stuff done
	//cryptographic hashes best 3rd party one per lesson is Bcrypt... not built into java
}