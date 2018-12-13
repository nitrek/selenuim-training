package Com.Java.Basic;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean Prime = true;
		int n=99;
		for (int i=2;i<=n/2;i++) {
			if (n%i==0) {
				System.out.println("Number is not Prime");
				Prime=false;
				break;
			}
		}
	
	
	if(Prime) {
		System.out.println("Number is  Prime");
		}
	}

}
