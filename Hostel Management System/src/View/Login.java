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
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnNewButton;
	private JLabel lblForgetPassword;
	private JLabel Photos;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 695, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 10, 328, 366);
			panel.setLayout(null);
			panel.add(getPhotos());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(348, 10, 328, 366);
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel());
			panel_1.add(getTextField());
			panel_1.add(getTextField_1());
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getChckbxNewCheckBox());
			panel_1.add(getBtnNewButton());
			panel_1.add(getLblForgetPassword());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel.setBounds(120, 30, 115, 23);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(40, 64, 251, 33);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(40, 164, 251, 33);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(120, 130, 115, 23);
		}
		return lblNewLabel_1;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Show Password");
			chckbxNewCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
			chckbxNewCheckBox.setBounds(152, 206, 139, 21);
		}
		return chckbxNewCheckBox;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(112, 252, 115, 37);
		}
		return btnNewButton;
	}
	private JLabel getLblForgetPassword() {
		if (lblForgetPassword == null) {
			lblForgetPassword = new JLabel("Forget Password");
			lblForgetPassword.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			lblForgetPassword.setBounds(108, 320, 139, 23);
		}
		return lblForgetPassword;
	}
	private JLabel getPhotos() {
		if (Photos == null) {
			Photos = new JLabel("");
			Photos.setBounds(10, 10, 308, 346);
			Photos.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\sc1.jpg").getImage().getScaledInstance(Photos.getWidth(), Photos.getHeight(), DO_NOTHING_ON_CLOSE)));
			
		}
		return Photos;
	}
}
