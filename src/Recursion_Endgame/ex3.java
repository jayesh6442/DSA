package Recursion_Endgame;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		System.out.println("we are in recursion end game");
		Scanner sc = new Scanner(System.in);
	//	int result =Ri(4);
	//	System.out.println(result);
	//  Head and Tail recursion
		// Fibo
int a = sc.nextInt();
	int ans = Ri(a);
		System.out.println(ans);
		for (int i = 0; i <= a; i++) {
			System.out.println(Ri(i)+" ");
		}
	}
//	public static int Ri(int n){
//		if (n==1)return 1;
//		return n* Ri(n-1);
//	}
	public static int Ri(int term){
		if (term<=1)return term;
		return Ri(term-1)+Ri(term-2);
	}
}
