package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent
{
	public SuperConstructorChild()
	{
		super(5,6);
		System.out.println("Default constrcutor");
	}

	public static void main(String[] args) 
	{
		SuperConstructorChild obj =new SuperConstructorChild();
	 
		// TODO Auto-generated method stub

	}

}
