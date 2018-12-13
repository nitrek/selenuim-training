package Com.Java.Basic;

public class Factors {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean Prime = true;
		int n=20;
		for (int i=1;i<n;i++) {
			if (n%i==0) {
				System.out.println("Factor Number is " +i);
				//Prime=false;
				//break;
			}
		}
	
	

	}
}
