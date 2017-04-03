package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Titre extends JTextArea {
	private String text;
	
	public Titre(String monText){
		super();
		initialize(monText);
	}
	
	private void initialize(String myText) {
    	this.append(myText); 
    }

}