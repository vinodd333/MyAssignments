package week1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number =13;
		int count=0;
		
		for(int i=2;i<number;i++) {
			
			if(number%i==0) {
				count =count+1;
			}
				
		}
		
		if(count==0) {
			
			System.out.println("Provided number "+ number + " is primenumber");
		}
		
		else
			System.out.println("Provided number "+ number + " is not a primenumber");

	}

}
