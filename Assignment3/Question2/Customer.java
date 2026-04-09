package com.sunbeam;

import java.util.Scanner;

public class Customer
{
	private static Scanner sc=new Scanner(System.in);
	
	private int acc_no;
	private int bal_at_begin_month;
	private int total_item_charged_cumonth;
	private int total_credit_apply_cuacc_month;
	private int allow_credit_limit;
	
	
	public Customer()
	{
		
	}
	
	public Customer(int acc_no, int bal_at_begin_month, int total_item_charged_cumonth,
			int total_cridit_apply_cuacc_month, int allow_credit_limit) {
		super();
		this.acc_no = acc_no;
		this.bal_at_begin_month = bal_at_begin_month;
		this.total_item_charged_cumonth = total_item_charged_cumonth;
		this.total_credit_apply_cuacc_month = total_cridit_apply_cuacc_month;
		this.allow_credit_limit = allow_credit_limit;
	}
	
	
	
	
	public int getAcc_no() {
		return acc_no;
	}


	public int getBal_at_begin_month() {
		return bal_at_begin_month;
	}


	public int getTotal_item_charged_cumonth() {
		return total_item_charged_cumonth;
	}

	public void setTotal_item_charged_cumonth(int total_item_charged_cumonth) {
		this.total_item_charged_cumonth = total_item_charged_cumonth;
	}

	public int getTotal_credit_apply_cuacc_month() {
		return total_credit_apply_cuacc_month;
	}


	public int getAllow_credit_limit() {
		return allow_credit_limit;
	}

	public void acceptRecord()
	{
		
		
		
		
		System.out.printf("Enter Account Number :");
		this.acc_no=sc.nextInt();
		
		
		System.out.printf("Enter begining balance  : ");
		this.bal_at_begin_month=sc.nextInt();
		
		System.out.printf(" Enter total charges  : ");
		this.total_item_charged_cumonth=sc.nextInt();
		
		System.out.printf(" Enter total credits: ");
		this.total_credit_apply_cuacc_month=sc.nextInt();
		
		System.out.printf(" Enter credit limit : ");
		this.allow_credit_limit=sc.nextInt();
		
		
		
		}
	
	public void display()
	{
		System.out.println("\n\nAccount number : "+getAcc_no());
		
		System.out.println("Balance begining  : "+getBal_at_begin_month());
		
		System.out.println("Total charges  : "+getTotal_item_charged_cumonth());
		
		System.out.println("Total credits : "+getTotal_credit_apply_cuacc_month() );
		
		System.out.println(" Credit limit : "+getAllow_credit_limit());
		

		
		
	}
	
	public void newBalance()
	{
		int new_balance= getBal_at_begin_month() + getTotal_item_charged_cumonth() - getTotal_credit_apply_cuacc_month();
		
		System.out.println("Balance :"+new_balance);
		
		if(new_balance>getAllow_credit_limit())
		{
			System.out.println("Credit limit exceeded");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter how many customer no :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the details of customer :");
		Customer c= new Customer();
		c.acceptRecord();
		c.display();
		c.newBalance();
		
		}
	
}
		
		
}
	
	
	




		
	
		
		

	


