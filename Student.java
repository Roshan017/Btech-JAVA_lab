import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {

    public static String Grade(int n){

        String Grade = "";
        if(n<45)
        {
            Grade = "F";
        }
        else if(n<50)
        {
           Grade = "P";
        }

        else if(n<60)
        {
            Grade = "D";
        }

        else if(n<70)
        {
            Grade = "C";
        }
        else if(n<80)
        {
            Grade = "B";
        }
        else if(n<90)
        {
            Grade = "A";
        }
         else
        {
            Grade = "S";
        }
        return Grade;
        

        

    }
    public static void main(String[]args){

        JFrame jr = new JFrame("Student");
        JLabel l1 =  new JLabel("Roll no");
        l1.setBounds(100,100,100,30);
        JTextField f1 = new JTextField(20);
        f1.setBounds(200,100,100,30);
        JLabel l2 = new JLabel("Name");
        l2.setBounds(100,150,100,30);
        JTextField f2 = new JTextField(20);
        f2.setBounds(200,150,100,30);
        JLabel l3 = new JLabel("Mark of Subject 1: ");
        l3.setBounds(100,200,150,30);
        JTextField f3 = new JTextField(20);
        f3.setBounds(220,200,100,30);
        JLabel l4 = new JLabel("Mark of Subject 2: ");
        l4.setBounds(100,250,150,30);
        JTextField f4 = new JTextField(20);
        f4.setBounds(220,250,100,30);
        JLabel l5 = new JLabel("Mark of Subject 3: ");
        l5.setBounds(100,300,150,30);
        JTextField f5 = new JTextField(20);
        f5.setBounds(220,300,100,30);
        JTextField f6 = new JTextField(20);
        f6.setBounds(350,200,100,30);
        JTextField f7 = new JTextField(20);
        f7.setBounds(350,250,100,30);
        JTextField f8 = new JTextField(20);
        f8.setBounds(350,300,100,30);
        

        JButton b1 = new JButton("Submit");
        b1.setBounds(100,380,180,30);

        b1.addActionListener( new ActionListener(){

            public void actionPerformed(ActionEvent e){

                int n1 = Integer.parseInt(f3.getText());
                int n2 = Integer.parseInt(f4.getText());
                int n3 = Integer.parseInt(f5.getText());

                f6.setText(Grade(n1));
                f7.setText(Grade(n2));
                f8.setText(Grade(n3));

                

                
            }

            
            
        });

        jr.setSize(600,600);
        
        //SpringLayout sp = new SpringLayout();
        
        jr.setLayout(null);
        jr.add(l1);
        jr.add(l2);
        jr.add(l3);
        jr.add(l4);
        jr.add(l5);
        jr.add(f1);
        jr.add(f2);
        jr.add(f3);
        jr.add(f4);
        jr.add(f5);
        jr.add(b1);
        jr.add(f6);
        jr.add(f7);
        jr.add(f8);
        jr.setVisible(true);

        
    }

    
}
