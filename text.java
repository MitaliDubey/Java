package AdvJAVA;


import java.awt.*;
import java.awt.event.*;

public class text extends Frame{
	text(){
		this.addWindowListener(new WindowAdapter()

		{
		public void windowClosing(WindowEvent e){
		System.exit(0);
		}
		}
		);

		}
		   
		    public static void main(String[] args) {
		        text t = new text();
		        t.setSize(400,400);
		        t.setVisible(true);
		        t.setTitle("displaying text in frame");
		        
		    }
		    public void paint(Graphics g){
		    g.drawString("hello guys",125,125);
		    g.setColor(Color.red);
		    }
		    
		}


