package AB55;

public class PrimitiveTypeCasting 
{

	public static void main(String[] args)
	{
	
		
		
		//Problem 1: int into long
		int a=100;
		long converted_value=    a;        //widening
		//implicit syntax
		System.out.println(converted_value);
		
		
		long converted_value1=(long)a;  //widening
		///explicitely syntax
		
		System.out.println(converted_value1);
		
		//Problem 2: Byte into double
		
		byte b =100;
		double converted_value2= b; //widening
		System.out.println(converted_value2);
		
		//Problem3: Double into int
		
		double wt =100.9;
		int converted_weight= (int)wt; //narrowing should be done explicitely
		System.out.println(converted_weight);
		
		
		
		//Problem 4: int into byte
		
		int a1= 10;
		byte converted_value3= (byte)a1;
		System.out.println(a1);
		

	}

}
