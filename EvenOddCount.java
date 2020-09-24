/* Count odd and even digit
  eg = n=2468
 no of odd digit = 0
 no of even digit = 4 
*/


import java.util.*;
class EvenOddCount
{
public static void main(String args[])
{
int n,r,even_count=0,odd_count=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
 n = sc.nextInt();
while (n>0)
{
  r = n%10;
  if(r%2 == 0)
    even_count++;
  else
    odd_count++;
   n=n/10;
}
  System.out.println("Even digit are:"+even_count);
  System.out.println("Odd digit are:"+odd_count);
}
}