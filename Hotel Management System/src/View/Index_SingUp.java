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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Index_SingUp extends JFrame {
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel contentPane_1;
	private JLabel lblNewLabel_1;
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
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index_SingUp frame = new Index_SingUp();
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
	public Index_SingUp() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 40, 1402, 774);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getContentPane_1_1());
		contentPane.add(getBtnNewButton_1_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Hotel Management System");
			lblNewLabel.setFont(new Font("Elephant", Font.BOLD, 46));
			lblNewLabel.setBounds(400, 26, 679, 110);
		}
		return lblNewLabel;
	}
	private JPanel getContentPane_1_1() {
		if (contentPane_1 == null) {
			contentPane_1 = new JPanel();
			contentPane_1.setLayout(null);
			contentPane_1.setForeground(Color.WHITE);
			contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane_1.setBackground(Color.DARK_GRAY);
			contentPane_1.setBounds(400, 146, 654, 490);
			contentPane_1.add(getLblNewLabel_1_1());
			contentPane_1.add(getLblEmail_1());
			contentPane_1.add(getLblPassword_1());
			contentPane_1.add(getTextField_2());
			contentPane_1.add(getTextField_1_1());
			contentPane_1.add(getBtnNewButton_1());
			contentPane_1.add(getBtnSingup_1());
			contentPane_1.add(getSeparator_1());
			contentPane_1.add(getLblNumber());
			contentPane_1.add(getTextField_2_1());
			contentPane_1.add(getLblPassword_2());
			contentPane_1.add(getPasswordinput());
			contentPane_1.add(getLblSecurityQuestion());
			contentPane_1.add(getLblAnswer());
			contentPane_1.add(getAnswerinput());
			contentPane_1.add(getLblAddress());
			contentPane_1.add(getAddressinput());
			contentPane_1.add(getCmbsecqsn());
		}
		return contentPane_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("SingUp");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel_1.setBounds(280, 20, 154, 35);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblEmail_1() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Full Name");
			lblEmail.setForeground(Color.WHITE);
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(60, 86, 103, 35);
		}
		return lblEmail;
	}
	private JLabel getLblPassword_1() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Email ID");
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPassword.setBounds(60, 134, 103, 35);
		}
		return lblPassword;
	}
	private JTextField getTextField_2() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setColumns(10);
			emailinput.setBounds(224, 138, 367, 26);
		}
		return emailinput;
	}
	private JTextField getTextField_1_1() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setColumns(10);
			fullnameinput.setBounds(224, 89, 367, 26);
		}
		return fullnameinput;
	}
	private JButton getBtnNewButton_1() {
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
						new Index().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "SingUp Failed");
					}
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setBounds(261, 425, 127, 32);
		}
		return btnNewButton;
	}
	private JButton getBtnSingup_1() {
		if (btnSingup == null) {
			btnSingup = new JButton("Login");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index().setVisible(true);
					dispose();
				}
			});
			btnSingup.setForeground(Color.WHITE);
			btnSingup.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSingup.setBackground(new Color(220, 20, 60));
			btnSingup.setBounds(455, 425, 117, 32);
		}
		return btnSingup;
	}
	private JSeparator getSeparator_1() {
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
	private JTextField getTextField_2_1() {
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
	private JButton getBtnNewButton_1_1() {
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
}
