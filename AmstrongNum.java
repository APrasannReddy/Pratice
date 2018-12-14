class AmstrongNum
{
	public static void main(String args[])
	{
		int num = 153;
		int sum = 0, temp = num;
		while(num != 0)
		{
		    int rem = num%10;
		    sum += Math.pow(rem, 3);
		    num = num/10;
		}
		if(sum == temp)
			System.out.println("is amstrong num");
		else
			System.out.println("is not amstrong num");
	}
}
