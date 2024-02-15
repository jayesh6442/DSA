package TwoDimArray;
import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		int row = sc.nextInt();
		System.out.println("enter the col");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		takeUser(arr,row,col);
		printArr(arr,row,col);
		printRowWiseSum(arr,row,col);
		printColWiseSum(arr,row,col);
		int[][] result = transpose(arr,row,col);
		printArr(result,row,col);
	}
	public static void takeUser(int[][] ar, int row , int col){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				ar[i][j]= sc.nextInt();
			}
		}
	}
	public static void printArr(int[][] ar, int row, int col){
		System.out.println("the element are");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void printRowWiseSum(int[][] ar, int row, int col){
		System.out.println("row wise sum");
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum = sum + ar[i][j];
			}
			System.out.println(sum);
		}
	}
	public static void printColWiseSum(int[][] ar, int row,int col){
		System.out.println("col wise sum");
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum = sum + ar[j][i];
			}
			System.out.println(sum);
		}
	}
	public static  int[][] transpose(int[][] ar,int row,int col){
		int[][] transPose = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transPose[j][i]= ar[i][j];
			}
		}
		return transPose;
	}
}
