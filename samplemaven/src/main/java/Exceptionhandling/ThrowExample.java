package Exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) 
	{
		int age=8;
		if (age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("age under 18");
			
		}
		
		
		// TODO Auto-generated method stub

	

		// TODO Auto-generated method stub
		
	}

}
