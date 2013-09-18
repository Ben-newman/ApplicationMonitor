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
		
		grabber.performGrab(apps);
    }
	
	
	public static void addApplications()
	{
    	apps.add(new Application("Chrome"));	apps.get(0).setVersion("30.0.1599.22");
    	apps.add(new Application("Firefox"));	apps.get(1).setVersion("23.0");
    	apps.add(new Application("Safari"));	apps.get(2).setVersion("6.0.5");
    	apps.add(new Application("Skype"));		apps.get(3).setVersion("6.7.0.102");
    	apps.add(new Application("Opera"));		apps.get(4).setVersion("16.0.1196.73");
	}

}
