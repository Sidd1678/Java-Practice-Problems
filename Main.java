class Box
{
	int length,breath,height;
	void setDimension(int l,int b,int h)
{
	length=l;
	breath=b;
	height=h;
}
void showDimension()
{
	System.out.println("length"+ length);
	System.out.println("breath"+ breath);
	System.out.println("height"+ height);

}
}
class Main
{
	public static void main(String[] args)
{
	Box smallBox=new Box();
	smallBox.setDimension(2,4,8);
	smallBox.showDimension();
}
}
	