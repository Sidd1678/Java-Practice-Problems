

public class AnonymousClass
{
	public static void main(String args[])
	{
		A obj=new A();
		{
		System.out.println("in B");
		}
		obj.Show();
	}
}