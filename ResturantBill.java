import java.util.*;
class ResturantBill
{
public static void main(String args[])
{
float p1,p2,p3,taxpercent,sum = 0,taxamount,finalamount;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the price of the three product:");
   p1 = sc.nextFloat();
   p2 = sc.nextFloat();
   p3 = sc.nextFloat();
  sum = p1+p2+p3;
System.out.println("Enter the tax percentage on all the product:");
     taxpercent = sc.nextFloat();
   taxamount = (taxpercent/100)*sum;
   finalamount = taxamount + sum;
System.out.println("tax amount of the product is:"+taxamount);	
System.out.println("Final amount of the product is : "+finalamount);
}
}
