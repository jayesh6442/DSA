package Recursion_EndGame;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("we are in day 2");
		System.out.println("enter the staris  no ");
		int n = sc.nextInt();
		int result = Climb(n);
		System.out.println(result);
	}
	public static int Climb(int n){
		if (n==1||n==0){
			return 1;
		}
		int[] dp = new int[n+1];
		dp[0]=dp[1]=1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];


	}
}
