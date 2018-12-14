class ForAlpha2
{
   public static void main(String args[])
   {
	
	for(int i=1;i<6;i++)
	{
	    char ch ='A'; 
	    for(int j=0;j<5;j++)
	      {
		System.out.print( ch+ " ");
		ch++;
	      }
		
	      
	   System.out.println();
	}
    }
}

/*
char ch ='A'; 
above the i
output:
A B C D E
F G H I J
K L M N O
P Q R S T
U V W X Y

output:
if i delace char ch =a;
below the i and above the j
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
*/