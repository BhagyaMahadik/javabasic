package AB55;

public class NonStaticMethod {
	
	void login()
	{
		System.out.println("Login to Amazon");
	}
	void logout()
	{
		System.out.println("Logout from Amazon");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticMethod a= new NonStaticMethod();
		a.login();
		a.logout();
		
		
	}

}
