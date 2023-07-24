package day_2;

public class Project2 
{
	public static void main(String[] args)
	{
		for(int num=2;num<=100;num++)
		{
		int i=2;	
		while(i<num) 
		{
			if(num%i==0) 
			{
				//System.out.println("number is not prime");
				break;
			}
			i++;
		}
		if(num==i)
		{
			//System.out.println("number is prime");
			System.out.println(num);
		}
		}
	}
	
}


	