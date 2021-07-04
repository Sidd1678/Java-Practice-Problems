class Student
{
	private String name;
	private int roll;
	
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void getName()
	{
		System.out.println(name);
	}
	
	public void getRoll()
	{
		System.out.println(roll);
	}
}

public class Encapsulation
{
	public static void main(String args[])
{
	Student s=new Student();
	s.setName("sidd");
	s.setRoll(19);

	s.getName();
}
}