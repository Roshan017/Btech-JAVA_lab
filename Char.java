import java.io.*;

public class Char
{
    public static void main(String[]args)throws IOException{
        FileReader fr = new FileReader(args[0]);
        FileWriter fw = new FileWriter(args[1]);
       // StringBuffer st = new StringBuffer();
        int c;
        
        String s="";
        String rev = "";
        char ch;

        while((c=fr.read())!=-1)
        {
            System.out.println((char)c);
            s +=(char)c;
        }
        fr.close();

        //System.out.println(s);
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);;
            rev = ch+rev;

        }
        fw.write(rev);
        fw.close();
        

    }
}

        