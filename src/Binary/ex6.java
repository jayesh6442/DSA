package Binary;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		//Nearly sorted array
		int[] ar = new int[size];

		for (int i = 0; i < size; i++) {
			ar[i]= sc.nextInt();
		}
		int target = sc.nextInt();
		int result = Bi(ar,target);

		System.out.println(result+1);
	}
	public static int Bi(int[] ar ,int target) {
		int s = 0;
		int e = ar.length - 1;
		int mid = s + (e-s)/2;
		while (s <= e) {
			mid = s + (e - s) / 2;
			if (ar[mid] == target ){
				return mid;
			}if (ar[mid - 1] == target){
				return mid-1;
			}if (ar[mid + 1] == target) {
				return mid +1;
			}
			else if (target > ar[mid]) {
				s = mid + 2;
			} else {
				e = mid - 2;
			}
			mid = s + (e-s)/2;
		}
		return -1;
	}
}
