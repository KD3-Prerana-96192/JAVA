package com.app.fruits;
import java.util.Scanner;
public class FruitBasket   {
	public static void main(String[] args) {
		//FruitBasket obj=new FruitBasket();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		Fruit[] basket=new Fruit[size];
		
		int choice;
		int count=0;
		do
			{
				
				System.out.println("0. Exit");
				System.out.println("1. Add Mango");
				System.out.println("2. Add Orange");
				System.out.println("3. Add Apple");
				System.out.println("4. Display names of all fruits in the basket");
				System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket.");
				System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket.");
				System.out.println("7. Mark a fruit as stale i/p : index ");
				System.out.println("8. Marks all sour Fruits");
				
				System.out.println("Enter Choice: ");
				choice=sc.nextInt();
				System.out.println();
				switch(choice)
				{
				
				case 1:
					if(count<size)
					{
					basket[count]=new Mango("MangoColoured",2,"Mango",false);
					count++;
					}
					else
					{
						System.out.println("Basket is Full!!");
					}
					break;
				case 2:
					if(count<size)
					{
					basket[count]=new Orange("OrangeColoured",1,"Orange",true);
					count++;
					}
					else
					{
						System.out.println("Basket is Full!!");
					}
					break;
				case 3:
					if(count<size) {
					basket[count]=new Apple("AppleColoured",2,"Apple",true);
					count++;
					}
					else
					{
						System.out.println("Basket is Full!!");

					}
					break;
				case 4:
					for(int i=0;i<count;i++)
					{
						System.out.println(basket[i].getName());
					}
					break;
				case 5:
					for(int i=0;i<count;i++)
					{
						String info=basket[i].toString();
						String t=basket[i].taste();
						System.out.println(info);
						System.out.println(t);
					}
					break;
				case 6:
					for(int i=0;i<count;i++) {
					if(basket[i].isFresh()!=true)
					{
						System.out.println(basket[i].taste());
						System.out.println(basket[i].getName());

					}
					}
					break;
					
				case 7:
					System.out.print("Enter index: ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx < count)
					    basket[idx].setFresh(false);
					break;

					case 8:
					for(int i=0;i<count;i++)
					{
					    if(basket[i].taste().equals("Sour"))
					        basket[i].setFresh(false);
					}
					break;
					}
				
				
			}
		while(choice!=0);

}}