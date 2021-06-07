//Java HttpURLConnecton Example
package Com.Mkpits.Java.AWT.May31;
import java.io.*;
import java.net.*;
public class HttpUrlEx1 {
    public static void main(String[] args){
        try{
            URL url=new URL("http://www.google.com/java-tutorial");
            HttpURLConnection huc=(HttpURLConnection)url.openConnection();
            for(int i=1;i<=8;i++){
                System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
            }
            huc.disconnect();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
