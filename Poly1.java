public class Poly1{

    void Area(int x, int y)
    {
        int area = x*y;
        System.out.println("The area of the square is: "+area);
    }

     void Area(double r)
    {
       System.out.println("The area of circle is: "+(3.14*r*r));
    }

     double Area(double x, double y)
    {
        
        return 0.5*x*y;
    }
}
 class Poly{
    public static void main(String[]args)
    {   
        Poly1 P = new Poly1();
        P.Area(3,4);
        P.Area(4.2);
        
        double n1 = P.Area(3.4,8.1);
        System.out.println("Area of Triangle is: "+n1);


    }
}
