package Recursion_EndGame;

import Recursion.Recursion;

public class ex5 {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		int n = ar.length;
		int i = 0;
		PrintUsingRicursion(ar,n,i);
	}
	public static void PrintUsingRicursion(int[] ar,int n,int i){
		if (i >= n){
			return;
		}
		System.out.println("-> "+ar[i]);
		PrintUsingRicursion(ar,n,i+1);

	}
}
