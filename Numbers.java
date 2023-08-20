import java.util.Scanner;
class Numbers
{
	public static void main(String args[])
	{
		int a,b,c,g;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 3 int values");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		g=(a>b&&a>c)?a:(b>c?b:c);
		System.out.println(g+"is greater");
	}
}