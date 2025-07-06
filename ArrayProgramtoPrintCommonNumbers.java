package AB55;

public class ArrayProgramtoPrintCommonNumbers {

	public static void main(String[] args) 
	{
		int []array1= new int[4];
		array1[0]=74;
		array1[1]=64;
		array1[2]=34;
		array1[3]=44;
		
		int []array2= new int[4];
		array2[0]=14;
		array2[1]=24;
		array2[2]=34;
		array2[3]=44;
		
		for(int i=0; i<array1.length; i++)  //this is for array1
		{
			for(int j=0; j<array2.length; j++)  //this is for array2
			{
				if(array1[i]==array2[j])
				{
					System.out.println("This is the common number: "+array1[i]);
				}
			}
			
		}
		
		

	}

}
