import java.lang.*;
public class Msg {
    public static void main(String[]args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread m1 = new Thread(t1);
        Thread m2 = new Thread(t2);
        m1.start();
        m2.start();
        
    }   
}
class Print{
    synchronized void print(String x)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("This is the "+x+" thread");
        }
    }
}
class Thread1 implements Runnable
{
    public void run()
    {
        Print p = new Print();
        p.print("First");
    }
    
}
class Thread2 implements Runnable
{
    public void run()
    {
        Print p = new Print();
        p.print("Second");
    }
}
