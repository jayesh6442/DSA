package Recursion;

import java.util.Scanner;

public class TotalNoOfStars {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int r = sc.nextInt();
		int ans = Climb(r);
		System.out.println(ans);
	}
	public static int Climb(int n ){
		if (n==0||n==1){
			return 1;
		}
		int ans = Climb(n-1)+Climb(n-2);
		return ans;
	}
}
