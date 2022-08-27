package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
      Set<Integer> numbers = new TreeSet<Integer>();

        for (int i=0; i<data.length; i++) {
        	
        	numbers.add(data[i]);
        }
        	System.out.println(numbers);
        	
        List<Integer> list = new ArrayList<Integer>(numbers);
        
        int num = list.get(list.size()-2);
        
        System.out.println("Second largest number is: " +num);
        }
	}
    
		
		
    
    
    