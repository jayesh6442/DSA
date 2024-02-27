package Recursion_Endgame;

public class ex8 {
	public static void main(String[] args) {
		//Find the key in the string using the recursion
		String name = "aaaaaaa";
		char[] ch = name.toCharArray();
		int i = 0;
		int l =name.length()-1;
		char key = 'a';
		boolean result = Ricur(ch,key,i,l);
		System.out.println(result);
		int result2 = Ricur2(ch,key,i,l);
		System.out.println(result2);
		Ricur3(ch,key,i,l);

	}
	public static boolean Ricur(char[] name,char key ,int i,int l){
		if (i>l)return false;
		if (name[i]==key){
			return true;
		}
		return Ricur(name,key,i+1,l);
	}
	public static int Ricur2(char[] name,char key ,int i,int l){
		if (i>l)return -1;
		if (name[i]==key){
			return i+1;
		}
		return Ricur2(name,key,i+1,l);
	}
	public static void Ricur3(char[] name,char key ,int i,int l){
		if (i>l)return;
		if (name[i]==key){
			System.out.println("find at-> "+i);;
		}
		 Ricur3(name,key,i+1,l);
	}

	//another method

}
