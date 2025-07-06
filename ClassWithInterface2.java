package AB55Inheritance;

interface three
{
	void add();
	void subtract();
}
interface two extends three 
{
	void mul();
	void div();
}

public class ClassWithInterface2 implements two
{

	static void mod()
	{
		System.out.println("Concete method");
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	


	@Override
	public void add() 
	{
	
		
	}

	@Override
	public void subtract()
	{
		
		
	}


	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

}
