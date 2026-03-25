import java.util.Scanner;

public class Bill
{
	  public int menuList()
   {
	   int choice = 0;
	  
	   System.out.println("----------MENU----------");
	   System.out.println("Enter 1. for Dosa");
	   System.out.println("Enter 2. for Upma");
	   System.out.println("Enter 3. for Idli");
	   System.out.println("Enter 4. for Uttapam");
	   System.out.println("Enter 5. for Pitha");
	   System.out.println("Enter 6. for Chennapoda ");
	   System.out.println("Enter 7. for Dhokla");
	   System.out.println("Enter 8. for Chowmin");
	   System.out.println("Enter 9. for Pav Bhaji");
	   System.out.println("Enter 10. forPoha");
	   System.out.println("Enter your choice: ");
	   Scanner sc= new Scanner(System.in);
	   choice = sc.nextInt();
	   return choice;
   }
   public static void main(String[] args)
   {
	   Bill b = new Bill();
	   int choice = 0;
	   double bill = 0.0;
	   int quantity = 0;
	   System.out.println("Enter the quantity : ");
	   Scanner sc= new Scanner(System.in);
	   quantity = sc.nextInt();
	
	   
	   while ((choice = (b.menuList()))!=0 )
	 {
		   switch(choice)
		   {
		   case 1 :
		       bill +=30*quantity;
		       break;
		   case 2 :
			   bill +=20*quantity;
			   break;
		   case 3 :
			   bill +=10*quantity;
			   break;
		   case 4 :
			   bill +=40*quantity;
			   break;
		   case 5 :
			   bill +=20*quantity;
			   break;
		   case 6 :
			   bill +=25*quantity;
			   break;
		   case 7 :
			   bill +=20*quantity;
			   break;
		   case 8 :
			   bill +=22*quantity;
			   break;
		   case 9 :
			   bill +=20*quantity;
			   break;
		   case 10 :
			   bill +=32*quantity;
			   break;
			   
		  default :
			  System.out.println("Enter the valid number.");
		   
		    }
		   
		System.out.println("The total Bill is : "+bill);
      }
   }
}
