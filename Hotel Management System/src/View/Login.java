package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Service.User_Service;
import Service.User_Service_empl;
import model.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JTextField pswinput;
	private JTextField emailinput;
	private JButton btnNewButton;
	private JButton btnSingup;
	private JButton btnForgotPassword;
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
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 654, 346);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblEmail());
		contentPane.add(getLblPassword());
		contentPane.add(getPswinput());
		contentPane.add(getEmailinput());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnSingup());
		contentPane.add(getBtnForgotPassword());
		contentPane.add(getSeparator());
		contentPane.add(getBtnNewButton_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Login");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(326, 28, 109, 35);
		}
		return lblNewLabel;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setForeground(Color.WHITE);
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(58, 110, 74, 35);
		}
		return lblEmail;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPassword.setBounds(58, 158, 103, 35);
		}
		return lblPassword;
	}
	private JTextField getPswinput() {
		if (pswinput == null) {
			pswinput = new JTextField();
			pswinput.setBounds(179, 162, 402, 26);
			pswinput.setColumns(10);
		}
		return pswinput;
	}
	private JTextField getEmailinput() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setColumns(10);
			emailinput.setBounds(179, 113, 402, 26);
		}
		return emailinput;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String user = emailinput.getText();
					String psw = pswinput.getText();
					
					User_Service us = new User_Service_empl();
//					us.LoginUser(user, psw);
					
					if(us.LoginUser(user, psw)) {
						JOptionPane.showMessageDialog(null, "Login Success");
					}else {
						JOptionPane.showMessageDialog(null, "Login Failed");
					}
				
					
				}
			});
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBounds(247, 219, 91, 32);
		}
		return btnNewButton;
	}
	private JButton getBtnSingup() {
		if (btnSingup == null) {
			btnSingup = new JButton("SingUp");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Singup().setVisible(true);
					dispose();
				}
			});
			btnSingup.setBackground(new Color(220, 20, 60));
			btnSingup.setForeground(Color.WHITE);
			btnSingup.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSingup.setBounds(427, 219, 103, 32);
		}
		return btnSingup;
	}
	private JButton getBtnForgotPassword() {
		if (btnForgotPassword == null) {
			btnForgotPassword = new JButton("Forgot Password ?");
			btnForgotPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Forget_Password().setVisible(true);
					dispose();
				}
			});
			btnForgotPassword.setBackground(new Color(220, 20, 60));
			btnForgotPassword.setForeground(Color.WHITE);
			btnForgotPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnForgotPassword.setBounds(272, 284, 208, 32);
		}
		return btnForgotPassword;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(293, 76, 161, 13);
		}
		return separator;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("X");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showConfirmDialog(null,"Do you Really Want to Exit ?");
					dispose();
				}
			});
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setBackground(Color.RED);
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1.setBounds(584, 3, 60, 60);
		}
		return btnNewButton_1;
	}
}
