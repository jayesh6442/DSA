package Day3Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex1 {
	public static void main(String[] args) {
	int[] ar = {1,2,3,4,5,6};
	int[] rev = Rev(ar);
		System.out.println(Arrays.toString(rev));
	}
	public static int[] Rev(int[] ar){
		int start=0;
		int end = ar.length-1;
		while (start<=end){
			int temp = ar[start];
			ar[start]=ar[end]; // Corrected assignment
			ar[end]=temp; // Corrected assignment
			start+=1;
			end-=1;
		}
		return ar;
	}

}
