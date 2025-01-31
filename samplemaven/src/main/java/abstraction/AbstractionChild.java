package abstraction;

public class AbstractionChild extends Abstraction1 {

	public static void main(String[] args) 
	{
		//AbstractionChild obj=new AbstractionChild();//object creation
		Abstraction1 obj=new AbstractionChild();//reference creation
		obj.display();
		obj.display1();
		
		
	}
		
		public void display3()
		{
			System.out.println("age");

	
		
	
			
		}
				
		// TODO Auto-generated method stub

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("name");
		
	}

}
