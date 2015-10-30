package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class Praktijk extends Applet 
{

	Label labelNaam = new Label("Naam: ");
	Label labelNummer = new Label("Telefoonnummer: ");
	TextField inputNaam = new TextField("", 15);
	TextField inputNummer = new TextField("", 15);
	Button ok = new Button("OK");
	String[] stringNaam = new String[10];
	String[] stringNummer = new String[10];
	int teller = 0;
	
	public void init() 
	{
		setSize(600, 200);
		add(labelNaam);
		add(inputNaam);
		inputNaam.addActionListener(new InputListener());
		add(labelNummer);
		add(inputNummer);
		inputNummer.addActionListener(new InputListener());
		add(ok);
		ok.addActionListener(new InputListener());
		for (int i = 0; i < stringNaam.length; i++) 
		{
			stringNaam[i] = "";
			stringNummer[i] = "";
		}
	}
	
	public void paint(Graphics g) 
	{
		int x = getWidth();
		int y = getHeight();
		
		for (int i = 0; i < stringNaam.length; i++) 
		{
			if (teller == 10) 
			{
				g.drawString(""+ stringNaam[i], x/2-100, (y/2-35*stringNaam.length/2)+35*i);
				g.drawString(""+ stringNummer[i], x/2-100, (y/2-35*stringNaam.length/2)+15+35*i);
			}
		}
	}
	
	class InputListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			teller++;
			stringNaam[(teller-1)] = "Naam: "+ inputNaam.getText();
			stringNummer[(teller-1)] = "Telefoonnummer: "+ inputNummer.getText();
			inputNaam.setText("");
			inputNummer.setText("");
			inputNaam.requestFocus();
			repaint();
		}
	}
}

