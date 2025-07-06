package AB55;
import java.lang.Object;

class GoogleProblem
{
	void add()
	{
		
	}
	void sub()
	{
		
	}
}


public class UpcastingProgram extends GoogleProblem 
{
	void mul()
	{
		
	}
	void div()
	{
		
	}

	public static void main(String[] args) 
	{
		GoogleProblem g1= new UpcastingProgram();          //upcasting
		
		UpcastingProgram u1= (UpcastingProgram) new GoogleProblem();      //downcasting
		
		//u1 =child class prop and its all parent class prop
		
		u1.add();
		u1.mul();
		u1.sub();
		u1.div();
		
		
	   /*//implicit syntax
		//g1-->only access parent class properties
		
		g1.add();
		g1.sub();
		//when being a class when you want to access the interface methods
		
		GoogleProblem g2= (GoogleProblem) new UpcastingProgram();
		
		//explicit syntax
		//g1-->only access parent class properties
		
		g1.add();
		g1.sub();*/
		
		
		
		
	}

}
