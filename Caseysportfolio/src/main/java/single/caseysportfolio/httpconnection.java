/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single.caseysportfolio;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;
import org.w3c.dom.*;
import javax.xml.parsers.*;
//This is strictly for when I am on break at work, where there is a proxy
import java.net.Proxy;
/**
 *
 * @author cbald
 */
public class httpconnection {
       public static void section() throws Exception{
           //These lines specify what url to go to
    System.out.println("HTTP!\n");
    String url = "http://www.google.com";
    //try is just in case there is a problem
    try {
        //create the object and set the timeout

    URL obj = new URL(url);
    //open the connection!
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    //whats the response code?
  int status = con.getResponseCode();
  if (status != con.HTTP_OK) {
      //This is because I have a proxy at work, and this is to mitigate that
    System.out.println("Server returned response code " + status);

}
  else {
      
  }
    }
    catch (MalformedURLException e) {
        System.out.println("This url is bad! " + e.getMessage());
    }
    catch (IOException e) {
         System.out.println("Im broken :-/" + e.getMessage());
    }
    }


public static void readxml() {
File xml = new File("solarxml.xml");
DocumentBuilderFactory builderfactory = DocumentBuilderFactory.newInstance();
//DocumentBuilder documentbuilder = builderfactory.newDocumentBuilder();
//Document document = documentbuilder.parse(xml);

}
}
