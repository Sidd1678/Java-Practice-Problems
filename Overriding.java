class A
{
public void show1()
{
	System.out.println("in A");
}
}

class B extends A
{
public void show()
{
	System.out.println("in B");
}
}

public class Overriding
{
	public static void main(String args[])
	{
		A obj=new B();
		obj.show();
	}
}