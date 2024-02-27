package Recursion_Endgame;

public class ex6 {
	public static void main(String[] args) {
	//Printing the array element using the recursion
	int[] ar = {1,2,3,4,5,6,7,8,9,0};
	int i = 0;
	int l= ar.length;
	Print(ar,l,i);
	}
	public static void Print(int[]ar,int l,int i){
		if (i>=l)return;
		Print(ar,l,i+1);
		System.out.println("-> "+ar[i]);
	}

}
