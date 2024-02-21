package Binary;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size  = sc.nextInt();
		//Total number of the occurrence;
		System.out.println("enter the elements");
		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("enter the target element");
		int ta = sc.nextInt();
		int ans1=First(ar,ta);
		int ans2 = Last(ar,ta);
		int mainResult = ans2 - ans1 + 1;
		System.out.println("the total occurrence of that element is: "+ mainResult);
	}
	public static int First(int[] ar,int target){
		int start = 0;
		int end = ar.length-1;
		int ans = -1;
		while (start<=end){
			int mid = start + (end-start)/2;
			if (ar[mid]==target){
				ans = mid;
				end = mid -1;
			}
			else if(target>ar[mid]){
				start= mid+1;
			}
			else{
				end= mid-1;
			}
		}
		return ans;
	}public static int Last(int[] ar,int target){
		int start = 0;
		int end = ar.length-1;
		int ans = -1;
		while (start<=end){
			int mid = start + (end-start)/2;
			if (ar[mid]==target){
				ans = mid;
				start = mid + 1;
			}
			else if(target>ar[mid]){
				start= mid+1;
			}
			else{
				end= mid-1;
			}
		}
		return ans;
	}
}
