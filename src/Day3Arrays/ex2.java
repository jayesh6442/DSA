package Day3Arrays;

import java.util.Arrays;

public class ex2 {
	public static void main(String[] args) {
		int[] ar = {1,2,3,-1,-2,-3};
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
