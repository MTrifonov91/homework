import java.util.Scanner;

public class Stars4{


	public static void main (String args[]){
	Scanner in = new Scanner(System.in);
        System.out.println ("Enter the number of rows");
	int rows = in.nextInt();
	System.out.println ("Enter the number of columns");
	int columns = in.nextInt();
	columns = columns * 2;
	for (int i = 1; i<=rows; i++){
			if (i%2==0) {
				System.out.println ("");
				System.out.print (" ");
				}
			else {
				System.out.println ("");
			}
		for (int a = 1; a<=columns; a++){
			if (a%2==0) {
				System.out.print (" ");
				}
			else {
				System.out.print ("*");
			}
					}
				}	
			}	
		}