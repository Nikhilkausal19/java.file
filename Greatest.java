import java.util.Scanner;
class Greatest
{
	public static void  main(String args[])
	{
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter 2 int value");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greatest");
			}
			else
			{
				System.out.println(c+"is greatest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is greatest");
			}
			else
			{
				System.out.println(c+"is greatest");
			}
		}
	}
}			