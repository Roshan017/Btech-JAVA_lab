import java.io.*;
import java.util.*;
public class Word {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Sentence: ");
    String x = sc.nextLine();
    int c=0;
    System.out.println("Enter a Word: ");
    String y = sc.nextLine();
    String temp[] = x.split(" ");
    for(int i = 0 ;i < temp.length;i++)
    {
        if(y.equals(temp[i]))
        {
            c++;
        }
    }
    System.out.println(y+" occurs "+c+" no of times");
    }

}
