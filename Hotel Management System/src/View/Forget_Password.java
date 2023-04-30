package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Forget_Password extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblEmail;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnSingup;
	private JSeparator separator;
	private JLabel lblSecurityQuestion;
	private JLabel lblEmail_1;
	private JTextField textField_2;
	private JLabel lblNewPassword;
	private JTextField textField_3;
	private JButton btnSave;
	private JButton btnSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forget_Password frame = new Forget_Password();
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
	public Forget_Password() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 723, 346);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblEmail());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnSingup());
		contentPane.add(getSeparator());
		contentPane.add(getLblSecurityQuestion());
		contentPane.add(getLblEmail_1());
		contentPane.add(getTextField_2());
		contentPane.add(getLblNewPassword());
		contentPane.add(getTextField_3());
		contentPane.add(getBtnSave());
		contentPane.add(getBtnSearch());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Forgot Password ?");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 28));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(238, 27, 324, 35);
		}
		return lblNewLabel;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setForeground(Color.WHITE);
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(50, 95, 74, 35);
		}
		return lblEmail;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(211, 146, 362, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(209, 98, 364, 26);
		}
		return textField_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBounds(479, 290, 94, 32);
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
			btnSingup.setBounds(341, 290, 103, 32);
		}
		return btnSingup;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(226, 75, 324, 13);
		}
		return separator;
	}
	private JLabel getLblSecurityQuestion() {
		if (lblSecurityQuestion == null) {
			lblSecurityQuestion = new JLabel("Security Question");
			lblSecurityQuestion.setForeground(Color.WHITE);
			lblSecurityQuestion.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSecurityQuestion.setBounds(50, 140, 154, 35);
		}
		return lblSecurityQuestion;
	}
	private JLabel getLblEmail_1() {
		if (lblEmail_1 == null) {
			lblEmail_1 = new JLabel("Answer");
			lblEmail_1.setForeground(Color.WHITE);
			lblEmail_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail_1.setBounds(50, 189, 74, 35);
		}
		return lblEmail_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(209, 194, 364, 26);
		}
		return textField_2;
	}
	private JLabel getLblNewPassword() {
		if (lblNewPassword == null) {
			lblNewPassword = new JLabel("New Password");
			lblNewPassword.setForeground(Color.WHITE);
			lblNewPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewPassword.setBounds(50, 234, 149, 35);
		}
		return lblNewPassword;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(209, 240, 364, 26);
		}
		return textField_3;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSave.setForeground(Color.WHITE);
			btnSave.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSave.setBackground(new Color(220, 20, 60));
			btnSave.setBounds(211, 290, 86, 32);
		}
		return btnSave;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 15));
			btnSearch.setBackground(new Color(220, 20, 60));
			btnSearch.setBounds(588, 95, 103, 30);
		}
		return btnSearch;
	}
}
