class A
{

A()
{
	i=10;
}
final int i=0;
}
public  class FinalDemo
{
	public static void main(String args[])
	{
		A obj=new A();
		System.out.print(obj.i);
	}
}
