package AB55;

import java.util.Scanner;
import java.util.InputMismatchException;

public class HumanInputAtRuntime2 {

	static void area_of_circle()
	{
		System.out.println("Enter the value of R");
		Scanner s1= new Scanner(System.in);
		double r= s1.nextDouble();
		System.out.println("Lets find out the AREA");
		double area= Math.PI*r*r;
		System.out.println("The area of circle is "+area);
		s1.close();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area_of_circle();
		
	}

}
