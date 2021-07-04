interface Writer
{
	abstract void write();
}
class Pen implements Writer
{
	public void write()
	{	
		System.out.println("i am a pen");
	}
}
class Pencil implements Writer   
{
	public void write()
	{	
		System.out.println("i am a pencil");
	}
}
class kit
{
	public void doSomething(Writer p)
	{
	p.write();
	}
}	
public class Interface
{
	public static void main(String args[])
	{	
		Pen p=new Pen();
		Pencil pc=new Pencil();
		kit k=new kit();
		k.doSomething(pc);
	}
}