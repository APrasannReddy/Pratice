class For3
{
   public static void main(String args[])
   {
	for(int i=1;i<6;i++)
	{
	    for(int j=1;j<6;j++)
	      {
		System.out.print(i*j+" ");
	      }
	   System.out.println();
	}
    }
}

/* output:
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10
System.out.print(i+j);
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25
System.out.print(i*j);*/
