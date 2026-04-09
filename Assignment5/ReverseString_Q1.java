import java.util.Scanner;

public class ReverseString_Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		//System.out.println(s.length());
		System.out.println("Reversed String : ");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
