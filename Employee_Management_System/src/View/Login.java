package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.Db;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField usernameinput;
	private JLabel lblPassword;
	private JPasswordField passwordinput;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JSeparator separator_1;

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
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getUsernameinput());
		contentPane.add(getLblPassword());
		contentPane.add(getPasswordinput());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getSeparator_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(49, 83, 126, 40);
		}
		return lblNewLabel;
	}
	private JTextField getUsernameinput() {
		if (usernameinput == null) {
			usernameinput = new JTextField();
			usernameinput.setBounds(185, 86, 203, 39);
			usernameinput.setColumns(10);
		}
		return usernameinput;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblPassword.setBounds(49, 151, 126, 40);
		}
		return lblPassword;
	}
	private JPasswordField getPasswordinput() {
		if (passwordinput == null) {
			passwordinput = new JPasswordField();
			passwordinput.setBounds(185, 150, 203, 40);
		}
		return passwordinput;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String user = usernameinput.getText();
					String pass = passwordinput.getText();
					
					String login = "SELECT * FROM userinfo where e_username= '"+user+"' or e_number= '"+user+"' and e_password='"+pass+"' ";
					
					try {
						Statement stm = Db.getDB().createStatement();
						
						ResultSet res = stm.executeQuery(login);
						
						if(res.next()) {
							JOptionPane.showMessageDialog(null,"Login Success");
							new Dashboard().setVisible(true);
							dispose();
						}else {
							JOptionPane.showMessageDialog(null,"Login Failed");
						}
						
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 24));
			btnNewButton.setBounds(172, 223, 155, 40);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Copy All Right Reserved DSP 2022 Version 1.0");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1.setBounds(41, 295, 379, 21);
		}
		return lblNewLabel_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(92, 328, 289, 4);
		}
		return separator;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Login Form");
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 28));
			lblNewLabel_2.setBounds(165, 10, 203, 40);
		}
		return lblNewLabel_2;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(152, 51, 203, 25);
		}
		return separator_1;
	}
}
