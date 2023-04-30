package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Service.User_Service;
import Service.User_Service_empl;
import model.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index_Forgot extends JFrame {
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel contentPane_1;
	private JLabel lblNewLabel_1;
	private JLabel lblEmail;
	private JTextField secqstninput;
	private JTextField emailinput;
	private JButton btnNewButton;
	private JButton btnSingup;
	private JSeparator separator;
	private JLabel lblSecurityQuestion;
	private JLabel lblEmail_1;
	private JTextField answerinput;
	private JLabel lblNewPassword;
	private JTextField new_pswinput;
	private JButton btnSave;
	private JButton btnSearch;
	private JButton btnNewButton_1;
	
	private String email;
	private String Matchpsw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index_Forgot frame = new Index_Forgot();
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
	public Index_Forgot() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 40, 1402, 774);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getContentPane_1_1());
		contentPane.add(getBtnNewButton_1_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Hotel Management System");
			lblNewLabel.setFont(new Font("Elephant", Font.BOLD, 46));
			lblNewLabel.setBounds(400, 26, 679, 110);
		}
		return lblNewLabel;
	}
	private JPanel getContentPane_1_1() {
		if (contentPane_1 == null) {
			contentPane_1 = new JPanel();
			contentPane_1.setLayout(null);
			contentPane_1.setForeground(Color.WHITE);
			contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane_1.setBackground(Color.DARK_GRAY);
			contentPane_1.setBounds(377, 191, 723, 346);
			contentPane_1.add(getLblNewLabel_1_1());
			contentPane_1.add(getLblEmail_1());
			contentPane_1.add(getTextField_2());
			contentPane_1.add(getTextField_1_1());
			contentPane_1.add(getBtnNewButton_1());
			contentPane_1.add(getBtnSingup_1());
			contentPane_1.add(getSeparator_1());
			contentPane_1.add(getLblSecurityQuestion());
			contentPane_1.add(getLblEmail_1_1());
			contentPane_1.add(getTextField_2_1());
			contentPane_1.add(getLblNewPassword());
			contentPane_1.add(getNew_pswinput());
			contentPane_1.add(getBtnSave());
			contentPane_1.add(getBtnSearch());
		}
		return contentPane_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Forgot Password ?");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 28));
			lblNewLabel_1.setBounds(238, 27, 324, 35);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblEmail_1() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setForeground(Color.WHITE);
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(50, 95, 74, 35);
		}
		return lblEmail;
	}
	private JTextField getTextField_2() {
		if (secqstninput == null) {
			secqstninput = new JTextField();
			secqstninput.setColumns(10);
			secqstninput.setBounds(211, 146, 362, 26);
		}
		return secqstninput;
	}
	private JTextField getTextField_1_1() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setColumns(10);
			emailinput.setBounds(209, 98, 364, 26);
		}
		return emailinput;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setBounds(479, 290, 94, 32);
		}
		return btnNewButton;
	}
	private JButton getBtnSingup_1() {
		if (btnSingup == null) {
			btnSingup = new JButton("SingUp");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index_SingUp().setVisible(true);
					dispose();
				}
			});
			btnSingup.setForeground(Color.WHITE);
			btnSingup.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSingup.setBackground(new Color(220, 20, 60));
			btnSingup.setBounds(341, 290, 103, 32);
		}
		return btnSingup;
	}
	private JSeparator getSeparator_1() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(226, 75, 324, 13);
		}
		return separator;
	}
	private JLabel getLblSecurityQuestion() {
		if (lblSecurityQuestion == null) {
			lblSecurityQuestion = new JLabel("Security Question");
			lblSecurityQuestion.setForeground(Color.WHITE);
			lblSecurityQuestion.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSecurityQuestion.setBounds(50, 140, 154, 35);
		}
		return lblSecurityQuestion;
	}
	private JLabel getLblEmail_1_1() {
		if (lblEmail_1 == null) {
			lblEmail_1 = new JLabel("Answer");
			lblEmail_1.setForeground(Color.WHITE);
			lblEmail_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail_1.setBounds(50, 189, 74, 35);
		}
		return lblEmail_1;
	}
	private JTextField getTextField_2_1() {
		if (answerinput == null) {
			answerinput = new JTextField();
			answerinput.setColumns(10);
			answerinput.setBounds(209, 194, 364, 26);
		}
		return answerinput;
	}
	private JLabel getLblNewPassword() {
		if (lblNewPassword == null) {
			lblNewPassword = new JLabel("New Password");
			lblNewPassword.setForeground(Color.WHITE);
			lblNewPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewPassword.setBounds(50, 234, 149, 35);
		}
		return lblNewPassword;
	}
	private JTextField getNew_pswinput() {
		if (new_pswinput == null) {
			new_pswinput = new JTextField();
			new_pswinput.setColumns(10);
			new_pswinput.setBounds(209, 240, 364, 26);
		}
		return new_pswinput;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(new_pswinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter the New Password !!");
						return;
					}
					if(answerinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter the Security Answer !!");
						return;
					}
					
					String qstn_ans = answerinput.getText();
					String new_psw = new_pswinput.getText();
					String match_ans = Matchpsw;
						
			// Change Password Query
					// Update Passwords
					User u = new User();
					u.setEmail(email);
					u.setPsw(new_pswinput.getText());
					
					if(qstn_ans.equals(match_ans)) {
						
						User_Service uss = new User_Service_empl();
						boolean res = uss.UpdUser(u);
						
						if(res) {
							JOptionPane.showMessageDialog(null,"Password Changed Success");
							new Index().setVisible(true);
							dispose();
						}else {
							JOptionPane.showMessageDialog(null,"Failed to Change Password");
						}
						
					}else {
						JOptionPane.showMessageDialog(null,"The Given Security Question is not Matched !! Please Try Again !! ");
					}
				}
			});
			btnSave.setForeground(Color.WHITE);
			btnSave.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSave.setBackground(new Color(220, 20, 60));
			btnSave.setBounds(211, 290, 86, 32);
		}
		return btnSave;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Search_email = emailinput.getText().trim();
					
					User_Service us = new User_Service_empl();
					us.GetUserById(Search_email);
					
					Change_Psw(Search_email);
					System.out.println(Matchpsw);		
								
				}
			});
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 15));
			btnSearch.setBackground(new Color(220, 20, 60));
			btnSearch.setBounds(588, 95, 103, 30);
		}
		return btnSearch;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("X");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit This Application","select",JOptionPane.YES_NO_OPTION);
					if(a == 0) {
						System.exit(a);
					}
				}
			});
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1.setBackground(Color.RED);
			btnNewButton_1.setBounds(1342, 10, 50, 40);
		}
		return btnNewButton_1;
	}
	
	// Change Password
	public void Change_Psw(String umail) {
		
		email = umail;
		User_Service us = new User_Service_empl();
		User u = us.GetUserById(email);
		
		secqstninput.setText(u.getSecqsn());
//		answerinput.setText(u.getAnswer());		
		
		Matchpsw = u.getAnswer();
	}
}
