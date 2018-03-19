package sample1;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteOldResults 
{
	public static void delete(String name)
	{
		try
		{
			Files.deleteIfExists(Paths.get("./PageFactory/PageFactory"+name+".png"));
			System.out.println("Old screenshots Succesfully deleted");
			
			//File file = new File("c:\\logfile20100131.log");
        	
    	//	if(file.delete()){
    		//	System.out.println(file.getName() + " is deleted!");
    //		}
	//	else
		//{
    	//		System.out.println("Delete operation is failed.");
    		//}
			
		}
		catch(Exception e)
		{
			System.out.println("Old screenshots unable to find");
		}
	}
	
	
}

