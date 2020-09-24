// Write a program to check whether the string is palindrome or not

import java.util.*;
class Pallindrome
{
public static void main (String args[])
{
String s1,s2="",org_str;
int n,i=0; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String:");
  s1 = sc.next();
  org_str = s1;
  n = s1.length();
for(i=n-1;i>=0;i--)
{
 s2 = s2+s1.charAt(i);
}
System.out.println("Reverse of a string is:"+s2);
if(org_str.equals(s2))
{
System.out.println("It is  a pallindrone");
}
else
{
System.out.println("It is  not a pallindrome");
} 
}
}