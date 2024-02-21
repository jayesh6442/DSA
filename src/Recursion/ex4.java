package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		System.out.println("We are recursion");
		int[] ar = {4,3,8,5};
		boolean result = containD(ar);
		System.out.println(result);
	}
	public static boolean containD(int[] ar){
		Arrays.sort(ar);
		for (int i = 1; i < ar.length; i++) {
			if (ar[i]==ar[i-1]){
				return true;
			}
		}
		return false;
	}
}
