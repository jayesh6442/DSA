package Recursion;

public class Factorial {
	public static void main(String[] args) {
	int result = Fact(6);
	System.out.println(result);
	}
	public static int Fact(int n){
		if (n==1){
			return 1;
		}
		return n * Fact(n-1);
	}
}
