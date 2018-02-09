package cocubesxam;

import java.util.Scanner;

public class SumOfDouble {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array");
		     int [] a = new int[20];
		     for(int i=0;i < a.length;i++) {
		    	 a[i] = sc.nextInt();
		     }
		System.out.println("Enter your start index");
		     int b = sc.nextInt();
		     
		     for(int i=0 ; i<a.length;i++) {
		    	 System.out.print(+a[i] + " ");
		     }
	
		     System.out.println(sumOfArray(a,b));
	}

	    public static int sumOfArray(int [] a,int b) {
	    	int sum=0;
	    	for(int i=0 ;b < a.length ; i++) {
	    		sum += a[b];
	    		b *= 2 ;
	    	}
	    	return sum;
	    	
	    	
	    	
	    }
	    
}
