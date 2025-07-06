package AB55;

import java.util.Arrays;

public class ArrayProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				int[]array1= new int[4];
				array1[0]= 64;
				array1[1]= 60;
				array1[2]= 84;
				array1[3]= 804;
				
				int[]array2= new int[array1.length];
				
				for(int i=0, j=array1.length-1; i<array1.length; i++, j--)
				{
					array2[j]=array1[i];
					
					
				}
				/*array2[0]= array1[3];
				array2[1]= array1[2];
				array2[2]= array1[1];
				array2[3]= array1[0];*/
				
				System.out.println("My input Array is Array1: " +Arrays.toString(array1));
				System.out.println("My Output Array is Array2:" +Arrays.toString(array2));
				
	}

}
