package SearchinSorting;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int size = sc.nextInt();

//		int[] ar = new int[size];
//		System.out.println("enter the element");
//		TakeUser(ar,size);
//		System.out.println("the elements are");
//		PrintA(ar,size);
//		System.out.println();
//		System.out.println("enter the element you want to find: ");
//		int target  = sc.nextInt();
//		int result = BinarySearch(ar,size,target);
//		System.out.println("Target element found at "+ (result+1));
		int[] ar = {2,5,6,8,10,12,4,4,4,4,4,4,4,4,4,6,6,7,4,3};

		int size =20;
		int result = BinarySearch (ar,size,3);
		System.out.println(result);

	}
	public static int BinarySearch(int[] ar,int size,int key){
		int start= 0;
		int end = size-1;
		while (start<=end){
			int mid = start + (end -start)/2;
			if (ar[mid]==key){
				return mid;
			} else if (ar[mid]>key) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
			mid= start +(end-start)/2;
		}
		return -1;
	}
	public static void TakeUser(int[] ar, int size){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			ar[i]= sc.nextInt();
		}

	}
	public static void PrintA(int[] ar, int size){
		for (int i = 0; i < size; i++) {
			System.out.print(ar[i]+" ");
		}
	}

	public static int Firstacc(int[] ar, int size, int key) {
		int start = 0;
		int end = size -1;
		int mid  = start+ (end-start)/2;
		int ans = -1;
		while (start<=end){

			if (ar[mid]==key){
				ans = mid;
				end = mid-1;

			} else if (key>ar[mid]) {
				start = mid+1;
			}else if(key<ar[mid]) {
				end = mid-1;
			}
			mid= start+ (end-start)/2;
		}
		return ans;
	}

}
