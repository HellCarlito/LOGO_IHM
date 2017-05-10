package Main;

import javax.swing.JFrame;

import view.Menu;

public class Main
{
	public static void main(String[] args)
	{
		 JFrame test = new JFrame();
	     test.setContentPane(new Menu());
	     test.setVisible(true);
	     test.pack();
	}
}
