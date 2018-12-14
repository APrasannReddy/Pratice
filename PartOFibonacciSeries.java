
public class PartOFibonacciSeries
{
	public static boolean isPartOfFibSeries(int num)
	{
		int firstNum=0;
		int secondNum=1;
		int result=firstNum+secondNum;

	while(result<num)
	{
	firstNum = secondNum;
	secondNum = result;
	result=firstNum+secondNum;
				
}
return result != num;
	}
public static void main(String[] args) 
{
	int num=4;
	if(isPartOfFibSeries(num))
		System.out.println(num+" is a part of fibonacci series");
	else
		System.out.println(num+" is not a part of fibonacci series");
}
}