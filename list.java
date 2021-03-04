package AdvJAVA;
import  java.awt.*;
import java.awt.event.*;
public class list extends Frame implements ItemListener{	
	String msg="";
	List alist;
	Panel apanel;
	Label alabel;
	list(){
		setLayout(new FlowLayout());
	     alabel=new Label("Hobbies");
		alabel.setAlignment(Label.CENTER);
	    alist=new List();
		alist.add("Cricket");
		alist.add("basketball");
		alist.add("Badminton");
		alist.add("Football");
		
		alist.addItemListener(this);
		apanel=new Panel();
		add(apanel);
		apanel.add(alabel);
		apanel.add(alist);
		apanel.setBackground(Color.LIGHT_GRAY);
		
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();//call the paint method
		
	}
	public void paint(Graphics g) {
		
	g.drawString("Selected Hobby:", 15, 100);
	msg=alist.getSelectedItem();
	g.drawString(msg, 20,120);
	}
public static void main(String[] args) {
	list f=new list();
	f.setSize(300,300);
	f.setTitle("List");
	f.setVisible(true);
	f.addWindowListener(new exit1());
	
}
}
class exit1 extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
