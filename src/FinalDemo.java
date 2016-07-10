/*
 * Notes: Constructors not required explicitly 
 * Error on myMethod because of a final variable.
 * If MAX_VALUE was not initialized, need to initialize it in constructor 
 */
public class FinalDemo {
	
	//final int MAX_VALUE = 100;
	final int studentID;
	
	FinalDemo(int id)
	{
		studentID = id;
	}
	
	void myMethod()
	{
		//Error here
		//MAX_VALUE = 101;
	}
	
	void print()
	{
		System.out.println(studentID);
	}
	public static void main(String args[])
	{
		FinalDemo obj = new FinalDemo(12);
		obj.print();
	}
}
