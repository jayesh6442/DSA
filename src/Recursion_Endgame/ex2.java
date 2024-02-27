package Recursion_Endgame;

public class ex2 {
	public static void main(String[] args) {
		PrintTable(5,1);
	}
	public static void PrintTable(int n ,int i){
		//Printing the table using the recursion
		if (i>10)return;
		System.out.println(n + " X " + i + " = " + n*i);
		PrintTable(n,i+1);
	}
}
