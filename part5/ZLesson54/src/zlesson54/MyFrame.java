package zlesson54;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JRadioButton pizzaButton;
	JRadioButton burgerButton;
	JRadioButton hotdogButton;
	ButtonGroup group;

	
	MyFrame(){	
		
	pizzaButton  = new JRadioButton("pizza");
	burgerButton = new JRadioButton("burger");
	hotdogButton = new JRadioButton("hotdog");
	group  = new ButtonGroup();
	//button = new JButton("submit");
	//button.addActionListener(this);
	
	group.add(burgerButton);
	group.add(pizzaButton);
	group.add(hotdogButton);
	
	this.setSize(400, 400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.add(burgerButton);
	this.add(pizzaButton);
	this.add(hotdogButton);
	burgerButton.addActionListener(this);
	pizzaButton.addActionListener(this);
	hotdogButton.addActionListener(this);
	//this.add(button);
	//this.pack();
	this.setLayout(new FlowLayout());
	this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==pizzaButton) {
			   System.out.println("You ordered pizza!");
			  }
			  else if(e.getSource()==burgerButton) {
			   System.out.println("You ordered a hamburger!");
			  }
			  else if(e.getSource()==hotdogButton) {
			   System.out.println("You ordered a hotdog!");}

		
	}

}
