class For14
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
				if(i>j)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/*output:
System.out.print(i+" ");
1 1 1 1 1
 2 2 2 2
  3 3 3
   4 4
    5
System.out.print(i+" ");
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
*/

