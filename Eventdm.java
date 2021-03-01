package AdvJAVA;
import java.awt.*;
import java.awt.event.*;
public class Eventdm extends Frame{
	Frame f=new Frame();
    Button b=new Button("Display Name");
    TextField tf=new TextField(15);
     
    Eventdm(){
   f.setLayout(new FlowLayout());
   f.add(tf);
   f.add(b);
    
   classA a=new classA(tf);
   b.addActionListener(a);
   f.setSize(400,400);
   f.setVisible(true);
   f.addWindowListener(new closef());
    
    }
	public static void main(String[] args) {
		Eventdm e=new Eventdm();
	}
	
	class classA implements ActionListener{
		TextField tf;
		classA(TextField tf){
			
			this.tf=tf;
		}
		public void actionPerformed(ActionEvent ae) {
			tf.setText("Mitali Dubey");
		}
		
	}

}
class closef extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
