interface A
{
	void Add(int i,int j);
}

class B implements A
{
	public void Add(int i,int j)
	{
		System.out.println(i+j);
	}
}
public class Interface1
{
	public static void main(String args[])
	{
		A obj=new B();
		obj.Add(4,5);
	}
}