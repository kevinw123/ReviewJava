import java.io.*;
import static java.lang.System.*;

public class TextFile {
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("Credits.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("Course: 30 credits");
			pw.println("Year: 120 credits");
			pw.println("Degreee: 360 credits");
			
			pw.close();
		}
		catch(IOException e)
		{
			out.println("ERROR!");
		}
	}
}
