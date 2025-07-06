package AB55;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgram4 {

	public static void main(String[] args) 
	
	{
		ArrayList <Integer> a1= new ArrayList<Integer>();
		a1.add(7);
		a1.add(71);
		a1.add(47);
		a1.add(35);
		a1.add(1, 89);
		System.out.println(a1);
		
		System.out.println(a1.lastIndexOf(71));
		
		
		Iterator<Integer> i1=  a1.iterator();
		//i1.next();       //->object
		//i1.hasNext();        //boolean
		
		/*System.out.println("Iteration started: ");
		
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}*/
		
		ListIterator<Integer> i2= a1.listIterator();
		//hasnext---boolean
		//next----object
		//hasprevious---boolean
		//previous----object
		/*System.out.println("Forward iteration using ListIterator: ");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Backward iteration using ListIterator: ");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}*/
		
		

	}

}
