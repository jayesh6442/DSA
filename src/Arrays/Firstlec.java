package Arrays;

import java.util.Scanner;

public class Firstlec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("we are in array");
		int size = sc.nextInt();
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i]= sc.nextInt();
		}
		Rev(ar);
		Inverse(ar);
	}
	public static void Rev(int[] ar){
		int start = 0;
		int end = ar.length-1;
		while (start<=end){
			if (start==end){
				System.out.println(ar[start]);
			}
			else {
				System.out.println(ar[start]);
				System.out.println(ar[end]);
			}
			start += 1;
			end -= 1;
		}
	}
	public static void Inverse(int[] ar){
		int start=0;
		int end= ar.length-1;
		while (start<=end){
			int temp = ar[start];
			ar[start]= ar[end];
			ar[end]= temp;
			start+=1;
			end-=1;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
