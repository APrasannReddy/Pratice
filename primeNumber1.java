
public class primeNumber1
{
	
	public static String printPrimeNums(int num)
	{
		String result = "";
		int i = 2;
		boolean isPrime = true;
		while(i <= Math.sqrt(initialNum))
		{
			if(num % i == 0)
				{
					isPrime = false;
					break;
				}
				i++;
			}
			if(isPrime)
				result = result + num + " ";
				//System.out.println(initialNum);
			num++;
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(printPrimeNums(30));
		//printPrimeNums(10, 30);
	}

}
