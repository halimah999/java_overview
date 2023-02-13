package zlesson45;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	
	MyFrame(){
		ImageIcon icon = new ImageIcon("LR2.png");
		
		
		button = new JButton();
		button.setIcon(icon);
		button.setText("click here");
		button.setBounds(150, 150, 200, 100);
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,22));
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());

		button.addActionListener(this);
		this.setVisible(true); //make frame visible
		this.setTitle("JFrame title goes here"); //sets title of frame);
		this.setSize(500,500);//sets the x-dimension, and y-dimension of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
		//frame.setResizable(false); //prevent frame from being resized
		this.setLayout(null);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("boo");
		}
		
	}
	

}
