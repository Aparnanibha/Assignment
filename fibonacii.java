// Print the fibonaccii series

import java.util.*;
class fibonacii
{
public static void main(String args[])
{
int n,temp,i,cur=1,prev=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
  n = sc.nextInt();
System.out.print(prev+"\t"+cur);
for(i=3;i<=n;i++)
{
temp = cur;
cur = cur+prev;
prev = temp;
System.out.print("\t"+cur);
}
}
}
 
