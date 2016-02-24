class Student {
	String name;
	int credits;
	double gpa;
}

public class StudentDatabase {
	public static void main( String[] args ) {
		Student[] db;
		db = new Student[4];
		
		db[0] = new Student(); //allocates space in the array without this you will get a null pointer exception
		db[0].name = "Esteban";
		db[0].credits = 43;
		db[0].gpa = 2.9;
		
		db[1] = new Student();
		db[1].name = "Dave";
		db[1].credits = 15;
		db[1].gpa = 4.0;
		
		db[2] = new Student();
		db[2].name = "Michelle";
		db[2].credits = 132;
		db[2].gpa = 3.72;
		
		db[3] = new Student();
		db[3].name = "Chad";
		db[3].credits = 145;
		db[3].gpa = 3.99;
		
		for ( int i=0; i<db.length; i++ ){
			System.out.println("Name: \t" + db[i].name);
			System.out.println("\tCredit hours: " + db[i].credits);
			System.out.print("\tGPA: " + db[i].gpa + "\n");
		}
	
		/*
		//method using the "for each loop" 
		for ( Student s : db ) {
			System.out.println("Name: " + s.name);
			System.out.println("\tCredit hours: " + s.credits);
			System.out.println("\tGPA: " + s.gpa + "\n");
		}
			*/
		
		//notice that since min is initialized to 0, you are initially comparing slot 0 to slot 1  
		int min = 0;
		for ( int i = 1; i<db.length; i++ )
			if (db[i].gpa < db[min].gpa )
				min = i;
		
		//the above for loop cycles through the array and saves "max" as the highest gpa that it sees from each of the records
		
		System.out.println(db[min].name + " has the lowest GPA.");
	}
}
		
		