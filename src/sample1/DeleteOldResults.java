package sample1;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteOldResults 
{
	public static void delete(String name)
	{
		try
		{
			Files.deleteIfExists(Paths.get("./PageFactory/screenshot"+name+".png"));
			System.out.println("Old screenshots Succesfully deleted");
		}
		catch(Exception e)
		{
			System.out.println("Old screenshots unable to find");
		}
	}
	
	
}

