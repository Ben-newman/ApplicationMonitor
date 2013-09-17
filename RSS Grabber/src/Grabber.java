


import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Grabber {
    public static void main(String[] args) throws Exception {
    	ArrayList<String> items = new ArrayList<String>();
        URL oracle = new URL("http://feeds.feedburner.com/filehippo?format=xml");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null){
            items.add(extractTagContent("item", inputLine));
        }
        
        for(String s:items)
        	System.out.println(s);
        
        in.close();
    }
    
    public static String extractTagContent(String tagName, String extractFrom)
    {    	
    	if(extractFrom.contains("<"+tagName+">")){
        	String[] temp = extractFrom.split("<"+tagName+">");
        	String[] temp2 = temp[1].split("</"+tagName+">");
        	return temp2[0];
        }
    	
    	return null;
    }
    
    public static boolean checkItem(String item)
    {
    	//get title
    	String title = extractTagContent("title", item);
    	
    	return false;    	
    }
}