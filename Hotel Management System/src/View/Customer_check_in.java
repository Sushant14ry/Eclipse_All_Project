package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

import Service.Check_In_Service;
import Service.Check_In_Service_empl;
import model.Customer_CheckIN;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class Customer_check_in extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JTextField fullnameinput;
	private JLabel lblRoomNumber;
	private JLabel lblMobileNumber;
	private JTextField mobileinput;
	private JLabel lblNationality;
	private JTextField nationalityinput;
	private JLabel lblGender;
	private JLabel lblEmail;
	private JTextField emailinput;
	private JLabel lblId;
	private JLabel lblRoomNumber_1_1;
	private JTextField addressinput;
	private JLabel lblRoomNumber_1_2;
	private JLabel lblNoBed;
	private JLabel lblNoBed_1;
	private JLabel lblNoBed_2;
	private JTextField roompriceinput;
	private JLabel lblNoBed_2_1;
	private JComboBox cmbroomnum;
	private JComboBox cmbroomtype;
	private JComboBox cmbbedno;
	private JButton btnAllotRoom;
	private JButton btnClear;
	private JComboBox cmbgender;
	private JDateChooser checkdate_today;
	private JComboBox cmbidproof;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_check_in frame = new Customer_check_in();
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
	public Customer_check_in() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(94, 130, 1375, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(51, 204, 153));
			panel.setBounds(0, 10, 1374, 632);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getPanel_1());
			panel.add(getBtnNewButton());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("CUSTOMER CHECK IN");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(40, 16, 278, 54);
		}
		return lblNewLabel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(40, 116, 1296, 495);
			panel_1.setLayout(null);
			panel_1.add(getTextField_4());
			panel_1.add(getLblRoomNumber_1());
			panel_1.add(getLblRoomNumber_1_1());
			panel_1.add(getMobileinput());
			panel_1.add(getLblNationality());
			panel_1.add(getNationalityinput());
			panel_1.add(getLblGender());
			panel_1.add(getLblEmail());
			panel_1.add(getTextField_4_1());
			panel_1.add(getLblRoomNumber_1_2());
			panel_1.add(getLblRoomNumber_1_1_1());
			panel_1.add(getAddressinput());
			panel_1.add(getLblRoomNumber_1_2_1());
			panel_1.add(getLblNoBed());
			panel_1.add(getLblNoBed_1());
			panel_1.add(getLblNoBed_2());
			panel_1.add(getRoompriceinput());
			panel_1.add(getLblNoBed_2_1());
			panel_1.add(getCmbroomnum());
			panel_1.add(getCmbroomtype());
			panel_1.add(getCmbbedno());
			panel_1.add(getBtnAllotRoom());
			panel_1.add(getBtnClear());
			panel_1.add(getCmbgender());
			panel_1.add(getCheckdate_today());
			panel_1.add(getCmbidproof());
		}
		return panel_1;
	}
	private JTextField getTextField_4() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setColumns(10);
			fullnameinput.setBounds(22, 72, 367, 26);
		}
		return fullnameinput;
	}
	private JLabel getLblRoomNumber_1() {
		if (lblRoomNumber == null) {
			lblRoomNumber = new JLabel("Full Name");
			lblRoomNumber.setForeground(Color.BLACK);
			lblRoomNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber.setBounds(23, 30, 144, 35);
		}
		return lblRoomNumber;
	}
	private JLabel getLblRoomNumber_1_1() {
		if (lblMobileNumber == null) {
			lblMobileNumber = new JLabel("Mobile Number");
			lblMobileNumber.setForeground(Color.BLACK);
			lblMobileNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber.setBounds(23, 123, 157, 35);
		}
		return lblMobileNumber;
	}
	private JTextField getMobileinput() {
		if (mobileinput == null) {
			mobileinput = new JTextField();
			mobileinput.setColumns(10);
			mobileinput.setBounds(22, 165, 367, 26);
		}
		return mobileinput;
	}
	private JLabel getLblNationality() {
		if (lblNationality == null) {
			lblNationality = new JLabel("Nationality");
			lblNationality.setForeground(Color.BLACK);
			lblNationality. setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNationality.setBounds(23, 215, 144, 35);
		}
		return lblNationality;
	}
	private JTextField getNationalityinput() {
		if (nationalityinput == null) {
			nationalityinput = new JTextField();
			nationalityinput.setColumns(10);
			nationalityinput.setBounds(22, 257, 367, 26);
		}
		return nationalityinput;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setForeground(Color.BLACK);
			lblGender.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblGender.setBounds(23, 306, 144, 35);
		}
		return lblGender;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setForeground(Color.BLACK);
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(23, 397, 144, 35);
		}
		return lblEmail;
	}
	private JTextField getTextField_4_1() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setColumns(10);
			emailinput.setBounds(22, 439, 367, 26);
		}
		return emailinput;
	}
	private JLabel getLblRoomNumber_1_2() {
		if (lblId == null) {
			lblId = new JLabel(" ID Proof");
			lblId.setForeground(Color.BLACK);
			lblId.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblId.setBounds(457, 30, 144, 35);
		}
		return lblId;
	}
	private JLabel getLblRoomNumber_1_1_1() {
		if (lblRoomNumber_1_1 == null) {
			lblRoomNumber_1_1 = new JLabel("Address");
			lblRoomNumber_1_1.setForeground(Color.BLACK);
			lblRoomNumber_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_1_1.setBounds(458, 123, 144, 35);
		}
		return lblRoomNumber_1_1;
	}
	private JTextField getAddressinput() {
		if (addressinput == null) {
			addressinput = new JTextField();
			addressinput.setColumns(10);
			addressinput.setBounds(457, 165, 367, 26);
		}
		return addressinput;
	}
	private JLabel getLblRoomNumber_1_2_1() {
		if (lblRoomNumber_1_2 == null) {
			lblRoomNumber_1_2 = new JLabel("Check In Date ( Today )");
			lblRoomNumber_1_2.setForeground(Color.BLACK);
			lblRoomNumber_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_1_2.setBounds(457, 215, 227, 35);
		}
		return lblRoomNumber_1_2;
	}
	private JLabel getLblNoBed() {
		if (lblNoBed == null) {
			lblNoBed = new JLabel("No. Bed");
			lblNoBed.setForeground(Color.BLACK);
			lblNoBed.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNoBed.setBounds(902, 30, 144, 35);
		}
		return lblNoBed;
	}
	private JLabel getLblNoBed_1() {
		if (lblNoBed_1 == null) {
			lblNoBed_1 = new JLabel("Room Type");
			lblNoBed_1.setForeground(Color.BLACK);
			lblNoBed_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNoBed_1.setBounds(902, 123, 144, 35);
		}
		return lblNoBed_1;
	}
	private JLabel getLblNoBed_2() {
		if (lblNoBed_2 == null) {
			lblNoBed_2 = new JLabel("Room Number");
			lblNoBed_2.setForeground(Color.BLACK);
			lblNoBed_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNoBed_2.setBounds(902, 215, 144, 35);
		}
		return lblNoBed_2;
	}
	private JTextField getRoompriceinput() {
		if (roompriceinput == null) {
			roompriceinput = new JTextField();
			roompriceinput.setColumns(10);
			roompriceinput.setBounds(901, 348, 367, 26);
		}
		return roompriceinput;
	}
	private JLabel getLblNoBed_2_1() {
		if (lblNoBed_2_1 == null) {
			lblNoBed_2_1 = new JLabel("Room Price");
			lblNoBed_2_1.setForeground(Color.BLACK);
			lblNoBed_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNoBed_2_1.setBounds(902, 306, 144, 35);
		}
		return lblNoBed_2_1;
	}
	private JComboBox getCmbroomnum() {
		if (cmbroomnum == null) {
			cmbroomnum = new JComboBox();
			cmbroomnum.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbroomnum.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select Room Number ---- ]", "12", "42", "34", "12"}));
			cmbroomnum.setBounds(902, 257, 367, 26);
		}
		return cmbroomnum;
	}
	private JComboBox getCmbroomtype() {
		if (cmbroomtype == null) {
			cmbroomtype = new JComboBox();
			cmbroomtype.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbroomtype.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select Room Type---- ]", "AC", "Non AC", "VIP"}));
			cmbroomtype.setBounds(902, 165, 367, 26);
		}
		return cmbroomtype;
	}
	private JComboBox getCmbbedno() {
		if (cmbbedno == null) {
			cmbbedno = new JComboBox();
			cmbbedno.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbbedno.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select No of Bed---- ]", "1", "2", "3", "4"}));
			cmbbedno.setBounds(902, 72, 367, 26);
		}
		return cmbbedno;
	}
	private JButton getBtnAllotRoom() {
		if (btnAllotRoom == null) {
			btnAllotRoom = new JButton("Allot Room");
			btnAllotRoom.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Customer_CheckIN cci = new Customer_CheckIN();
					
					cci.setFullname(fullnameinput.getText());
					cci.setMobile(mobileinput.getText());
					cci.setNationality(nationalityinput.getText());
					cci.setGender(cmbgender.getSelectedItem().toString());
					cci.setEmail(emailinput.getText());
					cci.setId_proof(cmbidproof.getSelectedItem().toString());
					cci.setAddress(addressinput.getText());
					cci.setCheck_date(new Date(checkdate_today.getDate().getTime()));
					cci.setBed_no(Integer.parseInt(cmbbedno.getSelectedItem().toString()));
					cci.setRoom_type(cmbroomtype.getSelectedItem().toString());
					cci.setRoom_no(cmbroomnum.getSelectedItem().toString());
					cci.setRoom_price(Integer.parseInt(roompriceinput.getText()));
					
					Check_In_Service cis = new Check_In_Service_empl();
					boolean res = cis.AddCheckIN(cci);
					if(res) {
						JOptionPane.showMessageDialog(null,"Room Check in Success");
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Check In Room");
					}
					
				}
			});
			btnAllotRoom.setForeground(Color.WHITE);
			btnAllotRoom.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnAllotRoom.setBackground(new Color(220, 20, 60));
			btnAllotRoom.setBounds(902, 412, 155, 32);
		}
		return btnAllotRoom;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new Customer_check_in().setVisible(true);
					
				}
			});
			btnClear.setForeground(Color.WHITE);
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnClear.setBackground(new Color(220, 20, 60));
			btnClear.setBounds(1113, 412, 155, 32);
		}
		return btnClear;
	}
	private JComboBox getCmbgender() {
		if (cmbgender == null) {
			cmbgender = new JComboBox();
			cmbgender.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbgender.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select Your Gender ---- ]", "Male", "Female"}));
			cmbgender.setBounds(22, 348, 367, 26);
		}
		return cmbgender;
	}
	private JDateChooser getCheckdate_today() {
		if (checkdate_today == null) {
			checkdate_today = new JDateChooser();
			checkdate_today.setBounds(457, 257, 366, 26);
		}
		return checkdate_today;
	}
	private JComboBox getCmbidproof() {
		if (cmbidproof == null) {
			cmbidproof = new JComboBox();
			cmbidproof.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Choose Your ID  ---- ]", "Citizenship", "License", "Voter ID"}));
			cmbidproof.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbidproof.setBounds(457, 72, 367, 26);
		}
		return cmbidproof;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("X");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit This Application","select",JOptionPane.YES_NO_OPTION);
					if(a == 0) {
						System.exit(a);
					}
				}
			});
			btnNewButton.setBackground(Color.RED);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBounds(1319, 10, 50, 40);
		}
		return btnNewButton;
	}
}
