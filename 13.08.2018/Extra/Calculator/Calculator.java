import java.util.Scanner;

public class Calculator{

	public static void main (String []args){
	Scanner in = new Scanner (System.in);
		for (int i=0; i<=9; i++){
		System.out.println("Enter first number");
		int a= in.nextInt();
		System.out.println("Enter operation type ( +; -; *; /)");
		char c = in.next().charAt(0);
		System.out.println("Enter second number");
		int b= in.nextInt();
			if (c=='+'){
				System.out.println(a+" + "+b+" = "+(a+b));
			}
			if (c=='-'){
				System.out.println(a+" - "+b+" = "+(a-b));
			}
			if (c=='*'){
				System.out.println(a+" * "+b+" = "+(a*b));
			}
			if (c=='/'){
				System.out.println(a+" / "+b+" = "+(a/b));
				}
			System.out.println("To quit the programme press q, to continue press c");
			char quit = in.next().charAt(0);
			if (quit=='q'){
				i=9;
				}
			
		}
	
	}
}