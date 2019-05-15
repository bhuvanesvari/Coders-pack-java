import java.util.Scanner;
class min
{
	public static void main(String args[])
	{
	   int minute,year,days;
	   year=0;
	   days=0;
	   Scanner sc;
	   sc=new Scanner(System.in);
	   System.out.println("Minutes: ");
	   minute=sc.nextInt();
	   
	   year=(int)(minute/525600);//i year=525600 minutes
	   int m=minute-year*525600;
	   days=(int)(m/1440); // 1 day=1440minutes
	   System.out.println(minute+" is approximately "+year+" years "+days+" days.");
	}
}