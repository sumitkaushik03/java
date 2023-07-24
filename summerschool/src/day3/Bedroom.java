package day3;

public class Bedroom extends Room
{
	int height;
	Bedroom(int length,int breadth,int height)
	{
		super(length,breadth);
		this.height=height;
	}
	void volume()
	{
		System.out.print("volume of room="+length*breadth*height);
	}
	public static void main(String args[])
	{
		Bedroom br=new Bedroom(10,15,10);
		br.area();
		br.volume();
	}

}
