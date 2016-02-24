//assumes that BMI can be successfully calculated with lb and ft w/inches successfully -- calculation does not work like that

 import java.util.Scanner;
 
 public class BMICalculator2
 {
     public static void main( String[] args )
     {
		Scanner keyboard = new Scanner(System.in);
		double ft, in, lb, bmi, m;
		
		System.out.print( "Your height (ft only): " );
		ft = keyboard.nextDouble();
		
		System.out.print( "Your height (in only): " );
		in = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		lb = keyboard.nextDouble();
		
		lb = lb*0.453592;
		in = 12/in;
		m = (ft + in)/3.28;
		
		bmi = lb / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
     }
 }