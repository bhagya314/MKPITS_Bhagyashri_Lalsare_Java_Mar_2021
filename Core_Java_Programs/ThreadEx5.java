//Example of naming a thread
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx5 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        ThreadEx5 t1=new ThreadEx5();
        ThreadEx5 t2=new ThreadEx5();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());

        t1.start();
        t2.start();

        t1.setName("Sonoo Jaiswal");
        System.out.println("After changing name of t1:"+t1.getName());
    }
}