package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Model.Member;
import Service.Member_Service;
import Service.Member_Service_Empl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class New_Member extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField fullnameinput;
	private JLabel lblMemberId;
	private JLabel lblMobileNumber;
	private JTextField numberinput;
	private JLabel lblNewLabel_1_1;
	private JTextField emailinput;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField fathernameinput;
	private JLabel lblMotherName;
	private JTextField pswinput;
	private JLabel lblGymTime;
	private JLabel lblNewLabel_1_1_2;
	private JTextField citizennoinput;
	private JLabel lblNewLabel_1_1_1_2;
	private JTextField ageinput;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JTextField amountinput;
	private JLabel lblNewLabel_1_2;
	private JButton btnNewButton;
	private JButton btnReset;
	private JComboBox cmbgender;
	private JComboBox cmbgyntime;
	private JButton btnX;
	private JSeparator separator;
	private JLabel memberIDinput;
	New_Member frame = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Member frame = new New_Member();
					frame.setVisible(true);
//					frame.
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public New_Member() {
		if(this.frame!=null) {
			dispose();
			 frame = new New_Member();
		}
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(260, 140, 1060, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getFullnameinput());
		contentPane.add(getLblMemberId());
		contentPane.add(getLblMobileNumber());
		contentPane.add(getNumberinput());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getEmailinput());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getFathernameinput());
		contentPane.add(getLblMotherName());
		contentPane.add(getPswinput());
		contentPane.add(getLblGymTime());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getCitizennoinput());
		contentPane.add(getLblNewLabel_1_1_1_2());
		contentPane.add(getAgeinput());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getAmountinput());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnReset());
		contentPane.add(getCmbgender());
		contentPane.add(getCmbgyntime());
		contentPane.add(getBtnX());
		contentPane.add(getSeparator());
		contentPane.add(getMemberIDinput());
		
		//Random Member ID
			Member_ID();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Full Name");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel.setBounds(76, 88, 127, 35);
		}
		return lblNewLabel;
	}
	private JTextField getFullnameinput() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setColumns(10);
			fullnameinput.setBounds(76, 130, 352, 28);
		}
		return fullnameinput;
	}
	private JLabel getLblMemberId() {
		if (lblMemberId == null) {
			lblMemberId = new JLabel("Member ID : ");
			lblMemberId.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblMemberId.setBounds(76, 40, 127, 35);
		}
		return lblMemberId;
	}
	private JLabel getLblMobileNumber() {
		if (lblMobileNumber == null) {
			lblMobileNumber = new JLabel("Mobile Number");
			lblMobileNumber.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblMobileNumber.setBounds(76, 180, 172, 35);
		}
		return lblMobileNumber;
	}
	private JTextField getNumberinput() {
		if (numberinput == null) {
			numberinput = new JTextField();
			numberinput.setColumns(10);
			numberinput.setBounds(76, 222, 352, 28);
		}
		return numberinput;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Email ID");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1.setBounds(76, 274, 127, 35);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getEmailinput() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setColumns(10);
			emailinput.setBounds(76, 314, 352, 28);
		}
		return emailinput;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Gender");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1_1.setBounds(76, 367, 127, 35);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Father Name");
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1_1_1.setBounds(76, 465, 155, 35);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getFathernameinput() {
		if (fathernameinput == null) {
			fathernameinput = new JTextField();
			fathernameinput.setColumns(10);
			fathernameinput.setBounds(76, 507, 352, 28);
		}
		return fathernameinput;
	}
	private JLabel getLblMotherName() {
		if (lblMotherName == null) {
			lblMotherName = new JLabel("Password");
			lblMotherName.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblMotherName.setBounds(617, 88, 166, 35);
		}
		return lblMotherName;
	}
	private JTextField getPswinput() {
		if (pswinput == null) {
			pswinput = new JTextField();
			pswinput.setColumns(10);
			pswinput.setBounds(617, 130, 352, 28);
		}
		return pswinput;
	}
	private JLabel getLblGymTime() {
		if (lblGymTime == null) {
			lblGymTime = new JLabel("Gym TIme");
			lblGymTime.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblGymTime.setBounds(617, 180, 172, 35);
		}
		return lblGymTime;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Citizen Number ( Unique ID )");
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1_2.setBounds(617, 274, 307, 35);
		}
		return lblNewLabel_1_1_2;
	}
	private JTextField getCitizennoinput() {
		if (citizennoinput == null) {
			citizennoinput = new JTextField();
			citizennoinput.setColumns(10);
			citizennoinput.setBounds(617, 314, 352, 28);
		}
		return citizennoinput;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("Age");
			lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_2.setBounds(617, 367, 127, 35);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JTextField getAgeinput() {
		if (ageinput == null) {
			ageinput = new JTextField();
			ageinput.setColumns(10);
			ageinput.setBounds(617, 409, 352, 28);
		}
		return ageinput;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Amount to Pay / Month");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1_1_1_1.setBounds(617, 465, 259, 35);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JTextField getAmountinput() {
		if (amountinput == null) {
			amountinput = new JTextField();
			amountinput.setColumns(10);
			amountinput.setBounds(617, 507, 352, 28);
		}
		return amountinput;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("New Member");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel_1_2.setBounds(388, 0, 259, 64);
		}
		return lblNewLabel_1_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Save");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Member mbr = new Member();
					mbr.setMid(Integer.parseInt(memberIDinput.getText()));
					mbr.setFullname(fullnameinput.getText());
					mbr.setMobileNumber(numberinput.getText());
					mbr.setEmailid(emailinput.getText());
					mbr.setGender(cmbgender.getSelectedItem().toString());
					mbr.setFathername(fathernameinput.getText());
					mbr.setPassword(pswinput.getText());
					mbr.setGymtime(cmbgyntime.getSelectedItem().toString());
					mbr.setCitizenNum(citizennoinput.getText());
					mbr.setAge(Integer.parseInt(ageinput.getText()));
					mbr.setAmountpay(Integer.parseInt(amountinput.getText()));
					
					Member_Service ms = new Member_Service_Empl();
					boolean res = ms.AddMember(mbr);
					
					if(res) {
						JOptionPane.showMessageDialog(null,"New Member Added Sucessfull");
						setVisible(false);
						new New_Member().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Add New Member");
					}
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(76, 554, 106, 42);
		}
		return btnNewButton;
	}
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("Reset");
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new New_Member().setVisible(true);
				}
			});
			btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnReset.setBounds(200, 554, 106, 42);
		}
		return btnReset;
	}
	private JComboBox getCmbgender() {
		if (cmbgender == null) {
			cmbgender = new JComboBox();
			cmbgender.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbgender.setModel(new DefaultComboBoxModel(new String[] {"[ -- Select Your Gender --- ]", "Male", "Female"}));
			cmbgender.setBounds(76, 409, 352, 28);
		}
		return cmbgender;
	}
	private JComboBox getCmbgyntime() {
		if (cmbgyntime == null) {
			cmbgyntime = new JComboBox();
			cmbgyntime.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbgyntime.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Choose Your Gym Time ---- ]", "06 : 00 AM  --  07 : 00 AM ", "07 : 00 AM  --  08 : 00 AM ", "08 : 00 AM  --  09 : 00 AM ", "09 : 00 AM  --  10 : 00 AM "}));
			cmbgyntime.setBounds(617, 222, 352, 28);
		}
		return cmbgyntime;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnX.setForeground(Color.WHITE);
			btnX.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnX.setBackground(Color.RED);
			btnX.setBounds(1000, 10, 50, 40);
		}
		return btnX;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(380, 60, 252, 19);
		}
		return separator;
	}
	private JLabel getMemberIDinput() {
		if (memberIDinput == null) {
			memberIDinput = new JLabel("");
			memberIDinput.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			memberIDinput.setBounds(208, 40, 84, 35);
		}
		return memberIDinput;
	}
	
	// Random Member ID
	
	public void Member_ID() {
		Random rn = new Random();
		
		memberIDinput.setText(""+rn.nextInt(100000+1));
	}
	
}
