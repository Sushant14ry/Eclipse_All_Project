package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import db.db;
import model.SingUp;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cashier_login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField luserinput;
	private JTextField lpswinput;
	private JButton btnNewButton;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cashier_login frame = new Cashier_login();
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
	public Cashier_login() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 540, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(getPanel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLuserinput());
		contentPane.add(getLpswinput());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnLogin());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Cashier Login");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 28));
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.ORANGE);
			panel.setBounds(0, 0, 526, 60);
			panel.add(getLblNewLabel());
		}
		return panel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Username");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(76, 90, 111, 30);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Password");
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(76, 147, 111, 30);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getLuserinput() {
		if (luserinput == null) {
			luserinput = new JTextField();
			luserinput.setBounds(202, 90, 205, 30);
			luserinput.setColumns(10);
		}
		return luserinput;
	}
	private JTextField getLpswinput() {
		if (lpswinput == null) {
			lpswinput = new JTextField();
			lpswinput.setColumns(10);
			lpswinput.setBounds(202, 147, 205, 30);
		}
		return lpswinput;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cancel");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new index().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBounds(123, 222, 103, 39);
		}
		return btnNewButton;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String luser = luserinput.getText();
					String lpsw = lpswinput.getText();
										
//					-------------------------- Cashier Login Code ----------------
						
						try {
							String login = "Select * from cashier where cash_num='"+luser+"' OR cash_email='"+luser+"' and cash_psw='"+lpsw+"'  ";
							Statement stm = db.getDB().createStatement();
							ResultSet res = stm.executeQuery(login);
							
							if(res.next()) {
								JOptionPane.showMessageDialog(null,"Login Success");
								new cashier_dashboard().setVisible(true);
								dispose();
							}else {
								JOptionPane.showMessageDialog(null,"Login Failed");
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	
//						-------------------------- Cashier Login Code ----------------
						
				}	
			});
			btnLogin.setForeground(Color.BLACK);
			btnLogin.setBackground(Color.CYAN);
			btnLogin.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnLogin.setBounds(280, 222, 103, 39);
		}
		return btnLogin;
	}
}
