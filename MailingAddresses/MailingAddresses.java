//Note that defining two classes will create two bytecode files for these classes when the java file is compiled

class Address //sort of treated like a Record or Struct (Object-oriented language folks say record) 
{
	String street;
	String city;
	String state;
	int zip;
}

public class MailingAddresses
{
	public static void main(String[] args)
	{
		Address uno, dos, tres, quatro; //since address is its own class you are declaring variables that hold address classes
		//right now they are declared, but not initialized. The following code initializes them
		
		uno = new Address();
		uno.street = "191 Marigold Land";
		uno.city = "Miami";
		uno.state = "FL";
		uno.zip = 33179;
		
		dos = new Address();
		dos.street = "3029 Losh Lane";
		dos.city = "Crafton";
		dos.state = "PA";
		dos.zip = 15205;
		
		tres = new Address();
		tres.street = "2693 Hannah Street";
		tres.city = "Hickory";
		tres.state = "NC";
		tres.zip = 21412;
		
		quatro = new Address();
		quatro.street = "141 Mott Farm Rd";
		quatro.city = "Tomkins Cove";
		quatro.state = "NY";
		quatro.zip = 19086;
		
		
		System.out.println();
		System.out.println(uno.street + "\n" + uno.city + ", " + uno.state + "  " + uno.zip + "\n"); 
		System.out.println(dos.street + "\n" + dos.city + ", " + dos.state + "  " + dos.zip + "\n"); 
		System.out.println(tres.street + "\n" + tres.city + ", " + tres.state + "  " + tres.zip + "\n"); 
		System.out.println(quatro.street + "\n" + quatro.city + ", " + quatro.state + "  " + quatro.zip + "\n"); 
		
	}
}