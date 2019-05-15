import java.util.Scanner;
class cubeDemo
{
	
	public static void main(String args[])
	{
		int i,n;
		System.out.println("Number of terms: ");
		Scanner sc;
		sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Number is: "+i+" and cube is: "+i*i*i);
		}
	}
}