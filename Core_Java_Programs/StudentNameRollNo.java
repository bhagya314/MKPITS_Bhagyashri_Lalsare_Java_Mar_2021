//for eg. create a class student having member variable rno and name
//and member functions getdata and showdata.

import java.util.Scanner;
public class StudentNameRollNo
{
    int rno;
    String name;

    void getstudentdata(int r,String n )
    {
        rno=r;
        name=n;
    }
    void showstudentdata()
    {
        System.out.println("rno=" +rno);
        System.out.println("name="+name);
    }
    public static void main(String args [])
    {
        Scanner s=new Scanner(System.in);
        StudentNameRollNo stud=new StudentNameRollNo();
        System.out.println("enter rno and name");
        int r=s.nextInt();
        String n=s.next();
        stud.getstudentdata(r,n);
        stud.showstudentdata();
    }
}