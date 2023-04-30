package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import Connections.DB;
import Model.Member;
import Service.Member_Service;
import Service.Member_Service_Empl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

public class Update_Delete_Member extends JFrame {

	private JPanel inputinput;
	private JLabel lblNewLabel;
	private JTextField fullnameinput;
	private JLabel lblMemberId;
	private JLabel lblMobileNumber;
	private JTextField mobileinput;
	private JLabel lblNewLabel_1_1;
	private JTextField emailinput;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField fatherinput;
	private JLabel lblMotherName;
	private JTextField pswinput;
	private JLabel lblGymTime;
	private JLabel lblNewLabel_1_1_2;
	private JTextField citizeninput;
	private JLabel lblNewLabel_1_1_1_2;
	private JTextField ageinput;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JTextField amoutninput;
	private JLabel lblNewLabel_1_2;
	private JButton btnNewButton;
	private JButton btnReset;
	private JComboBox cmbgenders;
	private JComboBox cmbgyms;
	private JTextField m_idinput;
	private JButton btnSearch;
	private JButton btnReset_1;
	private JButton btnX;
	private JSeparator separator;
	
	private int eid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Delete_Member frame = new Update_Delete_Member();
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
	public Update_Delete_Member() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(260, 140, 1060, 620);
		inputinput = new JPanel();
		inputinput.setBackground(new Color(255, 255, 255));
		inputinput.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(inputinput);
		inputinput.setLayout(null);
		inputinput.add(getLblNewLabel());
		inputinput.add(getFullnameinput());
		inputinput.add(getLblMemberId());
		inputinput.add(getLblMobileNumber());
		inputinput.add(getMobileinput());
		inputinput.add(getLblNewLabel_1_1());
		inputinput.add(getEmailinput());
		inputinput.add(getLblNewLabel_1_1_1());
		inputinput.add(getLblNewLabel_1_1_1_1());
		inputinput.add(getFatherinput());
		inputinput.add(getLblMotherName());
		inputinput.add(getPswinput());
		inputinput.add(getLblGymTime());
		inputinput.add(getLblNewLabel_1_1_2());
		inputinput.add(getCitizeninput());
		inputinput.add(getLblNewLabel_1_1_1_2());
		inputinput.add(getAgeinput());
		inputinput.add(getLblNewLabel_1_1_1_1_1());
		inputinput.add(getAmoutninput());
		inputinput.add(getLblNewLabel_1_2());
		inputinput.add(getBtnNewButton());
		inputinput.add(getBtnReset());
		inputinput.add(getCmbgenders());
		inputinput.add(getCmbgyms());
		inputinput.add(getM_idinput());
		inputinput.add(getBtnSearch());
		inputinput.add(getBtnReset_1());
		inputinput.add(getBtnX());
		inputinput.add(getSeparator());
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
			lblMemberId.setBounds(76, 40, 155, 34);
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
	private JTextField getMobileinput() {
		if (mobileinput == null) {
			mobileinput = new JTextField();
			mobileinput.setColumns(10);
			mobileinput.setBounds(76, 222, 352, 28);
		}
		return mobileinput;
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
	private JTextField getFatherinput() {
		if (fatherinput == null) {
			fatherinput = new JTextField();
			fatherinput.setColumns(10);
			fatherinput.setBounds(76, 507, 352, 28);
		}
		return fatherinput;
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
			lblGymTime = new JLabel("Gym Time");
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
	private JTextField getCitizeninput() {
		if (citizeninput == null) {
			citizeninput = new JTextField();
			citizeninput.setColumns(10);
			citizeninput.setBounds(617, 314, 352, 28);
		}
		return citizeninput;
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
	private JTextField getAmoutninput() {
		if (amoutninput == null) {
			amoutninput = new JTextField();
			amoutninput.setColumns(10);
			amoutninput.setBounds(617, 507, 352, 28);
		}
		return amoutninput;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Update And Delete Member");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel_1_2.setBounds(539, 2, 520, 64);
		}
		return lblNewLabel_1_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Update");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Member mbr = new Member();
					
					mbr.setMid(eid);
					mbr.setFullname(fullnameinput.getText());
					mbr.setMobileNumber(mobileinput.getText());
					mbr.setEmailid(emailinput.getText());
					mbr.setGender(cmbgenders.getSelectedItem().toString());
					mbr.setFathername(fatherinput.getText());
					mbr.setPassword(pswinput.getText());
					mbr.setGymtime(cmbgyms.getSelectedItem().toString());
					mbr.setCitizenNum(citizeninput.getText());
					mbr.setAge(Integer.parseInt(ageinput.getText()));
					mbr.setAmountpay(Integer.parseInt(amoutninput.getText()));
					
					Member_Service ms = new Member_Service_Empl();
					boolean res = ms.UpdateMember(mbr);
					
					if(res) {
						JOptionPane.showMessageDialog(null,"Member Update Sucessfull");
						setVisible(false);
						new Update_Delete_Member().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Update Member");
					}
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBounds(76, 554, 112, 42);
		}
		return btnNewButton;
	}
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("Delete");
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Member mbr = new Member();
					
					int Search_id = Integer.parseInt(m_idinput.getText().toString());
					Member_Service ms = new Member_Service_Empl();
					boolean res = ms.DeleteMembe(Search_id);
					
					if(res) {
						JOptionPane.showMessageDialog(null,"Deleted Success ");
						setVisible(false);
						new Update_Delete_Member().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"Deleted Failed ");
						setVisible(false);
						new Update_Delete_Member().setVisible(true);
					}
			
					
				}
			});
			btnReset.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnReset.setBounds(208, 554, 104, 42);
		}
		return btnReset;
	}
	private JComboBox getCmbgenders() {
		if (cmbgenders == null) {
			cmbgenders = new JComboBox();
			cmbgenders.setModel(new DefaultComboBoxModel(new String[] {"[ -- Select Your Gender --- ]", "Male", "Female"}));
			cmbgenders.setBounds(76, 409, 352, 28);
		}
		return cmbgenders;
	}
	private JComboBox getCmbgyms() {
		if (cmbgyms == null) {
			cmbgyms = new JComboBox();
			cmbgyms.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Choose Your Gym Time ---- ]", "06 : 00 AM  --  07 : 00 AM ", "07 : 00 AM  --  08 : 00 AM ", "08 : 00 AM  --  09 : 00 AM ", "09 : 00 AM  --  10 : 00 AM "}));
			cmbgyms.setBounds(617, 222, 352, 28);
		}
		return cmbgyms;
	}
	private JTextField getM_idinput() {
		if (m_idinput == null) {
			m_idinput = new JTextField();
			m_idinput.addKeyListener(new KeyAdapter() {
			
			});
			m_idinput.setColumns(10);
			m_idinput.setBounds(208, 40, 96, 34);
		}
		return m_idinput;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(m_idinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter the Member ID ");
						return;
					}else {
						JOptionPane.showMessageDialog(null,"Member ID Does not Exist");
					}
					
						Member mbr = new Member();
						
						int Search_id = Integer.parseInt(m_idinput.getText().toString());
						Member_Service ms = new Member_Service_Empl();
						
						ms.getMemeberByID(Search_id);
			
						Update_Member(Search_id);
						
				
//					------------------------------------------------------------
					
//					List<Member> m_list = ms.SearchMember(Search_id);
					
//					String fetch_data = "SELECT * FROM `new_member` WHERE id=? ";
//					
//					try {
//						PreparedStatement pstm = DB.getDB().prepareStatement(fetch_data);
//						
//						pstm.setString(1,m_idinput.getText());
//						ResultSet res = pstm.executeQuery();
//						
//						if(res.next()) {
//							fullnameinput.setText(res.getString("fullname"));
//							mobileinput.setText(res.getString("mobile_num"));
//							emailinput.setText(res.getString("email_id"));
//							cmbgender.setSelectedItem(res.getString("gender"));
//							fatherinput.setText(res.getString("father_name"));
//							pswinput.setText(res.getString("Password"));
//							cmbgym.setSelectedItem(res.getString("gym_time"));
//							citizeninput.setText(res.getString("citizen_no"));
//							ageinput.setText(String.valueOf(res.getInt("age")));
//							amoutninput.setText(String.valueOf(res.getInt("amount")));	
//						}
//						 
//					} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
					
					
					
				}
			});
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnSearch.setBounds(311, 40, 118, 34);
		}
		return btnSearch;
	}
	private JButton getBtnReset_1() {
		if (btnReset_1 == null) {
			btnReset_1 = new JButton("Reset");
			btnReset_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new Update_Delete_Member().setVisible(true);
				}
			});
			btnReset_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnReset_1.setBounds(328, 554, 100, 42);
		}
		return btnReset_1;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.setForeground(Color.WHITE);
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnX.setBackground(new Color(255, 0, 0));
			btnX.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnX.setBounds(10, 10, 50, 40);
		}
		return btnX;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(539, 63, 511, 42);
		}
		return separator;
	}
	
	// Update Member 
	
	public void Update_Member(int id) {
		
		eid = id;
		Member_Service ms = new Member_Service_Empl();
		Member m = ms.getMemeberByID(id);
		
		fullnameinput.setText(m.getFullname());
		mobileinput.setText(m.getMobileNumber());
		emailinput.setText(m.getEmailid());
		fatherinput.setText(m.getFathername());
		pswinput.setText(m.getPassword());
		citizeninput.setText(m.getCitizenNum());
		ageinput.setText(String.valueOf(m.getAge()));
		amoutninput.setText(String.valueOf(m.getAmountpay()));
		
		// Combo box Code Set
		cmbgenders.setSelectedItem(m.getGender());
		cmbgyms.setSelectedItem(m.getGymtime());
	}
	
	
}
