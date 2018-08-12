import java.util.Scanner;


public class MinMax2 {


	public static void main (String []args) {
	Scanner in = new Scanner (System.in);
	int min= 2000000000;
	int max=-2000000000; 
	System.out.println("This program will show the largest and the smallest number entered");
	System.out.println("Enter 5 numbers");
		for (int i=0; i<=4; i++){
			int number = in.nextInt();
				if (number > max){
				max=number; }
				if (number < min){
				min=number; }
				}
	System.out.println("The largerst number is " + max);
 	System.out.println("The smallest number is " + min);
	}	
}
				
		
	
