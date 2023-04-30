package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblPassword;
	private JTextField textField_1;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnLogin;
	private JButton btnClose;
	private JLabel lblLogin;
	private JSeparator separator;
	private JPanel panel_1;

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
		setBounds(0,0, 1560, 824);
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
			panel.setBounds(686, 232, 800, 394);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getTextField());
			panel.add(getLblPassword());
			panel.add(getTextField_1());
			panel.add(getChckbxNewCheckBox());
			panel.add(getBtnLogin());
			panel.add(getBtnClose());
			panel.add(getLblLogin());
			panel.add(getSeparator());
			panel.add(getPanel_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(398, 128, 127, 35);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(535, 129, 235, 33);
		}
		return textField;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblPassword.setBounds(398, 183, 127, 35);
		}
		return lblPassword;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(535, 184, 235, 33);
		}
		return textField_1;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Show Password");
			chckbxNewCheckBox.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			chckbxNewCheckBox.setBounds(535, 223, 167, 24);
		}
		return chckbxNewCheckBox;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnLogin.setBounds(535, 268, 101, 42);
		}
		return btnLogin;
	}
	private JButton getBtnClose() {
		if (btnClose == null) {
			btnClose = new JButton("Close");
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnClose.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnClose.setBounds(669, 268, 101, 42);
		}
		return btnClose;
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("Login");
			lblLogin.setFont(new Font("Arial Black", Font.BOLD, 46));
			lblLogin.setBounds(493, 38, 161, 55);
		}
		return lblLogin;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(478, 102, 185, 25);
		}
		return separator;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 20, 378, 354);
			panel_1.setLayout(null);
		}
		return panel_1;
	}
}
