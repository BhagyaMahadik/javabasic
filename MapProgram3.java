package AB55;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> m1= new HashMap<Integer, String>();
		m1.put(46035586, "Bhagya");
		m1.put(46035587, "Anagha");
		m1.put(46035588, "Christy");
		System.out.println(m1);
		System.out.println("Iterating through values using keyset(): ");
		
		for (Integer i1       :   m1.keySet())
		{
			System.out.println(i1);
		}
		System.out.println("Iterating through values using values(): ");
		for (String s2       :   m1.values())
		{
			System.out.println(s2);
		}
		System.out.println("Iterating through values using entryset(): ");
		for (Entry<Integer, String> e2       :   m1.entrySet())
		{
			System.out.println(e2);
		}
		System.out.println("Iterating using iterator(): ");
		Set<Entry<Integer, String>>  s12= m1.entrySet();
		
		Iterator<Entry<Integer, String>>s3=  s12.iterator();
		
		while(s3.hasNext())
		{
			System.out.println(s3.next());
		}
		
		
	}

}
