import java.util.Scanner;
class digitsum
{
  protected int num,sum;
  public digitsum()
   {
      num=0;
      sum=0;
    }
 public digitsum(int num)
   {
     this.num=num;
   }
 public int add()
   {
     while(num!=0)
     {sum+=num%10;    
     num/=10;}
     return sum;
   }
}
class digitsumDemo
{
  public static void main(String args[])
    {
       Scanner sc;
       int num;
       sc=new Scanner(System.in);
       System.out.print("Enter the number: ");
       num=sc.nextInt();
       digitsum n=new digitsum(num);
       System.out.println("The sum of the digits is "+n.add());
     }
}
  
          
          