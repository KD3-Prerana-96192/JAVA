import java.util.Scanner;

public class CountWords_Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		System.out.println(str);
		int count=0;
		String s=" ";
		
		
		//System.out.println(s1);
		System.out.println("Splitted String : ");
		String[] split_String=str.split(" ");
		
		
//		System.out.println(split_String [0]);
//		System.out.println(split_String [1]);
		
		
		for(int i=0;i<split_String.length;i++)
		{
			System.out.println(split_String[i]);
		
			count++;
			
		}
		System.out.println(s);
		System.out.println("\nCount of words: "+count);
		
		
		
	}

}
