
import javax.swing.*;
import java.awt.event.*;
public class User {
    public static void main(String[]args)
    {
        JFrame f = new JFrame("User");
        JLabel l1 = new JLabel("Username: ");
        JTextField f1 = new JTextField(20);
        JLabel l2 = new JLabel("Password: ");
        JTextField f2 = new JTextField(20);
        JLabel l3 = new JLabel("");

        JButton b1 = new JButton("Submit");

        l1.setBounds(100,100,100,30);
        l2.setBounds(100,200,100,30);
        f1.setBounds(200,100,100,30);
        f2.setBounds(200,200,100,30);
        b1.setBounds(100,300,100,30);
       

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                JLabel l4 = new JLabel("Username is: "+f1.getText());
                JLabel l5 = new JLabel("Password is: "+f2.getText());
                l4.setBounds(100,400,200,30);
                l5.setBounds(300,400,200,30);
                f.add(l4);
                f.add(l5);
            }
            
        });
        
        f.add(f1);
        f.add(f2);
        f.add(l1);
        f.add(l2);
        f.add(b1);
        f.add(l3);
        
       
        
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,400);



    }
}
