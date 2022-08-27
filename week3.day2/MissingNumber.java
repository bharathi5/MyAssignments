package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
	 
		int[] arr = {1,2,3,4,6,7,8,9,10};
		Set<Integer> num = new TreeSet<Integer>();
		
		 for (int i=0; i<arr.length; i++) {
	        	
	        	num.add(arr[i]);
	        }
	        	System.out.println(num);
	        	
	     for (int i=0; i<arr.length-1; i++) {
	             	
	          if(arr[i]+1!=arr[i+1])   
	          {
	             	System.out.println("Missing number is: "+(arr[i]+1));
	          }
	     }
	}
}
