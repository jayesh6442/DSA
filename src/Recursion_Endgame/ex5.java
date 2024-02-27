package Recursion_Endgame;

public class ex5 {
	public static void main(String[] args) {
		//How to reach the nth stairs
		int result = Stars(4);
		System.out.println(result);
	}
	public static int Stars(int n){
		if (n==0||n==1)return 1;
		return Stars(n-1)+Stars(n-2);
	}
}
