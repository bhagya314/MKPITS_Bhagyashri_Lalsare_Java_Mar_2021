//Example of java PrintStream class , In this example, we are simply printing integer and string value.
package Com.Mkpits.Java.AWT.May17;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class PrintStreamEx {
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("D:\\testout.txt ");
        PrintStream pout=new PrintStream(fout);
        pout.println(2016);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
        System.out.println("Success?");
    }
}
