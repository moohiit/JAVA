import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class _3_Calculator  implements ItemListener{
    //Creating objects of the reuired classes:
    JFrame f1;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1;
    JComboBox cb;

    //Creating constructor:
    public _3_Calculator(){
        f1 = new JFrame("Calculator");
        f1.setLayout(null);
        f1.getContentPane().setBackground(Color.LIGHT_GRAY);
        

        //creating Labels:
        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel("Result");
        l4 = new JLabel("=");
        l1.setBounds(20, 40, 120, 30);
        l2.setBounds(160, 40, 120, 30);
        l3.setBounds(290, 40, 120, 30);
        l4.setBounds(250, 70, 10, 30);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);

        //Creating Test Fields:
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t1.setBounds(20, 70, 70, 30);
        t2.setBounds(170, 70, 70, 30);
        t3.setBounds(280, 70, 70, 30);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);

        //Creating a Button:
        b1 = new JButton("Enter");
        b1.setBounds(140, 150, 90, 30);
        f1.add(b1);

        //creating a ComboBox for options:
        cb = new JComboBox();
        cb.setBounds(100,70,60,30);
        cb.addItem("ADD");
        cb.addItem("SUB");
        cb.addItem("MUL");
        cb.addItem("DIV");
        cb.addItem("MOD");
        f1.add(cb);

        //Setting the size of the frames:
        f1.setSize(400, 300);
        f1.setVisible(true);

        //Adding action on button And ComboBox:
        // b1.addActionListener(this);
        cb.addItemListener(this);

    }

    //Creating a drop down menu;
    public void itemStateChanged(ItemEvent e){
        if(e.getItemSelectable()==cb){
            int a,b,c;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());

            if(cb.getSelectedItem()=="ADD"){
                //Write your code
                c= a+b;
                t3.setText(String.valueOf(c));

            }
            else if(cb.getSelectedItem()=="SUB"){
                //Write your code
                c= a-b;
                t3.setText(String.valueOf(c));
            }
            else if(cb.getSelectedItem()=="MUL"){
                //Write your code
                c= a*b;
                t3.setText(String.valueOf(c));
            }
            else if(cb.getSelectedItem()=="DIV"){
                //Write your code
                c= a/b;
                t3.setText(String.valueOf(c));
            }
            else if(cb.getSelectedItem()=="MOD"){
                //Write your code
                c= a%b;
                t3.setText(String.valueOf(c));

            }


        }
    }

    //Action on Button:
    // public void actionPerformed(ActionEvent e){
    //     int a,b,c;
    //     String symb;
    //     if(e.getSource()==b1){
    //     // a=Integer.parseInt(t1.getText());
    //     // b=Integer.parseInt(t2.getText());
    //     // symb =String.valueOf(cb.getSelectedItem());
    //     // if(symb=="ADD"){
    //     //     c = a + b;
    //     // }else if(symb=="SUB"){
    //     //     c = a - b;
    //     // }else if(symb=="MUL"){
    //     //     c = a * b;
    //     // }else if(symb=="DIV"){
    //     //     c = a / b;
    //     // }else if(symb=="MOD"){
    //     //     c = a % b;
    //     }
    //     }
    // }
    //creating main class:
    public static void main(String[] args) {
        _3_Calculator c = new _3_Calculator();
    }
}
