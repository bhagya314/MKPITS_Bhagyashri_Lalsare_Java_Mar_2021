//the simple example of object cloning
package Com.mkpits.java.ObjectClass;

class Student18 implements Cloneable
{
    int rollno;
    String name;

    Student18(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String args[])
    {
        try
        {
            Student18 s1=new Student18(101,"amit");

            Student18 s2=(Student18)s1.clone();// cloning s2 with s1

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}

    }
}