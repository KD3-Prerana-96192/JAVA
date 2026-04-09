/*1. Create a class called Invoice that a hardware store might use to represent 
an invoice for an item sold at the store. An Invoice should include four 
pieces of information as instance variables—a part number (type String), a 
part description (type String), a quantity of the item being purchased (type 
int) and a price per item (double). Your class should have a constructor 
that initializes the four instance variables. Provide a set and a get method 
for each instance variable. calculates the invoice amount (i.e. multiplies the 
quantity by the price per item), then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. 
If the price per item is not positive, it should be set to 0.0. 
Write a test application named InvoiceTest that demonstrate class Invoice’s 
capabilities.*/

package Assignment02;
class Invoice
{
	private String part_number;
	private String part_desc;
	private int quantity;
	private double price;
	
	public Invoice()//parameterless constructor
	{
		
	}
	public Invoice(String part_number, String part_desc, int quantity, double price) {
		
		
		this.part_number = part_number;
		this.part_desc = part_desc;
		//if quantity is negative then only set value otherwise initialize to zero
		if(quantity<0)
		{
		quantity=0;
		}
		else
		{
		this.quantity = quantity;
		}
		//if price is negative then only set value otherwise initialize to 0.0

		if(price<0)
		{
			price=0.0;
		
		}
		else
		{
		this.price = price;
		
	     }
	}

	public String getPart_number() {
		return part_number;
	}

	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}

	public String getPart_desc() {
		return part_desc;
	}

	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity<0)
		{
		this.quantity = 0;
		}
		else
		{
			this.quantity=quantity;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0)
		{
		this.price = 0.0;
		}
		else
		{
			this.price=price;
		}
	}
	
	public double invoiceAmount()
	{
		return quantity*price;
	}
	
	
	
}

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice obj1=new Invoice("monitor","LED monitor",10,2000.00);
		double amt=obj1.invoiceAmount();
		System.out.println("Invoice Amount"+amt);
		
		obj1.setPrice(-1);
		System.out.println("Price: "+obj1.getPrice());
		
		obj1.setQuantity(-7);
		System.out.println("Quantity: "+obj1.getQuantity());
		
		Invoice obj2=new Invoice("Keyboard","LED Keyboard",-1,1500.00);
		int q=obj2.getQuantity();
		System.out.println("Quantity: "+q);
		double amt1=obj2.invoiceAmount();
		System.out.println("Amount: "+amt1);
		
		
	}

}
