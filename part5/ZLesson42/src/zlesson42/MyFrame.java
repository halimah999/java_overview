package zlesson42;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	 MyFrame(){
		  // JFrame = a GUI window to add components to
		this.setVisible(true); //make this visible
		this.setTitle("JFrame title goes here"); //sets title of this);
		this.setSize(400,400);//sets the x-dimension, and y-dimension of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
		this.setResizable(false); //prevent this from being resized

		ImageIcon img = new ImageIcon("javalogo2.png");//create an ImageIcon
		this.setIconImage(img.getImage());//change icon of this		
		this.getContentPane().setBackground(new Color(0x9A9CD5));//change color of background
	}

}
