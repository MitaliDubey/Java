package AdvJAVA;
import  java.awt.*;
import java.awt.event.*;
public class list extends Frame {	
public static void main(String[] args) {
	Frame f=new Frame();
	f.setSize(300,300);
	f.setTitle("List");
	f.setVisible(true);
	f.addWindowListener(new exit1());
	Label alabel=new Label("Hobbies");
	alabel.setAlignment(Label.CENTER);
	List alist=new List();
	alist.add("Cricket");
	alist.add("basketball");
	alist.add("Badminton");
	alist.add("Footbsall");
	alist.setMultipleMode(true);
	Panel apanel=new Panel();
	f.add(apanel);
	apanel.add(alabel);
	apanel.add(alist);
	apanel.setBackground(Color.LIGHT_GRAY);
}
}
class exit1 extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
