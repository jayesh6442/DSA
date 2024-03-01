package Recursion_Endgame.part2;
import SearchinSorting.Binary;
import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		//Binary search in recursion
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = sc.nextInt();
		}
		int s= 0;
		int e= size-1;
		int key = sc.nextInt();
		int result = BinarySearch(ar,key,s,e);
		System.out.println(result+1);
	}
	public static int BinarySearch(int[] ar,int key,int s ,int e){
		if (s>e)return -1;
		int mid  = s+(e-s)/2;
		if (ar[mid]==key){
			return mid;
		}
		return (ar[mid]<key) ?	BinarySearch(ar,key,mid+1,e) : BinarySearch(ar,key,s,mid-1);
	}
}
