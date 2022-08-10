package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] num = {3,2,11,4,6,7};
		int[] n = {1,2,8,4,9,7};
		
      int nLength = num.length;
    for(int i=0; i<nLength; i++) 
   {
	 int mLength = n.length;
	for(int j=0; j<mLength; j++) 
	{	
		if(num[i]==n[j]) {
			
			System.out.println(num[i]);
		}
	}
  }
	}
}
