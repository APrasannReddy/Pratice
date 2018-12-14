class Num1 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(" 2 ");
				}
				else
				{
					System.out.print(" 4 ");
				}
			}
			System.out.println();
		}
	}
}
/*output:
System.out.print(" 0 ");  here we can give number based on user requriments
 1
 1  0
 1  0  1
 1  0  1  0
 1  0  1  0  1
System.out.print(" 1 ");
 0
 0  1
 0  1  0
 0  1  0  1
 0  1  0  1  0

 */

