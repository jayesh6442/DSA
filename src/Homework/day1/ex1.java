package Homework.day1;

import java.util.Arrays;

public class ex1 {
	public static void main(String[] args) {
		//Searching algorithm
		int[] a = {4,3,2,1};
		LinearSearch(a);
	}
	public static void LinearSearch(int[] ar) {
		Arrays.sort(ar);
		for (int a :
				ar) {
			System.out.println(a);
		}
	}
}
