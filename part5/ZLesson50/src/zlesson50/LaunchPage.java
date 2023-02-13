package zlesson50;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	JFrame frame;
	JButton button;
	
	LaunchPage(){
		frame = new JFrame();
		button = new JButton();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.setText("Lunch Windows");
		button.setBounds(100,160,200,40);
		button.setFocusable(false);
		button.addActionListener(this);
		frame.add(button);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			frame.dispose();
			NewWindow window = new NewWindow();
		}
		
		
		
	}
	

}
