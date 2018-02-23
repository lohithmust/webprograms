package practice;

import java.util.ArrayList;

public class Java8Demo {
 private  int a =10;

 
 
 public static void main(String[] args) {
           
		
		ArrayList <String> gameList = new ArrayList<String>();
		
		gameList.add("football");
		gameList.add("cricket");
		gameList.add("Carrom");
		
	
	
	gameList.forEach(System.out::println);
	
	}
}
