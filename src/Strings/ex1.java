package Strings;

public class ex1 {
	public static void main(String[] args) {
		System.out.println("we are in string");
		String name = "jayesh";
		char[] ar = name.toCharArray();
		for (char c :
				ar) {
			System.out.print(c);
		}
		System.out.println();
		System.out.println(name);
		System.out.println(name.substring(0,5));
	}
}
