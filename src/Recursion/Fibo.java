package Recursion;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int r = sc.nextInt();
		int ans = Fi(r);
		System.out.println("The "+r+"th term is: "+ans );
	}
	public static int Fi(int n){
		//Base case
		if (n==1){
			return 0;
		}
		if (n==2){
			return 1;
		}
		//recursive relationship
		return Fi(n-1)+Fi(n-2);

	}
}

