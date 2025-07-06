package AB55;

public class StringBufferMethods {

	public static void main(String[] args) 
	{
		
		StringBuffer s1=new StringBuffer("I am to school");
		//s1.append(" testing");
		System.out.println(s1);
		
		//System.out.println(s1.insert(4, " going"));
		
		
		StringBuffer s2=new StringBuffer("api testing");
		//System.out.println(s2.replace(0, 3, "automation"));
		//System.out.println(s2.delete(0, 4));
		
		System.out.println(s2.substring(4));
		
		
		
		StringBuffer s3=new StringBuffer("apitesting");
		System.out.println(s3.reverse());
		
		
		
		

	}

}
