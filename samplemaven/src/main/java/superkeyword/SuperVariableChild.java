package superkeyword;

public class SuperVariableChild extends SuperVariable1
{
	String color="blue";
	
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
		
		
	}
	
	

	public static void main(String[] args) 
	{
		SuperVariableChild obj=new SuperVariableChild();
		obj.display();
		// TODO Auto-generated method stub

	}

}
