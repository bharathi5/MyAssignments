package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
            int count = 0;
            String temp = " ";
            String[] str = text.split(" ");
            
        for (int i=0; i<=str.length-1; i++) {
           for (int j=0; j<=str.length-1; j++) {
            	if (i!=j && str[i].equalsIgnoreCase(str[j])) {
            		count = count+1;
            		temp = str[i];
            	}
            	}
            }
        
		if (count>1) {
        	String tx = text.replace(temp, "");
        		System.out.println(tx);
        	}
	
}
}
