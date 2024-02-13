package TwoDimArray;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("we are in the tow dimensional array");
		System.out.println("enter the row");
		int row = sc.nextInt();
		System.out.println("enter the col");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		takeUser(arr,row,col);
		printArr(arr,row,col);
		findMax(arr,row,col);
		findMin(arr,row,col);

	}
	public static void takeUser(int ar[][],int row ,int col){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				ar[i][j]= sc.nextInt();
			}
		}
	}
	public static void printArr(int ar[][],int row,int col){
		System.out.println("the element are");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void findMax(int ar[][],int row,int col){
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (ar[i][j]>max){
					max = ar[i][j];
				}
			}
		}
		System.out.println("the Max element is: "+ max);
	}
	public static void findMin(int ar[][],int row ,int col){
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (ar[i][j]<min){
					min = ar[i][j];
				}
			}
		}
		System.out.println("the Max element is: "+ min);
	}
}
