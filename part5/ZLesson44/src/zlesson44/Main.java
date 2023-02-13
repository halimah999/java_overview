package zlesson44;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		//img icon and label
		ImageIcon img = new ImageIcon("tumb.png");
		JLabel label = new JLabel("Hi");
		label.setIcon(img);
		label.setBounds(100, 20, 75, 200);
		//--------------------------------------------
		// JPanel
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		//redPanel.add(label);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(null);

		//greenPanel.setLayout(new BorderLayout());
		//label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon+text within label
		//label.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label
		greenPanel.add(label);
		
		//--------------------------------------
		JFrame frame = new JFrame();frame.setVisible(true); //make frame visible
		frame.setTitle("JFrame title goes here"); //sets title of frame);
		frame.setSize(750,750);//sets the x-dimension, and y-dimension of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
		frame.setLayout(null);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);

	}

}
