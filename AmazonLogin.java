package AB55;

public class AmazonLogin {
	double pi=3.14;
	AmazonLogin(String a, String b)    //constructor
	{
		System.out.println("Login using user id");
	}

	
	AmazonLogin(long mobileno)    //constructor
	{
		System.out.println("Login using mobile number");
	}
	AmazonLogin(String emailid)    //constructor
	{
		System.out.println("Login using email id");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AmazonLogin a1=new AmazonLogin(803441373);
		//AmazonLogin a2=new AmazonLogin("bhagyahsree041997@gmail.com");

		new AmazonLogin(803441373);
		new AmazonLogin("bhagyahsree041997@gmail.com");
		
		AmazonLogin a1= new AmazonLogin("Bhagya", "Sunil");
		System.out.println(a1.pi);
		
		/*
		 * new AmazonLogin();
		new AmazonLogin();
		new AmazonLogin();
		new AmazonLogin();
		new AmazonLogin();*/
		
	}
	
	
	
	

}
