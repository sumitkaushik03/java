package day_2;

public class room 
{
	int length,breadth;
	public void getData(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
		
	}
	void printArea()
	{
		System.out.println("area="+length*breath);	
	}
	int getLen()
	{
		return length;
	}
	int getBred()
	{
		return breadth;
	}
}