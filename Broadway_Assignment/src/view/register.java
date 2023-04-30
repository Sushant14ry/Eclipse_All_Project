package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

import model.SingUp;
import service.Market_User_Service;
import service.Market_User_Service_empl;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.awt.Window.Type;

public class register extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField fnameinput;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField lnameinput;
	private JLabel lblNewLabel_1_1;
	private JTextField usenameinput;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JTextField addressinput;
	private JLabel lblNewLabel_1_1_1_1_1_1_1;
	private JButton btnRegister;
	private JButton btnNewButton;
	private JDateChooser dobinput;
	private JPasswordField pswinput;
	private JLabel lblNewLabel_2;
	private JPasswordField re_pswinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
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
	public register() {
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 589, 682);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getFnameinput());
		contentPane.add(getPanel());
		contentPane.add(getLnameinput());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getUsenameinput());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1());
		contentPane.add(getAddressinput());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1_1());
		contentPane.add(getBtnRegister());
		contentPane.add(getBtnNewButton());
		contentPane.add(getDobinput());
		contentPane.add(getPswinput());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getRe_pswinput());
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("First Name");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(96, 102, 102, 30);
		}
		return lblNewLabel_1;
	}
	private JTextField getFnameinput() {
		if (fnameinput == null) {
			fnameinput = new JTextField();
			fnameinput.setColumns(10);
			fnameinput.setBounds(252, 102, 240, 30);
		}
		return fnameinput;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.ORANGE);
			panel.setBounds(0, 0, 575, 58);
			panel.add(getLblNewLabel());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Register");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 28));
		}
		return lblNewLabel;
	}
	private JTextField getLnameinput() {
		if (lnameinput == null) {
			lnameinput = new JTextField();
			lnameinput.setColumns(10);
			lnameinput.setBounds(252, 150, 240, 30);
		}
		return lnameinput;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Last Name");
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(96, 150, 102, 30);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getUsenameinput() {
		if (usenameinput == null) {
			usenameinput = new JTextField();
			usenameinput.setColumns(10);
			usenameinput.setBounds(252, 200, 240, 30);
		}
		return usenameinput;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Username");
			lblNewLabel_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(96, 200, 102, 30);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Password");
			lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(96, 245, 102, 30);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Retype Pass");
			lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1.setBounds(96, 295, 120, 30);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1 = new JLabel("Birth Date");
			lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_1.setBounds(96, 340, 102, 30);
		}
		return lblNewLabel_1_1_1_1_1_1;
	}
	private JTextField getAddressinput() {
		if (addressinput == null) {
			addressinput = new JTextField();
			addressinput.setColumns(10);
			addressinput.setBounds(252, 396, 240, 72);
		}
		return addressinput;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Address");
			lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_1_1.setBounds(96, 420, 89, 30);
		}
		return lblNewLabel_1_1_1_1_1_1_1;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(fnameinput.getText().isBlank()) {
						JOptionPane.showInternalMessageDialog(null,"First Name Field is Blank");
						return;
					}
					if(lnameinput.getText().isBlank()) {
						JOptionPane.showInternalMessageDialog(null,"Last Name Field is Blank");
						return;
					}
					if(usenameinput.getText().isBlank()) {
						JOptionPane.showInternalMessageDialog(null,"User Name Field is Blank");
						return;
					}
					if(pswinput.getText().isBlank()){
						JOptionPane.showInternalMessageDialog(null,"Please Enter Password");
						return;
					}
					if(re_pswinput.getText().isBlank()) {
						JOptionPane.showInternalMessageDialog(null,"Please Enter Re-Password");
						return;
					}
					if(addressinput.getText().isBlank()) {
						JOptionPane.showInternalMessageDialog(null,"Address Field is Blank");
						return;
					}
	
					
						SingUp sup = new SingUp();
						
						sup.setFname(fnameinput.getText());
						sup.setLname(fnameinput.getText());
						sup.setUsername(usenameinput.getText());
						sup.setPsw(pswinput.getText());
						sup.setRe_psw(re_pswinput.getText());
						sup.setDob(new Date(dobinput.getDate().getTime()));
						sup.setAddress(addressinput.getText());
						
						
						Market_User_Service mus = new Market_User_Service_empl();
						boolean respond = mus.AddUser(sup);
						
						if(respond) {
							JOptionPane.showMessageDialog(null,"SingUp Success");
						}else {
							JOptionPane.showMessageDialog(null,"SingUp Failed");
						}
					
				}
			});
			btnRegister.setForeground(Color.BLACK);
			btnRegister.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnRegister.setBackground(new Color(0, 191, 255));
			btnRegister.setBounds(297, 502, 130, 39);
		}
		return btnRegister;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cancel");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_login().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setBounds(140, 502, 103, 39);
		}
		return btnNewButton;
	}
	private JDateChooser getDobinput() {
		if (dobinput == null) {
			dobinput = new JDateChooser();
			dobinput.setBounds(252, 344, 240, 30);
		}
		return dobinput;
	}
	private JPasswordField getPswinput() {
		if (pswinput == null) {
			pswinput = new JPasswordField();
			pswinput.setBounds(252, 249, 240, 30);
		}
		return pswinput;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Click here to Login");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new admin_login().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Arial Black", Font.ITALIC, 16));
			lblNewLabel_2.setBounds(199, 580, 191, 23);
		}
		return lblNewLabel_2;
	}
	private JPasswordField getRe_pswinput() {
		if (re_pswinput == null) {
			re_pswinput = new JPasswordField();
			re_pswinput.setBounds(252, 295, 240, 30);
		}
		return re_pswinput;
	}
}
