import javax.swing.*;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.event.*;
class Login implements ActionListener{
    
    JFrame f1;
    JButton b1,reset;
    JTextField t1,t2;
    JLabel l1,l2;
    public Login(){
        
        
		
        f1=new JFrame("Data Entry ");
        f1.setLayout(null);

        l1=new JLabel("Emp_ID :");
        l1.setBounds(100,50,100,30);
        f1.add(l1);

        l2=new JLabel("Name :");
        l2.setBounds(100,100,100,30);
        f1.add(l2);

        t1=new JTextField();
        t1.setBounds(200,50,100,30);
        f1.add(t1);

        t2=new JTextField();
        t2.setBounds(200,100,100,30);
        f1.add(t2);

        b1=new JButton("Insert");
        b1.setBounds(130,150,70,30);
        f1.add(b1);
        b1.addActionListener(this);
        
        reset=new JButton("Reset");
        reset.setBounds(210,150,70,30);
        f1.add(reset);
        reset.addActionListener(this);

        f1.setSize(430,300);
        f1.setLayout(new BorderLayout());
        JLabel bg = new JLabel(new  ImageIcon("sky-dark-mix-blue.jpg"));
        f1.add(bg);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==b1){
            final String DB_URL = "jdbc:mysql://localhost:3306/Employee";
            final String USER = "root"; 
            final String PASS = "mohit";
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); 
                Statement stmt = conn.createStatement();){
                int s1;
                String s2;
                s1=Integer.parseInt(t1.getText());
                s2=t2.getText();
                String sql = "insert into employee values ("+s1+",'"+s2+"') ";
                stmt.executeUpdate(sql);
                System.out.println("Data Inserted successfully..");
            }catch (SQLException e){
                e.printStackTrace();
            }
            
            
            
        }else if (e1.getSource() == reset) {
			String def = "";
			t1.setText(def);
			t2.setText(def);
		}	
    }
}
class Student_Portal{
    public static void main(String args[])
    {
    Login lg=new Login();
    }
}

