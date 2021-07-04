 class Calc
{
	int num1;
	int num2;
	int result;
	
	public void perform()
	{
		result =num1+num2;
	}

	Calc()
	{
		System.out.println("hello");
	}

	Calc(int n)
	{
		result=44;
	}

	
	class Inner
	{
		Inner()
		{
		System.out.println("in display");
		}
	}


}
public class ObjectDemo
{
	public static void main(String args[])
	{
		Calc obj=new Calc();
		obj.num1=5;
		obj.num2=10;
		//obj.perform();
		Calc.Inner obj1=obj.new Inner();
		//obj1.display();
		//System.out.println(obj.result);
	}


}
