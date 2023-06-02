package hii;

public class Traffic {

	public static void main(String[] args) 
	{  
		String color="orange";
	switch(color)
	{
	case "red":
	System.out.println("STOP");
	break;
	case "yellow": case "orange":
	System.out.println("READY");
	break;
	case "green":
	System.out.println("GO");
	break;
	default:  
	System.out.println("Invalid Input");
	}
		
	}

}
