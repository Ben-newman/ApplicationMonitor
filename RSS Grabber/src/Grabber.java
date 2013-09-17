


import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Grabber {
	
	static private ArrayList<Application> apps = new ArrayList<Application>();
	
    public static void main(String[] args) throws Exception {
    	
    	apps.add(new Application("Chrome"));
    	apps.add(new Application("Firefox"));
    	apps.add(new Application("Safari"));
    	apps.add(new Application("Skype"));
    	apps.add(new Application("Opera"));
    	
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
        	
        	Application check = checkItem(item);
        	if(check!=null)
        		System.out.println("Match found: - "+check.getTitle());
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
    
    public static Application checkItem(String item)
    {
    	String title = extractTagContent("title", item);
    	for(Application app : apps) 
    	{
    		if(title.contains(app.getTitle()))
    			return app;
    	}
    	
    	return null;    	
    }
}