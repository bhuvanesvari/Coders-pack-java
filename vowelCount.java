import java.util.Scanner;
class vowelCount
{
	public static void main(String args[])
	{
		Scanner sc;
		System.out.println("Enter the string: ");
		sc=new Scanner(System.in);
		int count=0;
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
			{
				count++;
			}
		}
		System.out.println("The total vowel count in the string is "+count);
	}
}