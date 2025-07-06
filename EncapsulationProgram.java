package AB55;

class sensitiveClass
{

	private String emailid= "customer@gmail.com";

	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid= emailid;
	}
	private int OTP=1234;
	
	public int getOtp()
	{
		return OTP;
	}
	public void setOtp(int OTP)
	{
		this.OTP= OTP;
	}
	
	private char gender='F';

	public char getGender() 
	{
		return gender;
	}
	public void setGender(char gender) 
	{
		this.gender = gender;
	}
	
	private String PanCard="DDDPM2741F";
	
	public String getPanCard() 
	{
		return PanCard;
	}
	public void setPanCard(String panCard) 
	{
		this.PanCard = panCard;
	}
	
}

public class EncapsulationProgram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		sensitiveClass s1=new sensitiveClass();
		s1.setEmailid("anuja@gmail.com");
		System.out.println(s1.getEmailid());
		
		s1.setOtp(4797);
		System.out.println(s1.getOtp());

		s1.setPanCard("asdfg4797h");
		System.out.println(s1.getPanCard());
	}

}
