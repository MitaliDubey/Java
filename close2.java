package AdvJAVA;


import java.awt.event.WindowAdapter;

import java.awt.*;
import java.awt.event.WindowEvent;
/**
 *
 * @author mitali dubey
 */
public class close2 extends Frame{
    public static void main(String[] args) {
        close2 c1=new close2();
        c1.setVisible(true);
        c1.setSize(500,500);
        c1.setTitle("my frame");
        c1.addWindowListener(new newclass());
        
    }
}
    class newclass extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
        
    }


