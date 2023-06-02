package hii;

public class Currentbill {

	public static void main(String[] args) 
	{   double discount;
		double amount=0;
		int unit=240;
		if(unit>0 && unit<=50)
		{
		amount=unit*1;
		}
		else if(unit>50 && unit<=100)
		{
		amount=(50*1)+(unit-50)*2;
		}
		else if(unit>100 && unit<=150)
		{
		amount=(50*1)+(50*2)+(unit-100)*3;
		}
		else if (unit>150 && unit<=200)
		{
		amount=(50*1)+(50*2)+(50*3)+(unit-150)*4;
		}
		else if(unit>200)
		{
		amount=(50*1)+(50*2)+(50*3)+(50*4)+(unit-200)*5;
		{
		discount=((amount*10)/100);
		System.out.println("The discount is" + discount);
		amount=amount-discount;
		}
		}
		else
		{
		System.out.println("Invalid Input");
		System.out.println("Current bill is" + amount+"Rs");
		}
		
		
		}
	}


