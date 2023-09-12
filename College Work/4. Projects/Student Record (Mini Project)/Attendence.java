import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
class Attendence implements ActionListener{
    JFrame f1;
    JButton b1,b2;
    JTextField t1,t2;
    JLabel l1,l2;
    JRadioButton present;
	JRadioButton absent;
	ButtonGroup gp;
    public Attendence(){
		
        f1=new JFrame("Attendence Portal ");
        f1.setLayout(null);

        l1=new JLabel("Student Name :");
        l1.setBounds(30,30,150,30);
        f1.add(l1);

        l2=new JLabel("Class :");
        l2.setBounds(30,80,100,30);
        f1.add(l2);

        t1=new JTextField();
        t1.setBounds(120,30,80,30);
        f1.add(t1);

        t2=new JTextField();
        t2.setBounds(120,80,80,30);
        f1.add(t2);
        
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

        present = new JRadioButton("Present");
		present.setFont(new Font("Arial", Font.PLAIN, 15));
		present.setSelected(false);
		present.setSize(90, 20);
		present.setLocation(220, 65);
		f1.add(present);

		absent = new JRadioButton("Absent");
		absent.setFont(new Font("Arial", Font.PLAIN, 15));
		absent.setSelected(false);
		absent.setSize(80, 20);
		absent.setLocation(340, 65);
		f1.add(absent);

		gp = new ButtonGroup();
		gp.add(present);
		gp.add(absent);

        f1.setSize(500,250);
        f1.setLayout(null);
        JLabel bg = new JLabel(new  ImageIcon("light-skyblue-yellow.jpg"));
        bg.setBounds(0, 0, 500, 250);
        f1.add(bg);
        f1.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==b1){
            String s1,s2;
            s1=t1.getText();
            s2=t2.getText();
            JOptionPane.showMessageDialog(null,"Attendence Submitted");            
        }	
    }
}
