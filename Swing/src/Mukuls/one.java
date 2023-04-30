package Mukuls;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class one {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
/*		frame.setSize(700,500);
		frame.setLocation(100,50);
*/		frame.setBounds(100,50,600,500);
		
		// Software Title
		frame.setTitle("My Frame ");  // Software Title 
		
		// Image Icon
		ImageIcon icon = new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\sc1.jpg");
		frame.setIconImage(icon.getImage()); // Show Images
		
		// Background Change
		Container cl = frame.getContentPane();
//		cl.setBackground(Color.ORANGE);
		cl.setBackground(Color.red);
		
		// Fix Resize Window
		frame.setResizable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
