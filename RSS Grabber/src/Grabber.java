


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
        	
            //System.out.println(inputLine+"\n\n");
            if(inputLine.contains("<item>")){
            	String[] temp = inputLine.split("<item>");
            	String[] temp2 = temp[1].split("</item>");
            	items.add(temp2[0]);
            }
            
        }
        
        for(String s:items)
        	System.out.println(s);
        
        in.close();
    }
}