package AB55;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) 
	{
		
		
		

		try 
		{
			Scanner s1=new Scanner(System.in);
			int array1[]= new int[s1.nextInt()];
		}
		catch(InputMismatchException c1)
		{
			System.out.println("Bhagya");
			try 
			{
				Scanner s1=new Scanner(System.in);
				int array1[]= new int[s1.nextInt()];
			}
			catch(InputMismatchException c2)
			{
				System.out.println("Bhagya");
			}

		}
		catch(NegativeArraySizeException c2)
		{
			System.out.println("Bhagya2 ");
		}
		//nested try catch block
	}

}
