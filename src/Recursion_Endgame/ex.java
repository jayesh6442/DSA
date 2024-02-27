package Recursion_Endgame;

public class ex {
	public static void main(String[] args) {
		R(100);
	}
	public static void R(int n){
		//Printing the counting
		if (n==0)return;
		R(n-1);
		System.out.println(n);
	}
}
