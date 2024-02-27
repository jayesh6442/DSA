package Recursion_Endgame;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println(Fibo(i));
		}
	}
	public static int Fibo(int n){
		if (n<=1)return n;
		return Fibo(n-1) + Fibo(n-2);
	}
}
