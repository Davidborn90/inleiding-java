package h10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Praktijkh10 extends Applet
{
	TextField vak1;
	Label label;
	String text,s,cijfer;
	int maand;
	
	public void init()
	{
		vak1 = new TextField("",20);
		label = new Label("typ een getal");
		vak1.addActionListener(new Vaklisten());
		add (label);
		add (vak1);
	}
	public void paint(Graphics g)
	{
		g.drawString("uw cijfer is een "+ text, 40, 80);
		g.drawString("het ingevoerde cijfer was "+cijfer,40, 100);
		
	}
	class Vaklisten implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			s = vak1.getText();
			maand = Integer.parseInt(s);
			switch(maand)
			{
			case 1:
				text = "slecht cijfer";
				cijfer = "1";
				break;
			case 2:
				text = "slecht cijfer";
				cijfer = "2";
				break;
			case 3:
				text = "slecht cijfer";
				cijfer = "3";
				break;
			case 4:
				text = "onvoldoende";
				cijfer = "4";
				break;
			case 5:
				text = "matig";
				cijfer = "5";
				break;
			case 6:
				text = "voldoende";
				cijfer = "6";
				break;
			case 7:
				text = "voldoende";
				cijfer = "7";
				break;
			case 8:
				text = "goed";
				cijfer = "8";
				break;
			case 9:
				text = "goed";
				cijfer = "9";
				break;
			case 10:
				text = "uitstekend";
				cijfer = "10";
				break;

			default:
				text = "dit is een incorrect cijfer";
				cijfer = null;
				break;
				
			}
			repaint();
		}
	}
}
