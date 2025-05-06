import javax.swing.*;

public class Swing2 extends JFrame{

    JFrame f;

    Swing2(){

        JButton j = new JButton();
        j.setText("Poda Myre");
        j.setBounds(100, 130, 130, 90);

        add(j);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        j.setEnabled(true);
        //j.setIcon("");


    }



    public static void main(String[]args){
        new Swing2();

    }
    
}
