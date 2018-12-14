
public class primeNumber
{
	
	public static String printPrimeNums(int initialNum, int finalNum)
	{
		String result = "";
		while(initialNum <= finalNum)
		{
			int i = 2;
			boolean isPrime = true;
			while(i <= Math.sqrt(initialNum))
			{
				if(initialNum % i == 0)
				{
					isPrime = false;
					break;
				}
				i++;
			}
			if(isPrime)
				result = result + initialNum + " ";
				//System.out.println(initialNum);
			initialNum++;
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(printPrimeNums(10, 30));
		//printPrimeNums(10, 30);
	}

}
