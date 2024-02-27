package Recursion_Endgame;

public class ex9 {
	public static void main(String[] args) {
		System.out.println("we are in end game");
		//in Output print all the digit of the Integer
		int a=1234;
		P(a);
	}

	public static void P(int n){
		if (n==0)return;
		int brandnew= n/10;
		P(brandnew);
		int a = n%10;
		System.out.print(a +" ");

	}
}
