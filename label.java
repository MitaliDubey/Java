package AdvJAVA;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
public class label extends Frame {
	

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setSize(300,300);
		f.setVisible(true);
		f.setTitle("Label");
		Label alabel=new Label("Enter Name");
		alabel.setAlignment(Label.RIGHT);
		Panel apanel=new Panel();
		f.add(apanel);
		apanel.add(alabel);
       f.addWindowListener(new exit());
	}

}
class exit extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}


