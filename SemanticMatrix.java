package TwoDarray;

import java.util.Scanner;

public class SemanticMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row : ");
		int row=sc.nextInt();
		System.out.println("Enter the column : ");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		int arr1[][]=new int[row][col];
		
		System.out.println("Second matrix ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				System.out.println("Enter the valuse for "+i+"  "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Simple  ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Array element are ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[j][i]+"  ");
	    	}
			System.out.println();
		}
		
	//	 System.out.println("Sum of Two array ");
		    for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					
			}	
				System.out.println();
			}
		
		
	}
}
