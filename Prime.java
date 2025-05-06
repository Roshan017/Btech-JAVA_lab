public class Prime {

    public static boolean CheckPrime(int n)
    {
        int i; 
        for(i=2;i<n/2;i++)
        {
            if(n%i == 0)
            {
                return false;
            }

            
        }

        return true;
       
    }
    public static void main(String[]args)
    {
        int n = Integer.parseInt(args[0]);
        int j;
        for( j=1;j<n;j++){

            if(CheckPrime(j))
            {
                System.out.println(j);
            }

        }

        
        
    }
}