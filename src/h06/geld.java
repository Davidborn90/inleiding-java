package h06;

import java.awt.*;
import java.applet.*;


public class geld extends Applet{

	int uitkomst;
	public void init(){

		uitkomst = (113 / 4);
	}
	public void paint(Graphics g){
		g.drawString("jeannette", 20, 20);
		g.drawString("jan", 20, 40);
		g.drawString("ali", 20, 60);
		g.drawString("david(ik)", 20, 80);
		g.drawString("= €"+uitkomst+",-", 80, 20);
		g.drawString("= €"+uitkomst+",-", 80, 40);
		g.drawString("= €"+uitkomst+",-", 80, 60);
		g.drawString("= €"+uitkomst+",-", 80, 80);
		
	}

}
