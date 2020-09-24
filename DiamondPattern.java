// Write a program to print the half diamond pattern

import java.util.*;
class DiamondPattern
{
public static void main (String args[])
{
int n,i,j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter n:");
n = sc.nextInt();
for(i=0;i<n;i++)
{
 for(j=0;j<=i;j++)
{
  System.out.print("*");
}
System.out.println("\n");
}
for(i=1;i<n;i++)
{
 for(j=i;j<n;j++)
 {
  System.out.print("*");
  }
System.out.println("\n");
}
}
}


