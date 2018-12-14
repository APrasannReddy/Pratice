import java.util.*;
class While
{
    public static void main(String args[])
    {
    int f=1;
	do
	{
	    System.out.println("enter a alphabet");
	    Scanner sc = new Scanner(System.in);
	    char ch = sc.next().charAt(0);
	        switch(ch)
		{
		    case 'a' : System.out.println("vowel");
			f=1;
			break;
		    case 'e' : System.out.println("vowel");
			f=1;
			break;
		    case 'i' : System.out.println("vowel");
			f=1;
			break;
		    case 'o' : System.out.println("vowel");
			f=1;
			break;
		    case 'u' : System.out.println("vowel");
			f=1;
			break;
		default:  System.out.println("not vowel please give vowel value");
			f=0;
		}
	  }

	while(f==0);
     }
}

/* output:
D:\durga online progs>java While
enter a alphabet
b
not vowel please give vowel value
enter a alphabet
e
*/


