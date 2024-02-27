package Recursion_Endgame.part2;

public class ex1 {
	public static void main(String[] args) {
		//Check weather the array is sorted of not in recursion
	int[]ar = {1,2,3,4,5,6,5};
	int i = 0;
	int l = ar.length-1;
boolean isSorted = CheckSorted(ar,i,l);
if (isSorted) System.out.println("sorted");
else System.out.println("not sorted");
	}
	public static boolean CheckSorted(int[] ar,int i ,int l){
		if (i==l)return true;
		if (ar[i]>ar[i+1]){
			return false;
		}
		return CheckSorted(ar,i+1,l);
	}
}
