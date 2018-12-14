
public class Fibonacci011
{
		public static String getFibonacciSeries(int num)
		{
			if(num >= 40 || num < 1)
				return "-1";
			
			if(num == 1)
				return "0";
			if(num == 2)
				return "0,1";
			
			int i = 1;
			int firstNum = 0, secondNum = 1;
			String result = "";
			result = result + firstNum + "," + secondNum;
			while(i <= num-2)
			{
				
				int thirdNum = firstNum + secondNum;
				result = result + "," + thirdNum;
				firstNum = secondNum;
				secondNum = thirdNum;
				i++;				
			}
			return result;
			}	
		
			
		public static void main(String[] args) 
		{
			System.out.println(getFibonacciSeries(45));
			System.out.println(getFibonacciSeries(-1));
			System.out.println(getFibonacciSeries(0));
			System.out.println(getFibonacciSeries(1));
			System.out.println(getFibonacciSeries(2));
			System.out.println(getFibonacciSeries(7));
		}

	} 
