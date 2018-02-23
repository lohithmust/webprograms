package rough;

public class ArrayOddOcc {

	public static void main(String[] args) {

		int [] a = {1,1,2,1,3,2,3,4,4,3,4,4,6};
		int prescount=0,presvalue=0,sum=0,prevvalue=0;

		for(int i =0;i< a.length;i++) {
			prescount=0;

			for(int j=0;j<a.length;j++) {
				
				if(a[i] == a[j]) {
					prescount++;
				}		
			} 	 
	
			if(prescount % 2 != 0) {
				presvalue = a[i];

				if(presvalue != prevvalue) {
					
					prevvalue = presvalue;
					sum += prevvalue;	
				}
			}
		}
		System.out.println(sum);
	}
}