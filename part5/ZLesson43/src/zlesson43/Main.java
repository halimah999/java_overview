package zlesson43;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		//border
		Border border = BorderFactory.createLineBorder(Color.green, 4) ;
		//label
		JLabel label = new JLabel(); //create a label
		label.setText("bro, do you even code?"); //set text of 
		//Image icon
		ImageIcon image = new ImageIcon("coding2.gif");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); //set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,40)); //set font of text
		label.setIconTextGap(2);//set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //display background color
		label.setBorder(border);

		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions
			

		

		//frame
		JFrame frame =new  JFrame(); //creates a frame
		frame.setVisible(true); //make frame visible
		frame.setTitle("JFrame title goes here"); //sets title of frame);
		//frame.setSize(500,500);//sets the x-dimension, and y-dimension of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
		//frame.setResizable(false); //prevent frame from being resized
		frame.add(label);
		//frame.setLayout(null);
		frame.pack();
	

	}

}
