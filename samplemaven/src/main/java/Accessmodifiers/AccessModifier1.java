package Accessmodifiers;

public class AccessModifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier1 obj= new AccessModifier1();
		
				obj.display();
		        obj.display1();
		        obj.display2();
		        obj.display3();
		
		
		
		
	}
			
			public void display()
			{
				System.out.println("public");
			}
			
				private void display1()
				{
					System.out.println("private");
				}
				
				protected void display2()
		
				{
					
				System.out.println("protected");
				
				}
				void display3()
				{
					System.out.println("default");
				}
				
				
				
		

	}


