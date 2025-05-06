import java.util.*;
public class Threada{
    public static void main(String[]args){

        Thread1 t1 = new Thread1();
        t1.start();
    }
}

class Thread1 extends Thread{
    public void run(){
        Random r = new Random();
        for(int i=0;i<10;i++)
        {
            int x = r.nextInt(10);

            Thread2 t2 = new Thread2(x);
            Thread3 t3 = new Thread3(x);

            if(x % 2 == 0)
            {
                t2.start();
            }
            else{
                t3.start();

            }
            try{
                Thread.sleep(500);

            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread{
    int x;

    Thread2(int data){
        this.x = data;
    }
   public void run (){
        int y = x*x;
        System.out.println("The Square of "+ x +" is "+y);    
    }
}

class Thread3 extends Thread{
    int x;

    Thread3(int data){
        this.x = data;
    }
   public void run (){
        int y = x*x*x;
        System.out.println("The Square of "+ x +" is "+y);    
    }
}