package SearchinSorting;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		System.out.println("we are in the searching and sorting");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] ar = new int[size];
		TakeUser(ar,size);
		PrintVar(ar,size);

	}
	public  static void TakeUser(int[] ar,int size){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			ar[i]= sc.nextInt();
		}
	}
	public  static  void PrintVar(int[] ar,int size){
		for (int i = 0; i < size; i++) {
			System.out.println(ar[i]);
		}
	}
}
