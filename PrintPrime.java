import java.util.Scanner;
class PrintPrime
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no to print prime no ");
		int n =s.nextInt();
		int i,j;
		for( i=2;i<n;i++)
		{
			for(j=2;j<i;j++)
				if(i%j==0)
				{
					break;
				}
			if(i==j)
				System.out.println(i);
		} 

	}
}