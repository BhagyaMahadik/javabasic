package AB55;

import java.util.Arrays;

public class ArrayProblem8 {

	public static void main(String[] args) 
	{
		String input= "Zoo in a 123 ^&*";
		
		
		
		int countofalpha=0;
		int countofnumeric=0;
		int whitespace=0;
		
		
		char[]c1=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		
		for(int i=0; i<c1.length; i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			boolean b2= Character.isDigit(c1[i]);
			boolean b3= Character.isWhitespace(c1[i]);
			
			if(b1==true)
			{
				countofalpha++;
				
			}
			if(b2==true)
			{
				countofnumeric++;
			}
			if(b3==true)
			{
				whitespace++;
			}
		}
		int countofspecialchara= input.length()- (countofalpha+countofnumeric+whitespace);
		
		
		System.out.println("Count of alphabates is: " +countofalpha);
		System.out.println("Count of numbers is: " +countofnumeric);
		System.out.println("Count of spaces is: " +whitespace);
		System.out.println("Count of special chara is: " +countofspecialchara);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
