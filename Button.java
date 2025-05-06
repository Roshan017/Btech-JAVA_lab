import javax.swing.*;
class Button{
    
    public static void main(String[]args){
        
        JFrame j = new JFrame();
        
        JButton b = new JButton("Poda funde");
        b.setBounds(200,100,100,40);
        
        j.add(b);
        j.setSize(400,400);
        j.setLayout(null);
        j.setVisible(true);
        
        
    }
}