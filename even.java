import java.io.*;
import java.util.*;
class even
{
public static void main(String args[])
{
int n;
int sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
sum+=i;
System.out.println("sum:"+sum);
}
}
}
}