	import java.util.*;
	public class ProblemA {
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int numberOfTestCase = sc.nextInt();
		 System.out.println("Lumberjacks:");
		 
		 
		 for(int y=0; y<numberOfTestCase; y++){
		 int[] array = new int[10];
		 for(int i=0; i<10; i++){
			 array[i]=sc.nextInt();
		 }
		 
		 int[] array1 = Arrays.copyOf(array, array.length); //array1 is the copy of the original array
		
		 int[] array2= countingSort(array); //array2 is the ascending version
		 int[] array3= new int[10];
		 
		 // By this time, array is already sorted in ascending order
		 // Working with the reverse Array
		 //array3 is the reversed version of array
		 
		 int count=0;
		 for(int i=9; i>=0; i--){
			 array3[count] = array[i];
			 count++;
		 }
		/* System.out.println("Original Array");
		 for(int i=0; i<10; i++){
			 System.out.println(array1[i]);
		 }
		 System.out.println("Ascending order");
		 
		 for(int i=0; i<10; i++){
			 System.out.println(array2[i]);
		 }
		 
		 System.out.println("Descending order");
		 
		 for(int i=0; i<10; i++){
			 System.out.println(array3[i]);
		 }
	     */
		 
		 if(Arrays.equals(array1, array2) || Arrays.equals(array1, array3)){
			 System.out.println("Ordered");
		 }
		 else{
			 System.out.println("Unordered");
		 }
		 
		
	 }
	 }
	 static int[] countingSort(int[] numbers) {
		    int max = numbers[0];
		    for (int i = 1; i < numbers.length; i++) {
		        if (numbers[i] > max)
		            max = numbers[i];
		    }
	
		    int[] sortedNumbers = new int[max+1];
	
		    for (int i = 0; i < numbers.length; i++) {
		        sortedNumbers[numbers[i]]++;
		    }
	
		    int insertPosition = 0;
	
		    for (int i = 0; i <= max; i++) {
		            for (int j = 0; j < sortedNumbers[i]; j++) {
		                    numbers[insertPosition] = i;
		                    insertPosition++;
		            }
		    }
		    return numbers;
		}
	}
