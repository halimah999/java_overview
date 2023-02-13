package zlesson52;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JTextField textField;
	JButton button;
	
	MyFrame()
	{ 
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("submit");
		button.addActionListener(this);
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,35));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.pink);
		
		this.add(textField);
		this.add(button);
		//this.pack();
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{
			System.out.println(textField.getText());
			textField.setText(null);
		}		
	}

}
