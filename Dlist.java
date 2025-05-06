import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;



public Node(int data){
    this.data = data;
    this.next = null;
    this.prev = null;
}
}

 class Doubly{
    Node head;

    public void InsertAthead(int data)
    {
        Node n = new Node(data);
        n.next = head;
        if(head != null)
        {
            head.prev = n;
        }
        head = n;
    }

    public void InsertAtTail(int data)
    {
        Node n = new Node(data);
        if(head == null)
        {
            head = n;
            return;
        }
        else{
            Node temp = head;

            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp = n;
            n.prev = temp;
        }

    }

    public void DeleteAtEnd(){
        if(head == null)
        {
            return;
        }
        if(head.next==null)
        {
            head  = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void DeleteAtBegin(){

        if(head==null)
        {
            return;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }
    public void display(){
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
    }  
}
public class Dlist{
    public static void main(String[]args){

        Doubly dl = new Doubly();
        System.out.println("Opertaion List\n1.Insert_Begin\n2.Insert_End\n3.Delete_Begin\n4.Delete_End\n5.Display List\n6.Exit\n");
        int c, data;
        Scanner r = new Scanner(System.in);
        do{
            System.out.println("\nEnter Your Choice: ");
            c = r.nextInt();
            try
            {
                switch(c)
                {
                    case 1: 
                    System.out.println("Enter Number: ");
                    data = r.nextInt();
                    dl.InsertAthead(data);
                    break;

                    case 2: 
                    System.out.println("Enter Number: ");
                    data = r.nextInt();
                    dl.InsertAtTail(data);
                    break;

                    case 3: 
                    dl.DeleteAtBegin();
                    break;

                    case 4:
                    dl.DeleteAtEnd();
                    break;

                    case 5: 
                    dl.display();
                    break;

                    case 6: 
                    System.out.println("Exit");
                    break;

                    default:
                    System.out.println("Invalid Choice");
                    break;
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
        while(c!=6);
        r.close();
    }
}

