package TwoDarray;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column : ");
		int row=sc.nextInt();
		int col=row;
		
		int arr[][]=new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
			if(i==j) {
				arr[i][j]=1;
			}else {
				arr[i][j]=0;
			}
				
		}
	}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				System.out.print(arr[i][j]+"  ");
	     	}
			System.out.println();
		}
    }
}
