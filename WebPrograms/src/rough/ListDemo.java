package rough;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String [] args) {
		
		String str2="lohith";
		List<String> str = new ArrayList<String>();
		
	     str = demo1(str2);	
	
	     System.out.println(str);
	}

	
	static List<String> str3= new ArrayList<String>();
	public static List demo1(String str1) {
		

		
		str3.add(str1);
		
		
		
		
		return str3 ;
		
		
	}
}
