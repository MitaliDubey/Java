package AdvJAVA;
import java.awt.*;
import java.awt.event.*;

public class buttons extends Frame{

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setVisible(true);
        f.setSize(400,400);
        f.setTitle("Buttons");
		f.addWindowListener(new exit3());
		Panel p=new Panel();
		p.setBackground(Color.cyan);
		Button okButton=new Button("ok");
		Button cancel=new Button("cancel");
		
		TextField tf=new TextField(10);
		
		f.add(p);
		p.add(tf);
		
		p.add(okButton);
		p.add(cancel);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("ok button is working");
				
			}
		});
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
			
		});
		}

}
class exit3  extends WindowAdapter{
	 @Override
	    public void windowClosing(WindowEvent e)
	    {
	        
		 System.exit(0);
		 
	    }
	
}
