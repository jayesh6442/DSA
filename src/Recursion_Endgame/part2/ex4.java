package Recursion_Endgame.part2;

public class ex4 {
	public static void main(String[] args) {
		System.out.println("we are in end game");
		int[] ar = {1,2,3};
		int target = 5;
		int ans = FindElem(ar,target);
		System.out.println(ans);
	}
	public static int FindElem(int[] ar,int target){
		if (target==0){
			return 0;
		}
		if (target<0){
			return Integer.MAX_VALUE;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			int ans = FindElem(ar,target - ar[i]);
			if (ans!=Integer.MAX_VALUE)
				min = Integer.min(min,ans + 1);
		}
		return min;
	}
}
