/*
 * 
 * @author: Matt Ball
 */
import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Grabber {
    
    public static void performGrab() throws Exception
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