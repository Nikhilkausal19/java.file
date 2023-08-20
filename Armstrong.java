import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
	int n,d,p,s=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the n");
	n=obj.nextInt();
	p=n;
	while(n>0)
	{
		d=n%10;
		s=s+d;
		n=n/10;
	}
	   System.out.println("sum of digits="+s);
	}
}
