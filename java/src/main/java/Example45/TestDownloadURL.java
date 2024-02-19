package Example45;

import java.awt.image.ImagingOpException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestDownloadURL {

    public static void main(String[] args) {

        try{
            queryURL("");

        }catch( MalformedURLException ex){
            // do the necessary
        }catch( IOException ex){
            // do the necessary
        }
    }

    /** Remove the throws Exception and replace it with the specific exception */
    // checked exception ==> you must declare
    public static String queryURL(String urlString) throws MalformedURLException, IOException {
        // Create a URL object
        URL url = new URL(urlString);

        // read the URL stream into the Scanner object
        Scanner input = new Scanner(url.openStream());
        String out = "";
        while (input.hasNext()){
            out = out + input.nextLine() + "\n";
        }
        return out;
    }

}



