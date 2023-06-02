package hii;

public class Primenumber
{

	public static void main(String[] args) 
	{
		int n=11;
		boolean flag=false;
		for(int i=2;i<=n-1; i++)
		{
			if(n%i==0)
		{
				flag=true;
				break;
		}
		}
			if(flag)
			{
		System.out.println("given number is not prime");
			}
			else
			{
			System.out.println("given number is prime");	
		}
	}

}
