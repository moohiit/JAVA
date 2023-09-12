import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class FeeStructure implements ActionListener{
    JFrame f1;
    JLabel l1,l2,l3,bg;
    JTextField t1,t2,t3;
    JButton b1,b2;

    public FeeStructure(){
        f1=new JFrame("Fees Structure ");
        f1.setLayout(null);

        l1=new JLabel("Student Name :");
        l1.setBounds(30,30,150,30);
        f1.add(l1);

        l2=new JLabel("Class :");
        l2.setBounds(30,80,100,30);
        f1.add(l2);
        
        l3 = new JLabel("Fees :");
        l3.setBounds(250, 65, 90, 30);
        f1.add(l3);

        t1=new JTextField();
        t1.setBounds(120,30,80,30);
        f1.add(t1);

        t2=new JTextField();
        t2.setBounds(120,80,80,30);
        f1.add(t2);

        t3 = new JTextField();
        t3.setBounds(340, 65, 100, 30);
        f1.add(t3);
        
        b1=new JButton("Submit");
        b1.setBounds(150,120,80,30);
        b1.addActionListener(this);
        f1.add(b1);
        
        b2=new JButton("Close");
        b2.setBounds(250,120,80,30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f1.dispose();
            }
        });
        f1.add(b2);

        f1.setSize(500,250);
        f1.setLayout(null);
        bg = new JLabel(new  ImageIcon("light-skyblue-yellow.jpg"));
        bg.setBounds(0, 0, 500, 250);
        f1.add(bg);
        f1.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==b1){
            String s1,s2,s3;
            s1=t1.getText();
            s2=t2.getText();
            s3=t3.getText();
            // JOptionPane.showMessageDialog(null,"Submitted");
            JOptionPane.showMessageDialog(null, "Submitted");            
        }	
    }
}
