package Binary;

public class ex4 {
	public static void main(String[] args) {
		//Finding the last occurrence of the element
		int[] ar = {1,3,3,3,3,3,3,3,3,3,6,8};
		int ans =Bi(ar,3);
		System.out.println(ans);
	}
	public static int Bi(int[] ar,int target){
		int start = 0;
		int end = ar.length-1;
		int ans = -1;
		while (start<=end){
			int mid = start + (end-start)/2;
			if (ar[mid]==target){
				ans =  mid;
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
