package AB55Inheritance;
abstract class linkedin_auth
{
	abstract void login();
	abstract void registration();
	static void logout()
	{
		System.out.println("Exposing the logic");
	}
	static void resetting_password()
	{
		System.out.println("Exposing the logic");
	}

}

abstract class facebook_auth extends linkedin_auth//abstract class
{
	abstract void login_mob();
	abstract void regi_otp();
}


public class ClassType_Concrete2 
{
	static void method1()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
