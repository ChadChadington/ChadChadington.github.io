import java.util.Scanner;
//import java.io.IOException;
//import java.net.DatagramPacket;
//import java.net.DatagramSocket;
//import java.net.SocketException;

class TemperatureSample {
	int month, day, year;
	double temperature;
}

public class TemperaturesByDatev2 {
	public static void main(String[] args) throws Exception {
		
		Scanner inFile = new Scanner(new java.io.File("AZPHOENI.txt"));
		
		//String url = "https://learnjavathehardway.org/txt/avg-daily-temps-with-dates-atx.txt";
		//Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
		
		TemperatureSample[] tempDB = new TemperatureSample[10000];
		int numRecords, i = 0;
		
		while ( inFile.hasNextInt() && i < tempDB.length ) {
			TemperatureSample e = new TemperatureSample();
			e.month = inFile.nextInt();
			e.day = inFile.nextInt();
			e.year = inFile.nextInt();
			e.temperature = inFile.nextDouble();
			
			if ( e.temperature == -99 ) //no data flag, or "sentinal value"
				continue; //continue is a keyword that is only available within loops, allows the loop to continue --> you wouldn't want to do a "break" here
			tempDB[i] = e;
			i++;
		}
		inFile.close();
		numRecords = i;
		
		System.out.println(numRecords + " daily temperatures loaded.");
		
		double total = 0, avg, maxval;
		int count = 0;
		
		/*for ( i = 0; i < numRecords; i++ ){
			if ( tempDB[i].month == 11 ) {
				total += tempDB[i].temperature;
				count++;	
			}
		}*/
			total = 0;
			count = 0;
			maxval = 0;
			
			for ( TemperatureSample t : tempDB ){
				
				if ( t == null )
					break;
			
				if ( t.month == 2 ) {
					total += t.temperature;
					count++;
				}	
				
				if (t.temperature > maxval)
					maxval = t.temperature;
			
		}
		
		TemperatureSample ts0 = tempDB[0];
		System.out.println(ts0); //prints out the memory address of what you are calling
		
		avg = total / count;
		avg = roundToOneDecimal(avg);
		maxval = roundToOneDecimal(maxval);
		System.out.print("Average daily temperature over " + count);
		System.out.println(" days in February: " + avg); 
		
		System.out.print("Highest daily temperature of all is " + maxval + "\n" );
		
		}
		
	public static double roundToOneDecimal (double d){
		return Math.round(d*10)/10.0;
	}
}
					
	/* another option instead of doing "continue" is to do this 
		if ( e.temperature != 99 )
		{
			tempDB[i] = e;
			i++;
		}
	*/
	