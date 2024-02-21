package Binary;

public class ex7 {
	public static void main(String[] args) {
		// Peak element in mountain array
		int[] ar = {1,4,6,8,10,80,399,4,2};
		int result = Bi(ar);
		System.out.println(result);
	}
	public  static int Bi(int[] ar){
		int s = 0;
		int e = ar.length - 1;
		while (s < e) {
			int mid = s + (e - s) / 2;
			if (ar[mid] < ar[mid + 1]) {
				s = mid + 1;
			} else {
				e = mid;
			}
		}
		return s; // or return e, as both s and e point to the peak index
	}
}
