package AB55;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperties {

	public static void main(String[] args) 
	{
		Set<Integer> s1= new HashSet <Integer>();
		s1.add(74);
		s1.add(55);
		s1.add(747);
		s1.add(7489);
		s1.add(7489);
		
		System.out.println(s1);
		System.out.println("Iteration using Iterator: ");
		
		Iterator<Integer> i2= s1.iterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}

	}

}
