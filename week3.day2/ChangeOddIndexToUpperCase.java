package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String word = "changeme";
		char[] ch = word.toCharArray();
		
		for (int i=0; i<ch.length; i++) {
			if(i%2!=0) {
				String temp = ch[i]+"";
				String st = temp.toUpperCase();
				System.out.print(st);
			}
			else
				System.out.print(ch[i]);
		}
		

	}

}
