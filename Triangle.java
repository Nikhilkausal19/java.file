import java.util.Scanner;
class Triangle
{
	public static void main(String args[])
	{
	int a,b,h;
	Scanner s=new Scanner(System.in);
	System.out.println("enter 2 int value");
	b=s.nextInt();
	h=s.nextInt();
	a=(b*h)/2;
	System.out.print("Area of triangle="+a);
	}
}