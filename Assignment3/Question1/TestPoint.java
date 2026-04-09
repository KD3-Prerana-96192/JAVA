package Tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter X cordinate: ");
	int x1=sc.nextInt();
	int y1=sc.nextInt();
	
	System.out.println("Enter y cordinate: ");
	int x2=sc.nextInt();
	int y2=sc.nextInt();
	
	Point2D obj=new Point2D(x1,y1,x2,y2);
	obj.getDetails();
	
	
if(obj.isEqual())
{
	System.out.println("Distance is Zero(Both cordinates are same)");
}
else
{
	double dist=obj.calculateDistance();
	System.out.println("Distance between X and Y Cordinates: "+dist);
}
	
	
}
}
