package h11; 
 
import java.applet.Applet; 
import java.awt.Graphics; 
 
 
public class opdracht1 extends Applet { 

	public void paint(Graphics g)
	{ 
 		int i = 10; 
		int x = 50; 
 		int y = 50; 
 		while (i < 30)
 		{  
			g.drawLine(x, y, 300, y); 
 			y += 20; 
			i++; 
 		} 	 
 	} 
 } 
