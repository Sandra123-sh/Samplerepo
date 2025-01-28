package polymorphism;



public class PolymorphismParent extends Polymorphism1 
{
	

public static void main(String args[])
{
	PolymorphismParent obj=new PolymorphismParent();
	obj.display(5, 8);
	
	
	
}

	public void display(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
		super.display(6, 7);
		

}
}



