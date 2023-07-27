package week1.assignment;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
	
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int length = array.length;
		
		System.out.println("Duplicate elements in array are ");
		
		for(int i=0;i<length;i++) {//outer loop
			
			for(int j=i+1;j<length;j++) {//inner loop
				
				if(array[i]==array[j]) {
					
					System.out.println(array[i]);
					
				}
			}
		}

	}

}
