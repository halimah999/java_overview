package zlesson50;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

	 JLabel label = new JLabel("Hello!");
	JFrame frame;
	NewWindow(){
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null,Font.BOLD,25));
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
