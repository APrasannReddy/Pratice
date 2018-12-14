class A
{
    public static void main(String args[])
    {
    int n = 2378;
    int sum = 0;
    int r = 0;

	for(int i =1;i<4;i++)
        {
	r = n%10;
	sum = sum+r;
	n = n/10;
        }
	System.out.println(sum);
    }
}

//output: 18