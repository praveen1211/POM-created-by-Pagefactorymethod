package sample1;

public class ExtentReports 
{
	public static ExtentReports extent;
	public static String Path;
	
	public static ExtentReports getInstance()
	{		
		 Path = "D:\\eclipsenewworkspace\\PageFactory\\test-output";
		extent = new ExtentReports ();
		
		return extent;
	}

}
