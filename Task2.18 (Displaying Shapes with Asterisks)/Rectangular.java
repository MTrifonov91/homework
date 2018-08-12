public class Rectangular {

	public static void main (String args[]){
		for (int r=0; r<=8; r++) {
			if (r%2==0 && r%8==0) {
				for (int c=2; c<=10; c++) {
				System.out.print ("*");
					}
				System.out.println ("");
					}
			else {
				System.out.print ("*");
				for (int s=3; s<=9; s++) {
					System.out.print (" ");
							}
				System.out.println ("*");
				}
			}
		}
	}	
