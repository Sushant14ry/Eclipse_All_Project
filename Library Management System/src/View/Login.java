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

public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblPassword;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnSingup;
	private JButton btnForgotPassword;
	private JLabel lblTroubleLogin;

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
		setBounds(500, 200, 639, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(24, 32, 584, 308);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getTextField());
			panel.add(getLblPassword());
			panel.add(getTextField_1());
			panel.add(getBtnNewButton());
			panel.add(getBtnSingup());
			panel.add(getBtnForgotPassword());
			panel.add(getLblTroubleLogin());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel.setBounds(65, 58, 113, 23);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(216, 56, 263, 29);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPassword.setBounds(65, 105, 113, 23);
		}
		return lblPassword;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(216, 103, 263, 29);
		}
		return textField_1;
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
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBounds(216, 157, 113, 35);
		}
		return btnNewButton;
	}
	private JButton getBtnSingup() {
		if (btnSingup == null) {
			btnSingup = new JButton("SingUp");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Register().setVisible(true);
					dispose();
				}
			});
			btnSingup.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSingup.setBounds(353, 157, 126, 35);
		}
		return btnSingup;
	}
	private JButton getBtnForgotPassword() {
		if (btnForgotPassword == null) {
			btnForgotPassword = new JButton("Forgot Password");
			btnForgotPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Forgot_psw().setVisible(true);
					dispose();
				}
			});
			btnForgotPassword.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnForgotPassword.setBounds(216, 216, 263, 35);
		}
		return btnForgotPassword;
	}
	private JLabel getLblTroubleLogin() {
		if (lblTroubleLogin == null) {
			lblTroubleLogin = new JLabel("Trouble Login !!");
			lblTroubleLogin.setForeground(Color.RED);
			lblTroubleLogin.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblTroubleLogin.setBounds(35, 224, 158, 20);
		}
		return lblTroubleLogin;
	}
}
