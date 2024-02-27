package Recursion_Endgame;

public class ex7 {
	public static void main(String[] args) {
		//Find the max element in the array using the recursion
		System.out.println("we are in the end game");
		int[]ar = {1,3,4,5,6,7,8,9};
		int l = ar.length;
		int i = 0;

		int result =FindMax(ar,i,l);
		System.out.println("maxi is "+result);

	}
	public static int FindMax(int[] ar, int i , int l){
		if (i == l - 1) {
			return ar[i];
		}
		int maxOfRest = FindMax(ar, i + 1, l);
		return Math.max(ar[i], maxOfRest);
	}
}
