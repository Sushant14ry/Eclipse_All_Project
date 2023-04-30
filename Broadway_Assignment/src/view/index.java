package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class index extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnCashierLogin;
	private JLabel lblNewLabel_1;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setResizable(false);
		setTitle("Index");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 625, 368);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnCashierLogin());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getSeparator());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Welcome to Super Market Billing System");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(81, 10, 477, 41);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Admin Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_login().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBounds(403, 126, 166, 47);
		}
		return btnNewButton;
	}
	private JButton getBtnCashierLogin() {
		if (btnCashierLogin == null) {
			btnCashierLogin = new JButton("Cashier Login");
			btnCashierLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Cashier_login().setVisible(true);
					dispose();
				}
			});
			btnCashierLogin.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnCashierLogin.setBounds(404, 218, 165, 47);
		}
		return btnCashierLogin;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\dd.PNG"));
			lblNewLabel_1.setBounds(57, 80, 279, 218);
		}
		return lblNewLabel_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(47, 54, 523, 9);
		}
		return separator;
	}
}
