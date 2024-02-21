package Binary;

public class ex3 {
	public static void main(String[] args) {
		//Find the first accurance of the element
		int[] ar ={1,2,3,3,3,3,6,7};
		int result = Bi(ar,4);
		System.out.println(result);
	}
	public static int Bi(int[] ar,int target){
		int start = 0;
		int end = ar.length-1;
		int ans=-1;
		while (start<=end){
			int mid = start + (end-start)/2;
			if (ar[mid]==target){
				ans = mid;
				end= mid-1;
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
