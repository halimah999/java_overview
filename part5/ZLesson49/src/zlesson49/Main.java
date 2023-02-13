package zlesson49;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {
		  
		  // JLayeredPane = Swing container that provides a 
		  //				third dimension for positioning components
		  //				ex. depth Z-index  
		
		  //label1
		  JLabel label1= new JLabel();
		  label1.setBackground(Color.red);
		  label1.setBounds(50,50,200,200);
		  label1.setOpaque(true);
		  //label2
		  JLabel label2= new JLabel();
		  label2.setBackground(Color.green);
		  label2.setBounds(100,100,200,200);
		  label2.setOpaque(true);
		  
		  //label3
		  JLabel label3= new JLabel();
		  label3.setBackground(Color.blue);
		  label3.setBounds(150,150,200,200);
		  label3.setOpaque(true);
		  
		  JLayeredPane layeredPane = new JLayeredPane();
		  layeredPane.add(label1,Integer.valueOf(0));
		  layeredPane.add(label2,Integer.valueOf(1));
		  layeredPane.add(label3,Integer.valueOf(2));
		
		  JFrame frame =new JFrame();
		  frame.setSize(500,500);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.add(layeredPane);
		  frame.setVisible(true);

	}

}
