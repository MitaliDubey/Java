package AdvJAVA;



import java.awt.*;
import java.awt.event.*;
public class firstFrame extends Frame {
    public static void main(String[] args) {
        firstFrame f1=new firstFrame();
        f1.setTitle("My First Frame");
        f1.setSize(400,300);
        f1.setVisible(true);
        f1.addWindowListener(new newClass());
       
    }
} 
    class  newClass implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
         System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
       
    }

    @Override
    public void windowIconified(WindowEvent e) {
            }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }

    }

