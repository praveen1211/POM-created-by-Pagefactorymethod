package sample1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.io.Zip;

public class FolderZip 
{
	public static Zip z1;
	static String zippath = "D:\\PageFactory\\screenshot.zip";
	public static File f1;
	
	public static void zipper ()
	{
		f1 =new File(zippath);
		
		if(f1.exists())
		{
			f1.delete();
			System.out.println("Zip folder deleted");
		}
		else
		{
			System.out.println("zip folder not found");
		}
		
		z1 = new Zip();
	try
	{
			
		z1.zip(new File("D:\\eclipsenewworkspace\\PageFactory\\PageFactory"), 
					new File("D:\\PageFactory\\screenshot.zip"));	
			
			System.out.println("Directory is zipped succesfully");
	}
		catch(IOException e)	
		{
			System.out.println("Can not zip the directory");
	}
		
	}
	
}
