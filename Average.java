import java.io.IOException;
//import java.util.*;
public class Average {
    public static void main(String[]args)throws IOException
    {
       int x = Integer.parseInt(args[0]);
       int y[] = new int[10];
       for(int i = 1;i<x;i++)
       {
         y[i]= Integer.parseInt(args[i]);
       }

       int sum = 0;

       for(int i=0;i<x;i++)
       {
        sum = sum+y[i];
       }

       int av;
       av = sum/x;

       System.out.println(av);
    }
}
