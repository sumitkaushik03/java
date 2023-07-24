package day_2;

public class project_1 
{
	public static void main(String args[])
	{
		Area ar=new Area();
		ar.area(5);
		ar.area(4,6);
		ar.area(4,5,7);
		
	}

}
class Area
{
	int length,breadth,width;
	void area(int length)
	{
		System.out.println("area of square="+length*length);
		
	}
	void area(int length,int breadth)
	{
		System.out.println("area of rectangle="+length*breadth);
	}
	void area(int length,int breadth,int width)
	{System.out.println("area of rectangle="+length*breadth*width);
	}
	
}
