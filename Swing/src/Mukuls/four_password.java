package Mukuls;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class four_password {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100,100,600,400);
		Container c = frame.getContentPane();
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(100,50,120,20);
		pass.setText("12345678");
		pass.setFont(new Font("Arial",Font.BOLD,24));
		
//		change Password Font
		pass.setEchoChar('*');
		
//		Hide or Show Password
		pass.setEchoChar((char)0);
		
		
		c.add(pass);

		
		frame.setVisible(true);
	}
}
