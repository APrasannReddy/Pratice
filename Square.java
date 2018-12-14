class Square
{
    public static void main(String args[])
    {
    int n = 123, sqr = 0;
    int sum = 0;
    int r = 0;
    int t = n;

	for(int i = 1;i<3;i++)
        {
	r = n%10;
	sqr = r*r;
	sum = sum+sqr;
	n = n/10;
        }
	System.out.println(sum);
	
    }
}
//output:   13