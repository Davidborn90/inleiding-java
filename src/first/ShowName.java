package first;

import java.awt.*;
import java.applet.*;



public class ShowName extends Applet {
	public void init() {setBackground(Color.white); }
		public void paint(Graphics g) {
			g.setColor(Color.blue);
			g.drawString("David",50, 60);
			g.setColor(Color.red);
			g.drawString("Born", 50, 80);
		}
			
		}
		

