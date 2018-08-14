
public class ProductOfOdd {

	public static void main (String []args){
	int ProductOfOddNumbers=1;
	for (int i=1; i<=15; i++) {
		if (i%2!=0) {
			ProductOfOddNumbers*=i;
		}
	}
	System.out.println ("The Product of all the odd numbers from 1 to 15 = " + ProductOfOddNumbers);
}
}

	
