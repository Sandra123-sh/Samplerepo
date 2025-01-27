package superkeyword;

public class SuperMethodChild extends SuperMethod
{
	
	public void display()
	{
		System.out.println("this is the child");
		super.display();
		
	}

	public static void main(String[] args) 
	{
		SuperMethodChild obj=new SuperMethodChild();
		obj.display();
		// TODO Auto-generated method stub

	}

}
