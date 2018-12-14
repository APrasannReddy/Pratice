import java.util.Scanner;
class Fibonacci 
{
public static void main(String[] args) 
{
int i,no, first=0, second=1, next;
Scanner s=new Scanner(System.in);
System.out.println("Enter nubmer of terms for Series: ");
no=s.nextInt();
first=0;
second=1;
System.out.println("Fibonacci series are: ");
 for(i=0; i<no; i++)
 {
  System.out.print(first+" ");
  next = first + second;
  first = second;
  second = next;
  }
}
}
/* output:
Enter nubmer of terms for Series:
6
Fibonacci series are:
0 1 1 2 3 5 */