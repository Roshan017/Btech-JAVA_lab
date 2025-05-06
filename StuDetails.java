import java.util.*;
//import java.io.*;

class Details{

    int m1,m2,m3;
    int Enroll;
    String name;
    int total=0;

    Scanner s = new Scanner(System.in);

    void printdetails(int n)
    {
        System.out.println("Name of Student "+n+": "+name);
        System.out.println("Enrollment No: "+Enroll);
        System.out.println("Mark of Subject 1: "+m1);
        System.out.println("Mark of Subject 2: "+m2);
        System.out.println("Mark of Subject 3: "+m3);
        System.out.println("Total Marks: "+total);

    }

    void Student(int n)
    {
        System.out.println("Enter Student Name "+n+" : ");
        name = s.nextLine();
        System.out.println("Enter Enrollment No: ");
        Enroll = s.nextInt();
        System.out.println("Mark of Subject 1: ");
        m1 = s.nextInt();
        System.out.println("Mark of Subject 2: ");
        m2 = s.nextInt();
        System.out.println("Mark of Subject 3: ");
        m3 = s.nextInt();
        
        if(m1<25|| m2<25 || m3<25)
        {
            total = 0;
        }
        else{
            total = m1+m2+m3;
        }
    }
}
public class StuDetails{
public static void main(String[]args)
{
    Scanner se = new Scanner(System.in);
    System.out.println("Enter the Number of Students");
    int n = se.nextInt();
    int i;
    Details d = new Details();
   

    for(i=1;i<n;i++)
    {
        d.Student(i);
        d.printdetails(i);
    }
    se.close();
}

}
