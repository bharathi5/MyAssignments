package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		 
		String S = "bharathi";
		char[] ch = S.toCharArray();
		Set<Character> ch1 = new HashSet<Character>();
		for(Character data :ch) {
			ch1.add(data);
		}
		 System.out.println(ch1);
		 List<Character> list = new ArrayList<Character>(ch1);
		 
		 for (int i=0; i<list.size(); i++) {
			 int count = 0;
			 for (int j=0; j<ch.length; j++) {
				
				 if(list.get(i)==ch[j])
				 {
					 count++;
				 }
			 }
			 if(count==1) {
				 System.out.println(list.get(i));
			 }
		}
    }
}
