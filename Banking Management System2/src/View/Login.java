package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import DB.db;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	Connection conn;
	ResultSet rs;
	PreparedStatement pstm;
	
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField mobile;
	private JPasswordField pin;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JSeparator separator;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		
		// Database Connection
		conn = db.getDb();
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setFont(new Font("Arial Black", Font.BOLD, 16));
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 6, true), "Authentication", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 24, 494, 406);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_1_1());
			panel.add(getMobile());
			panel.add(getPin());
			panel.add(getBtnNewButton());
			panel.add(getLblNewLabel_2());
			panel.add(getSeparator());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(160, 42, 177, 72);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Mobile Number");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(42, 168, 144, 23);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Secret Pin");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(42, 222, 144, 23);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getMobile() {
		if (mobile == null) {
			mobile = new JTextField();
			mobile.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			mobile.setBounds(209, 167, 217, 31);
			mobile.setColumns(10);
		}
		return mobile;
	}
	private JPasswordField getPin() {
		if (pin == null) {
			pin = new JPasswordField();
			pin.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			pin.setBounds(209, 220, 217, 31);
		}
		return pin;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String login = "select * from account where acc_no=? and pin_no=?";
					try {
						pstm = conn.prepareStatement(login);
						pstm.setString(1, mobile.getText());
						pstm.setString(2, pin.getText());
						pstm.executeQuery();
						if(rs.next()) {
							setVisible(false);
							Progress_bar pb = new Progress_bar();
							setVisible(true);
							rs.close();
							pstm.close();
						}else {
							JOptionPane.showMessageDialog(null, "Incorrect Acc_No and Pin No");
						}
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, e);
					}finally {
						try {
							rs.close();
							pstm.close();
						}catch(Exception e1) {
							
						}
					}
				
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(250, 273, 130, 37);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Forget Pin");
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel_2.setBounds(75, 347, 101, 17);
		}
		return lblNewLabel_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(56, 370, 114, 9);
		}
		return separator;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("New Account");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1.setBounds(209, 331, 217, 37);
		}
		return btnNewButton_1;
	}
}
