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
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Singup extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JTextField emailinput;
	private JTextField fullnameinput;
	private JButton btnNewButton;
	private JButton btnSingup;
	private JSeparator separator;
	private JLabel lblNumber;
	private JTextField numberinput;
	private JLabel lblPassword_2;
	private JTextField Passwordinput;
	private JLabel lblSecurityQuestion;
	private JLabel lblAnswer;
	private JTextField answerinput;
	private JLabel lblAddress;
	private JTextField addressinput;
	private JComboBox cmbsecqsn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singup frame = new Singup();
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
	public Singup() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 654, 490);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblEmail());
		contentPane.add(getLblPassword());
		contentPane.add(getEmailinput());
		contentPane.add(getFullnameinput());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnSingup());
		contentPane.add(getSeparator());
		contentPane.add(getLblNumber());
		contentPane.add(getNumberinput());
		contentPane.add(getLblPassword_2());
		contentPane.add(getPasswordinput());
		contentPane.add(getLblSecurityQuestion());
		contentPane.add(getLblAnswer());
		contentPane.add(getAnswerinput());
		contentPane.add(getLblAddress());
		contentPane.add(getAddressinput());
		contentPane.add(getCmbsecqsn());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("SingUp");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(280, 20, 154, 35);
		}
		return lblNewLabel;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Full Name");
			lblEmail.setForeground(Color.WHITE);
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(60, 86, 103, 35);
		}
		return lblEmail;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Email ID");
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPassword.setBounds(60, 134, 103, 35);
		}
		return lblPassword;
	}
	private JTextField getEmailinput() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setBounds(224, 138, 367, 26);
			emailinput.setColumns(10);
		}
		return emailinput;
	}
	private JTextField getFullnameinput() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setColumns(10);
			fullnameinput.setBounds(224, 89, 367, 26);
		}
		return fullnameinput;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Register");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					User usr = new User();
					
					usr.setFullname(fullnameinput.getText());
					usr.setEmail(emailinput.getText());
					usr.setMobile(numberinput.getText());
					usr.setPsw(Passwordinput.getText());
					usr.setSecqsn(cmbsecqsn.getSelectedItem().toString());
					usr.setAnswer(answerinput.getText());
					usr.setAddress(addressinput.getText());
					
					User_Service us = new User_Service_empl();
					boolean res = us.AddUser(usr);
					
					if(res) {
						JOptionPane.showMessageDialog(null, "SingUp Success");
						new Login().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "SingUp Failed");
					}
					
					
				}
			});
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBounds(261, 425, 127, 32);
		}
		return btnNewButton;
	}
	private JButton getBtnSingup() {
		if (btnSingup == null) {
			btnSingup = new JButton("Login");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index().setVisible(true);
					dispose();
				}
			});
			btnSingup.setBackground(new Color(220, 20, 60));
			btnSingup.setForeground(Color.WHITE);
			btnSingup.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSingup.setBounds(455, 425, 117, 32);
		}
		return btnSingup;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(247, 68, 187, 20);
		}
		return separator;
	}
	private JLabel getLblNumber() {
		if (lblNumber == null) {
			lblNumber = new JLabel("Mobile No");
			lblNumber.setForeground(Color.WHITE);
			lblNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNumber.setBounds(60, 179, 103, 35);
		}
		return lblNumber;
	}
	private JTextField getNumberinput() {
		if (numberinput == null) {
			numberinput = new JTextField();
			numberinput.setColumns(10);
			numberinput.setBounds(224, 183, 367, 26);
		}
		return numberinput;
	}
	private JLabel getLblPassword_2() {
		if (lblPassword_2 == null) {
			lblPassword_2 = new JLabel("Password");
			lblPassword_2.setForeground(Color.WHITE);
			lblPassword_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPassword_2.setBounds(60, 224, 103, 35);
		}
		return lblPassword_2;
	}
	private JTextField getPasswordinput() {
		if (Passwordinput == null) {
			Passwordinput = new JTextField();
			Passwordinput.setColumns(10);
			Passwordinput.setBounds(224, 228, 367, 26);
		}
		return Passwordinput;
	}
	private JLabel getLblSecurityQuestion() {
		if (lblSecurityQuestion == null) {
			lblSecurityQuestion = new JLabel("Security Question");
			lblSecurityQuestion.setForeground(Color.WHITE);
			lblSecurityQuestion.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSecurityQuestion.setBounds(60, 269, 154, 35);
		}
		return lblSecurityQuestion;
	}
	private JLabel getLblAnswer() {
		if (lblAnswer == null) {
			lblAnswer = new JLabel("Answer");
			lblAnswer.setForeground(Color.WHITE);
			lblAnswer.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer.setBounds(60, 314, 103, 35);
		}
		return lblAnswer;
	}
	private JTextField getAnswerinput() {
		if (answerinput == null) {
			answerinput = new JTextField();
			answerinput.setColumns(10);
			answerinput.setBounds(224, 318, 367, 26);
		}
		return answerinput;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setForeground(Color.WHITE);
			lblAddress.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAddress.setBounds(60, 359, 103, 35);
		}
		return lblAddress;
	}
	private JTextField getAddressinput() {
		if (addressinput == null) {
			addressinput = new JTextField();
			addressinput.setColumns(10);
			addressinput.setBounds(224, 363, 367, 26);
		}
		return addressinput;
	}
	private JComboBox getCmbsecqsn() {
		if (cmbsecqsn == null) {
			cmbsecqsn = new JComboBox();
			cmbsecqsn.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbsecqsn.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Your Security Question --- ]", "What is Your Nick Name", "Where are you Born", "what is your Favourite flower", "what is your favourite Movies"}));
			cmbsecqsn.setBounds(224, 273, 367, 26);
		}
		return cmbsecqsn;
	}
}
