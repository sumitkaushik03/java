package as1;

public class a1 
{
	int length,breadth;
	public void getData(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	void printArea()
	{
		System.out.println("area="+length*breadth);	
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
