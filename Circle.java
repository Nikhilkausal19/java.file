import java.util.Scanner;
class Circle
{
	public static void main(String args[])
	{
	double r,a;
	Scanner s=new Scanner(System.in);
	System.out.println("enter radius");
	r=s.nextDouble();
	a=3.14*r*r;
	System.out.println("area of circle"+a);
	}
}
	