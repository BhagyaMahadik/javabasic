package AB55;

public class StaticMethod {
	
	static void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.print("The addition is: ");
		System.out.println(c);
	}
	static void sub()
	{
		int a1=20;
		int a2=40;
		int c1=a1-a2;
		System.out.print("The subtraction is: ");
		System.out.println(c1);
	}
	static void mul()
	{

		int c2= 30;
		int d1= 4;
		int d2= c2*d1;
		System.out.print("The multiplication is: ");
		System.out.println(d2);
	}
	static void div()
	{
		int e=40;
		int f= 20;
		int g= e/f;
		System.out.print("The division is: ");
		System.out.println(g);
	}
	static void mod()
	{
		int h=50;
		int i=5;
		int j=h%i;
		System.out.print("The modulus is: ");
		System.out.println(j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		div();
		sub();
		mod();
		mul();
		
		
	}


	
	
	
	
	
	
}
