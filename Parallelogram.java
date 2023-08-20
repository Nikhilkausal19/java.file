import java.util.Scanner;
class parallelogram
{
	public static void main(String args[])
	{
	int a,b,h;
	Scanner s=new Scanner(System.in);
	System.out.println("enter 2 int value");
	b=s.nextInt();
	h=s.nextInt();
	a=b*h;
	System.out.println("area of Parallelogram="+a);
	}
}