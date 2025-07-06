package AB55;

public class LocalVariable {
	static void add1 ()
	{
		int b=10000;
		System.out.println(b);
	}
	static void add2()
	{
		int b=10000;
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		System.out.println(a);
		
		double salary=365*1000;
		System.out.println(salary);
		
		double weight;   //delcaration
		weight=52;		//initialization
		System.out.println(weight);  //utilization
		
		add1();
		add2();
		
		
	}

}
