package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 34343, temp,rev,r;
		temp=num;

	for (rev=0; num!=0; num/=10) {	
	   
		r = num%10;
	   rev=(rev*10)+r;
	}
	if(rev==temp) {	

	System.out.println("Palindrome number");
	}
	else {
	
	System.out.println("Not a palindrome number");  
	}
 }
}
	
	
