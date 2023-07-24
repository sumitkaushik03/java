package day3;

public class Room
{
	int length,breadth;
	Room()
	{
		
	}
	Room(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	void area()
	{
		System.out.print("Area of room="+length*breadth);
	}

}
