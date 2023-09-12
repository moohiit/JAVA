
//Importing required classes:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class _2_Add implements ActionListener,ItemListener{
    //Creating objects of the required class:
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    JComboBox cb;

    //Creating Constructor:
    public _2_Add(){
        f1=new JFrame("Login Page");
        f1.setLayout(null);
        f1.getContentPane().setBackground(Color.PINK);

        //Creating Labels:
        l1=new JLabel("Enter No1");
        l2=new JLabel("Enter No2");
        l3=new JLabel("Result");
        l1.setBounds(40,40,120,30);
        l2.setBounds(40,90,120,30);
        l3.setBounds(40,130,120,30);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);

        //creating Text Fields:
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t1.setBounds(200,40,120,30);
        t2.setBounds(200,90,120,30);
        t3.setBounds(200,130,120,30);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);

        //Creating a Combobox for options:
        cb = new JComboBox();
        cb.setBounds(20,180,80,30);
        cb.addItem("Red");
        cb.addItem("Green");
        cb.addItem("Yellow"); 
        cb.addItem("Blue");
        f1.add(cb);
        
        //Creating a Submit Button:
        b1=new JButton("Submit");
        b1.setBounds(150,180,90,30);
        f1.add(b1);
        
        //Setting the size of the frames:
        f1.setSize(400,500);
        f1.setVisible(true);

        //Adding action on button And ComboBox:
        b1.addActionListener(this);
        cb.addItemListener(this);
    }

    //Drop down option menu
    public void itemStateChanged(ItemEvent e){
        if(e.getItemSelectable()==cb){
            if(cb.getSelectedItem()=="Red"){
                f1.getContentPane().setBackground(Color.RED);
            }
            else if(cb.getSelectedItem()=="Green"){
                f1.getContentPane().setBackground(Color.GREEN);
            }
            else if(cb.getSelectedItem()=="Yellow"){
                f1.getContentPane().setBackground(Color.YELLOW);
            }
            else if(cb.getSelectedItem()=="Blue"){
                f1.getContentPane().setBackground(Color.BLUE);
            }

        }
    }
    //Action on Button:
    public void actionPerformed(ActionEvent e){
        int a,b,c;
        if(e.getSource()==b1){
        JOptionPane.showMessageDialog(b1,"welcome");
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        c=a+b;
        t3.setText(String.valueOf(c));
        }
    }
    //Main function:
    public static void main(String args[]){
        //creating Object of the class, 
        //it will automatically call the constructor
        _2_Add m1=new _2_Add();
    }
}