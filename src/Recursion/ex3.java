package Recursion;

import java.awt.event.WindowFocusListener;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int j=0;
		int[] ar = new int[size];

		System.out.println("enter the element");
		for (int i = 0; i < size; i++) {
			ar[i]= sc.nextInt();
		}
		System.out.println("the element are");
		PrintArr(ar,size,j);
	}
	public static void PrintArr(int[]ar, int n,int i){
		//base case
		if (i>=n){
			return;
		}
		System.out.println(ar[i]);
		PrintArr(ar,n,i+1);
	}
}
