package AdvJAVA;
import java.awt.*;
import java.awt.event.*;
public class LoginPage extends Frame{
	
	public static void main(String[] args) {
		Frame f=new Frame("Login Page");
		f.setVisible(true);
		f.setSize(500,500);
		f.addWindowListener(new Close());
		f.setBackground(Color.gray);
		Font ft=new Font("Arial",Font.ITALIC,15);
		f.setFont(ft);
		Panel p=new Panel();
		p.setLayout(null);
		f.add(p);
	
		Label l=new Label("LOGIN PAGE");
        l.setLocation(200,70);
        l.setSize(100,30);
        p.add(l);
        
        Label l1=new Label("Username");
        l1.setLocation(100,120);
        l1.setSize(100,30);
        p.add(l1);
        
        Label  l2=new Label("Password");
        l2.setLocation(100,160);
        l2.setSize(100,30);
        p.add(l2);
        
        TextField tf=new TextField(20);
        tf.setLocation(220,120);
        tf.setSize(150, 30);
        p.add(tf);
		
        TextField tf1=new TextField(20);
        tf1.setEchoChar('*');
        tf1.setLocation(220, 160);
        tf1.setSize(150,30);
        p.add(tf1);
        
        Button b1=new Button("Login");
        b1.setLocation(200, 220);
        b1.setSize(70,40);
        p.add(b1);

	}
	
}
class close1 extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
