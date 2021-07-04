public class Test
{
private int x;

{
System.out.println("Initilization Block:x="+x);
x=5;
}
public Test()
{
System.out.println("Constructor:x="+x);
}
public static void main(String []args)
{
Hello t1=new Hello();
Test t2=new Test();
}
}


