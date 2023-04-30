package Mukuls;

import java.awt.Container;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class three_textField {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100,100,600,400);
		Container c = frame.getContentPane();
		
		JTextField t1 = new JTextField();
		t1.setBounds(100,50,120,30);
		t1.setText("Enter Your Name");
		Font font = new Font("Arial",Font.BOLD,14);
		t1.setFont(font);
		t1.setForeground(Color.green);
		t1.setBackground(Color.yellow);
		
		// no one can change text
		t1.setEditable(false);
		c.add(t1);
		
		

		
		frame.setVisible(true);
	}
}
