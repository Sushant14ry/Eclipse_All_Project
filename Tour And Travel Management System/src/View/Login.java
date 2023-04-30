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

public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblPassword;
	private JLabel lblLogin;
	private JSeparator separator;
	private JButton btnNewButton;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JButton btnSingup;
	private JButton btnForgotPassword;
	private JLabel lblNewLabel_2;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 160, 897, 522);
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
			panel.setBounds(10, 10, 857, 465);
			panel.add(getPanel_1());
			panel.add(getPanel_2());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBounds(412, 10, 435, 445);
			panel_1.add(getLblNewLabel());
			panel_1.add(getTextField());
			panel_1.add(getTextField_1());
			panel_1.add(getLblPassword());
			panel_1.add(getLblLogin());
			panel_1.add(getSeparator());
			panel_1.add(getBtnNewButton());
			panel_1.add(getBtnSingup());
			panel_1.add(getBtnForgotPassword());
			panel_1.add(getLblNewLabel_2());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(45, 115, 127, 35);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(45, 157, 352, 32);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(45, 259, 352, 32);
		}
		return textField_1;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblPassword.setBounds(45, 217, 127, 35);
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
					new Dashboard().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton.setBounds(45, 316, 101, 42);
		}
		return btnNewButton;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBounds(10, 10, 390, 445);
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
	private JButton getBtnSingup() {
		if (btnSingup == null) {
			btnSingup = new JButton("SingUp");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Singup().setVisible(true);
					dispose();
				}
			});
			btnSingup.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnSingup.setBounds(276, 316, 121, 42);
		}
		return btnSingup;
	}
	private JButton getBtnForgotPassword() {
		if (btnForgotPassword == null) {
			btnForgotPassword = new JButton("Forgot Password");
			btnForgotPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Forgot_Psw().setVisible(true);
					dispose();
				}
			});
			btnForgotPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			btnForgotPassword.setBounds(45, 384, 182, 32);
		}
		return btnForgotPassword;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Trouble In Login ?");
			lblNewLabel_2.setForeground(Color.RED);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_2.setBounds(270, 398, 154, 13);
		}
		return lblNewLabel_2;
	}
}
