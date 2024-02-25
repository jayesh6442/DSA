package Binary;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Divide two number using the binary search
		int a  = sc.nextInt();
		int ans = Bi(a);
		System.out.println(ans);
	}
	public static int Bi(int n){
		int start = 0;
		int end = n;
		int ans = -1;
		while (start<=end){
			int mid = start + (end-start)/2;
			if (mid*mid== n){
				return mid;
			} else if (mid*mid> n) {
				// Left Search
				end = mid-1;
			}else {
				ans = mid;
				//Right Search
				start = mid+1;
			}
		}
		return ans;
	}
}
