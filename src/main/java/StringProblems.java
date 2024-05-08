

public class StringProblems {
	
	public static void main (String []agrs)
	{
		StringProblems strp=new StringProblems();
		
		strp.stringConcatNum();
		strp.strToInt();
		
	}
	
	
	private void stringConcatNum()
	{
		//adding new change 2.0
		String price="Rs.1200";	     
	     System.out.println(price+2);
	     
	}
	
	
	private void strToInt()
	{
		String price="1200";	
		int intPrice= Integer.parseInt(price);
		
	     System.out.println(intPrice);
	     
	}
	
	
	

}

//wrapper class: basically allow DEVs to easily convert same type (datatype) of vairable from one type (int) to other (long) etc.
// == compares object while equals() compare values of the object
// String literal -- when intialized string and String object -- when created object

//do check xPaths
//Banks implememt
