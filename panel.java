package AdvJAVA;


import java.awt.*;
import java.awt.event.*;
public class panel extends Frame{
	
	public static void main(String[] args) {
		
		
		Panel apanel=new Panel();
		apanel.add(new Button("ok"));
		apanel.add(new Button("cancel"));
		apanel.setBackground(Color.gray);
		Frame f=new Frame();
		f.setSize(300,300);
		f.setVisible(true);
		f.setTitle("Panel in Frame");
		f.setLocation(10,10);
	
		f.add(apanel);
		f.addWindowListener(new close());
	}
}
	class close extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
        
	}



