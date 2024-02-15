package Recursion;
public class ex2 {
	public static void main(String[] args) {
		Printer(100);
	}
	public static void Printer(int n){
		if (n==0){
			return;
		}
		Printer(n-1);
		System.out.println(n);
	}
}
