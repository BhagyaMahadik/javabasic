package AB55;

public class UpdatingGlobalLocal {

			static int a=100;
			int b=200;
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				GlobalVariable2 g2=new GlobalVariable2();
				System.out.println(g2.b=300);			//updateing non static variable value
				a=200;   	//update the global variable
				System.out.println(a);
				GlobalVariable2 g1 =new GlobalVariable2();
				
				System.out.println(g1.b);
				
				int c=90;							//updating value of local variable- once we have declared any variable no need to declare it again
				System.out.println(c);
				c=10;
				System.out.println(c);
			}
	}


