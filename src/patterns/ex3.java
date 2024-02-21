package patterns;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pri(n);
		For();

	}
	public static void Pri(int n ){
		for (int i = 0; i < n; i++) {
			System.out.println("jayesh");
		}
	}
	public static void For(){
		int i = 0;
		for (;;){
			if (i<5){
				System.out.println(i);
				i+=1;
			}
		}
	}
}
