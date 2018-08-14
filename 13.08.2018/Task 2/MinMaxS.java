import java.util.Scanner;

public class MinMaxS {

	public static void main (String []args) {
	Scanner in = new Scanner (System.in);
	int min=2147000000;
	int max=-2147000000;
	System.out.println("Enter 2 numbers (press ENTER key after entering one)");
		for (int i=0; i<=1; i++) {	
			int number = in.nextInt();
				if (number>max) {
					max = number;
						}
				if (number<min) {
					min = number;
						}
					}
	System.out.println("max number = " + max + " ; min number = " + min);
	}
}
		

	
