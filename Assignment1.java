import java.util.*;
class Assignment1
{
public static void main(String args[])
{
int t,Days,Hours,Minutes,sec;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the time in second:");
   t = sc.nextInt();
Days = t/(24*3600);
t= t%(24*3600);
Hours = t/3600;
t = t%3600;
Minutes = t/60;
t = t%60;
sec = t;
System.out.println(Days+" days "+Hours+" hrs "+Minutes+" min "+sec+" sec");
}
}