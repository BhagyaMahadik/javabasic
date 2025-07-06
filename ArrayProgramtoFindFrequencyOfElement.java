package AB55;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayProgramtoFindFrequencyOfElement {

	public static void main(String[] args) 
	{
		int []array1= new int[6];
		array1[0]=78;
		array1[1]=11;
		array1[2]=54;
		array1[3]=78;
		array1[4]=11;
		array1[5]=100;

		Arrays.sort(array1);
		int count=1;
		System.out.println(Arrays.toString(array1));
		for(int i=1; i<array1.length; i++)
		{
			if(array1[i]==array1[i-1])
			{
				count++;
				
				
			}
			else
			{
				System.out.println("The element at index " +(i-1) +" has occured  " +count);
				count=1;
			}
		}
		
		System.out.println("The element at index " +(array1.length-1) +" has occured  " +count);
	}

}
