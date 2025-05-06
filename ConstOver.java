class Name{

    

    Name(){
        System.out.println("Student details: ");
    }

    Name(String name){
        System.out.println("Student Name: "+name);
    }

    Name(int n, int x)
    {
        System.out.println("Class: "+n);
        System.out.println("Roll No: "+x);
    }
}

public class ConstOver{
    public static void main(String[]args)
    {
        Name n1 = new Name();
        Name n2 = new Name("Roshan");
        Name n3 = new Name(12,51);
        

    }
}