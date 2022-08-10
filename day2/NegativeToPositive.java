package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int number = -40;
	
		if(number<0) {
			int pos = number*(-1);
			
		System.out.println("The number -40 is converted to "+ pos); 
		}
		else {
			System.out.println("Number is positive");
		}

	}

}
