import java.util.Scanner;

class Circle
{
   protected double radius;
   public Circle()
     {
       radius=0;
      }
   public Circle(double radius)
      {
        this.radius=radius;
       }
   public double area()
       {
         return 3.14*radius*radius;
        }
   public double perimeter()
       {
          return 2*3.14*radius;
        }
}
class CircleDemo
{
   public static void main(String args[])
        {   
            Scanner sc;
            System.out.println("Enter the radius of the circle for which the perimeter and area must be determined");
            sc=new Scanner(System.in);
            double r=sc.nextDouble();
            Circle C=new Circle(r);
            System.out.println("The area of the circle of radius "+r+" is "+C.area());
            System.out.println("The perimeter of the circle of radius "+r+" is "+C.perimeter());
         }
}


            