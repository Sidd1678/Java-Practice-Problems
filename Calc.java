class Calcu
{
	Calcu()
	{
		System.out.println("in a");
	}
	
	Calcu(int n)
	{
		System.out.println("in a int");
	}
	public int sum(int i,int j)
	{
		return i+j;
	}
	int sub(int i,int j)
	{
		System.out.println("Calcu");
		return i-j;
	}
}

class Calcu1 extends Calcu
{
	
	Calcu1()
	{
		super();
		System.out.println("in b");
	}

	Calcu1(int n)
	{
		super(7);
		System.out.println("in b int");
	}
	int sub(int i,int j)
	{
		System.out.println("Calcu1");
		return i-j;
		
	}
	public int sum(int i,int j)
	{
		System.out.println("Calcu1");
		return 999;
	}
} 

class Calcu2 extends Calcu1
{
	Calcu2()
	{
		super();
		System.out.println("in c");
	}


	Calcu2(int n)
	{
		super(6);
		System.out.println("in c int");
	}
	int multi(int i,int j)
	{
		return i*j;
	}
}

public class Calc
{
	public static void main(String args[])
	{
		//Calcu obj=new Calcu();
		Calcu2 obj=new Calcu2(5);
		
		System.out.println(obj.sum(5,6));
		System.out.println(obj.sub(6,5));
		System.out.println(obj.multi(6,5));
	}
}