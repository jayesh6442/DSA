package Recursion_EndGame;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("we are in recursion");
		System.out.println("enter the number till the number");
		int a = sc.nextInt();
		RI(a);
	}
	public static void RI(int n){
		if (n<1){
			return;
		}
		System.out.println(n);
		RI(n-1);
	}

}
