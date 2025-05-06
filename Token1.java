import java.util.*;
import java.io.*;

public class Token1{

    
    public static void main(String[]args)throws FileNotFoundException
    {
       // Token1 tr = new Token1();
        Token1.longestword();
        Token1.shortestword();
    }

    static String longestword() throws FileNotFoundException{

        String str ="";
        String c;
        Scanner se = new Scanner(new File("file.txt"));

        while(se.hasNext())
        {
            c = se.next();
            if(c.length() > str.length())
            {
                str = c;
            }
        }
        System.out.println("The Longest word is:"+str);
        return str;
    }
    static String shortestword() throws FileNotFoundException{

        String str1 ="ggsuyatdsyatydtuyadatdaytdya";
        String c;
        Scanner se = new Scanner(new File("file.txt"));

        while(se.hasNext())
        {
            c = se.next();
            if(c.length() < str1.length())
            {
                str1 = c;
            }
        }
        System.out.println("The Shortest word is:"+str1);
        return str1;
    }
}
