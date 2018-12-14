class For15 
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			if(i<j)
			{
				System.out.print(ch+" ");
				ch++;
			}
			else
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*output:
char ch = 'A';
inside the for loop i
A A A A A
 A A A A
  A A A
   A A
    A
if(i<j)
A B C D E
  F G H I
   J K L
    M N
     O

*/