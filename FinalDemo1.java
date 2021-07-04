class A
{
	public final void show()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	
	public void show2()
	{
		System.out.println("in B show");
		show();
	}
}

public class FinalDemo1
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show2();
	
	}
}
