class Armstrong
{
    public static void main(String args[])
    {
    int n = 153, cube = 0;
    int sum = 0;
    int r = 0;
    int t = n;

	for(int i = 1;i<4;i++)
        {
	r = n%10;
	cube = r*r*r;
	sum = sum+cube;
	n = n/10;
        }
	System.out.println(sum);
	if (t == sum)
	System.out.println("given number is armstrong");
	else 
	System.out.println("given number is not armstrong");
    }
}