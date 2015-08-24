package shapes;

import java.awt.*;
import java.applet.*;

public class huis extends Applet{ public void init(){}
public void paint(Graphics g){
	g.drawLine(50, 120, 150, 120);
	g.drawLine(50, 120, 100, 50);
	g.drawLine(100, 50, 150, 120);
	g.drawRect(50,150,20,45);
	g.drawRect(50,120,100,75);
	g.drawRect(100,150,35,35);
}

}
