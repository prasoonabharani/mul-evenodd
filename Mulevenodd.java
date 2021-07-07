import java.util.*;
class Mulevenodd
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int e=0,o=0, m=0;
System.out.println("Enter array size=");
int n=sc.nextInt(); 
int arr[]=new int[n];
System.out.println("Enter array elemnts =");
for (int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(arr[i]%2==0)
{e++;}
else
{o++;}
}
m=e*o;
if(m%2==0)
{
System.out.println("EVEN");
}
else
{System.out.println("ODD");}
}}