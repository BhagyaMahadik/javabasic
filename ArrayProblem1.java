package AB55;

import java.util.Arrays;

public class ArrayProblem1 {

	public static void main(String[] args) 
	{
		int []rollno=new int[3];
		rollno[0]= 74;
		rollno[1]= 14;
		rollno[2]= 34;
		
		String []name =new String[3];
		name [0]= "Shalini";
		name [1]= "Rudra";
		name [2]= "Vaishali";
		
		System.out.println(Arrays.toString(name));

	/*	for (int i=0; i<=2; i++)
		{
			System.out.println(rollno[i]);
			System.out.println(name[i]);
		}*/
		
		System.out.println(Arrays.toString(rollno));
		
		
	}

}
