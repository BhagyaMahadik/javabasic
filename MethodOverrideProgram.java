package AB55Inheritance;
final class ParentClass1
{
	void login()
	{
		System.out.println("Login with Mob No");
	}
}

public class MethodOverrideProgram extends ParentClass1
{
	
	void login()
	{
		//super.login();  //super keyword
		System.out.println("Login with email id");
		super.login(); 
	}

	public static void main(String[] args)
{
		// TODO Auto-generated method stub

		MethodOverrideProgram m1= new MethodOverrideProgram();
		m1.login();
		m1.login();
		
		
}

}
