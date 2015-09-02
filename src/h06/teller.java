package h06;

import java.applet.*;
import java.awt.Graphics;

public class teller extends Applet
{
	int teller;
	public void init()
	{
		teller=0;
	}
	public void paint(Graphics g)
	{
		teller++;
		g.drawString("refresh is: "+teller, 20, 20);
	}

}
