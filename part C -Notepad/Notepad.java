package GraphicUserInterface;
import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  
  
public class Notepad extends JFrame implements ActionListener{  
JFrame f;  
JMenuBar mb;  
JMenu file,edit,help;  
JMenuItem cut,copy,paste;
JMenuItem open,save,exit;
JMenuItem about;
JTextArea ta;  
      
Notepad(){  
f=new JFrame();  
f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
mb=new JMenuBar();
ta=new JTextArea();
ta.setBounds(5,30,500,500);  
ta.setVisible(true);
f.add(ta);  
f.setTitle("My Simple Editor");

f.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent we) {
        int result = JOptionPane.showConfirmDialog(null, "Do you want to save your changes?", "An Inane Question", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.NO_OPTION) System.exit(0);
        else  {
      	  JFileChooser fileopen = new JFileChooser();
          int ret = fileopen.showSaveDialog(null);
          if (ret == JFileChooser.APPROVE_OPTION) {
              File file = fileopen.getSelectedFile();

              BufferedWriter bw;
              try {
                  bw = new BufferedWriter(new FileWriter(file));
                  bw.write(ta.getText());
                  bw.close();
              } catch (IOException ex) {
                  System.err.println("Error writing to file");
              }
          }
        }

    }
});
  

cut=new JMenuItem("Cut");  
copy=new JMenuItem("Copy");  
paste=new JMenuItem("Paste");  
  
cut.addActionListener(this);  
copy.addActionListener(this);  
paste.addActionListener(this);  
  

open=new JMenuItem("Open");  
save=new JMenuItem("Save");  
exit=new JMenuItem("Exit");

open.addActionListener(this);  
save.addActionListener(this);  
exit.addActionListener(this);

about=new JMenuItem("About");
about.addActionListener(this);


  
mb.setBounds(0,0,500,30);  
  
file=new JMenu("File");  
edit=new JMenu("Edit");  
help=new JMenu("Help");  
  
edit.add(copy);edit.add(paste);edit.add(cut);
file.add(open); file.add(save); file.add(exit);
help.add(about);
 
  
mb.add(file);mb.add(edit);mb.add(help); 


// shortcut
KeyStroke keyStrokeToOpen = KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_DOWN_MASK);
open.setAccelerator(keyStrokeToOpen);

KeyStroke keyStrokeToSave = KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK);
save.setAccelerator(keyStrokeToSave);

KeyStroke keyStrokeToExit = KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_DOWN_MASK);
exit.setAccelerator(keyStrokeToExit);

KeyStroke keyStrokeToCopy = KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK);
copy.setAccelerator(keyStrokeToCopy);

KeyStroke keyStrokeToPaste = KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK);
paste.setAccelerator(keyStrokeToPaste);

KeyStroke keyStrokeToCut = KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK);
cut.setAccelerator(keyStrokeToCut);


//icon
ImageIcon icon = new ImageIcon("C:\\Users\\Hodaya\\Pictures\\icon.jpg");
open.setIcon(icon);
save.setIcon(icon);
exit.setIcon(icon);
copy.setIcon(icon);
paste.setIcon(icon);
cut.setIcon(icon);
about.setIcon(icon);

  
f.add(mb);
f.setLayout(null);  
f.setSize(500,500);  
f.setVisible(true);


}  
  
public void actionPerformed(ActionEvent e) {  
if(e.getSource()==cut)  
ta.cut();  
if(e.getSource()==paste)  
ta.paste();  
if(e.getSource()==copy)  
ta.copy();  
if(e.getSource()==exit)  
System.exit(0); 

if(e.getSource()==open) {
	 JFileChooser fc=new JFileChooser();    
	    int i=fc.showOpenDialog(f);    
	    if(i==JFileChooser.APPROVE_OPTION){    
	        File f=fc.getSelectedFile();    
	        String filepath=f.getPath();    
	        try{  
	        BufferedReader br=new BufferedReader(new FileReader(filepath));    
	        String s1="",s2="";                         
	        while((s1=br.readLine())!=null){    
	        s2+=s1+"\n";    
	        }    
	        ta.setText(s2);    
	        br.close();    
	        }catch (Exception ex) {ex.printStackTrace();  }                 
	    }    
}
if(e.getSource()==save) {
	  JFileChooser fileopen = new JFileChooser();
      int ret = fileopen.showSaveDialog(null);
      if (ret == JFileChooser.APPROVE_OPTION) {
          File file = fileopen.getSelectedFile();

          BufferedWriter bw;
          try {
              bw = new BufferedWriter(new FileWriter(file));
              bw.write(ta.getText());
              bw.close();
          } catch (IOException ex) {
              System.err.println("Error writing to file");
          }
      }
}

if(e.getSource()==about) {
    Toolkit.getDefaultToolkit().beep();
    JOptionPane optionPane = new JOptionPane("My Simple Editor Product Version 1.0.0",JOptionPane.WARNING_MESSAGE);
    JDialog dialog = optionPane.createDialog(f.getTitle());
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
}
}  

  
public static void main(String[] args) {  
    new Notepad();  

}

}  
