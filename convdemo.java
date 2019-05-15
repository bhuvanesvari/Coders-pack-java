import java.util.Scanner;
class conv
{
	protected double inch,metre;
	public conv()
	{
		inch=0;
		metre=0;
	}
	public conv(double inch)
	{
		this.inch=inch;
	}
	public double intomt()
	{
		metre=inch*0.0254;
		return metre;
	}
}
class convdemo
{
	public static void main(String args[])
	{
	Scanner sc;
	System.out.println("Enter the inch value : ");
	sc=new Scanner(System.in);
	double inch=sc.nextDouble();
	conv c=new conv(inch);
	System.out.println("Inch: "+inch);
	System.out.println("Metre: "+c.intomt());
	}
}