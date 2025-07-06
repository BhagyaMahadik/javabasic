package AB55;

import java.util.Arrays;

public class ArrayProblem4 {

	public static void main(String[] args) 
	{
		
		String a="manish";
		a.length();
		int[]array1= new int[3];
		array1[0]= 64;
		array1[1]= 60;
		array1[2]= 84;
		
		int[]array2= new int[array1.length];
		
		for(int i=0; i<array1.length; i++)
		{
		array2[i]= array1[i];
		//array2[1]= array1[1];
		//array2[2]= array1[2];
		}
		
		System.out.println("This is my 1st array:" +Arrays.toString(array1));
		System.out.println("This is my copied array:" +Arrays.toString(array2));
		

	}

}
