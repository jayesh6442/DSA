package Recursion_Endgame;

public class ex1 {
	public static void main(String[] args) {
	int result = Ri(6);
		System.out.println(result);
	}
	public static int Ri(int n){
		//Find the factorial and make the use of the recursion
		if (n==1)return 1;
		return n * Ri(n-1);
	}
}
