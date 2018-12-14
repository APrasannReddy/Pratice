import java.util.*;
class EvenOdd
{
    public static void main(String args[])
    {
    int esum = 0;
    int osum = 0;

	for(int i = 1;i<5;i++)
        {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	 if(n%2 == 0)
	 {
	     esum = esum+n;
	     if(esum%2 == 0)
	     {
		System.out.println("esum number even");
	     }
	     else
	      {
		System.out.println("esum number odd");
	      }
        }
	else
	  {
	     osum = osum+n;
	     if(osum%2 == 0)
	     {
		System.out.println("esum number even");
	     }
	     else
	     {
		System.out.println("esum number odd");
	     }
        }
	System.out.println("esum="+esum);
	System.out.println("osum="+osum);
       }
    }
}