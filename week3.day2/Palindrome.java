package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String S ="madam";
		String rev = " ";
		for (int i=S.length()-1; i>=0; i--) {
			
			rev+=S.charAt(i);
		}
          System.out.println("Palindrome string is "+rev);
	}

}
