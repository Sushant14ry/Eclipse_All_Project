package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Connections.DB;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField username;
	private JLabel lblPassword;
	private JLabel lblLogin;
	private JSeparator separator;
	private JButton btnNewButton;
	private JCheckBox show_msg;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JButton btnX;
	private JLabel error_msg;
	private JPasswordField pswinput;

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
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 824);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getBtnX());
		
		error_msg.setVisible(false);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(380, 170, 857, 465);
			panel.setLayout(null);
			panel.add(getPanel_1());
			panel.add(getPanel_2());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(412, 10, 435, 445);
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel());
			panel_1.add(getUsername());
			panel_1.add(getLblPassword());
			panel_1.add(getLblLogin());
			panel_1.add(getSeparator());
			panel_1.add(getBtnNewButton());
			panel_1.add(getShow_msg());
			panel_1.add(getError_msg());
			panel_1.add(getPswinput());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(43, 147, 127, 35);
		}
		return lblNewLabel;
	}
	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField();
			username.setFont(new Font("Tahoma", Font.BOLD, 16));
			username.setText("Enter Your Username");
			username.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					error_msg.setVisible(false);
					if(username.getText().equals("Enter Your Username")) {
						username.setText("");
						username.setForeground(new Color(0,118,221));
					}
				}
				@Override
				public void focusLost(FocusEvent e) {
					error_msg.setVisible(false);
					if(username.getText().equals("")) {
						username.setText("Enter Your Username");
						username.setForeground(new Color(0,118,221));
					}
				}
			});
			username.setBounds(43, 189, 352, 32);
			username.setColumns(10);
		}
		return username;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblPassword.setBounds(43, 249, 127, 35);
		}
		return lblPassword;
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("LOGIN");
			lblLogin.setFont(new Font("Elephant", Font.BOLD, 24));
			lblLogin.setBounds(176, 38, 121, 35);
		}
		return lblLogin;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(150, 85, 164, 18);
		}
		return separator;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String user = username.getText();
					String pasw = pswinput.getText();
					
//					---------------------------- Admin Login Code --------------------
					
					try {
						String login = "Select * from login where username='"+user+"' and psw='"+pasw+"' ";
						Statement stm = DB.getDB().createStatement();
						ResultSet res = stm.executeQuery(login);
						
						if(res.next()) {
							JOptionPane.showMessageDialog(null,"Login Success");
							new Dashboard().setVisible(true);
							dispose();
						}else {
							JOptionPane.showMessageDialog(null,"Login Failed");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton.setBounds(43, 348, 101, 42);
		}
		return btnNewButton;
	}
	private JCheckBox getShow_msg() {
		if (show_msg == null) {
			show_msg = new JCheckBox("Show Password");
			show_msg.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(show_msg.isSelected()) {
						pswinput.setEchoChar((char) 0 );
					}else {
						pswinput.setEchoChar('*');
					}
				}
			});
			show_msg.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
			show_msg.setBounds(191, 348, 204, 42);
		}
		return show_msg;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBounds(10, 10, 390, 445);
			panel_2.setLayout(null);
			panel_2.add(getLblNewLabel_1());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Photos");
			lblNewLabel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			lblNewLabel_1.setBounds(10, 10, 370, 425);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit This Application","select",JOptionPane.YES_NO_OPTION);
					if(a == 0) {
						System.exit(a);
					}
				}
			});
			btnX.setForeground(Color.WHITE);
			btnX.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnX.setBackground(Color.RED);
			btnX.setBounds(1480, 16, 50, 40);
		}
		return btnX;
	}
	private JLabel getError_msg() {
		if (error_msg == null) {
			error_msg = new JLabel("Incorrect Username and Password");
			error_msg.setForeground(Color.RED);
			error_msg.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 17));
			error_msg.setBounds(43, 102, 352, 35);
		}
		return error_msg;
	}
	private JPasswordField getPswinput() {
		if (pswinput == null) {
			pswinput = new JPasswordField();
			pswinput.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					error_msg.setVisible(false);
					if(pswinput.getText().equals("Enter Your Password")) {
						pswinput.setText("");
						pswinput.setForeground(new Color(0,118,221));
					}
				}
				@Override
				public void focusLost(FocusEvent e) {
					error_msg.setVisible(false);
					if(pswinput.getText().equals("")) {
						pswinput.setText("Enter Your Password");
						pswinput.setForeground(new Color(0,118,221));
					}
				}
			});
			pswinput.setFont(new Font("Arial Black", Font.BOLD, 16));
			pswinput.setBounds(43, 291, 352, 32);
		}
		return pswinput;
	}
}
