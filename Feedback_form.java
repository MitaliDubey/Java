package AdvJAVA;
import java.awt.*;
import java.awt.event.*;
public class Feedback_form extends Frame {

	public static void main(String[] args) {
      Frame f = new Frame("Feedback Form");
      f.setSize(500,500);
      f.setVisible(true);
      f.addWindowListener(new close3());
      Font ft=new Font("Arial",Font.ITALIC,15);
      f.setFont(ft);
      Panel p = new Panel();
      p.setBackground(Color.gray);
      p.setLayout(null);
      f.add(p);
      
      Label lb=new Label("**FEEDBACK**");
      lb.setLocation(200,60);
      lb.setSize(120,50);
      p.add(lb);
      
      Label lb1=new Label("Name");
      lb1.setLocation(150,120);
      lb1.setSize(80,30);
      p.add(lb1);
      
      TextField tf=new TextField(35);
      tf.setLocation(250, 120);
      tf.setSize(150,25);
      p.add(tf);
      
      Label lb2=new Label("Email");
      lb2.setLocation(150,160);
      lb2.setSize(80,30);
      p.add(lb2);
      
      TextField tf1=new TextField(35);
      tf1.setLocation(250, 160);
      tf1.setSize(150,25);
      p.add(tf1);
      
      Label lb3=new Label("Mobile No.");
      lb3.setLocation(150,200);
      lb3.setSize(80,30);
      p.add(lb3);
      
      TextField tf2=new TextField(35);
      tf2.setLocation(250, 200);
      tf2.setSize(150,25);
      p.add(tf2);
      
      Label lb4=new Label("Feedback");
      lb4.setLocation(150,240);
      lb4.setSize(80,30);
      p.add(lb4);
           
      TextArea ta=new TextArea();
      ta.setLocation(250,250);
      ta.setSize(180,120);
      p.add(ta);
      
      Button b1=new Button("Submit");
      b1.setLocation(200, 400);
      b1.setSize(80,30);
      p.add(b1);
	}

}
class close3 extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
}