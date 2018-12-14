class ForAlpha
{
   public static void main(String args[])
   {
	
	for(int i=1;i<6;i++)
	{
	    char ch ='A'; 
	    for(int j=0;j<i;j++)
	      {
		System.out.print(ch + " ");
	      }
	      ch++;
	   System.out.println();
	}
    }
}

/*output:
System.out.print(ch+ " ");
ch++;
A
B B
C C C
D D D D
E E E E E
output:
A
A B
A B C
A B C D
A B C D E
System.out.print(ch++ + " ");
*/

