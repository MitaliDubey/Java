package AdvJAVA;
import java.awt.*;
import java.awt.event.*;
public class checkbox extends Frame implements ItemListener{
 String msg="";
 Checkbox cb1,cb2,cb3;
	checkbox(){
		addWindowListener(new exit2());
		
		setLayout(new FlowLayout());
	    cb1=new Checkbox("Red");
		cb1.setBounds(100, 100, 70, 30);
	
	    cb2=new Checkbox("Green");
		cb2.setBounds(200, 100, 70, 30);
		
		cb3=new Checkbox("black");
		cb3.setBounds(300, 100, 70, 30);
		add(cb1);
		add(cb2);
		add(cb3);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		
		repaint();
		//show current status
	}
	public void paint(Graphics g) {
		
		g.drawString("Show Status:", 15, 100);
		msg="Red:"+ cb1.getState();
		
		g.drawString(msg, 15, 120);
		msg="Green:"+ cb2.getState();
		
		g.drawString(msg, 15, 140);
		msg="Black:"+ cb3.getState();
		g.drawString(msg, 15, 160);
		
	}
	public static void main(String[] args) {
		
        	checkbox obj =new checkbox();	
        	obj.setSize(500,500);
    		obj.setTitle("my checkbox");
    		obj.setVisible(true);
    		
		
	}
	

}
class exit2 extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}