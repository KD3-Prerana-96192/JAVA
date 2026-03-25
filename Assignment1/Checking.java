import java.util.Scanner;
public class Checking 
{
   public static void main(String[] args)
   {
	   double avg  = 0.0;
	   double num1 = 0.0; 
	   double num2 = 0.0;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the first number : ");
	   
	   if (!sc.hasNextInt()  &&  sc.hasNextDouble())//checks the value is not an integer and is a double
	   {
	     
		   
		   num1 = sc.nextDouble();//storing the double value  of num1
		   System.out.println("Enter the second number : ");
		   
		   if(!sc.hasNextInt()  &&  sc.hasNextDouble())//checks the value is not an integer and is a double
		   {
			   num2 = sc.nextDouble(); //stores the double value of num2
			   
			   avg = (num1+num2)/2 ;//does average of both the number
			   System.out.println("The average of "+num1+ " and "+num2+" is "+avg);
		   }
		   else
		   { 
			   System.out.println("Error : 2nd value not double : Please enter double type value ...");//prints error msg if num 2 is not double
		   }
	   }
	   else
	   {
		   System.out.println("Error : 1st value not double : Please enter double type value ...");//prints error msg if num 1 isn't double
	   }
	  
   
   }  
   
}
