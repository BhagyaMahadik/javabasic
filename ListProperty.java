package AB55;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProperty {

	public static void main(String[] args) 
	{
	      List<Double> l1 =               	new ArrayList();
	      l1.add(6.35);
	      l1.add(6.35);
		
		
	      l1.add(9.35);
	      l1.add(11.35);
	      l1.add(12.35);
	      l1.add(9);
	      l1.add("Ram");
	      l1.add('C');
	      l1.add(null);
	      
	     // l1.add("Bhagya");
	      
	      System.out.println(l1);
	      
	      Iterator i2= l1.iterator();
	      while(i2.hasNext())
	      {
	    	  System.out.println(i2.next());
	      }
	      
	      ListIterator i3= l1.ListIterator();
	      while(i3.hasNext())
	      {
	    	  System.out.println(i3.next());
	      }
	      while(i3.hasPrevious())
	      {
	    	  System.out.println(i3.previous());
	      }
		
		
		

	}

}
