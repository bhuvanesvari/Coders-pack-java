import java.io.*;
import java.util.Scanner;
class BinAdd{
   pubic static void main(String[] args){
    String b1,b2,res;int a,b,add;
    Scanner s=new Scanner(System.in);
    b1=s.nextInt();
    b2=s.nextInt();
    a=Integer.parseInt(b1,2);
   b=Integer.parseInt(b2,2);
    add=a+b;
    res=Integer.toBinaryString(add);
  System.out.println(res);
}
}