import java.util.Scanner;
class small
{
	protected int x,y,z;
	public small()
	{
		x=y=z=0;
	}
	public small(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void smallestnum()
	{
		if(x<y && x<z)
		{
			System.out.println("The smallest number among "+ x +" "+ y +" "+ z +" is "+ x);
		}
		else if(y<x && y<z)
		{
			System.out.println("The smallest number among "+ x +" "+ y +" "+ z +" is "+ y);
		}
		else
		{
			System.out.println("The smallest number among "+ x +" "+ y +" "+ z +" is "+ z);
		}
	}
}
class smallDemo
{
	public static void main(String args[])
	{
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		small s=new small(x,y,z);
		s.smallestnum();
	}
}
		