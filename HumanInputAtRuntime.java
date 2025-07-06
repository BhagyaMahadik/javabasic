package AB55;
import java.util.Scanner;


public class HumanInputAtRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s1= new Scanner(System.in);
		//System.out.println();
		//you are invoking constructor of scanner class
		//parameterized type
		String name=         s1.next();
		int age= s1.nextInt();
		boolean answer= s1.nextBoolean();
		byte s2= s1.nextByte();
		short s3= s1.nextShort();
		long s4= s1.nextLong();
		float s6= s1.nextFloat();
		double s7= s1.nextDouble();
	}

}
