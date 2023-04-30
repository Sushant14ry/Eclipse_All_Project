package Mukuls;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class text {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100,100,600,400);
		
		JLabel label = new JLabel("Username");
		label.setBounds(40,40,120,30);
		frame.add(label);
		
//		JTextField t1 = new JTextField();
//		t1.setBounds(200,50,120,30);
//		frame.add(t1);
		
		frame.setVisible(true);
	}
}
