package Practice1;

public class CheckingStringisPalindrome {

	public static void main(String[] args) {
		//Reversing the string using cancadination method
		String S="madram",S1="";
		int l=S.length();
	for (int i=l-1;i>=0;i--) {
		S1=S1+S.charAt(i);//using charAt method inorder to extract each character at particular index
	}
	System.out.println(S1);
	//Checking weather string is palindrome or not
	if (S.equalsIgnoreCase(S1)) {
		System.out.println("Given String is a palindrome");
	}
	else {
		System.out.println("Given string is not a palindrome");
	}
	}

}
