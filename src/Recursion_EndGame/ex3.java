package Recursion_EndGame;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = Ri(a);
		System.out.println(result);
	}
	public static int Ri(int n){
		if(n==1){
			return 0;
		}
		if (n==2){
			return 1;
		}
		int ans = Ri(n-1) + Ri(n-2);
		return ans;
	}
}
