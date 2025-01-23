package inheritance;

public class HierarchialchildA extends HierarchialParent
{
	public static void main(String args[])
	{
		HierarchialchildA obj=new HierarchialchildA();
				obj.display();
				obj.display1();
		
	}
	public void display1()
	{
		System.out.println("child class");
		
	}

}
