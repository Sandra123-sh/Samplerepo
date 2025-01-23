package inheritance;

public class Singlechild extends SingleParent {

	public static void main(String[] args) {
		
		Singlechild obj=new Singlechild();
		obj.display1();
		obj.display();
		
		// TODO Auto-generated method stub

	}
	public void display1()
	{
		System.out.println("child class");
	}

}
