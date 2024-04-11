package TwoDarray;

import java.util.Scanner;

public class ZaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int row=sc.nextInt();
		int [][]a= new int [row][];
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println("enter the column size for row "+i);
			a[i]=new int[sc.nextInt()];
		}
		System.out.println("insert the values inside the zagged array");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				
		         System.out.println("enter the value for "+i+"  "+j);
		         a[i][j]=sc.nextInt();
			}
		}
		System.out.println("New array");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				
		         System.out.print( a[i][j]+"  ");
		       
			}
			System.out.println();
		}
		
	}
}
