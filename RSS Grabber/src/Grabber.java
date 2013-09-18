/*
 * 
 * @author: Matt Ball
 */
import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Grabber {
    
    public void performGrab(ArrayList<Application> apps) throws Exception
    {
    	ArrayList<String> items = new ArrayList<String>();
        URL oracle = new URL("http://feeds.feedburner.com/filehippo?format=xml");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null){
        	String input = extractTagContent("item", inputLine);
        	
        	if(input!=null)
        		items.add(input);
        }
        
        for(String item:items) {
        	
        	checkItem(item, apps);
        }
        
        in.close();
    }
    
    public static String extractTagContent(String tagName, String extractFrom)
    {    	
    	if(extractFrom.contains("<"+tagName+">"))
    	{
        	String[] temp = extractFrom.split("<"+tagName+">");
        	String[] temp2 = temp[1].split("</"+tagName+">");
        	return temp2[0];
        }
    	
    	return null;
    }
    
    public Application checkItem(String item, ArrayList<Application> apps)
    {
    	String title = extractTagContent("title", item);
    	for(Application app : apps) 
    	{
    		if(title.contains(app.getTitle()))
    			return update(app, title.substring(app.getTitle().length()+1));  //If the title matches then get new version number substring of title from rss and perform update
    	}
    	
    	return null;    	
    }
    
    public Application update(Application app, String newVersion)
    {
    	//Check if the version numbers are different
    	if(!app.getVersion().equals(newVersion)) { //If they are update to new one
    		System.out.println("Update:.."+app.getTitle());
    		System.out.println("\t\tOld version:.."+app.getVersion());
    		System.out.println("\t\tNew version:.."+newVersion);
    	}
    	
    	return app;
    }
}