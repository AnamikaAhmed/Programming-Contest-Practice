import java.util.*;
public class ProblemA {
 public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int numberOfTestCase = sc.nextInt();
	 
	 for(int p=0; p<numberOfTestCase; p++){
		 System.out.println("The value of p is: "+p);
		 
		 int numberOfWall = sc.nextInt();
		 System.out.println("The number of wall is: "+numberOfWall);
		 int[] array = new int[numberOfWall];
		 int high =0;
		 int low =0;
		 // taking information about number of walls
		 for(int i=0; i<numberOfWall; i++){
			 array[i] = sc.nextInt();
			 System.out.print("Arrangement: "+array[i]);
		 }
		 for(int i=0; i<array.length-1; i++){
			 if(array[i]<array[i+1]){
				 high++;
				 System.out.println("High is: "+high);
			 }
			 else if(array[i]==array[i+1]){
				 
			 }
			 else{
				 low++;
				 
			 }
			 
			 
		 }
		 System.out.println("Case "+(p+1)+": "+high+" "+low);
		 
		 
		 
	 }
 }
 
}
