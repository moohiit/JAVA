import javax.swing.*;

class _5_Notepad{
    JFrame f1;
    JMenuBar mb;
    JMenu fi, ed, se;
    JMenuItem ne,op,sa,sas,re,exit,cut,copy,paste,undo,redo,find,findnext,replace;
    JTextArea ta;

    public _5_Notepad() {
        f1 = new JFrame("Notepad");
        f1.setLayout(null);
        //Creating Menubar
        mb = new JMenuBar();
        f1.setJMenuBar(mb);
        //Creating Menus
        fi = new JMenu("File");
        ed = new JMenu("Edit");
        se = new JMenu("Search");
        mb.add(fi);
        mb.add(ed);
        mb.add(se);
    

        //creating menu items:
        //1.For file menu:
        ne=new JMenuItem("New");
        op=new JMenuItem("Open");
        sa=new JMenuItem("Save");
        sas=new JMenuItem("Save as");
        re = new JMenuItem("Rename");
        exit = new JMenuItem("Exit");
        fi.add(ne);
        fi.add(op);
        fi.add(sa);
        fi.add(sas);
        fi.add(re);
        fi.add(exit);
        //2.For Edit menu:
        undo = new JMenuItem("Undo");
        redo = new JMenuItem("Redo");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        ed.add(undo);
        ed.add(redo);
        ed.add(cut);
        ed.add(copy);
        ed.add(paste);
        //3.For search menu:
        find=new JMenuItem("Find");
        findnext=new JMenuItem("Find Next");
        replace=new JMenuItem("Replace");
        se.add(find);
        se.add(findnext);
        se.add(replace);
        
        //Creating Text area:
        ta = new JTextArea();
        ta.setBounds(0,0,500,600);
        f1.add(ta);

        //Set the size of the frame:
        f1.setSize(490,590);
        f1.setVisible(true);
    }
    //Calling main function:
    public static void main(String[] args) {
        _5_Notepad np = new _5_Notepad();
    }
}