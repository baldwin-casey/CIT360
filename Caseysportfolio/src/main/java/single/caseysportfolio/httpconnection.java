/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single.caseysportfolio;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 *
 * @author cbald
 */
public class httpconnection {
       public static void section() {
    System.out.println("HTTP!\n");
    String url = "http://www.google.com";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
  int status = con.getResponseCode();
  System.out.println("Google response code is " + status);
}
}