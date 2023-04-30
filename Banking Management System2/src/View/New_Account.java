package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import DB.db;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class New_Account extends JFrame {

	Connection conn;
	ResultSet rs;
	PreparedStatement pstm;
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JTextField acc_no;
	private JTextField fullnameinput;
	private JLabel lblNewLabel_1_1;
	private JTextField numberinput;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField addressinput;
	private JLabel lblNewLabel_1_1_1_2;
	private JTextField religionsinput;
	private JLabel lblNewLabel_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_3_1;
	private JDateChooser dobinput;
	private JComboBox cmbid;
	private JTextField micr_no;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_2_1;
	private JTextField pin_no;
	private JComboBox cmbacctype;
	private JLabel lblNewLabel_1_1_1_3_1_1;
	private JLabel lblNewLabel_1_2_1_1;
	private JRadioButton malebtn;
	private JRadioButton femalebtn;
	private JLabel lblNewLabel_1_2_1_2;
	private JTextField secqstninput;
	private JLabel lblNewLabel_1_2_1_2_1;
	private JTextField secansinput;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField amountinput;
	private JLabel lblNewLabel_1_1_1_2_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Account frame = new New_Account();
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
	public New_Account() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getPanel());
		
		// Database Connection
		conn = db.getDb();
		
		// Random Generate Number
		RandomAcc();
		RandomMICR();
		RandomPin();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(347, 10, 177, 72);
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 6), "New Account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(52, 92, 724, 457);
			panel.setLayout(null);
			panel.add(getLblNewLabel_1());
			panel.add(getAcc_no());
			panel.add(getFullnameinput());
			panel.add(getLblNewLabel_1_1());
			panel.add(getNumberinput());
			panel.add(getLblNewLabel_1_1_1());
			panel.add(getLblNewLabel_1_1_1_1());
			panel.add(getAddressinput());
			panel.add(getLblNewLabel_1_1_1_2());
			panel.add(getReligionsinput());
			panel.add(getLblNewLabel_1_1_1_3());
			panel.add(getLblNewLabel_1_1_1_3_1());
			panel.add(getDobinput());
			panel.add(getCmbid());
			panel.add(getMicr_no());
			panel.add(getLblNewLabel_1_2());
			panel.add(getLblNewLabel_1_2_1());
			panel.add(getPin_no());
			panel.add(getCmbacctype());
			panel.add(getLblNewLabel_1_1_1_3_1_1());
			panel.add(getLblNewLabel_1_2_1_1());
			panel.add(getMalebtn());
			panel.add(getFemalebtn());
			panel.add(getLblNewLabel_1_2_1_2());
			panel.add(getSecqstninput());
			panel.add(getLblNewLabel_1_2_1_2_1());
			panel.add(getSecansinput());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_2());
			panel.add(getAmountinput());
			panel.add(getLblNewLabel_1_1_1_2_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Account No.");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1.setBounds(26, 36, 116, 27);
		}
		return lblNewLabel_1;
	}
	private JTextField getAcc_no() {
		if (acc_no == null) {
			acc_no = new JTextField();
			acc_no.setBounds(152, 36, 184, 27);
			acc_no.setColumns(10);
		}
		return acc_no;
	}
	private JTextField getFullnameinput() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setColumns(10);
			fullnameinput.setBounds(500, 36, 184, 27);
		}
		return fullnameinput;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Full Name");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(384, 36, 101, 27);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getNumberinput() {
		if (numberinput == null) {
			numberinput = new JTextField();
			numberinput.setColumns(10);
			numberinput.setBounds(500, 84, 184, 27);
		}
		return numberinput;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1.setBounds(384, 84, 101, 27);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Address");
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_1.setBounds(384, 131, 101, 27);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getAddressinput() {
		if (addressinput == null) {
			addressinput = new JTextField();
			addressinput.setColumns(10);
			addressinput.setBounds(500, 131, 184, 27);
		}
		return addressinput;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("Religions");
			lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_2.setBounds(384, 175, 101, 27);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JTextField getReligionsinput() {
		if (religionsinput == null) {
			religionsinput = new JTextField();
			religionsinput.setColumns(10);
			religionsinput.setBounds(500, 175, 184, 27);
		}
		return religionsinput;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("Date of Birth");
			lblNewLabel_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3.setBounds(384, 220, 116, 27);
		}
		return lblNewLabel_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_3_1() {
		if (lblNewLabel_1_1_1_3_1 == null) {
			lblNewLabel_1_1_1_3_1 = new JLabel("ID Proof");
			lblNewLabel_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1.setBounds(384, 268, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1;
	}
	private JDateChooser getDobinput() {
		if (dobinput == null) {
			dobinput = new JDateChooser();
			dobinput.setBounds(500, 220, 184, 27);
		}
		return dobinput;
	}
	private JComboBox getCmbid() {
		if (cmbid == null) {
			cmbid = new JComboBox();
			cmbid.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select ID Proof --- ]", "CitizenShip", "License", "Voter ID"}));
			cmbid.setFont(new Font("Arial Black", Font.BOLD, 12));
			cmbid.setBounds(500, 267, 184, 27);
		}
		return cmbid;
	}
	private JTextField getMicr_no() {
		if (micr_no == null) {
			micr_no = new JTextField();
			micr_no.setColumns(10);
			micr_no.setBounds(152, 84, 184, 27);
		}
		return micr_no;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("MICR No.");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(26, 84, 116, 27);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("Pin No.");
			lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(26, 131, 116, 27);
		}
		return lblNewLabel_1_2_1;
	}
	private JTextField getPin_no() {
		if (pin_no == null) {
			pin_no = new JTextField();
			pin_no.setColumns(10);
			pin_no.setBounds(152, 131, 184, 27);
		}
		return pin_no;
	}
	private JComboBox getCmbacctype() {
		if (cmbacctype == null) {
			cmbacctype = new JComboBox();
			cmbacctype.setFont(new Font("Arial Black", Font.BOLD, 12));
			cmbacctype.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Account Type --- ]", "Saving", "Current"}));
			cmbacctype.setBounds(152, 177, 184, 27);
		}
		return cmbacctype;
	}
	private JLabel getLblNewLabel_1_1_1_3_1_1() {
		if (lblNewLabel_1_1_1_3_1_1 == null) {
			lblNewLabel_1_1_1_3_1_1 = new JLabel("Account Type");
			lblNewLabel_1_1_1_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1_1.setBounds(26, 178, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1_1;
	}
	private JLabel getLblNewLabel_1_2_1_1() {
		if (lblNewLabel_1_2_1_1 == null) {
			lblNewLabel_1_2_1_1 = new JLabel("Gender");
			lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_1.setBounds(26, 220, 78, 27);
		}
		return lblNewLabel_1_2_1_1;
	}
	private JRadioButton getMalebtn() {
		if (malebtn == null) {
			malebtn = new JRadioButton("Male");
			buttonGroup.add(malebtn);
			malebtn.setFont(new Font("Arial Black", Font.BOLD, 14));
			malebtn.setBounds(152, 225, 72, 21);
		}
		return malebtn;
	}
	private JRadioButton getFemalebtn() {
		if (femalebtn == null) {
			femalebtn = new JRadioButton("Female");
			buttonGroup.add(femalebtn);
			femalebtn.setFont(new Font("Arial Black", Font.BOLD, 14));
			femalebtn.setBounds(251, 225, 85, 21);
		}
		return femalebtn;
	}
	private JLabel getLblNewLabel_1_2_1_2() {
		if (lblNewLabel_1_2_1_2 == null) {
			lblNewLabel_1_2_1_2 = new JLabel("Sec Question");
			lblNewLabel_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_2.setBounds(26, 268, 116, 27);
		}
		return lblNewLabel_1_2_1_2;
	}
	private JTextField getSecqstninput() {
		if (secqstninput == null) {
			secqstninput = new JTextField();
			secqstninput.setColumns(10);
			secqstninput.setBounds(152, 268, 184, 27);
		}
		return secqstninput;
	}
	private JLabel getLblNewLabel_1_2_1_2_1() {
		if (lblNewLabel_1_2_1_2_1 == null) {
			lblNewLabel_1_2_1_2_1 = new JLabel("Sec Answer");
			lblNewLabel_1_2_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_2_1.setBounds(26, 310, 116, 27);
		}
		return lblNewLabel_1_2_1_2_1;
	}
	private JTextField getSecansinput() {
		if (secansinput == null) {
			secansinput = new JTextField();
			secansinput.setColumns(10);
			secansinput.setBounds(152, 310, 184, 27);
		}
		return secansinput;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBounds(152, 390, 116, 35);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Create");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					String Create_acc = "INSERT INTO `account`(`fullname`, `number`, `address`, `amount`,`religions`, `acc_no`, `micr`, `qstn`, `acc_type`, `gender`, `answer`, `pin_no`, `id_proof`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					try {
						
						pstm = conn.prepareStatement(Create_acc);
						
						pstm.setString(1, fullnameinput.getText());
						pstm.setString(2, numberinput.getText());
						pstm.setString(3, addressinput.getText());
						pstm.setString(4, amountinput.getText());
						pstm.setString(5, religionsinput.getText());
						pstm.setString(6, acc_no.getText());
						pstm.setString(7, micr_no.getText());
						pstm.setString(8, secqstninput.getText());
						pstm.setString(9, secansinput.getText());
						pstm.setString(10, cmbacctype.getSelectedItem().toString());
						pstm.setString(11, pin_no.getText());
						pstm.setString(12, cmbid.getSelectedItem().toString());

						malebtn.setActionCommand("Male");
						femalebtn.setActionCommand("Female");
						pstm.setString(13, buttonGroup.getSelection().getActionCommand());

						pstm.execute();
						JOptionPane.showMessageDialog(null, "Congrates Account Created Sucess");
						Bal();
	
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1);
					}
					
				}
			});
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_1.setBounds(363, 390, 116, 35);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Clear");
			btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_2.setBounds(568, 390, 116, 35);
		}
		return btnNewButton_2;
	}
	private JTextField getAmountinput() {
		if (amountinput == null) {
			amountinput = new JTextField();
			amountinput.setColumns(10);
			amountinput.setBounds(500, 310, 184, 27);
		}
		return amountinput;
	}
	private JLabel getLblNewLabel_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_2_1 = new JLabel("Amount");
			lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_2_1.setBounds(384, 310, 101, 27);
		}
		return lblNewLabel_1_1_1_2_1;
	}
	
//	----------------------------------------------------------------------
	
	// Random Funtion to automatic Generate Code
	public void RandomAcc() {
		Random ran = new Random();
		acc_no.setText(""+ran.nextInt(100000+1));
	}
	public void RandomMICR() {
		Random ran = new Random();
		micr_no.setText(""+ran.nextInt(10000+1));
	}
	public void RandomPin() {
		Random ran = new Random();
		pin_no.setText(""+ran.nextInt(1000+1));
	}
	
	public void Bal() {
		String inbalance = "INSERT INTO `balances`(`name`, `acc`, `micr`, `balance`) VALUES(?,?,?,?)";
		
		try {
			pstm=conn.prepareStatement(inbalance);
			pstm.setString(1, fullnameinput.getText());
			pstm.setString(1, acc_no.getText());
			pstm.setString(1, micr_no.getText());
			pstm.setString(1, amountinput.getText());
			pstm.execute();
			
		}catch(Exception e1){
			JOptionPane.showMessageDialog(null, e1);
		}
	}
	
}
