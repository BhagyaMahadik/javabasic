package AB55;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem2 {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("ENter the size of array at runtime:");
		int []rollno=new int[s1.nextInt()];
		
		
		for(int i=0; i<=rollno.length-1; i++)
		{
			System.out.println("Enter the value of index position :"  + i);
		rollno[i]= s1.nextInt();

		}
		
		
		/*for(int i=0; i<4; i++)
		{
			System.out.println(rollno[i]);
		}*/
		
		System.out.println("The output array is: " +Arrays.toString(rollno));
		
		s1.close();
		
	}

}
