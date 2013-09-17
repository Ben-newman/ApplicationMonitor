


import java.net.*;
import java.io.*;

public class Grabber {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://feeds.feedburner.com/filehippo?format=xml");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
        	
            System.out.println(inputLine+"\n\n");
        
        in.close();
    }
}