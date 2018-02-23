package practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
 
		BufferedReader bf = null;
		int lineCount = 0;
		int wordCount=0;
		int charCount=0;
		try {
			bf = new BufferedReader(new FileReader("E:\\New folder\\Text Document.txt"));
			
			String currentLine = bf.readLine();
			
			while(currentLine != null) {
				lineCount++;
				
				String[] word = currentLine.split(" ");
				
				
					wordCount = wordCount + word.length;
					
					for(String words: word) {
						
						charCount = charCount + word.length;
					}
					
				
				
			System.out.println(currentLine);
			currentLine = bf.readLine();
			
			
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println(lineCount+" "+wordCount+" "+charCount);
		
	}

}
