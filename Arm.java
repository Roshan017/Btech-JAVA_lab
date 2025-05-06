 
import java.lang.Math;  

public class Arm {
    public static void main(String[]args){

        int n = Integer.parseInt(args[0]);
        int l=0,s=0,temp,d=0;

        temp=n;

        while(temp>0)
        {
            temp=temp/10;
            d++;
        }
        temp=n;

        while(temp>0)
        {
            l = temp%10;
            s += (Math.pow(l, d));
            temp = temp/10;
        }

        if(n == s)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not Armstrong");
        }
    }
}
