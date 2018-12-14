import java.util.*;
class For12
{
   public static void main(String args[])
   {
	for(int i=1;i<=5;i++)
	{
	     for(int j=i;j<5;j++)
		{
		System.out.print("  ");
		}
	for(int k=1;k<(i*2);k++)
	{
	System.out.print(" *");
	}
	System.out.println();
	}
    }
}
/*output:
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
for(int i=5;i>=1;i--)
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
*/
/*
import java.util.Scanner;
public class For13
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        Character c;
        System.out.println("Enter height of the triangle : ");
        size = sc.nextInt();
        System.out.println("Which character you want to use : ");
        c = sc.next().charAt(0);
        int i, j, k;
        for (i = 0; i < size + 1; i++) { for (j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (2 * i - 1); k++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

*/