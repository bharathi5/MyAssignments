package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		
		 List<Integer> l1 = new ArrayList<Integer>();
		 List<Integer> l2 = new ArrayList<Integer>();

		 for (int i=0; i<=a.length-1; i++) {
			 l1.add(a[i]);
		 }
		 for (int i=0; i<=b.length-1; i++) {
			 l2.add(b[i]);
		 }
		 for (int i=0; i<a.length; i++) {
			 for (int j=0; j<b.length; j++) {
		          	if(a[i]==b[j]) {
		          		System.out.println("Intersection is: " +a[i]);
		          	}
		 }
	}    	
	}

}
