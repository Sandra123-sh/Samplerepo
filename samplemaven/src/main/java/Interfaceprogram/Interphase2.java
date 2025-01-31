package Interfaceprogram;

public class Interphase2 implements Interface1

{
	public void show()
	{
		System.out.println("show method");
	}

	public static void main(String[] args) 
	{
		Interphase2 obj=new Interphase2();
		Interface1 obj1=new Interphase2();
				obj.display();
				obj.show();
				obj1.display();
				
				
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ammu");
		
	}

}
