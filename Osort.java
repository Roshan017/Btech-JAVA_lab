public class Osort {

    public static void main(int[]args)

    {
        int x[] = new int[10];
        int temp;
        int y =args[0];

        for(int i = 0 ;i<y;i++)
        {
            x[i] = args[i+1];
        }

        for(int j = 0 ;j<y;j++)
        {
            if(x[j] < x[j+1])
            {
                temp = x[j];
                x[j] = x[j+1];
                x[j+1] = temp;
            }
        }

        for(int j = 0 ;j<y;j++)
        {
            System.out.println(x[j]);
        }


    }
}

