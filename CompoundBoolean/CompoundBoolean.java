 import java.util.Scanner;
 
 public class CompoundBoolean
 //ShallowGrandmother Exercise
 {
     public static void main( String[] args )
     {
         Scanner keyboard = new Scanner(System.in);
      	
      	int age;
      	double income, hotness;
      	boolean allowed;
      	
      	System.out.print( "Enter your age: ");
      	age = keyboard.nextInt();
      	
      	System.out.print( "Enter your yearly income: ");
      	income = keyboard.nextDouble();
      	
      	System.out.print( "How hot are you on a scale from 0.0 - 10.0? ");
      	hotness = keyboard.nextDouble();
      	
      	allowed = ( age > 25 && age < 40 && ( income > 50000 || hotness >= 8.5 ) ); 
      	
      	System.out.println( "You are allowed to date my grandchild " + allowed );
      	  
      	  
      	 //act as bitwise operators/operations 
      	int x = 3 | 5; //sets x to 7
		int y = 3 & 5; //sets y to 1      
		
		//System.out.println(x);
		//System.out.println(y);
	 }
 }