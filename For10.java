
class For10
{
   public static void main(String args[])
   {
	for(int i=1;i<=5;i++)
	{
	   if(i==3)
	    {
	     System.out.print(" * ");
	    }
	else
	{
	    for(int j=1;j<=5;j++) 
                   {
		   System.out.print(" * ");
                   }
               }
            System.out.println();
       }
    }
}
/*output:
 *  *  *  *  *
 *  *  *  *  *
 *
 *  *  *  *  *
 *  *  *  *  *
*/