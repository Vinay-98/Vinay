package hii;

public class Fibinocciseries 
{
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2);
		for(int i=1;i<=5;i++)
		{
			int n3=n2+n1;
		System.out.println(" "+n3);
		n1=n2;
		n2=n3;
		}
	}

}
