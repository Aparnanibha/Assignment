import java.util.*;
class Assignment3
{
public static void main(String args[])
{
int d;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the date :");
 d = sc.nextInt();
if(d % 4 ==0 && d%100 != 0)
System.out.println(" Date Leap year");
else
System.out.println("Date is non leap year");
}
}