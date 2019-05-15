import java.util.Scanner;
class matAdd
{
	public static void main(String args[])
	{
		int m,n;
		System.out.println("Enter the row and column size of the matrix : ");
		Scanner sc;
		sc=new Scanner(System.in);
	    m=sc.nextInt();
		n=sc.nextInt();
		int a1[][]=new int[m][n];
		int a2[][]=new int[m][n];
		int sum[][]=new int[m][n];
		System.out.println("Enter the elements of the matrix 1: ");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Enter the elements of the matrix 2: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum[i][j]=a1[i][j]+a2[i][j];
			}
		}
		System.out.println("The sum is ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		