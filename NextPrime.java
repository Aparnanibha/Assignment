//write a program to get a next prime

import java.util.*;
class NextPrime
{
public static void main(String args[])
{
int n,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
  n = sc.nextInt();
for(i=1;i<n/2;i++)
{
if(n%i==0)
{
System.out.println("prime number");
}
else
{
System.out.println("Not prime");
}
}
}
}