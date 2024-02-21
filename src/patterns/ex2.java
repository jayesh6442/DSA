package patterns;

public class ex2 {
	public static void main(String[] args) {
		System.out.println("pattern 1");
		Pattern1(7);
		System.out.println("pattern 2");
		Pattern2(5);
		System.out.println("pattern 3");
		Pattern3(5);
		System.out.println("pattern 4");
		Pattern4(6);
		System.out.println("pattern 5");
		Pattern5(5);
		System.out.println("pattern 6");
		Pattern6(5);
		System.out.println("pattern 7");
		Pattern7(5);
		System.out.println("pattern 8");
		Pattern8(5);

	}

	public static void Pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void Pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void Pattern3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void Pattern4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

	public static void Pattern5(int n) {
		for (int i = 0; i <= 2 * n; i++) {
			for (int j = 0; j <= 2 * n; j++) {
				double distance = Math.sqrt(Math.pow(j - n, 2) + Math.pow(i - n, 2));
				if (Math.abs(distance - n) < 0.5) {
					System.out.print("()");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void Pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void Pattern7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}
	}

	public static void Pattern8(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}
	}
	public static void Pattern9(int n){

	}
}


