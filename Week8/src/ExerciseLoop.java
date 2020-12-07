import java.util.*;
public class ExerciseLoop {

	public static void main(String[] args) {
		
		//define the variables

		System.out.println("FOR LOOP");
		int sum=0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number <= upperbound; ++number) {
			sum += number; 	
		}
		average= sum/100;
		
		System.out.println("The sum of 1 to 100 is " +sum);
		System.out.println("The average is " +average);
		System.out.println();
		
		System.out.println("WHILE LOOP");
		int sumx= 0;
		double averagex;
		int lowerboundx = 1;
		int upperboundx= 100;
	      int number = lowerboundx;        
	      while (number <= upperboundx) {  
	         sumx += number;
	         ++number;   
	}
	      averagex= sumx/100;
			
			System.out.println("The sum of 1 to 100 is " +sumx);
			System.out.println("The average is " +averagex);
			System.out.println();
			

			System.out.println("DO-WHILE LOOP");
			 int sumz = 0;
			 double averagez;
				int lowerboundz = 1;
				int upperboundz = 100;
		      int numberx = lowerboundz;      
		      
		      do {
		         sumz += numberx;
		         ++numberx;                     
		      } while (numberx <= upperboundz);
		      
		      average= sumz/100;
				
				System.out.println("The sum of 1 to 100 is " +sumz);
				System.out.println("The average is " +average);
				System.out.println();
		      

}
}
