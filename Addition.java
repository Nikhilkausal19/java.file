import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
	double x,y,z;
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter 2 double value");
	x=obj.nextDouble(); 
	y=obj.nextDouble();
	z=x+y;
	System.out.println("x="+x);
	System.out.println("y="+y);
	System.out.println("x+y="+z);
	System.out.println("Exit");
	}
}