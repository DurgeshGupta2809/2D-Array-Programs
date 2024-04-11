package TwoDarray;

import java.util.Scanner;

public class MultiTwoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row : ");
		int row=sc.nextInt();
		System.out.println("Enter the column : ");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		System.out.println("Second matrix ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				System.out.println("Enter the valuse for "+i+"  "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second matrix ");
	    for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				System.out.println("Enter the valuse for "+i+"  "+j);
				arr1[i][j]=sc.nextInt();
			}	
		}
		
	    for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
	
				arr2[i][j]=arr[i][j]*arr1[i][j];
			}	
		}
	    System.out.println("Multi of Two array ");
	    for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				System.out.print(arr2[i][j]+"  ");
				
			}	
			System.out.println();
		}
	}

}
