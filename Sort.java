import java.util.*;
import java.util.Scanner;
public class Sort {
    public static void main(String[]args)
    {
        int i ,n,temp;
        
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the number of digits: ");
        n = se.nextInt();
        int ar[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for(i=0;i<n;i++)
        {
           ar[i] = se.nextInt();        
        }

        System.out.println(" Elements in unsorted form: ");
        for(i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }

        for(i=0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            
            {
                if(ar[j] > ar[i])
                {
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        System.out.println(" Elements in sorted form: ");
        for(i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
