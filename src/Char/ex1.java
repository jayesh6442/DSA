package Char;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sr = sc.nextLine();
		char[] ch = sr.toCharArray();
//		RemoveSpace(ch);
Palindrome(ch);
ConvertTOUpperCase(ch);
ConvertTOLowerCase(ch);
	}
	public static void Rev(char[] ch){
		int start=0;
		int end =ch.length-1;
		while (start<end){
			char temp = ch[start];
			ch[start]= ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		for (char c :
				ch) {
			System.out.println(c);
		}
	}
	public static void RemoveSpace(char[] ch){
		int l = ch.length;
		for (int i = 0; i < l; i++) {
			if (ch[i] ==' '){
				ch[i]='@';
			}
		}
		for (char c :
				ch) {
			System.out.print(c);
		}
	}
	public  static  void Palindrome(char[] ch){
		int start = 0;
		int end = ch.length-1;
		int flag = 0;
		while (start<end){
			if (ch[start]!=ch[end]){
				flag=1;
			}
			start++;
			end--;
		}
		if (flag==0){
			System.out.println("string is palindrome");
		}
		else{
			System.out.println("string is not palindrome");
		}
	}
	public static void ConvertTOUpperCase(char[] ch){
		int len = ch.length;
		for (int i = 0; i < len; i++) {
			ch[i]= (char) (ch[i]-'a'+'A');
		}
		for (char c :
				ch) {
			System.out.print(c);
		}
		System.out.println();
	}
	public static void ConvertTOLowerCase(char[] ch){
		int len = ch.length;
		for (int i = 0; i < len; i++) {
			ch[i]= (char) (ch[i]-'A'+'a');
		}
		for (char c :
				ch) {
			System.out.print(c);
		}
	}
}
