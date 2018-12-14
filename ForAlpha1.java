class ForAlpha1
{
   public static void main(String args[])
   {
	char ch ='A'; 
	for(int i=1;i<6;i++)
	{
	    for(int j=0;j<i;j++)
	      {
		System.out.print( ch+ " ");
		ch++;
	      }
		
	      
	   System.out.println();
	}
    }
}
/*
output:

A
B C
D E F
G H I J
K L M N O
OUTPUT:
System.out.print( ch+ " ");
}
ch++;
A
B B
C C C
D D D D
E E E E E*/