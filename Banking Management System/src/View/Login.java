package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import DB.db;
import Service.Account_Service;
import Service.Account_Service_empl;
import model.Account;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField mobileinput;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JSeparator separator;
	private JPasswordField pininput;

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
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 528, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setFont(new Font("Arial Black", Font.BOLD, 16));
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 6, true), "Authentication", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 24, 494, 406);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_1_1());
			panel.add(getMobileinput());
			panel.add(getBtnNewButton());
			panel.add(getLblNewLabel_2());
			panel.add(getSeparator());
			panel.add(getPininput());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(160, 42, 177, 72);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Mobile Number");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(42, 168, 144, 23);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Secret Pin");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(42, 222, 144, 23);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getMobileinput() {
		if (mobileinput == null) {
			mobileinput = new JTextField();
			mobileinput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			mobileinput.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			mobileinput.setBounds(209, 167, 217, 31);
			mobileinput.setColumns(10);
		}
		return mobileinput;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(mobileinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Enter Mobile Number");
						return;
					}
					if(pininput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Enter Secret Pin");
						return;
					}
					
					String l_phone = mobileinput.getText();
					int sec_pinn = Integer.parseInt(pininput.getText());
					
			/*		Account_Service as = new Account_Service_empl();
//					as.Loging(l_phone, sec_pinn);
					
					if(as.Loging(l_phone, sec_pinn)) {
						JOptionPane.showMessageDialog(null, "Login Sucess !!");
						new Home_Page().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Login Failed !!");
					}
					*/
				
				try {
					String login = "select * from create_acc where number='"+l_phone+"' and pin_no='"+sec_pinn+"' ";
					Statement stm = db.getDb().createStatement();
					ResultSet res = stm.executeQuery(login);
					
					if(res.next()) {
						JOptionPane.showMessageDialog(null,"Login Success");
						new Progress_bar().setVisible(true);
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
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(250, 273, 130, 37);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Forget Pin");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new forget_pin().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel_2.setBounds(75, 347, 101, 17);
		}
		return lblNewLabel_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(56, 370, 114, 9);
		}
		return separator;
	}
	private JPasswordField getPininput() {
		if (pininput == null) {
			pininput = new JPasswordField();
			pininput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			pininput.setBounds(209, 221, 217, 31);
		}
		return pininput;
	}
}
