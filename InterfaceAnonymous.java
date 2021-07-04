interface A
{
	void Add(int i,int j);
	default void Show()
	{
		System.out.println("in interface A show");
	}
}
interface C
{
	default void Show()
	{
		System.out.println("in interface C show");
	}
}
class B implements A,C
{
	public void Add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void Show()
	{
		C.super.Show();
	}
}
public class InterfaceAnonymous
{
	public static void main(String args[])
	{
		A obj=new B();
		obj.Add(6,7);
		obj.Show();
	}
}