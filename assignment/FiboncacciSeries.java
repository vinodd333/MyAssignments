package week1.assignment;

public class FiboncacciSeries {

	public static void main(String[] args) {
		
		int firstNumber =0;
		int secondNumber=1;
		int thirdNumber;
		

		
		for(int i=1;i<=11;i++) {
			
			System.out.println(firstNumber);
			
			thirdNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
			
		
		}
	

	}

}
