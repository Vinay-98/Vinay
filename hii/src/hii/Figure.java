package hii;

public class Figure 
{
	int shape(int length, int breadth)
	{
		return length*breadth;
	}
	double shape(double radius)
	{
		return Math.PI*Math.pow(radius,2);
	}
	double shape(int length)
	{
		return Math.pow(length,2);
	}
	}
class Run
{
	public static void main(String[] args)
	{
		Figure fg=new Figure();
		System.out.println(fg.shape(5)+"sqcms");
	}
}
