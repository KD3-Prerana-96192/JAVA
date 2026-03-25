import java.util.Scanner;
public class Program
{
   public static void main(String[] args)
   {
	   int num;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number : ");
	   num = sc.nextInt();
//	   Integer a = new Integer(num); //boxing
	   String b = 	Integer.toBinaryString(num);
	   String o =  Integer.toOctalString(num);
	   String h = Integer.toHexString(num);
	   System.out.println("\n The given number is : "+ num+"\n The Binary Equivalent is : "+b+"\n The Octal Equivalent is : "+o+"\n The Hexadecimal Equivalent is : "+h);
	   
	   
   }
}
