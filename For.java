	class For
{
	public static void main(String args[])
	{
		int i,j,k=1;
		for(i=0;i<=5;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(k%2);
				k++;
			}
			System.out.println();
		}
	}
}