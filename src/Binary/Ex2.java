package Binary;

public class Ex2 {
	public static void main(String[] args) {
		//binary in nearly sorted array
		int[]ar = {1,4,5,6,7,8,9};
		int result = Bi(ar,34);
		System.out.println(result);
	}
	public static int Bi(int[] ar,int target){
		int start = 0;
		int end = ar.length-1;
		while (start<=end){
			int mid = start + (end-start)/2;
			if (ar[mid]==target){
				return mid;
			}
			else if(target>ar[mid]){
				start= mid+1;
			}
			else{
				end= mid-1;
			}
		}
		return -1;
	}

}
