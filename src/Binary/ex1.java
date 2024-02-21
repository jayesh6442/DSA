package Binary;

public class ex1 {
	public static void main(String[] args) {
		int[] ar ={1,2,3,4,5,4};
		int result = BinarySearch(ar,6);
		System.out.println(result);
	}
	public static int BinarySearch(int[] ar, int target){
		int start = 0;
		int end = ar.length -1;
		int result = -1;
		while (start<=end){
			int mid = start + (end-start)/2;
			if (ar[mid]==target){
				result = mid;
				end = mid-1;

			} else if (target > ar[mid]) {
				start = mid +1;
			}
			else {
				end = mid -1;
			}

		}
		return result;
	}
}
