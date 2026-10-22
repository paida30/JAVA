//8.1 Write a java program to find ODD or EVEN number using command line argument.

class U1_P8_1
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}	
	}
}	
	
