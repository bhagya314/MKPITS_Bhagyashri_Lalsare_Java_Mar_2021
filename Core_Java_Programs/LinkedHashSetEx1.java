//example of Java LinkedHashSet class.
package Com.Mkpits.Java.AWT.May25;
import java.util.*;
public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        Iterator<String> i= set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
