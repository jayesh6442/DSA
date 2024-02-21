package OOP;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		students s1 = new students();
		s1.name = sc.nextLine();
		s1.mark = sc.nextInt();
		s1.mark = sc.nextFloat();
		System.out.println(s1.name);
		System.out.println(s1.roll);
		System.out.println(s1.mark);
		animal a1 = new animal();
		System.out.println();
		a1.Bark();

	}
}

