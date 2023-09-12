import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
  
class Courses {
    public Courses(){
        // Creating a new frame using JFrame
        JFrame f = new JFrame("Courses");
        // Creating the labels
        JLabel l1, l2;

        // Creating two JComboboxes
        // one for Branch and one
        // for Courses
        JComboBox j1, j2;

        // Creating  two buttons
        JButton b1, b2;

        // Naming the labels and setting
        // the bounds for the labels
        l1 = new JLabel("Branch :");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Courses :");
        l2.setBounds(50, 120, 100, 30);

        // Creating two string arrays one for
        // braches and other for sections
        String s1[]
            = { "  ", "CSE", "ECE", "EEE",
                "CIVIL", "MEC", "Others" };
        String s2[]
            = { "  ", "MCA", "BCA",
                "MBA", "BBA",
                "B.Tech" };

        // Creating two JComboBoxes one for
        // selecting branch and other for
        // selecting the section
        // and setting the bounds
        j1 = new JComboBox(s1);
        j1.setBounds(160, 50, 100, 30);
        j2 = new JComboBox(s2);
        j2.setBounds(160, 120, 100, 30);

        // Creating one button for Saving
        // and other button to close
        // and setting the bounds
        b1 = new JButton("Save");
        b1.setBounds(80, 200, 70, 30);
        b2 = new JButton("close");
        b2.setBounds(180, 200, 70, 30);

        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                // Getting the text from text fields
                // and JComboboxes
                // and copying it to a strings

                String s1 = l1.getText();
                String s2 = l2.getText();
                String s3 = j1.getSelectedItem() + "";
                String s4 = j2.getSelectedItem() + "";
                if (e.getSource() == b1) {
                    try {

                        // Creating a file and
                        // writing the data
                        // into a Textfile.
                        FileWriter w = new FileWriter("Student_Details.txt", true);

                        w.write(s1 + " : " + s3 + "\n");
                        w.write(s2 + " : " + s4 + "\n");
                        w.close();
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }
                }
                // Shows a Pop up Message when
                // save button is clicked
                JOptionPane.showMessageDialog(f,"Successfully Saved" + " The Details");
            }
        });

        // Action listener to close the form
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        // Adding the created objects
        // to the frame 
        f.add(l1);
        f.add(l2);
        f.add(j1);
        f.add(j2);
        f.add(b1);
        f.add(b2);
        f.setLayout(new BorderLayout());
        JLabel bg = new JLabel(new  ImageIcon("sky-dark-mix-blue.jpg"));
        f.add(bg);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}