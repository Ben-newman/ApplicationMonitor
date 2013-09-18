import java.util.ArrayList;


public class Controller 
{
	private static Grabber grabber;
	static private ArrayList<Application> apps;
	
    public static void main(String[] args) throws Exception 
    {
    	grabber = new Grabber();
		apps = new ArrayList<Application>();
		addApplications();
		
		grabber.performGrab();
    }
	
	
	public static void addApplications()
	{
    	apps.add(new Application("Chrome"));
    	apps.add(new Application("Firefox"));
    	apps.add(new Application("Safari"));
    	apps.add(new Application("Skype"));
    	apps.add(new Application("Opera"));
	}

}
