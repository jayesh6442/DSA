package Recursion_EndGame;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		//Base condition
		//recursive relationship
		//processing
		// This are 3 component of the recursion
		System.out.println("we are in recursion end game");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int finalresult= recursion(a);
		System.out.println("the result is "+finalresult);

	}
	public static int recursion(int n){
		if (n==1){
			return 1;
		}
		return n * recursion(n-1);
	}
}