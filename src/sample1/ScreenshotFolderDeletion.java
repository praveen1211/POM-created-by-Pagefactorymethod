package sample1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ScreenshotFolderDeletion 
{
	public static void main()
	{
		
		String directoryPath = "D:\\eclipsenewworkspace\\PageFactory\\PageFactory";
		File file = new File(directoryPath);
		try
		{
			if(file.exists())
			{
				FileUtils.deleteDirectory(file);
				System.out.println("Directory has been deleted!");	
			}
			else
			{
				System.out.println("Directory not found");
			}
		} 
		catch (IOException e)
		{
			System.out.println("Problem occurs when deleting the directory : " + directoryPath);
			e.printStackTrace();
		}
	}

	
}
