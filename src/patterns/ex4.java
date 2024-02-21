package patterns;

public class ex4 {
	public static void main(String[] args) {
		System.out.println("NEW pattern");
		Pattern2(6);
		System.out.println("NEW pattern");
		Pattern3(6);
	}
	//Some practice questions
	public static void Pattern1(int n){
		for (int i = 0; i < n; i++) {
			int count= 0;
			for (int j = 0; j <(n*2)-1; j++) {
				if (j<n-i-1)
				{
					System.out.print("  ");
				}
				else if (count < 2* i + 1)
				{
					if (count==0||count== 2*i||i==n-1)
					System.out.print("* ");
					count+=1;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void Pattern2(int n ){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				if (i==0||j==0||j==n-i-1){
					System.out.print((j+1)+" ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void Pattern3(int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==n-1||j==0||j==i){
					System.out.print((j+1)+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void Pattern4(int n){
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n*2-1; j++) {

			}
		}
	}

}
