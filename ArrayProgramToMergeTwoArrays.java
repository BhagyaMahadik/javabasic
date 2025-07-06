package AB55;

import java.util.Arrays;

public class ArrayProgramToMergeTwoArrays {

	public static void main(String[] args) 
	{
		int []array1=new int [3];
		array1[0]= 11;
		array1[1]= 22;
		array1[2]= 33;
		
		
		int []array2=new int [3];
		array2[0]= 66;
		array2[1]= 77;
		array2[2]= 55;

		int[] arraymerged= new int[array1.length+array2.length];
		
		for(int i=0; i<array1.length; i++)
		{
			arraymerged[i]=array1[i];
		}
		for(int j=0; j<array2.length; j++)
		{
			arraymerged[array1.length+j]=array2[j];
		}
		
		System.out.println("This is my merged array: ");
		System.out.println(Arrays.toString(arraymerged));
	}

}
