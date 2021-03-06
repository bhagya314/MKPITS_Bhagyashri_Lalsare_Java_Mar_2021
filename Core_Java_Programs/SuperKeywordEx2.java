//In the above example, Animal and Dog both classes have a common property color. If we print color
//property, it will print the color of current class by default. To access the parent property, we need to use
//super keyword.
package Com.mkpits.java.SuperKeyWord;
class Animal1
{
    String color="white";
}
class Dog1 extends Animal1
{
    String color="black";
    void printcolor()
    {
        System.out.println(super.color);//print color of animal class
    }
}
class Babydog extends Dog1
{
    String color="brown";
    void printcolor1()
    {
        System.out.println(color);//print color of dog class
        System.out.println(super.color);
        printcolor();
    }
}
public class SuperKeywordEx2
{
    public static void main(String[] args)
    {
        Babydog d=new Babydog();
        d.printcolor1();
    }
}
