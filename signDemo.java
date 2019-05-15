import java.util.Scanner;
class sign
{
	int num;
	public sign()
	{
		num=0;
	}
	public sign(int num)
	{
		this.num=num;
	}
	public void signofint()
	{
		if(num>0)
		{
			System.out.println("The number "+num+" is positive");
		}
		else if(num<0)
		{
			System.out.println("The number "+num+" is negative");
		}
		else
		{
			System.out.println("The number "+num+" is zero");
		}
	}
	
}
class signDemo
{
	public static void main(String args[])
	{
		Scanner sc;
	    sc=new Scanner(System.in);
	    System.out.println("Enter the number :");
	    int num=sc.nextInt();
	    sign S=new sign(num);
	    S.signofint();
	}
}	