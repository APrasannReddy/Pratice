public class Fibonacci01
{
	public static String getFibonacciSeries(int num)
	{	
		int i = 2;
		int firstNum = 1, secondNum = 2;
		String result = "";
		result = result + firstNum + "," + secondNum;
		while(i <= 38)
		{
			int thirdNum = firstNum + secondNum;
			result = result + "," + thirdNum;
			firstNum = secondNum;
			secondNum = thirdNum;
			i++;
			if( num >= 40)
				return "-1";

		}
		return result;
		
	}
	

	public static void main(String[] args) 
	{
		System.out.println(getFibonacciSeries(40));

	}

} 
