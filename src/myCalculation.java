
public class myCalculation extends Calculation 
{
	int z;
	public void multiplication(int x, int y)
	{
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}
	
	public static void main(String args[])
	{
		int a = 20, b=10;
		myCalculation demo = new myCalculation();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
	}
}
