package DnC;

public class ex1 {
	public static void main(String[] args) {
		//Merge sort
		int[] ar ={6,5,3,2,1};
		int r = ar.length;
		int s= 0;
		int e= ar.length-1;
	}
	public static void Merge(int[]ar, int s,int e){
		int mid = s + (e-s)/2;

	}
	public static void MergeSort(int[] ar , int s,int e){
		//Divide and conquer
		// Merge two sorted array using the recursion
		if (s>=e){
			return;
		}
		int mid = s + (e-s)/2;
		//left part sort recursion
		MergeSort(ar,s,mid);
		//right part sort
		MergeSort(ar,mid+1,e);
		// Now merge two sorted array
		Merge(ar,s,e);
	}


}
