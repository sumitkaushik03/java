package as1;

public class a2  extends Room
{
	int height;
	public void getData(int length,int breadth,int height)
	{
		this.length=length;
			this.height=height;	
			this.breadth=breadth;
	}
    void printArea() 
    {
    	System.out.println("area of bedroom:"+length*breadth* height);
    	
    }
	public static void main(String[] args)
	{
		Room rm=new Room();
		Bedroom bdrm=new Bedroom();
		rm.getData(10, 5);
		rm.printArea();
		bdrm.getData(10,5,2);
		bdrm.printArea();
	}

}

}
