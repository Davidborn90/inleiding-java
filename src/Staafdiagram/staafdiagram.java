package Staafdiagram;

import java.awt.*;
import java.applet.*;


@SuppressWarnings("serial")
public class staafdiagram extends Applet  
{
	int V, J, H;
	
	public void init()
	{
		//Valerie's gewicht.
		V=40;
		//Hans zijn gewicht.
		H=80;
		//Jeroen's gewicht.
		J=100;
	}
public void paint(Graphics g)
{
	//lijnen
	g.drawLine(20, 20, 20, 220);
	g.drawLine(20, 220, 140, 220);
	//waardes van grafiek
	g.drawString("0", 10, 220);
	g.drawString("20", 5, 180);
	g.drawString("40", 5, 140);
	g.drawString("60", 5, 100);
	g.drawString("80", 5, 60);
	g.drawString("100", 5, 20);
	//jeroen
	g.setColor(Color.green);
	g.drawString("J", 40, 240);
	g.fillRect(30, 220-(J*2), 20, J*2);
	//Hans
	g.setColor(Color.blue);
	g.drawString("H", 80, 240);
	g.fillRect(75,220-(H*2),20,H*2);
	//valerie
	g.setColor(Color.pink);
	g.drawString("V", 120, 240);
	g.fillRect(115, 220-(V*2), 20, V*2);
}
/* Omdat ik 2 pixels per kilogram nodig heb worden de formules voor de pixels altijd met 
 * 2 vermenigvuldigt.
 */

}
