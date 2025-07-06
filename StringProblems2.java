package AB55;

public class StringProblems2 {

	public static void main(String[] args) 
	{
		String a="world";                 
		String b= a.replace('w', 'W');          //replace char
		System.out.println(b);
		
		String a1="manual testing";
		String b1= a1.replace("manual", "Automation");         //replace char sequence
		System.out.println(b1);
		
		String a3="Automation Testing";
		String b3= a3.replaceAll("[a-z]", "");           //replaceall  - remove small letters with nothing
		System.out.println(b3);
		
		String a4="Automation Testing";
		String b4= a4.replaceAll("[A-Z]", "");           //replaceall  - remove capital letters with nothing
		System.out.println(b4);
		
		
		String a5="Automation123 Testing345";
		String b5= a5.replaceAll("[0-9]", "");           //replaceall  - remove numeric letters with nothing
		System.out.println(b5);
	}
	}


