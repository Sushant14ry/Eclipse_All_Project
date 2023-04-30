package Mukuls;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class two_JLabel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100,50,600,500);
		frame.setTitle("My Frame ");
		Container c = frame.getContentPane();
		c.setLayout(null);
		
//		JLabel label = new JLabel();
//		label.setBounds(100,50,100,30);
//		label.setText("Username");
//		
//		Font font = new Font("Arial",Font.BOLD,20);
//		label.setFont(font);
////	label.setFont(new Font("Arial", Font.BOLD, 14));
//		--------------------------- Iamage in Label -----------------------------------------
//		ImageIcon icon = new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\sc1.jpg");
//		JLabel label = new JLabel(icon);
////		setIcon(new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\sc1.jpg"));
//		label.setBounds(100,50,icon.getIconHeight(),icon.getIconWidth());  // fixed image size with label
//		--------------------------- Both Text and Image in Labels -----------------------------------------
		ImageIcon icon = new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\sc1.jpg");
		JLabel label = new JLabel("TEXT",icon,JLabel.RIGHT);
		label.setBounds(50,100,500,100);
		c.add(label);
		
		
		
		c.add(label);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
