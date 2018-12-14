class Num2 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

/*output:
System.out.print(j+" ");
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
System.out.print(i+" ");
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
*/
