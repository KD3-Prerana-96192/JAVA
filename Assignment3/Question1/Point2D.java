package com.app.geometry;
public class Point2D
{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Point2D(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public String getDetails()
	{
		//return String.format("xcorr:%d,%d"+x1,y1+"ycorr:%d,%d:"+x2,y2);
		return "x corr"+"("+x1+","+y1+")"+"  y corr"+"("+x2+","+y2+")";
	}
	
	public boolean isEqual()
	{
		if(x1==x2 && y1==y2 )
			return true;
		else
			return false;
	}
	
	public double calculateDistance()
	{
		//d=/(x2-x1)^2+(y2-y1)^2 //1,2,3,4    x1,y1,x2,y2  3-1=2=4 4-2=2=4==
		double distance= Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		return distance;
	}
	
	
}

