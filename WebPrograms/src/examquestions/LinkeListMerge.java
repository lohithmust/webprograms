package examquestions;

import java.util.LinkedList;

public class LinkeListMerge {

	public static void main(String[] args) {

		
		LinkedList<Integer> lk = new LinkedList<Integer>();
		
		lk.add(5);
		lk.add(8);
		
		System.out.println(lk);


		LinkedList<Integer> lk1 = new LinkedList<Integer>();
		
		lk1.add(7);
		lk1.add(9);
		
		System.out.println(lk1);
		
		LinkedList<Integer> merge1 = new LinkedList<Integer>();
		while(lk !=null && lk1 != null) {
			
			Integer first1 = lk.getFirst();
			Integer first2 = lk1.getFirst();
			System.out.println(first1+" " + first2);

            if(first1 > first2) {
				merge1.add(first2);
				lk1.removeFirst();
			}
			else if(first1 < first2) {
				
				merge1.add(first1);
			    lk.removeFirst();
			    }
			
			else if(lk.isEmpty() ) {
				
				merge1.add(first2);
				lk1.removeFirst();
				
			}
			else if(lk1.isEmpty()){
				merge1.add(first1);
				lk.removeFirst();
			}
		
            System.out.println(merge1);
		}
		
		System.out.println(merge1);
	}

}
