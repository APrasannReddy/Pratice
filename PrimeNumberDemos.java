class PrimeNumberDemos
{
   public static void printFHPrimeNums(int num)
   int count = 0;
   System.out.println("First 100 prime numbers are:");
   for ( int i = 2 ; i <= 100 ; )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num % j == 0 )
            {
               count = 0;
               break;
            }
         }
         if ( count != 0 )
         {
	     System.out.print(num + " ");
            i++;
         }
         count = 1;
         num++;
}
   public static void main(String args[])
   {
      printFHPrimeNums(num +" ");
   }        
}