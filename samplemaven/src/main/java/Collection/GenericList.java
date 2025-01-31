package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) 
	{
		List<String> s=new ArrayList<String>();
		s.add("Violet");
		s.add("red");
		s.add("green");
		s.add("white");
		s.add("blue");
		s.add("yellow");
		System.out.println(s);
		System.out.println(s.get (5));
		s.set(5, "BROWN");
		System.out.println(s);
		System.out.println(s.indexOf("BLUE"));
		System.out.println(s.lastIndexOf("YELLOW"));
		s.remove(4);
		System.out.println(s.contains("BLACK"));
		System.out.println(s.contains ("White"));
		
			
		
		
		
	}
}

	
		
		// TODO Auto-generated method stub


