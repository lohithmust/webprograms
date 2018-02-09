package webprograms;

import java.util.Scanner;

public class MatrixAdjascent {

	public static void main(String[] args) {


		int[][]  mat  = new int [5][5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your 5 X 5 Matrix");
		for(int i=0 ; i<5;i++) {
			for(int j=0; j<5 ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0 ; i<5;i++) {
			for(int j=0; j<5 ; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		  System.out.println(matAdj(mat));
	}

	public static int matAdj(int [][] mat) {
		
		
		int max=0;
		for(int i=0;i<5;i++) {
			int pro=1;
			for(int j=1;j<5;j++) {
				pro *= mat[i][j];
				//System.out.println(mat[i][j]);
			}
			  System.out.println(pro);
			if(pro > max) {
				max = pro;
			}
		}
		for(int i=0;i<5;i++) {
			int pro=1;
			for(int j=0;j<4;j++) {
				pro *= mat[i][j];
				//System.out.println(mat[i][j]);
			}
			  System.out.println(pro);
			if(pro > max) {
				max = pro;
				System.out.print(max+ " ");
			}
		}
		return max;
	}
}
