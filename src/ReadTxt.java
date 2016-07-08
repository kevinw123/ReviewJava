import java.io.*;
import static java.lang.System.*;

public class ReadTxt 
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("Credits.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}
			
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("File not found");
		}

	}
}
