import java.util.*;
class Add
{
int sum=0,n;

Scanner sc=new Scanner(System.in);

void sum()
{
n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;++i)
{
arr[i]=sc.nextInt();
sum+=arr[i];
}
System.out.print(sum);
}
}

class VariableLengthArgument
{
int sum=0;
void sum(int ... n)
{
for(int i : n)
sum+=i;
System.out.println(sum);
}

}
public class Demo2
{
public static void main(String args[])
{
VariableLengthArgument obj=new VariableLengthArgument();
obj.sum(1,2,3,4,5);
}}