package week1.assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		
		  int[] number = {3,2,11,4,6,7};
		  
		  int length = number.length;
		  
		  Arrays.sort(number);
		 
			
			System.out.println("The second largest number is the array is " + number[length-2]);
	
	}

}
