package AB55;

public class StringFunction {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="Automation";
		int size1= a.length();
		System.out.println(size1);
		
		boolean b3= a.contains("Manish");
				System.out.println(b3);
			String full=	a.concat("Batch from Growtechminds");
			System.out.println(full);
			
			String c="World";
		char c1=	c.charAt(4);
		System.out.println(c1);
		
		int i1=c.indexOf('W');
		System.out.println(i1);
		
	String s1=	a.substring(2);
System.out.println(s1);		
			
			String s2=a.substring(2, 7);
			System.out.println(s2);
		int size=a.length();
		System.out.println(size);
		String UpperName=a.toUpperCase();
		System.out.println(UpperName);
		String b="Bhagyashree Mahadik";
		String Lowercase= b.toLowerCase();
		System.out.println(Lowercase);
		
		boolean b1=b.equals("Bhagyashree Mahadik");
		System.out.println(b1);
	boolean b2=	b.equalsIgnoreCase("BHAGYASHREE MAHADIK");
	System.out.println(b2);
				
	}

}
