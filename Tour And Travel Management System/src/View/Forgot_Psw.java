package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Forgot_Psw extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblLogin;
	private JSeparator separator;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblFullName;
	private JTextField textField_1;
	private JLabel lblSecurityQuestion;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblAnswer;
	private JLabel lblPassword;
	private JTextField textField_4;
	private JButton btnSingup;
	private JButton btnSearch;
	private JButton btnRetrieve;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forgot_Psw frame = new Forgot_Psw();
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
	public Forgot_Psw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 160, 919, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setLayout(null);
			panel.setBounds(10, 10, 885, 465);
			panel.add(getPanel_1());
			panel.add(getPanel_2());
			panel.add(getSeparator());
			panel.add(getLblLogin());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setLayout(null);
			panel_1.setBounds(12, 85, 520, 370);
			panel_1.add(getTextField());
			panel_1.add(getLblNewLabel());
			panel_1.add(getLblFullName());
			panel_1.add(getTextField_1());
			panel_1.add(getLblSecurityQuestion());
			panel_1.add(getTextField_2());
			panel_1.add(getTextField_3());
			panel_1.add(getLblAnswer());
			panel_1.add(getLblPassword());
			panel_1.add(getTextField_4());
			panel_1.add(getBtnSingup());
			panel_1.add(getBtnSearch());
			panel_1.add(getBtnRetrieve());
		}
		return panel_1;
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("FORGOT PASSWORD");
			lblLogin.setBounds(280, 12, 328, 36);
			lblLogin.setFont(new Font("Elephant", Font.BOLD, 24));
		}
		return lblLogin;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(259, 57, 349, 18);
		}
		return separator;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setLayout(null);
			panel_2.setBounds(542, 85, 328, 370);
			panel_2.add(getLblNewLabel_1());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Photos");
			lblNewLabel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			lblNewLabel_1.setBounds(10, 10, 308, 350);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(180, 23, 192, 33);
		}
		return textField;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(20, 22, 127, 35);
		}
		return lblNewLabel;
	}
	private JLabel getLblFullName() {
		if (lblFullName == null) {
			lblFullName = new JLabel("Full Name");
			lblFullName.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblFullName.setBounds(20, 74, 127, 35);
		}
		return lblFullName;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(180, 75, 192, 33);
		}
		return textField_1;
	}
	private JLabel getLblSecurityQuestion() {
		if (lblSecurityQuestion == null) {
			lblSecurityQuestion = new JLabel("Question");
			lblSecurityQuestion.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblSecurityQuestion.setBounds(20, 122, 127, 35);
		}
		return lblSecurityQuestion;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			textField_2.setBounds(180, 123, 192, 33);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(180, 175, 192, 33);
		}
		return textField_3;
	}
	private JLabel getLblAnswer() {
		if (lblAnswer == null) {
			lblAnswer = new JLabel("Answer");
			lblAnswer.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblAnswer.setBounds(20, 174, 127, 35);
		}
		return lblAnswer;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblPassword.setBounds(20, 225, 127, 35);
		}
		return lblPassword;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setColumns(10);
			textField_4.setBounds(180, 226, 192, 33);
		}
		return textField_4;
	}
	private JButton getBtnSingup() {
		if (btnSingup == null) {
			btnSingup = new JButton("Back");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			btnSingup.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnSingup.setBounds(207, 295, 101, 42);
		}
		return btnSingup;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnSearch.setBounds(382, 23, 120, 33);
		}
		return btnSearch;
	}
	private JButton getBtnRetrieve() {
		if (btnRetrieve == null) {
			btnRetrieve = new JButton("Retrieve");
			btnRetrieve.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnRetrieve.setBounds(382, 174, 120, 33);
		}
		return btnRetrieve;
	}
}
