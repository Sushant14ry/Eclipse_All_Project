package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Forgot_psw extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblPassword;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JLabel lblAnswer;
	private JLabel lblYourSecurityQuestion;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblPassword_1_1;
	private JButton btnRetri;
	private JButton btnNewButton_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forgot_psw frame = new Forgot_psw();
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
	public Forgot_psw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 701, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Forgot Password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(24, 32, 646, 320);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getTextField());
			panel.add(getLblPassword());
			panel.add(getTextField_1());
			panel.add(getBtnNewButton());
			panel.add(getLblAnswer());
			panel.add(getLblYourSecurityQuestion());
			panel.add(getTextField_2());
			panel.add(getTextField_3());
			panel.add(getTextField_4());
			panel.add(getLblPassword_1_1());
			panel.add(getBtnRetri());
			panel.add(getBtnNewButton_1_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblNewLabel.setBounds(32, 56, 113, 23);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(232, 55, 263, 29);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblPassword.setBounds(32, 103, 113, 23);
		}
		return lblPassword;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(232, 101, 263, 29);
		}
		return textField_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Search");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBounds(512, 54, 113, 30);
		}
		return btnNewButton;
	}
	private JLabel getLblAnswer() {
		if (lblAnswer == null) {
			lblAnswer = new JLabel("Answer");
			lblAnswer.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblAnswer.setBounds(32, 199, 113, 23);
		}
		return lblAnswer;
	}
	private JLabel getLblYourSecurityQuestion() {
		if (lblYourSecurityQuestion == null) {
			lblYourSecurityQuestion = new JLabel("Your Security Question ? ");
			lblYourSecurityQuestion.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblYourSecurityQuestion.setBounds(32, 152, 198, 23);
		}
		return lblYourSecurityQuestion;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(232, 151, 263, 29);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(232, 197, 263, 29);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(232, 246, 263, 29);
		}
		return textField_4;
	}
	private JLabel getLblPassword_1_1() {
		if (lblPassword_1_1 == null) {
			lblPassword_1_1 = new JLabel("Your Password");
			lblPassword_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblPassword_1_1.setBounds(32, 248, 152, 23);
		}
		return lblPassword_1_1;
	}
	private JButton getBtnRetri() {
		if (btnRetri == null) {
			btnRetri = new JButton("Retrive");
			btnRetri.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnRetri.setBounds(512, 197, 113, 30);
		}
		return btnRetri;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Back");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_1_1.setBounds(512, 246, 113, 30);
		}
		return btnNewButton_1_1;
	}
}
