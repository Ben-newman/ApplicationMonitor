/*
 * Controls the program flow
 * @author: Ben Newman
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;


public class Controller 
{
	private static Grabber grabber;
	static private ArrayList<Application> apps;
	private static BAM window;
	
    public static void main(String[] args) throws Exception 
    {
    	window = BAM.gogogo();
    	grabber = new Grabber(window);
		apps = new ArrayList<Application>();
		setUp();
		
		grabber.performGrab(apps);
		
		
		
		closeApplication();
    }
	
    public static void updateApp(String name, String newVer)
    {
    	for(Application app : apps)
    	{
    		if(name.equals(app.getTitle())){
    			app.setVersion(newVer);
    			break;
    		}
    	}
    }
    
    public static void setUp()
    {
    	try{
    		BufferedReader in = new BufferedReader(new FileReader("apps.txt"));
    	
	    	String inputLine;
	    	while ((inputLine = in.readLine()) != null)
	    	{
	    	String applicationName;
	    	String version;
	    	
	    	String[] temp = inputLine.split("\t");
	    	applicationName = temp[0];
	    	version = temp[1];
	    	
	    	apps.add(new Application(applicationName, version));
	    	window.finaliseUpdate(applicationName, version);
	    	}
	    	
	    	in.close();
    	}
    	catch (Exception e)
    	{
    		addApplications();
    	}
    	
    	finally
    	{
    		
    	}
    }
	
	public static void addApplications()
	{
    	apps.add(new Application("Chrome", "30.0.1599.22"));
    	apps.add(new Application("Firefox", "23.0"));
    	apps.add(new Application("Safari", "6.0.5"));
    	apps.add(new Application("Skype", "6.7.0.102"));
    	apps.add(new Application("Opera", "16.0.1196.73"));
	}
	
	public static void closeApplication() throws FileNotFoundException
	{
		PrintStream out = new PrintStream(new FileOutputStream("apps.txt"));
		System.setOut(out);
		
		for (Application app: apps)
		{
			System.out.println(app.getAppDetails());
		}
	}

}
