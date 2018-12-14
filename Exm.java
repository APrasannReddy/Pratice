/*Can we define sub class first and super class later in a java file ?
Yes, Order of sub class and super class does not matter.*/
class Exm extends Exm1
{
   static void m2()
   {
       System.out.println("with out main");
   }
   public static void main(String args[])
   {
	Exm obj = new Exm();
	m2();
	obj.m1();
   }
}
class Exm1
{
   void m1()
   {
	System.out.println("super calss m1 method");
   }
	
}