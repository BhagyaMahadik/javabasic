package AB55;
import java.util.Arrays;
public class ArrayProblem7 {

	public static void main(String[] args) 
	{
		String a1="swathi";
		String a2= "sunita";
		
		
		if (a1.length()!=a2.length())
		{
			System.out.println("Since length is not same words are not Anagram");
		}
		else
		{
			//[h, e, a, r, t]     //sort it [a,e,h,r,t]
		//[e, a, r, t, h]   //sort it[a,e.h.r.t]
			
			char[] c1= a1.toCharArray();
			char[] c2= a2.toCharArray();
	
			
			
			
	System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
				
				Arrays.sort(c1);
				Arrays.sort(c2);
				System.out.println(Arrays.toString(c1));
				
				System.out.println(Arrays.toString(c2));
		
				if(Arrays.equals(c1, c2)==true)
				{
					System.out.println("String is Anagram");
					
				}
				
				else
				{
					System.out.println("String is not Anagram");
				}	
				
		}
		
	}
	
}
		

	


