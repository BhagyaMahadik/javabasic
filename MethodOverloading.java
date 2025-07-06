package AB55;

public class MethodOverloading {

	static void add(int a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void add(double a, int b, int c)
	{
		double sum=a+b+c;
		System.out.println(sum);
	}
	static void add(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void add(int a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	void add(int a, double b, double c) 
	{
		double sum=a+b+c;
		System.out.println(sum);
	}
	void add(int a, double b) 
	{
		double sum=a+b;
		System.out.println(sum);
	}
	void add(double b, double c) 
	{
		double sum=a+b+c;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(100, 3.14);
		add(4.8, 5, 9);
		add(1.2, 3.4);
		add(1,3);
		MethodOverloading s1= new MethodOverloading();
		s1.add(7, 0.9, 7.8);
		MethodOverloading s2= new MethodOverloading();
		s2.add(7, 0.9);
		
		
	}

}
