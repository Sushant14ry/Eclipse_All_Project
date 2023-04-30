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
import javax.swing.JPasswordField;

public class Index extends JFrame {
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel contentPane_1;
	private JLabel lblNewLabel_1;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JTextField emailinput;
	private JButton btnNewButton;
	private JButton btnSingup;
	private JButton btnForgotPassword;
	private JSeparator separator;
	private JButton btnNewButton_1;
	private JPasswordField pswinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 40, 1402, 774);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getContentPane_1());
		contentPane.add(getBtnNewButton_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Hotel Management System");
			lblNewLabel.setFont(new Font("Elephant", Font.BOLD, 46));
			lblNewLabel.setBounds(400, 26, 679, 110);
		}
		return lblNewLabel;
	}
	private JPanel getContentPane_1() {
		if (contentPane_1 == null) {
			contentPane_1 = new JPanel();
			contentPane_1.setLayout(null);
			contentPane_1.setForeground(Color.WHITE);
			contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane_1.setBackground(Color.DARK_GRAY);
			contentPane_1.setBounds(400, 214, 654, 346);
			contentPane_1.add(getLblNewLabel_1());
			contentPane_1.add(getLblEmail());
			contentPane_1.add(getLblPassword());
			contentPane_1.add(getEmailinput());
			contentPane_1.add(getBtnNewButton());
			contentPane_1.add(getBtnSingup());
			contentPane_1.add(getBtnForgotPassword());
			contentPane_1.add(getSeparator());
			contentPane_1.add(getPswinput());
		}
		return contentPane_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Login");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel_1.setBounds(305, 28, 109, 35);
		}
		return lblNewLabel_1;
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
					
					String emails = emailinput.getText();
					String psws = pswinput.getText();
					
					System.out.println(emails);
					System.out.println(psws);
					
					User_Service us = new User_Service_empl();
					boolean login = us.LoginUser(emails, psws);
					
					System.out.println(login);
					if(login) {	
						JOptionPane.showMessageDialog(null, "Login Success");
						new Home_Page().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Login Failed");
					}
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setBounds(247, 219, 91, 32);
		}
		return btnNewButton;
	}
	private JButton getBtnSingup() {
		if (btnSingup == null) {
			btnSingup = new JButton("SingUp");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index_SingUp().setVisible(true);
					dispose();
				}
			});
			btnSingup.setForeground(Color.WHITE);
			btnSingup.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSingup.setBackground(new Color(220, 20, 60));
			btnSingup.setBounds(427, 219, 103, 32);
		}
		return btnSingup;
	}
	private JButton getBtnForgotPassword() {
		if (btnForgotPassword == null) {
			btnForgotPassword = new JButton("Forgot Password ?");
			btnForgotPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index_Forgot().setVisible(true);
					dispose();
				}
			});
			btnForgotPassword.setForeground(Color.WHITE);
			btnForgotPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnForgotPassword.setBackground(new Color(220, 20, 60));
			btnForgotPassword.setBounds(272, 284, 208, 32);
		}
		return btnForgotPassword;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(272, 76, 161, 13);
		}
		return separator;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("X");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit This Application","select",JOptionPane.YES_NO_OPTION);
					if(a == 0) {
						System.exit(a);
					}
				}
			});
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1.setBackground(Color.RED);
			btnNewButton_1.setBounds(1342, 10, 50, 40);
		}
		return btnNewButton_1;
	}
	private JPasswordField getPswinput() {
		if (pswinput == null) {
			pswinput = new JPasswordField();
			pswinput.setBounds(179, 158, 402, 30);
		}
		return pswinput;
	}
}
