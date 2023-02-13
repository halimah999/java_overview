package zlesson53;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	MyFrame()
	{   
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("submit");
		button.addActionListener(this);
		checkBox = new JCheckBox("I'm not a robot");
		xIcon = new ImageIcon("cancel.png");
		checkIcon = new ImageIcon("check.png");


	    //checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,25));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);

		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
		
		
	}

}
