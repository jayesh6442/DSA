package patterns;

public class ex5 {
	public static void main(String[] args) {
		System.out.println("we are in day 3");
		Pattern1(6);
		Pattern2(6);
		Pattern3(10);
		Pattern4(10);
		Pattern5(10);
	}
	public static  void Pattern1(int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0||j==0||j==n-i-1){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static  void Pattern2(int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==n-1||j==0||j==i){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void Pattern3(int n ){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
					System.out.print("  ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
	public static void Pattern4(int n ){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
					System.out.print("  ");
			}
			for (int j = 0; j <n-i-1; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
	public static void Pattern5(int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*i+1; j++) {
				if (j==0||j==2*i){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
