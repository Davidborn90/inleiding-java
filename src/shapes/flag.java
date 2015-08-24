package shapes;

import java.awt.*;
import java.applet.*;

public class flag extends Applet{ public void init(){setBackground(Color.cyan);}
public void paint(Graphics g){
	g.setColor(Color.red);
	g.drawRect(50,50,90,25);
	g.fillRect(50,50,90,25);
	g.setColor(Color.white);
	g.drawRect(50,75,90,25);
	g.fillRect(50,75,90,25);
	g.setColor(Color.blue);
	g.drawRect(50,100,90,25);
	g.fillRect(50,100,90,25);
	g.setColor(Color.black);
	g.drawRect(45,50,5,120);
	g.fillRect(45,50,5,120);
	
}


}
