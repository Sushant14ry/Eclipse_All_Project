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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class forget_pin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField fsecanswerinput;
	private JButton btnNewButton;
	private JPasswordField fpininput;
	private JLabel lblNewLabel_1_2_1_2_1;
	private JLabel lblChangePin;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1_2;
	private JTextField phonenoinput;
	private JButton btnSearch;
	private JTextField fsecquestioninput;

	private String numb;
	private String match_ans;
	private String acc_num;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forget_pin frame = new forget_pin();
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
	public forget_pin() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 591, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setForeground(Color.BLACK);
			panel.setFont(new Font("Arial Black", Font.BOLD, 16));
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 6, true), "Authentication", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 24, 557, 528);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_1_1());
			panel.add(getFsecanswerinput());
			panel.add(getBtnNewButton());
			panel.add(getFpininput());
			panel.add(getLblNewLabel_1_2_1_2_1());
			panel.add(getLblChangePin());
			panel.add(getSeparator());
			panel.add(getSeparator_1());
			panel.add(getLblNewLabel_1_2());
			panel.add(getPhonenoinput());
			panel.add(getBtnSearch());
			panel.add(getFsecquestioninput());
			panel.add(getBtnBack());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(170, 32, 177, 48);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Sec Answer");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(37, 276, 144, 23);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Set New Pin");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(37, 331, 130, 23);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getFsecanswerinput() {
		if (fsecanswerinput == null) {
			fsecanswerinput = new JTextField();
			fsecanswerinput.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			fsecanswerinput.setBounds(201, 275, 217, 31);
			fsecanswerinput.setColumns(10);
		}
		return fsecanswerinput;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Changed");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(Color.BLUE);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(phonenoinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Enter Account Number");
						return;
					}
					if(fpininput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Enter Secret Pin");
						return;
					}
					
					String acc_no = phonenoinput.getText();
					String sec_questn = fsecquestioninput.getText();
					String sec_ans = fsecanswerinput.getText();
					int set_pin = Integer.parseInt(fpininput.getText());
					String matched_ans = match_ans;
					
					System.out.println("input : "+sec_ans);
					System.out.println(set_pin);
					System.out.println(matched_ans);
				
			// Changed Account Pin Number Query
				// Update Account Pin No
					
					Account acc = new Account();
					
					acc.setAac_no(acc_no);;
					acc.setRandom(set_pin);
					
					if(sec_ans.equals(matched_ans)) {
						Account_Service asc = new Account_Service_empl();
						boolean res = asc.ChangePin(acc);
						
						if(res) {
							JOptionPane.showMessageDialog(null,"Password Changed Success");
							new Login().setVisible(true);
							dispose();
						}else {
							JOptionPane.showMessageDialog(null,"Failed to Change Password");
						}					
					}else {
						JOptionPane.showMessageDialog(null,"The Given Security Question is not Matched !! Please Try Again !! ");
					}
					
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(231, 391, 156, 40);
		}
		return btnNewButton;
	}
	private JPasswordField getFpininput() {
		if (fpininput == null) {
			fpininput = new JPasswordField();
			fpininput.setFont(new Font("Arial Black", Font.BOLD, 16));
			fpininput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			fpininput.setBounds(201, 330, 217, 31);
		}
		return fpininput;
	}
	private JLabel getLblNewLabel_1_2_1_2_1() {
		if (lblNewLabel_1_2_1_2_1 == null) {
			lblNewLabel_1_2_1_2_1 = new JLabel("Sec Question");
			lblNewLabel_1_2_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_2_1_2_1.setBounds(37, 222, 144, 27);
		}
		return lblNewLabel_1_2_1_2_1;
	}
	private JLabel getLblChangePin() {
		if (lblChangePin == null) {
			lblChangePin = new JLabel("Change Pin Number");
			lblChangePin.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblChangePin.setBounds(122, 98, 296, 40);
		}
		return lblChangePin;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(151, 84, 196, 2);
		}
		return separator;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(110, 144, 300, 2);
		}
		return separator_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Acc Number");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_2.setBounds(37, 172, 144, 23);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getPhonenoinput() {
		if (phonenoinput == null) {
			phonenoinput = new JTextField();
			phonenoinput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					/*
					 * char c = e.getKeyChar(); if(!Character.isDigit(c)) { e.consume();
					 * JOptionPane.showMessageDialog(null,"We Accept Number Only !!"); }
					 */
				}
			});
			phonenoinput.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			phonenoinput.setColumns(10);
			phonenoinput.setBounds(201, 170, 217, 31);
		}
		return phonenoinput;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Search_num = phonenoinput.getText().trim();
					
					Account_Service asc = new Account_Service_empl();
					asc.getAccById(Search_num);
					Change_Pin(Search_num);
					
					if(Search_num.equals(acc_num)) {
						System.out.println(acc_num);
					}else {
						JOptionPane.showMessageDialog(null, "Account Number Not matched");
					}	
				}
			});
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch.setBounds(428, 168, 102, 32);
		}
		return btnSearch;
	}
	
	private JTextField getFsecquestioninput() {
		if (fsecquestioninput == null) {
			fsecquestioninput = new JTextField();
			fsecquestioninput.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			fsecquestioninput.setColumns(10);
			fsecquestioninput.setBounds(201, 220, 217, 31);
		}
		return fsecquestioninput;
	}
	
	/* ------------------------------------- */
	
	// Change Account Pin Number
	public void Change_Pin(String accnum) {
		
		numb = accnum;
		Account_Service as = new Account_Service_empl();
		Account ac = as.getAccById(numb);
		
		fsecquestioninput.setText(ac.getSec_qstn());
	
		match_ans = ac.getSec_ans();
		acc_num = ac.getAac_no();
	}

	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnBack.setBounds(37, 467, 102, 37);
		}
		return btnBack;
	}
}
