import java.util.*;
import java.io.*;

public class Pack{
    public static void main(String[]args)throws IOException
    {
        
        FileWriter fr = new FileWriter("h.txt");

        String x = "Java is an Object Oriented Progarm";

        fr.write(x);
        fr.close();
        int c=0;
        StringTokenizer sr = new StringTokenizer(x," ");
        while(sr.hasMoreTokens())
        {
          
          c++;
          sr.nextToken();
        }

        System.out.println("The no of words is: "+c);
}
}