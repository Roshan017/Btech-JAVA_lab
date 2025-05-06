import java.io.*;
//import java.util.*;
public class Read{
    public static void main(String[]args)throws IOException{
        FileReader fr = new FileReader("input.txt");
        int c;
        while((c=fr.read())!=-1)
        {
            System.out.print((char)c);
        }
        fr.close();
    }
}