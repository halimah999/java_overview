package zlesson51;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//JOptionPane = pop up a standard dialog box that prompts users for a value 
		//				or informs them of something.
		
		//JOptionPane.showMessageDialog(null, "This is a message dialog box", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Here is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "CALL TECH SUPPORT OR ELSE!", "title", JOptionPane.ERROR_MESSAGE);
		
		//JOptionPane.showConfirmDialog(null, "Bro, Do you even coding?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		//String name =JOptionPane.showInputDialog("what is your name");
		//System.out.println(name);
		ImageIcon icon = new ImageIcon("happy.png");
		String[] responses = {"No, you are!","thank you!","*blush*"};
		JOptionPane.showOptionDialog(
				null,
				"you are awsome",
				"secret message", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, 
				icon,
				responses,
				0);
		
		




	}

}
