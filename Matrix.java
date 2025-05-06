import java.util.*;
public class Matrix {

    public static void main(String[]args)
    {
        int a[][] = new int[3][3];
        Scanner c = new Scanner(System.in);
        int sum =0;

        System.out.println("Enter the matrix");
        for(int i =0;i<3;i++)
        {
            for(int j =0 ;j<3;j++)
            {
                a[i][j] = c.nextInt();
            }
        }

        for(int i =0;i<3;i++)
        {
            for(int j =0 ;j<3;j++)
            {
                if(i==j)
                {
                    sum = sum+a[i][j];
                }
            }
        }

        System.out.println("The sum of diagonal elements is "+sum);
        c.close();
    }

    

    
}
