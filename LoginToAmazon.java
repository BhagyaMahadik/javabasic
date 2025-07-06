package AB55Inheritance;

public class LoginToAmazon 
{
 LoginToAmazon()
 {
	 this(100);
	 System.out.println("1");
 }
 LoginToAmazon(int a)
 {
	 this("Ram");
	 System.out.println("2");
 }
 LoginToAmazon(String a)
 {
	 System.out.println("3");
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new LoginToAmazon();
	}

}
