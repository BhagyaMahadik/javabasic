package AB55;

import java.util.Date;

public class DateClassProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1.getTime());        //system understandable time
		Date d2=new Date();
		System.out.println(d2);     //human understandable time
		String format1= d2.toString();
		System.out.println(format1);
		String date=format1.substring(8, 10);
		System.out.println(date);
		String month= format1.substring(4, 7);
		System.out.println(month);
		String year= format1.substring(format1.length()-4);
		System.out.println(year);
		String year1= format1.substring(24);
		System.out.println(year1);

		
	
		
		
	}

}
