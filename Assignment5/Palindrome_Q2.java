import java.util.Scanner;

public class Palindrome_Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		
		//System.out.println(s.length());
		System.out.println("Reversed String : ");
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
			
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}

}
