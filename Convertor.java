import java.util.*;
class Convertor
{
public static void main(String args[])
{
double ft,inch,wt,height,weight;
double d1 = 2.54,d2= 2.2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the height in feet and inches:");
   ft = sc.nextDouble();
   inch = sc.nextDouble();
System.out.println("Enter the weight in kg:");
    wt = sc.nextDouble();
    
  height = ((ft * 12)+inch) * d1;
  weight = (int)wt * d2;
System.out.println("Height in cmm is:"+height);
System.out.println("Weight in pound is:"+weight);
}
}