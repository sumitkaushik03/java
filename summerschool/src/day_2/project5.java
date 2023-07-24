package day_2;

public class project5 extends room
{
	int height;
	public void getData(int length,int breath,int height)
	{
		this.length=length;
		this.height=height;	
		this.breath=breath;
	}
	void printArea()
	{
		System.out.println("area="+length*breath*height);
	}
	public static void main(String[]args)
	{
		room rm=new Room();
		Bedroom bdrm=new Bedroom();
		rm.getdata(10,5);
		rm.printarea();
		bdrm.getdata(25);
		bdrm.prontArea();
	}

}
