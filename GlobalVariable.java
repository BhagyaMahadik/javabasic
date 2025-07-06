package AB55;

public class GlobalVariable {

	static int a=100; //global variable    fathers pocketmoney
	static int b=200;	//global variable
	
	static void add()   //kid1
	{
		System.out.println(a+b);
	}
	static void sub()   //kid 2
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		
	}

}
