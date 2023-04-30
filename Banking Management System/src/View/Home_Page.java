package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import com.toedter.calendar.JDateChooser;

import Service.Account_Service;
import Service.Account_Service_empl;
import Service.Deposite_Service;
import Service.Deposite_Service_empl;
import Service.Transfer_Service;
import Service.Transfer_Service_empl;
import Service.Withdrawal_Service;
import Service.Withdrawal_Service_empl;
import model.Account;
import model.Deposite;
import model.Transfer;
import model.Withdrawal;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;

public class Home_Page extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField S_ac_no;
	private JTextField datefield;
	private JButton btnNewButton;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JLabel user;
	private JLabel lblNewLabel_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_3_1;
	private JTextField fullname;
	private JTextField number;
	private JTextField address;
	private JTextField usernameinputs;
	private JDateChooser dobinputs;
	private JComboBox cmbreligious;
	private JTextField acc_noinputs;
	private JTextField micr_noinputs;
	private JTextField pin_noinputs;
	private JComboBox cmbac_types;
	private JLabel lblNewLabel_1_2_1_1;
	private JLabel lblNewLabel_1_1_1_3_1_1;
	private JLabel lblNewLabel_1_2_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JTextField answer_qsntinputs;
	private JLabel lblNewLabel_1_2_1_2;
	private JSeparator separator;
	private JButton btnSave;
	private JButton btnNewButton_1_1;
	private JLabel lblNewLabel_1_1_1_4;
	private JTextField dacc_noinput;
	private JLabel lblNewLabel_1_1_1_4_1;
	private JTextField d_av_balance;
	private JLabel lblNewLabel_1_1_1_4_1_1;
	private JTextField ddeposite_amount;
	private JTextField dtotal_amount;
	private JButton btnTotal;
	private JButton btnDeposite;
	private JLabel lblNewLabel_1_1_1_4_1_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_1_1;
	private JLabel lblNewLabel_2_1_1_1;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JLabel lblNewLabel_2_1_1_1_1_1;
	private JButton btnSearch;
	private JLabel dfullname;
	private JLabel dusername;
	private JLabel dnumber;
	private JButton btnTotal_1;
	private JTextField trans_total_amount;
	private JTextField ttransfer_amount;
	private JLabel lblNewLabel_1_1_1_4_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_4_2;
	private JLabel tfullname;
	private JTextField tav_balance;
	private JLabel lblNewLabel_2_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_1_1_1;
	private JLabel lblNewLabel_2_1_2;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_1_1_1_4_2_1;
	private JTextField tc_acc_no;
	private JLabel lblNewLabel_2_2_1;
	private JButton btnSearch_1_1;
	private JLabel tc_fullname;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_3_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_1_1;
	private JLabel tc_number;
	private JLabel lblNewLabel_2_2_1_1;
	private JLabel lblNewLabel_2_2_1_1_1;
	private JTextField tc_transfer_balance;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1;
	private JLabel lblNewLabel_2_2_1_1_1_1;
	private JButton btnSearch_1_1_1;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1_1_1_4_3;
	private JTextField wacc_no;
	private JButton btnSearch_1;
	private JLabel wfullname;
	private JLabel wusername;
	private JLabel wnumber;
	private JTextField wavbalance;
	private JTextField wwithamoun;
	private JLabel lblNewLabel_2_1_1_1_1_3;
	private JLabel lblNewLabel_2_1_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_2;
	private JLabel lblNewLabel_2_1_3;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_4;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_3_1;
	private JLabel lblNewLabel_2_1_1_1_1_1_2_1;
	private JTextField wtotalamount;
	private JButton btnSearch_1_2;
	private JButton btnSearch_1_2_1;
	private JScrollPane scrollPane;
	private JTable customerTable;
	private JScrollPane scrollPane_1;
	private JTable transfer_table;
	private JLabel lblNewLabel_1_1_1_4_4;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_5;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_3;
	private JLabel lblNewLabel_2_1_1_3;
	private JLabel lblNewLabel_2_1_4;
	private JLabel lblNewLabel_2_4;
	private JTextField vS_ac_no;
	private JLabel vfullname;
	private JLabel vusername;
	private JLabel vmicrno;
	private JButton btnSearch_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1;
	private JLabel lblNewLabel_2_1_1_1_3_1;
	private JLabel vrate_of_intrest;
	private JLabel vbalances;
	private JLabel lblNewLabel_2_1_1_1_3_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1;
	private JLabel vtotalbalances;
	private JLabel lblNewLabel_2_1_1_1_3_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2;
	private JLabel vnomination;
	private JLabel lblNewLabel_2_1_1_1_3_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_5;
	private JTextField oldpininput;
	private JLabel lblNewLabel_1_1_1_4_5_1;
	private JTextField C_Customer_Number;
	private JLabel lblNewLabel_1_1_1_4_5_2;
	private JTextField cnewpinininput;
	private JButton btnSearch_2_1;
	private JButton btnSearch_2_1_1;
	private JPanel panel_1_1;
	private JLabel lblName;
	private JLabel lblSushantChaudhary;
	private JLabel lblCsushantgmailcom;
	private JLabel lblEmail_1;
	private JLabel lblPhone_1;
	private JLabel lblSushantChaudhary_1;
	private JLabel lblSushantChaudhary_1_1;
	private JLabel lblAdress;
	private JLabel lblKalankiKathmandu;
	private JLabel lblWebsite;
	private JLabel lblSushantChaudhary_1_2;
	private JPanel panel_9;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1_1;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_3_1_1_1;
	private JLabel lblNewLabel_3_1_2;
	private JLabel lblNewLabel_3_1_1_1_1;
	private JPanel panel_10;
	private JLabel lblNewLabel_4;
	private JTextField tacc_no;
	private JButton btnSearch_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_6;
	private JLabel lblNewLabel_2_1_5;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_6_1;
	private JLabel lblNewLabel_2_1_5_1;
	private JSeparator separator_2;
	private JTextField ddeposite_name;
	private JTextField ddeposite_num;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel malebtn;
	private JLabel lblNewLabel_1_2_1_2_1;
	private JComboBox cmbacctype;
	private JTextField micrinput;
	private JTextField acc_noinput;
	private JLabel lblNewLabel_1_3_1;
	private JLabel lblNewLabel_1_2_2;
	private JLabel lblNewLabel_1_1_1_3_1_1_1;
	private JLabel lblNewLabel_1_2_1_1_1;
	private JComboBox cmbreligions;
	private JDateChooser dobinput;
	private JTextField balanceinput;
	private JTextField addressinput;
	private JTextField numberinput;
	private JTextField fullnameinput;
	private JLabel lblNewLabel_1_1_1_5;
	private JLabel lblNewLabel_1_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_2_1;
	private JLabel lblNewLabel_1_1_1_3_2;
	private JLabel lblNewLabel_1_1_1_3_1_2;
	private JButton btnClear;
	private JButton btnNewButton_1_1_1;
	private JLabel lblNewLabel_1_2_1_2_1_1;
	private JTextField secanser;
	private JComboBox cmbsecqstn;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JComboBox cmbgender;
	private JComboBox cmb_genders;
	
	private int avbalance;
	private String acc_num;
	
	private String eid;
	private JLabel lblNewLabel_1_2_1_2_1_1_1;
	private JTextField pin_noinput;
	private JTextField Nominationinput;
	private JLabel Nomination;
	private JPanel panel_11;
	private JPanel panel_12;
	private JScrollPane scrollPane_2;
	private JTable withdrawal_table;
	private JScrollPane scrollPane_3;
	private JTable deposite_table;
	private JLabel lblNewLabel_1_1_1_4_5_3;
	private JTextField change_Acc_no;
	private JButton btnSearch_2_1_1_1;
	private JTextField Seach_Customer_List;
	private JTextField to_transfer_Search;
	private JLabel lblNewLabel_1_1_2;
	private JLabel lblNewLabel_1_1_3;
	private JTextField from_transfer_Search;
	private JTextField search_deposite;
	private JTextField search_withdrawal;
	private JButton btnLogout;
	
	// Transfer one account to another account get available balance to credit transfer account
	private int trans_and_upd_bal;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Page frame = new Home_Page();
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
	public Home_Page() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 60, 829, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getS_ac_no());
		contentPane.add(getDatefield());
		contentPane.add(getBtnNewButton());
		contentPane.add(getTabbedPane());
		contentPane.add(getSeparator());
		contentPane.add(getBtnLogout());
		
		// Curent Date Show in Input Box
			CurDate();
		
		// Generate Random Number
			GenrateRandom_Number();
		
		// Show Customer List
			Display_Customer_List();
		
		// Show Data in Withdrawal Transaction Table
			Withdrawal_Table();
		
		// Show Data in Deposite Transaction Table		
			Deposite_Table();
			
		// Show Data in Transfer Transaction Table		
			Transfer_Table();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Home_Page().setVisible(true);
					dispose();
				}
			});
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(42, 31, 177, 72);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Acc_No");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(414, 31, 81, 21);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Date");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(414, 74, 51, 21);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getS_ac_no() {
		if (S_ac_no == null) {
			S_ac_no = new JTextField();
			S_ac_no.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			S_ac_no.setBounds(505, 26, 190, 30);
			S_ac_no.setColumns(10);
		}
		return S_ac_no;
	}
	private JTextField getDatefield() {
		if (datefield == null) {
			datefield = new JTextField();
			datefield.setFont(new Font("Arial Black", Font.BOLD, 16));
			datefield.setColumns(10);
			datefield.setBounds(505, 72, 190, 30);
		}
		return datefield;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Show");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Search_acc = S_ac_no.getText().trim();
					
					Account_Service acs = new Account_Service_empl();
					acs.getAccById(Search_acc);
					Display_InputBox(Search_acc);
					
					if(Search_acc.equals(acc_num)) {
						System.out.println(acc_num);
					}else {
						JOptionPane.showMessageDialog(null, "Account Number Not matched");
					}
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnNewButton.setBounds(705, 24, 100, 32);
		}
		return btnNewButton;
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(22, 140, 764, 490);
			tabbedPane.addTab("Profile", null, getPanel(), null);
			tabbedPane.addTab("Deposite", null, getPanel_1(), null);
			tabbedPane.addTab("Withdrawal", null, getPanel_3(), null);
			tabbedPane.addTab("Create Account", null, getMalebtn(), null);
			tabbedPane.addTab("Customer List", null, getPanel_4(), null);
			tabbedPane.addTab("Transfer Transaction\r\n", null, getPanel_5(), null);
			tabbedPane.addTab("View Balance", null, getPanel_6(), null);
			tabbedPane.addTab("Transfer", null, getPanel_2(), null);
			tabbedPane.addTab("Change Pin", null, getPanel_7(), null);
			tabbedPane.addTab("About Us", null, getPanel_8(), null);
			tabbedPane.addTab("Withdrawal Transaction", null, getPanel_11(), null);
			tabbedPane.addTab("Deposite Transaction", null, getPanel_12(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNewLabel_1_1_1());
			panel.add(getLblNewLabel_1_1_1_1());
			panel.add(getLblNewLabel_1_1_1_1_1());
			panel.add(getUser());
			panel.add(getLblNewLabel_1_1_1_3());
			panel.add(getLblNewLabel_1_1_1_3_1());
			panel.add(getFullname());
			panel.add(getNumber());
			panel.add(getAddress());
			panel.add(getUsernameinputs());
			panel.add(getDobinputs());
			panel.add(getCmbreligious());
			panel.add(getAcc_noinputs());
			panel.add(getMicr_noinputs());
			panel.add(getPin_noinputs());
			panel.add(getCmbac_types());
			panel.add(getLblNewLabel_1_2_1_1());
			panel.add(getLblNewLabel_1_1_1_3_1_1());
			panel.add(getLblNewLabel_1_2_1());
			panel.add(getLblNewLabel_1_2());
			panel.add(getLblNewLabel_1_3());
			panel.add(getAnswer_qsntinputs());
			panel.add(getLblNewLabel_1_2_1_2());
			panel.add(getBtnSave());
			panel.add(getBtnNewButton_1_1());
			panel.add(getCmb_genders());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1_1_1_4());
			panel_1.add(getDacc_noinput());
			panel_1.add(getLblNewLabel_1_1_1_4_1());
			panel_1.add(getD_av_balance());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1());
			panel_1.add(getDdeposite_amount());
			panel_1.add(getDtotal_amount());
			panel_1.add(getBtnTotal());
			panel_1.add(getBtnDeposite());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_1());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_1_1());
			panel_1.add(getLblNewLabel_2());
			panel_1.add(getLblNewLabel_2_1());
			panel_1.add(getLblNewLabel_2_1_1());
			panel_1.add(getLblNewLabel_2_1_1_1());
			panel_1.add(getLblNewLabel_2_1_1_1_1());
			panel_1.add(getLblNewLabel_2_1_1_1_1_1());
			panel_1.add(getBtnSearch());
			panel_1.add(getDfullname());
			panel_1.add(getDusername());
			panel_1.add(getDnumber());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_6());
			panel_1.add(getLblNewLabel_2_1_5());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_6_1());
			panel_1.add(getLblNewLabel_2_1_5_1());
			panel_1.add(getSeparator_2());
			panel_1.add(getDdeposite_name());
			panel_1.add(getDdeposite_num());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getBtnTotal_1());
			panel_2.add(getTrans_total_amount());
			panel_2.add(getTtransfer_amount());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_2());
			panel_2.add(getLblNewLabel_1_1_1_4_1_2());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_3());
			panel_2.add(getLblNewLabel_1_1_1_4_2());
			panel_2.add(getTfullname());
			panel_2.add(getTav_balance());
			panel_2.add(getLblNewLabel_2_1_1_1_1_2());
			panel_2.add(getLblNewLabel_2_1_1_1_1_1_1());
			panel_2.add(getLblNewLabel_2_1_2());
			panel_2.add(getLblNewLabel_2_2());
			panel_2.add(getLblNewLabel_1_1_1_4_2_1());
			panel_2.add(getTc_acc_no());
			panel_2.add(getLblNewLabel_2_2_1());
			panel_2.add(getBtnSearch_1_1());
			panel_2.add(getTc_fullname());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_3_1());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1());
			panel_2.add(getTc_number());
			panel_2.add(getLblNewLabel_2_2_1_1());
			panel_2.add(getLblNewLabel_2_2_1_1_1());
			panel_2.add(getTc_transfer_balance());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1());
			panel_2.add(getLblNewLabel_2_2_1_1_1_1());
			panel_2.add(getBtnSearch_1_1_1());
			panel_2.add(getSeparator_1());
			panel_2.add(getTacc_no());
			panel_2.add(getBtnSearch_1_1_2());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(null);
			panel_3.add(getLblNewLabel_1_1_1_4_3());
			panel_3.add(getWacc_no());
			panel_3.add(getBtnSearch_1());
			panel_3.add(getWfullname());
			panel_3.add(getWusername());
			panel_3.add(getWnumber());
			panel_3.add(getWavbalance());
			panel_3.add(getWwithamoun());
			panel_3.add(getLblNewLabel_2_1_1_1_1_3());
			panel_3.add(getLblNewLabel_2_1_1_1_1_1_2());
			panel_3.add(getLblNewLabel_2_1_1_1_2());
			panel_3.add(getLblNewLabel_2_1_1_2());
			panel_3.add(getLblNewLabel_2_1_3());
			panel_3.add(getLblNewLabel_2_3());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_4());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_1_2());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_1());
			panel_3.add(getLblNewLabel_1_1_1_4_1_3());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_3());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_3_1());
			panel_3.add(getLblNewLabel_2_1_1_1_1_1_2_1());
			panel_3.add(getWtotalamount());
			panel_3.add(getBtnSearch_1_2());
			panel_3.add(getBtnSearch_1_2_1());
		}
		return panel_3;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setLayout(null);
			panel_4.add(getScrollPane());
			panel_4.add(getSeach_Customer_List());
		}
		return panel_4;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setLayout(null);
			panel_5.add(getScrollPane_1());
			panel_5.add(getTo_transfer_Search());
			panel_5.add(getLblNewLabel_1_1_2());
			panel_5.add(getLblNewLabel_1_1_3());
			panel_5.add(getFrom_transfer_Search());
		}
		return panel_5;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.setLayout(null);
			panel_6.add(getLblNewLabel_1_1_1_4_4());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_5());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_3());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2());
			panel_6.add(getLblNewLabel_2_1_1_1_3());
			panel_6.add(getLblNewLabel_2_1_1_3());
			panel_6.add(getLblNewLabel_2_1_4());
			panel_6.add(getLblNewLabel_2_4());
			panel_6.add(getVS_ac_no());
			panel_6.add(getVfullname());
			panel_6.add(getVusername());
			panel_6.add(getVmicrno());
			panel_6.add(getBtnSearch_2());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1());
			panel_6.add(getVrate_of_intrest());
			panel_6.add(getVbalances());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1());
			panel_6.add(getVtotalbalances());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1_2());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2());
			panel_6.add(getVnomination());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1_2_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1());
		}
		return panel_6;
	}
	private JPanel getPanel_7() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setLayout(null);
			panel_7.add(getLblNewLabel_1_1_1_4_5());
			panel_7.add(getOldpininput());
			panel_7.add(getLblNewLabel_1_1_1_4_5_1());
			panel_7.add(getC_Customer_Number());
			panel_7.add(getLblNewLabel_1_1_1_4_5_2());
			panel_7.add(getCnewpinininput());
			panel_7.add(getBtnSearch_2_1());
			panel_7.add(getBtnSearch_2_1_1());
			panel_7.add(getLblNewLabel_1_1_1_4_5_3());
			panel_7.add(getChange_Acc_no());
			panel_7.add(getBtnSearch_2_1_1_1());
		}
		return panel_7;
	}
	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
			panel_8.setLayout(null);
			panel_8.add(getPanel_1_1());
			panel_8.add(getPanel_9());
			panel_8.add(getPanel_10());
		}
		return panel_8;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Full Name");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1.setBounds(43, 38, 101, 27);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_1.setBounds(43, 86, 101, 27);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Address");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_1_1.setBounds(43, 133, 101, 27);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JLabel getUser() {
		if (user == null) {
			user = new JLabel("Username");
			user.setFont(new Font("Arial Black", Font.BOLD, 14));
			user.setBounds(43, 177, 101, 27);
		}
		return user;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("Date of Birth");
			lblNewLabel_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3.setBounds(43, 222, 116, 27);
		}
		return lblNewLabel_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_3_1() {
		if (lblNewLabel_1_1_1_3_1 == null) {
			lblNewLabel_1_1_1_3_1 = new JLabel("Religions");
			lblNewLabel_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1.setBounds(43, 270, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1;
	}
	private JTextField getFullname() {
		if (fullname == null) {
			fullname = new JTextField();
			fullname.setColumns(10);
			fullname.setBounds(159, 38, 184, 27);
		}
		return fullname;
	}
	private JTextField getNumber() {
		if (number == null) {
			number = new JTextField();
			number.setColumns(10);
			number.setBounds(159, 86, 184, 27);
		}
		return number;
	}
	private JTextField getAddress() {
		if (address == null) {
			address = new JTextField();
			address.setColumns(10);
			address.setBounds(159, 133, 184, 27);
		}
		return address;
	}
	private JTextField getUsernameinputs() {
		if (usernameinputs == null) {
			usernameinputs = new JTextField();
			usernameinputs.setColumns(10);
			usernameinputs.setBounds(159, 177, 184, 27);
		}
		return usernameinputs;
	}
	private JDateChooser getDobinputs() {
		if (dobinputs == null) {
			dobinputs = new JDateChooser();
			dobinputs.setBounds(159, 222, 184, 27);
		}
		return dobinputs;
	}
	private JComboBox getCmbreligious() {
		if (cmbreligious == null) {
			cmbreligious = new JComboBox();
			cmbreligious.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Nationality --- ]", "Hindu", "Muslim", "Baudh", "Cristan"}));
			cmbreligious.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbreligious.setBounds(159, 269, 184, 27);
		}
		return cmbreligious;
	}
	private JTextField getAcc_noinputs() {
		if (acc_noinputs == null) {
			acc_noinputs = new JTextField();
			acc_noinputs.setColumns(10);
			acc_noinputs.setBounds(526, 38, 184, 27);
		}
		return acc_noinputs;
	}
	private JTextField getMicr_noinputs() {
		if (micr_noinputs == null) {
			micr_noinputs = new JTextField();
			micr_noinputs.setColumns(10);
			micr_noinputs.setBounds(526, 86, 184, 27);
		}
		return micr_noinputs;
	}
	private JTextField getPin_noinputs() {
		if (pin_noinputs == null) {
			pin_noinputs = new JTextField();
			pin_noinputs.setColumns(10);
			pin_noinputs.setBounds(526, 133, 184, 27);
		}
		return pin_noinputs;
	}
	private JComboBox getCmbac_types() {
		if (cmbac_types == null) {
			cmbac_types = new JComboBox();
			cmbac_types.setFont(new Font("Arial Black", Font.BOLD, 12));
			cmbac_types.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Account--- ]", "Saving Account", "Current Account", "Salary Account", "Fixed Deposite Account"}));
			cmbac_types.setBounds(526, 179, 184, 27);
		}
		return cmbac_types;
	}
	private JLabel getLblNewLabel_1_2_1_1() {
		if (lblNewLabel_1_2_1_1 == null) {
			lblNewLabel_1_2_1_1 = new JLabel("Gender");
			lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_1.setBounds(400, 222, 78, 27);
		}
		return lblNewLabel_1_2_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_3_1_1() {
		if (lblNewLabel_1_1_1_3_1_1 == null) {
			lblNewLabel_1_1_1_3_1_1 = new JLabel("Account Type");
			lblNewLabel_1_1_1_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1_1.setBounds(400, 180, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1_1;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("Pin No.");
			lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(400, 133, 116, 27);
		}
		return lblNewLabel_1_2_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("MICR No.");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(400, 86, 116, 27);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Account No.");
			lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_3.setBounds(400, 38, 116, 27);
		}
		return lblNewLabel_1_3;
	}
	private JTextField getAnswer_qsntinputs() {
		if (answer_qsntinputs == null) {
			answer_qsntinputs = new JTextField();
			answer_qsntinputs.setColumns(10);
			answer_qsntinputs.setBounds(526, 270, 184, 27);
		}
		return answer_qsntinputs;
	}
	private JLabel getLblNewLabel_1_2_1_2() {
		if (lblNewLabel_1_2_1_2 == null) {
			lblNewLabel_1_2_1_2 = new JLabel("Sec Question");
			lblNewLabel_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_2.setBounds(400, 270, 116, 27);
		}
		return lblNewLabel_1_2_1_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(24, 118, 762, 43);
		}
		return separator;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Account ac = new Account();
					
					ac.setFullname(fullname.getText());
					ac.setNumber(number.getText());
					ac.setAddress(address.getText());
					ac.setUsername(usernameinputs.getText());
					ac.setDob(new Date(dobinputs.getDate().getTime()));
					ac.setReligions(cmbreligious.getSelectedItem().toString());
					
					ac.setAac_no(acc_noinputs.getText());
					ac.setMicr_no(micr_noinputs.getText());
					ac.setPinno(Integer.parseInt(pin_noinputs.getText()));
					ac.setAcc_type(cmbac_types.getSelectedItem().toString());
					ac.setGender(cmb_genders.getSelectedItem().toString());
					ac.setSec_ans(answer_qsntinputs.getText());
					
//					System.out.println(fullname.getText());
//					System.out.println(number.getText());
//					System.out.println(address.getText());
//					System.out.println(usernameinputs.getText());
//					System.out.println(dobinputs.getDate().getTime());
//					System.out.println(cmbreligious.getSelectedItem().toString());
//					System.out.println(acc_noinputs.getText());
//					System.out.println(micr_noinputs.getText());
//					System.out.println(pin_noinputs.getText());
//					System.out.println(cmbac_types.getSelectedItem().toString());
//					System.out.println(cmb_genders.getSelectedItem().toString());
//					System.out.println(answer_qsntinputs.getText());
					
					Account_Service acs = new Account_Service_empl();
					boolean upd_res = acs.UpdAcc(ac);
					
					if(upd_res) {
						JOptionPane.showMessageDialog(null, "Account Update Sucessfull !!");
						new Home_Page().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Update Account !!");
					}	
				}
			});
			btnSave.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSave.setBounds(594, 338, 116, 48);
		}
		return btnSave;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Edit");
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_1_1.setBounds(424, 338, 116, 48);
		}
		return btnNewButton_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4() {
		if (lblNewLabel_1_1_1_4 == null) {
			lblNewLabel_1_1_1_4 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4.setBounds(119, 24, 143, 27);
		}
		return lblNewLabel_1_1_1_4;
	}
	private JTextField getDacc_noinput() {
		if (dacc_noinput == null) {
			dacc_noinput = new JTextField();
			dacc_noinput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			dacc_noinput.setColumns(10);
			dacc_noinput.setBounds(332, 24, 265, 27);
		}
		return dacc_noinput;
	}
	private JLabel getLblNewLabel_1_1_1_4_1() {
		if (lblNewLabel_1_1_1_4_1 == null) {
			lblNewLabel_1_1_1_4_1 = new JLabel("Available Balance");
			lblNewLabel_1_1_1_4_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1.setBounds(119, 186, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1;
	}
	private JTextField getD_av_balance() {
		if (d_av_balance == null) {
			d_av_balance = new JTextField();
			d_av_balance.setEnabled(false);
			d_av_balance.setColumns(10);
			d_av_balance.setBounds(332, 186, 265, 27);
		}
		return d_av_balance;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1() {
		if (lblNewLabel_1_1_1_4_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1 = new JLabel("Deposite Amount");
			lblNewLabel_1_1_1_4_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1.setBounds(119, 319, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1_1;
	}
	private JTextField getDdeposite_amount() {
		if (ddeposite_amount == null) {
			ddeposite_amount = new JTextField();
			ddeposite_amount.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			ddeposite_amount.setColumns(10);
			ddeposite_amount.setBounds(332, 319, 184, 27);
		}
		return ddeposite_amount;
	}
	private JTextField getDtotal_amount() {
		if (dtotal_amount == null) {
			dtotal_amount = new JTextField();
			dtotal_amount.setEnabled(false);
			dtotal_amount.setColumns(10);
			dtotal_amount.setBounds(537, 319, 87, 27);
		}
		return dtotal_amount;
	}
	private JButton getBtnTotal() {
		if (btnTotal == null) {
			btnTotal = new JButton("Total");
			btnTotal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(ddeposite_name.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Depositer Name");
					}
					if(ddeposite_num.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Depositer Number");
					}
					if(ddeposite_amount.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Deposite Amount");
					}
					
					
					int deposite_amount = Integer.parseInt(ddeposite_amount.getText());
					
					Account_Service accs = new Account_Service_empl();
					Account ac = accs.getAccById(eid);
							
					int av_balance = ac.getBalance();
					int total_balance = (av_balance + deposite_amount);
					
					if(total_balance < av_balance) {
						JOptionPane.showMessageDialog(null, "Please Deposite Correct Amount ");
						dtotal_amount.setText("");
					}else {
						dtotal_amount.setText(String.valueOf(total_balance));
					}
					
					
				}
			});
			btnTotal.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnTotal.setBounds(650, 317, 81, 30);
		}
		return btnTotal;
	}
	private JButton getBtnDeposite() {
		if (btnDeposite == null) {
			btnDeposite = new JButton("Deposite");
			btnDeposite.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(dacc_noinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Account Number ");
						return;
					}
					if(dacc_noinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Click Search Button to get Acc Number Data ");
						return;
					}					
					if(ddeposite_name.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Depositer Name ");
						return;
					}
					if(ddeposite_num.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Depositer Number ");
						return;
					}
					if(ddeposite_amount.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Deposite Amount ");
						return;
					}
					if(dtotal_amount.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Click Total Button to get Total Amount ");
						return;
					}
					
					String d_acc_no = dacc_noinput.getText();
					
					Deposite dep = new Deposite();
					
					dep.setAcc_no(dacc_noinput.getText());
					dep.setFullname(dfullname.getText());
					dep.setUsername(dusername.getText());
					dep.setNumber(dnumber.getText());
					dep.setAv_balance(Integer.parseInt(d_av_balance.getText()));
					dep.setDep_name(ddeposite_name.getText());
					dep.setDep_num(ddeposite_num.getText());
					dep.setDep_amount(Integer.parseInt(ddeposite_amount.getText()));
					dep.setTotal_amount(Integer.parseInt(dtotal_amount.getText()));
					
					Deposite_Service ds = new Deposite_Service_empl();
					boolean res = ds.Add_Deposite_Amount(dep);
					
					if(res) {
						JOptionPane.showMessageDialog(null, "Deposite Amount Success");
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Deposite Amount");
					}
					
					// Update Account Balances
					Account ac = new Account();
					
					ac.setAac_no(d_acc_no);
					ac.setBalance(Integer.parseInt(d_av_balance.getText())+Integer.parseInt(ddeposite_amount.getText()));
					
					Account_Service acs = new Account_Service_empl();
					acs.Upd_balance(ac);
					
					new Home_Page().setVisible(true);
					dispose();
					
				}
			});
			btnDeposite.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnDeposite.setBounds(358, 372, 124, 42);
		}
		return btnDeposite;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1.setBounds(119, 63, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1 = new JLabel("User Name");
			lblNewLabel_1_1_1_4_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1.setBounds(119, 103, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1_4_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1.setBounds(119, 144, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel(":");
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2.setBounds(295, 24, 26, 27);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel(":");
			lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1.setBounds(295, 63, 26, 27);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel(":");
			lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1.setBounds(295, 103, 26, 27);
		}
		return lblNewLabel_2_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1_1 == null) {
			lblNewLabel_2_1_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1.setBounds(295, 144, 26, 27);
		}
		return lblNewLabel_2_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1.setBounds(295, 186, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_1.setBounds(295, 319, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_1;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_Deposite = dacc_noinput.getText().trim();
					
					if(s_Deposite.isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Account Number !!");
						return;
					}
					
					Account_Service acs = new Account_Service_empl();
					acs.getAccById(s_Deposite);
		
					Display_Deposite_Balances(s_Deposite);
					
				}
			});
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch.setBounds(620, 21, 113, 30);
		}
		return btnSearch;
	}
	private JLabel getDfullname() {
		if (dfullname == null) {
			dfullname = new JLabel("");
			dfullname.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			dfullname.setFont(new Font("Arial Black", Font.BOLD, 14));
			dfullname.setBounds(332, 61, 265, 27);
		}
		return dfullname;
	}
	private JLabel getDusername() {
		if (dusername == null) {
			dusername = new JLabel("");
			dusername.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			dusername.setFont(new Font("Arial Black", Font.BOLD, 14));
			dusername.setBounds(332, 103, 265, 27);
		}
		return dusername;
	}
	private JLabel getDnumber() {
		if (dnumber == null) {
			dnumber = new JLabel("");
			dnumber.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			dnumber.setFont(new Font("Arial Black", Font.BOLD, 14));
			dnumber.setBounds(332, 144, 265, 27);
		}
		return dnumber;
	}
	private JButton getBtnTotal_1() {
		if (btnTotal_1 == null) {
			btnTotal_1 = new JButton("Total");
			btnTotal_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(ttransfer_amount.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Transfer Amount");
					}
					
					
// --------------- Get Available Amount From Database -------------------		
					
					int trans_amount = Integer.parseInt(ttransfer_amount.getText());
					
					Account_Service accs = new Account_Service_empl();
					Account ac = accs.getAccById(eid);
							
					int av_amount = ac.getBalance();
					int total_amount = av_amount - trans_amount;
					
					if(trans_amount > av_amount) {
						JOptionPane.showMessageDialog(null, "Transfer Amount is greater Than Available Amount");
						trans_total_amount.setText(" ");
					}
					else {
						trans_total_amount.setText(String.valueOf(total_amount));
					}
					
					tc_transfer_balance.setText(String.valueOf(trans_amount));
					
				}
			});
			btnTotal_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnTotal_1.setBounds(622, 162, 81, 30);
		}
		return btnTotal_1;
	}
	private JTextField getTrans_total_amount() {
		if (trans_total_amount == null) {
			trans_total_amount = new JTextField();
			trans_total_amount.setColumns(10);
			trans_total_amount.setBounds(507, 162, 87, 27);
		}
		return trans_total_amount;
	}
	private JTextField getTtransfer_amount() {
		if (ttransfer_amount == null) {
			ttransfer_amount = new JTextField();
			ttransfer_amount.setColumns(10);
			ttransfer_amount.setBounds(302, 162, 184, 27);
		}
		return ttransfer_amount;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_2 = new JLabel("Transfer Amount");
			lblNewLabel_1_1_1_4_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_2.setBounds(89, 162, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_2() {
		if (lblNewLabel_1_1_1_4_1_2 == null) {
			lblNewLabel_1_1_1_4_1_2 = new JLabel("Available Balance");
			lblNewLabel_1_1_1_4_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_2.setBounds(89, 117, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_3() {
		if (lblNewLabel_1_1_1_4_1_1_1_3 == null) {
			lblNewLabel_1_1_1_4_1_1_1_3 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_3.setBounds(89, 80, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_2() {
		if (lblNewLabel_1_1_1_4_2 == null) {
			lblNewLabel_1_1_1_4_2 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_2.setBounds(89, 40, 143, 27);
		}
		return lblNewLabel_1_1_1_4_2;
	}
	private JLabel getTfullname() {
		if (tfullname == null) {
			tfullname = new JLabel("");
			tfullname.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			tfullname.setFont(new Font("Arial Black", Font.BOLD, 14));
			tfullname.setBounds(302, 78, 252, 27);
		}
		return tfullname;
	}
	private JTextField getTav_balance() {
		if (tav_balance == null) {
			tav_balance = new JTextField();
			tav_balance.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			tav_balance.setColumns(10);
			tav_balance.setBounds(302, 117, 252, 27);
		}
		return tav_balance;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_2() {
		if (lblNewLabel_2_1_1_1_1_2 == null) {
			lblNewLabel_2_1_1_1_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_2.setBounds(265, 117, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_1_1.setBounds(265, 162, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_2() {
		if (lblNewLabel_2_1_2 == null) {
			lblNewLabel_2_1_2 = new JLabel(":");
			lblNewLabel_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_2.setBounds(265, 80, 26, 27);
		}
		return lblNewLabel_2_1_2;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel(":");
			lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2.setBounds(265, 40, 26, 27);
		}
		return lblNewLabel_2_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_2_1() {
		if (lblNewLabel_1_1_1_4_2_1 == null) {
			lblNewLabel_1_1_1_4_2_1 = new JLabel("Credit Account");
			lblNewLabel_1_1_1_4_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_2_1.setBounds(89, 255, 143, 27);
		}
		return lblNewLabel_1_1_1_4_2_1;
	}
	private JTextField getTc_acc_no() {
		if (tc_acc_no == null) {
			tc_acc_no = new JTextField();
			tc_acc_no.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			tc_acc_no.setColumns(10);
			tc_acc_no.setBounds(302, 255, 184, 27);
		}
		return tc_acc_no;
	}
	private JLabel getLblNewLabel_2_2_1() {
		if (lblNewLabel_2_2_1 == null) {
			lblNewLabel_2_2_1 = new JLabel(":");
			lblNewLabel_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2_1.setBounds(265, 255, 26, 27);
		}
		return lblNewLabel_2_2_1;
	}
	private JButton getBtnSearch_1_1() {
		if (btnSearch_1_1 == null) {
			btnSearch_1_1 = new JButton("Search");
			btnSearch_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String S_Credit_acc_no = tc_acc_no.getText().trim();
					
					Account_Service acs = new Account_Service_empl();
					acs.getAccById(S_Credit_acc_no);
					Display_Credit_Transfer_Balances(S_Credit_acc_no);
					
				}
			});
			btnSearch_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_1.setBounds(502, 253, 113, 30);
		}
		return btnSearch_1_1;
	}
	private JLabel getTc_fullname() {
		if (tc_fullname == null) {
			tc_fullname = new JLabel("");
			tc_fullname.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			tc_fullname.setFont(new Font("Arial Black", Font.BOLD, 14));
			tc_fullname.setBounds(302, 292, 184, 27);
		}
		return tc_fullname;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_3_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_3_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_3_1 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_3_1.setBounds(89, 294, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_3_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1.setBounds(89, 329, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_1_1;
	}
	private JLabel getTc_number() {
		if (tc_number == null) {
			tc_number = new JLabel("");
			tc_number.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			tc_number.setFont(new Font("Arial Black", Font.BOLD, 14));
			tc_number.setBounds(302, 329, 184, 27);
		}
		return tc_number;
	}
	private JLabel getLblNewLabel_2_2_1_1() {
		if (lblNewLabel_2_2_1_1 == null) {
			lblNewLabel_2_2_1_1 = new JLabel(":");
			lblNewLabel_2_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2_1_1.setBounds(265, 292, 26, 27);
		}
		return lblNewLabel_2_2_1_1;
	}
	private JLabel getLblNewLabel_2_2_1_1_1() {
		if (lblNewLabel_2_2_1_1_1 == null) {
			lblNewLabel_2_2_1_1_1 = new JLabel(":");
			lblNewLabel_2_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2_1_1_1.setBounds(265, 329, 26, 27);
		}
		return lblNewLabel_2_2_1_1_1;
	}
	private JTextField getTc_transfer_balance() {
		if (tc_transfer_balance == null) {
			tc_transfer_balance = new JTextField();
			tc_transfer_balance.setColumns(10);
			tc_transfer_balance.setBounds(302, 366, 184, 27);
		}
		return tc_transfer_balance;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1 = new JLabel("Transfer Balance");
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1.setBounds(89, 366, 143, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_2_2_1_1_1_1() {
		if (lblNewLabel_2_2_1_1_1_1 == null) {
			lblNewLabel_2_2_1_1_1_1 = new JLabel(":");
			lblNewLabel_2_2_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2_1_1_1_1.setBounds(265, 366, 26, 27);
		}
		return lblNewLabel_2_2_1_1_1_1;
	}
	private JButton getBtnSearch_1_1_1() {
		if (btnSearch_1_1_1 == null) {
			btnSearch_1_1_1 = new JButton("Transfer");
			btnSearch_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(tacc_no.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Transfer Account Number ");
						return;
					}
					
					if(ttransfer_amount.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Transfer Amount ");
						return;
					}
					if(tc_acc_no.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Credit Transfer Account Number ");
						return;
					}
					if(trans_total_amount.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Click Total Button to get Total Amount ");
						return;
					}
					
					// ------------ Validate A Transfer Account Number
					String t_acc_no = tacc_no.getText();
					String c_acc_no = tc_acc_no.getText();
					
					if(t_acc_no.equals(c_acc_no)) {
						JOptionPane.showMessageDialog(null, "You Can't Transfer Money in the Same Account !! Please Enter Another Account Number");
					}else {
					
					// ------ transfer and Insert Data in Database -----------
						
						Transfer tf = new Transfer();
						
						tf.setTacc_no(tacc_no.getText());
						tf.setTfullname(tfullname.getText());
						tf.setTav_balance(Integer.parseInt(tav_balance.getText()));
						tf.setTtransfer_amount(Integer.parseInt(ttransfer_amount.getText()));
						tf.setTtotal_amount(Integer.parseInt(trans_total_amount.getText()));
						
						tf.setCacc_no(tc_acc_no.getText());
						tf.setCfullname(tc_fullname.getText());
						tf.setCnumber(tc_number.getText());
						tf.setCtransfer_balance(Integer.parseInt(tc_transfer_balance.getText()));
						
						Transfer_Service ts = new Transfer_Service_empl();
						boolean res = ts.Add_Transfer_Balance(tf);
						
						if(res) {
							JOptionPane.showMessageDialog(null, "Amount Transfer Success");
						}else {
							JOptionPane.showMessageDialog(null, "Failed to Transfer Amount");
						}
						
						
					// ------------------ Transfer Money and Update Balance --------------
						
						Account ac = new Account();
						
						ac.setAac_no(t_acc_no);
						ac.setBalance(Integer.parseInt(trans_total_amount.getText()));
						
						Account_Service acs = new Account_Service_empl();
						acs.Upd_balance(ac);
					
					// ------------------ End Transfer Money and Update Balance --------------
					
					// Update Balance of Credit account number
					
//						System.out.println(trans_and_upd_bal);
						
						Account act = new Account();
						
						act.setAac_no(c_acc_no);
						act.setBalance(Integer.parseInt(ttransfer_amount.getText()) + trans_and_upd_bal);
						
						Account_Service acst = new Account_Service_empl();
						acst.Upd_balance(act);
						
						new Home_Page().setVisible(true);
						dispose();
						
				   }	
				}
			});
			btnSearch_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_1_1.setBounds(502, 363, 113, 30);
		}
		return btnSearch_1_1_1;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(89, 225, 618, 42);
		}
		return separator_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_3() {
		if (lblNewLabel_1_1_1_4_3 == null) {
			lblNewLabel_1_1_1_4_3 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_3.setBounds(100, 36, 143, 27);
		}
		return lblNewLabel_1_1_1_4_3;
	}
	private JTextField getWacc_no() {
		if (wacc_no == null) {
			wacc_no = new JTextField();
			wacc_no.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			wacc_no.setColumns(10);
			wacc_no.setBounds(313, 36, 248, 27);
		}
		return wacc_no;
	}
	private JButton getBtnSearch_1() {
		if (btnSearch_1 == null) {
			btnSearch_1 = new JButton("Search");
			btnSearch_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_withdrawal = wacc_no.getText().trim();
					
					if(s_withdrawal.isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Account Number !!");
						return;
					}
					
					Account_Service acs = new Account_Service_empl();
					acs.getAccById(s_withdrawal);
					Display_Withdrawal_Balances(s_withdrawal);
					
				}
			});
			btnSearch_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1.setBounds(590, 34, 113, 30);
		}
		return btnSearch_1;
	}
	private JLabel getWfullname() {
		if (wfullname == null) {
			wfullname = new JLabel("");
			wfullname.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			wfullname.setEnabled(false);
			wfullname.setFont(new Font("Arial Black", Font.BOLD, 14));
			wfullname.setBounds(313, 73, 248, 27);
		}
		return wfullname;
	}
	private JLabel getWusername() {
		if (wusername == null) {
			wusername = new JLabel("");
			wusername.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			wusername.setEnabled(false);
			wusername.setFont(new Font("Arial Black", Font.BOLD, 14));
			wusername.setBounds(313, 115, 248, 27);
		}
		return wusername;
	}
	private JLabel getWnumber() {
		if (wnumber == null) {
			wnumber = new JLabel("");
			wnumber.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			wnumber.setEnabled(false);
			wnumber.setFont(new Font("Arial Black", Font.BOLD, 14));
			wnumber.setBounds(313, 156, 248, 27);
		}
		return wnumber;
	}
	private JTextField getWavbalance() {
		if (wavbalance == null) {
			wavbalance = new JTextField();
			wavbalance.setEnabled(false);
			wavbalance.setColumns(10);
			wavbalance.setBounds(313, 200, 184, 27);
		}
		return wavbalance;
	}
	private JTextField getWwithamoun() {
		if (wwithamoun == null) {
			wwithamoun = new JTextField();
			wwithamoun.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			wwithamoun.setColumns(10);
			wwithamoun.setBounds(313, 246, 184, 27);
		}
		return wwithamoun;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_3() {
		if (lblNewLabel_2_1_1_1_1_3 == null) {
			lblNewLabel_2_1_1_1_1_3 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_3.setBounds(276, 200, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_3;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1_2() {
		if (lblNewLabel_2_1_1_1_1_1_2 == null) {
			lblNewLabel_2_1_1_1_1_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_1_2.setBounds(276, 246, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_1_2() {
		if (lblNewLabel_2_1_1_1_2 == null) {
			lblNewLabel_2_1_1_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_2.setBounds(276, 156, 26, 27);
		}
		return lblNewLabel_2_1_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_2() {
		if (lblNewLabel_2_1_1_2 == null) {
			lblNewLabel_2_1_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_2.setBounds(276, 115, 26, 27);
		}
		return lblNewLabel_2_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_3() {
		if (lblNewLabel_2_1_3 == null) {
			lblNewLabel_2_1_3 = new JLabel(":");
			lblNewLabel_2_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_3.setBounds(276, 75, 26, 27);
		}
		return lblNewLabel_2_1_3;
	}
	private JLabel getLblNewLabel_2_3() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel(":");
			lblNewLabel_2_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_3.setBounds(276, 36, 26, 27);
		}
		return lblNewLabel_2_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_4() {
		if (lblNewLabel_1_1_1_4_1_1_1_4 == null) {
			lblNewLabel_1_1_1_4_1_1_1_4 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_4.setBounds(100, 75, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_4;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_2 = new JLabel("User Name");
			lblNewLabel_1_1_1_4_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_2.setBounds(100, 115, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1_4_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_1.setBounds(100, 156, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_3() {
		if (lblNewLabel_1_1_1_4_1_3 == null) {
			lblNewLabel_1_1_1_4_1_3 = new JLabel("Available Balance");
			lblNewLabel_1_1_1_4_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_3.setBounds(100, 200, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_3() {
		if (lblNewLabel_1_1_1_4_1_1_3 == null) {
			lblNewLabel_1_1_1_4_1_1_3 = new JLabel("Withdrawal Amount");
			lblNewLabel_1_1_1_4_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_3.setBounds(100, 246, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_3_1() {
		if (lblNewLabel_1_1_1_4_1_1_3_1 == null) {
			lblNewLabel_1_1_1_4_1_1_3_1 = new JLabel("Total Amount");
			lblNewLabel_1_1_1_4_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_3_1.setBounds(100, 296, 121, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_3_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1_2_1() {
		if (lblNewLabel_2_1_1_1_1_1_2_1 == null) {
			lblNewLabel_2_1_1_1_1_1_2_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_1_2_1.setBounds(276, 296, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_1_2_1;
	}
	private JTextField getWtotalamount() {
		if (wtotalamount == null) {
			wtotalamount = new JTextField();
			wtotalamount.setEnabled(false);
			wtotalamount.setColumns(10);
			wtotalamount.setBounds(313, 296, 184, 27);
		}
		return wtotalamount;
	}
	private JButton getBtnSearch_1_2() {
		if (btnSearch_1_2 == null) {
			btnSearch_1_2 = new JButton("Total");
			btnSearch_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(wwithamoun.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Withdrawal Amount");
					}
					
					int with_amount =Integer.parseInt( wwithamoun.getText());
		
			// --------- Get balance Data from Database -------------------
					
					Account_Service accs = new Account_Service_empl();
					Account ac = accs.getAccById(eid);
					
					int getav_Balance = ac.getBalance();
										
					if(with_amount > getav_Balance ) {
						JOptionPane.showMessageDialog(null, "Withdrawal Amount is Greatter than Available Balance");
						wtotalamount.setText("");
					}else {
						wtotalamount.setText(String.valueOf(getav_Balance-with_amount));					
					}
					
				}
			});
			btnSearch_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_2.setBounds(551, 296, 113, 30);
		}
		return btnSearch_1_2;
	}
	private JButton getBtnSearch_1_2_1() {
		if (btnSearch_1_2_1 == null) {
			btnSearch_1_2_1 = new JButton("Withdrawal");
			btnSearch_1_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(wacc_no.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Account Number !! ");
						return;
					}
					if(wacc_no.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Click Search Button to get Acc Number Data ");
						return;
					}
					if(wwithamoun.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Amount");
						return;
					}
					if(wtotalamount.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Click Total Button to get Total Amount ");
						return;
					}
					
					Withdrawal with = new Withdrawal();
					
					with.setAcc_number(wacc_no.getText());
					with.setFullname(wfullname.getText());
					with.setUsername(wusername.getText());
					with.setNumber(wnumber.getText());
					with.setAv_balance(Integer.parseInt(wavbalance.getText()));
					with.setWith_balance(Integer.parseInt(wwithamoun.getText()));
					with.setTotal_amount(Integer.parseInt(wtotalamount.getText()));
					
					Withdrawal_Service ws = new Withdrawal_Service_empl();
					boolean res = ws.Add_Withdrawa_Amount(with);
					
					if(res) {
						JOptionPane.showMessageDialog(null, "Withdrawal Success");
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Withdrawal");
					}
					
			// ------------------ Withdraw Money and Update Balance --------------
					String with_bal = wacc_no.getText();
					
					Account ac = new Account();
					
					ac.setAac_no(with_bal);
					ac.setBalance(Integer.parseInt(wtotalamount.getText()));
					
					Account_Service acss = new Account_Service_empl();
					acss.Upd_balance(ac);
				  
			// ------------------------- End Withdraw Money and Update Balance  ------
					
					new Home_Page().setVisible(true);
					dispose();
					
				}
			});
			btnSearch_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnSearch_1_2_1.setBounds(313, 354, 184, 51);
		}
		return btnSearch_1_2_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 49, 739, 360);
			scrollPane.setViewportView(getCustomerTable());
		}
		return scrollPane;
	}
	private JTable getCustomerTable() {
		if (customerTable == null) {
			customerTable = new JTable();
			customerTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Acc_No", "Full Name", "DOB", "Acc_Type", "Gender", "Mobile_No", "Address"
				}
			));
		}
		return customerTable;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 49, 739, 389);
			scrollPane_1.setViewportView(getTransfer_table());
		}
		return scrollPane_1;
	}
	private JTable getTransfer_table() {
		if (transfer_table == null) {
			transfer_table = new JTable();
			transfer_table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"T_ID", "T_Acc_no", "T_FullName", "T_Av_Balance", "T_Transfer_Amount", "T_Total_Amount", "C_Acc_No", "C_FullName", "C_Number", "C_Transfer_Amount"
				}
			));
		}
		return transfer_table;
	}
	private JLabel getLblNewLabel_1_1_1_4_4() {
		if (lblNewLabel_1_1_1_4_4 == null) {
			lblNewLabel_1_1_1_4_4 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_4.setBounds(109, 37, 143, 27);
		}
		return lblNewLabel_1_1_1_4_4;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_5() {
		if (lblNewLabel_1_1_1_4_1_1_1_5 == null) {
			lblNewLabel_1_1_1_4_1_1_1_5 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_5.setBounds(109, 82, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_5;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_3() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_3 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_3 = new JLabel("User Name");
			lblNewLabel_1_1_1_4_1_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_3.setBounds(109, 125, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2 = new JLabel("MICR No");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2.setBounds(109, 162, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_1_3() {
		if (lblNewLabel_2_1_1_1_3 == null) {
			lblNewLabel_2_1_1_1_3 = new JLabel(":");
			lblNewLabel_2_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3.setBounds(320, 162, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3;
	}
	private JLabel getLblNewLabel_2_1_1_3() {
		if (lblNewLabel_2_1_1_3 == null) {
			lblNewLabel_2_1_1_3 = new JLabel(":");
			lblNewLabel_2_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_3.setBounds(320, 125, 26, 27);
		}
		return lblNewLabel_2_1_1_3;
	}
	private JLabel getLblNewLabel_2_1_4() {
		if (lblNewLabel_2_1_4 == null) {
			lblNewLabel_2_1_4 = new JLabel(":");
			lblNewLabel_2_1_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_4.setBounds(320, 85, 26, 27);
		}
		return lblNewLabel_2_1_4;
	}
	private JLabel getLblNewLabel_2_4() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel(":");
			lblNewLabel_2_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_4.setBounds(320, 37, 26, 27);
		}
		return lblNewLabel_2_4;
	}
	private JTextField getVS_ac_no() {
		if (vS_ac_no == null) {
			vS_ac_no = new JTextField();
			vS_ac_no.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			vS_ac_no.setColumns(10);
			vS_ac_no.setBounds(376, 37, 214, 27);
		}
		return vS_ac_no;
	}
	private JLabel getVfullname() {
		if (vfullname == null) {
			vfullname = new JLabel("");
			vfullname.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			vfullname.setFont(new Font("Arial Black", Font.BOLD, 14));
			vfullname.setBounds(376, 83, 214, 27);
		}
		return vfullname;
	}
	private JLabel getVusername() {
		if (vusername == null) {
			vusername = new JLabel("");
			vusername.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			vusername.setFont(new Font("Arial Black", Font.BOLD, 14));
			vusername.setBounds(376, 125, 214, 27);
		}
		return vusername;
	}
	private JLabel getVmicrno() {
		if (vmicrno == null) {
			vmicrno = new JLabel("");
			vmicrno.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			vmicrno.setFont(new Font("Arial Black", Font.BOLD, 14));
			vmicrno.setBounds(376, 162, 214, 27);
		}
		return vmicrno;
	}
	private JButton getBtnSearch_2() {
		if (btnSearch_2 == null) {
			btnSearch_2 = new JButton("Search");
			btnSearch_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String vSearch_acc = vS_ac_no.getText().trim();
					
					if(vSearch_acc.isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Account Number !!");
						return;
					}
					
					Account_Service acs = new Account_Service_empl();
					acs.getAccById(vSearch_acc);
					
					Display_Balances(vSearch_acc);
								
	// --------------------- View And Set Balances -------------------------
					
					int rate = Integer.parseInt(vrate_of_intrest.getText());
					Account_Service accs = new Account_Service_empl();
					Account ac = accs.getAccById(eid);
					
					int get_balances = ac.getBalance();
					double total_balances = (rate* 0.083 *get_balances)/100;
					System.out.println(total_balances);
					
					vtotalbalances.setText(String.valueOf(get_balances+total_balances));
					
				}
			});
			btnSearch_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_2.setBounds(620, 34, 113, 30);
		}
		return btnSearch_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1 = new JLabel("Rate of Intrest ( % ) ");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1.setBounds(109, 199, 174, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_3_1() {
		if (lblNewLabel_2_1_1_1_3_1 == null) {
			lblNewLabel_2_1_1_1_3_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3_1.setBounds(320, 199, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3_1;
	}
	private JLabel getVrate_of_intrest() {
		if (vrate_of_intrest == null) {
			vrate_of_intrest = new JLabel("5");
			vrate_of_intrest.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			vrate_of_intrest.setFont(new Font("Arial Black", Font.BOLD, 14));
			vrate_of_intrest.setBounds(376, 199, 214, 27);
		}
		return vrate_of_intrest;
	}
	private JLabel getVbalances() {
		if (vbalances == null) {
			vbalances = new JLabel("");
			vbalances.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			vbalances.setFont(new Font("Arial Black", Font.BOLD, 14));
			vbalances.setBounds(376, 236, 214, 27);
		}
		return vbalances;
	}
	private JLabel getLblNewLabel_2_1_1_1_3_1_1() {
		if (lblNewLabel_2_1_1_1_3_1_1 == null) {
			lblNewLabel_2_1_1_1_3_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3_1_1.setBounds(320, 236, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1 = new JLabel("Available Balance");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1.setBounds(109, 236, 162, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1;
	}
	private JLabel getVtotalbalances() {
		if (vtotalbalances == null) {
			vtotalbalances = new JLabel("");
			vtotalbalances.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			vtotalbalances.setFont(new Font("Arial Black", Font.BOLD, 14));
			vtotalbalances.setBounds(376, 273, 214, 27);
		}
		return vtotalbalances;
	}
	private JLabel getLblNewLabel_2_1_1_1_3_1_2() {
		if (lblNewLabel_2_1_1_1_3_1_2 == null) {
			lblNewLabel_2_1_1_1_3_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_1_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3_1_2.setBounds(320, 273, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2 = new JLabel("MOD Balance");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2.setBounds(109, 273, 174, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2;
	}
	private JLabel getVnomination() {
		if (vnomination == null) {
			vnomination = new JLabel("");
			vnomination.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			vnomination.setFont(new Font("Arial Black", Font.BOLD, 14));
			vnomination.setBounds(376, 310, 214, 27);
		}
		return vnomination;
	}
	private JLabel getLblNewLabel_2_1_1_1_3_1_2_1() {
		if (lblNewLabel_2_1_1_1_3_1_2_1 == null) {
			lblNewLabel_2_1_1_1_3_1_2_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_3_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3_1_2_1.setBounds(320, 310, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1 = new JLabel("Nomination Registered");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1.setBounds(109, 310, 202, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_5() {
		if (lblNewLabel_1_1_1_4_5 == null) {
			lblNewLabel_1_1_1_4_5 = new JLabel("Enter Old Pin");
			lblNewLabel_1_1_1_4_5.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5.setBounds(100, 118, 143, 27);
		}
		return lblNewLabel_1_1_1_4_5;
	}
	private JTextField getOldpininput() {
		if (oldpininput == null) {
			oldpininput = new JTextField();
			oldpininput.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			oldpininput.setEnabled(false);
			oldpininput.setColumns(10);
			oldpininput.setBounds(271, 118, 300, 27);
		}
		return oldpininput;
	}
	private JLabel getLblNewLabel_1_1_1_4_5_1() {
		if (lblNewLabel_1_1_1_4_5_1 == null) {
			lblNewLabel_1_1_1_4_5_1 = new JLabel("Customer Number");
			lblNewLabel_1_1_1_4_5_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5_1.setBounds(100, 176, 161, 27);
		}
		return lblNewLabel_1_1_1_4_5_1;
	}
	private JTextField getC_Customer_Number() {
		if (C_Customer_Number == null) {
			C_Customer_Number = new JTextField();
			C_Customer_Number.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			C_Customer_Number.setEnabled(false);
			C_Customer_Number.setColumns(10);
			C_Customer_Number.setBounds(271, 176, 300, 27);
		}
		return C_Customer_Number;
	}
	private JLabel getLblNewLabel_1_1_1_4_5_2() {
		if (lblNewLabel_1_1_1_4_5_2 == null) {
			lblNewLabel_1_1_1_4_5_2 = new JLabel("Set New Pin");
			lblNewLabel_1_1_1_4_5_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5_2.setBounds(100, 235, 143, 27);
		}
		return lblNewLabel_1_1_1_4_5_2;
	}
	private JTextField getCnewpinininput() {
		if (cnewpinininput == null) {
			cnewpinininput = new JTextField();
			cnewpinininput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			cnewpinininput.setColumns(10);
			cnewpinininput.setBounds(271, 235, 300, 27);
		}
		return cnewpinininput;
	}
	private JButton getBtnSearch_2_1() {
		if (btnSearch_2_1 == null) {
			btnSearch_2_1 = new JButton("Change");
			btnSearch_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
									
					Account ac = new Account();
					
					ac.setAac_no(eid);
					ac.setRandom(Integer.parseInt(cnewpinininput.getText()));
					
					Account_Service accs = new Account_Service_empl();
					boolean res = accs.ChangePin(ac);
					
					if(res) {
						JOptionPane.showMessageDialog(null,"Pin No Changed Success");
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Changed Pin No");
					}	
					
				}
			});
			btnSearch_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch_2_1.setBounds(271, 309, 123, 41);
		}
		return btnSearch_2_1;
	}
	private JButton getBtnSearch_2_1_1() {
		if (btnSearch_2_1_1 == null) {
			btnSearch_2_1_1 = new JButton("Clear");
			btnSearch_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch_2_1_1.setBounds(448, 309, 123, 41);
		}
		return btnSearch_2_1_1;
	}
	private JPanel getPanel_1_1() {
		if (panel_1_1 == null) {
			panel_1_1 = new JPanel();
			panel_1_1.setLayout(null);
			panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1_1.setBounds(399, 16, 339, 201);
			panel_1_1.add(getLblName());
			panel_1_1.add(getLblSushantChaudhary());
			panel_1_1.add(getLblCsushantgmailcom());
			panel_1_1.add(getLblEmail_1());
			panel_1_1.add(getLblPhone_1());
			panel_1_1.add(getLblSushantChaudhary_1());
			panel_1_1.add(getLblSushantChaudhary_1_1());
			panel_1_1.add(getLblAdress());
			panel_1_1.add(getLblKalankiKathmandu());
			panel_1_1.add(getLblWebsite());
			panel_1_1.add(getLblSushantChaudhary_1_2());
		}
		return panel_1_1;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name   :- ");
			lblName.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblName.setBounds(15, 10, 86, 23);
		}
		return lblName;
	}
	private JLabel getLblSushantChaudhary() {
		if (lblSushantChaudhary == null) {
			lblSushantChaudhary = new JLabel("Sushant Chaudhary");
			lblSushantChaudhary.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary.setBounds(108, 10, 192, 23);
		}
		return lblSushantChaudhary;
	}
	private JLabel getLblCsushantgmailcom() {
		if (lblCsushantgmailcom == null) {
			lblCsushantgmailcom = new JLabel("csushant224@gmail.com");
			lblCsushantgmailcom.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblCsushantgmailcom.setBounds(108, 43, 205, 23);
		}
		return lblCsushantgmailcom;
	}
	private JLabel getLblEmail_1() {
		if (lblEmail_1 == null) {
			lblEmail_1 = new JLabel("Email   :- ");
			lblEmail_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblEmail_1.setBounds(15, 43, 86, 23);
		}
		return lblEmail_1;
	}
	private JLabel getLblPhone_1() {
		if (lblPhone_1 == null) {
			lblPhone_1 = new JLabel("Phone   :- ");
			lblPhone_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblPhone_1.setBounds(15, 76, 86, 23);
		}
		return lblPhone_1;
	}
	private JLabel getLblSushantChaudhary_1() {
		if (lblSushantChaudhary_1 == null) {
			lblSushantChaudhary_1 = new JLabel("9821224203");
			lblSushantChaudhary_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1.setBounds(110, 76, 132, 23);
		}
		return lblSushantChaudhary_1;
	}
	private JLabel getLblSushantChaudhary_1_1() {
		if (lblSushantChaudhary_1_1 == null) {
			lblSushantChaudhary_1_1 = new JLabel("9616680432");
			lblSushantChaudhary_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1_1.setBounds(110, 108, 132, 23);
		}
		return lblSushantChaudhary_1_1;
	}
	private JLabel getLblAdress() {
		if (lblAdress == null) {
			lblAdress = new JLabel("Adress :- ");
			lblAdress.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAdress.setBounds(15, 139, 86, 23);
		}
		return lblAdress;
	}
	private JLabel getLblKalankiKathmandu() {
		if (lblKalankiKathmandu == null) {
			lblKalankiKathmandu = new JLabel("Kalanki , Kathmandu");
			lblKalankiKathmandu.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblKalankiKathmandu.setBounds(108, 139, 192, 23);
		}
		return lblKalankiKathmandu;
	}
	private JLabel getLblWebsite() {
		if (lblWebsite == null) {
			lblWebsite = new JLabel("Website :- ");
			lblWebsite.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblWebsite.setBounds(15, 167, 86, 23);
		}
		return lblWebsite;
	}
	private JLabel getLblSushantChaudhary_1_2() {
		if (lblSushantChaudhary_1_2 == null) {
			lblSushantChaudhary_1_2 = new JLabel("www.dsp.com.np");
			lblSushantChaudhary_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1_2.setBounds(108, 167, 174, 23);
		}
		return lblSushantChaudhary_1_2;
	}
	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Social Media", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_9.setBounds(399, 224, 339, 185);
			panel_9.setLayout(null);
			panel_9.add(getLblNewLabel_3());
			panel_9.add(getLblNewLabel_3_1_1());
			panel_9.add(getLblNewLabel_3_1());
			panel_9.add(getLblNewLabel_3_1_1_1());
			panel_9.add(getLblNewLabel_3_1_2());
			panel_9.add(getLblNewLabel_3_1_1_1_1());
		}
		return panel_9;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Follow Me");
			lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_3.setBounds(36, 22, 84, 23);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_3_1_1() {
		if (lblNewLabel_3_1_1 == null) {
			lblNewLabel_3_1_1 = new JLabel("- www.facebook.com/dsp.1234");
			lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_3_1_1.setBounds(46, 46, 248, 23);
		}
		return lblNewLabel_3_1_1;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("Instagram");
			lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_3_1.setBounds(36, 78, 84, 23);
		}
		return lblNewLabel_3_1;
	}
	private JLabel getLblNewLabel_3_1_1_1() {
		if (lblNewLabel_3_1_1_1 == null) {
			lblNewLabel_3_1_1_1 = new JLabel("- www.instagram.com/dsp.1234");
			lblNewLabel_3_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_3_1_1_1.setBounds(46, 102, 248, 23);
		}
		return lblNewLabel_3_1_1_1;
	}
	private JLabel getLblNewLabel_3_1_2() {
		if (lblNewLabel_3_1_2 == null) {
			lblNewLabel_3_1_2 = new JLabel("Email");
			lblNewLabel_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_3_1_2.setBounds(36, 132, 84, 23);
		}
		return lblNewLabel_3_1_2;
	}
	private JLabel getLblNewLabel_3_1_1_1_1() {
		if (lblNewLabel_3_1_1_1_1 == null) {
			lblNewLabel_3_1_1_1_1 = new JLabel("- csushant224@gmail.com");
			lblNewLabel_3_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_3_1_1_1_1.setBounds(46, 152, 248, 23);
		}
		return lblNewLabel_3_1_1_1_1;
	}
	private JPanel getPanel_10() {
		if (panel_10 == null) {
			panel_10 = new JPanel();
			panel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_10.setBounds(10, 16, 373, 393);
			panel_10.setLayout(null);
			panel_10.add(getLblNewLabel_4());
		}
		return panel_10;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setBounds(5, 5, 363, 383);
			lblNewLabel_4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\sc1.jpg").getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), DO_NOTHING_ON_CLOSE)));
		}
		return lblNewLabel_4;
	}
	private JTextField getTacc_no() {
		if (tacc_no == null) {
			tacc_no = new JTextField();
			tacc_no.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			tacc_no.setColumns(10);
			tacc_no.setBounds(302, 40, 252, 27);
		}
		return tacc_no;
	}
	private JButton getBtnSearch_1_1_2() {
		if (btnSearch_1_1_2 == null) {
			btnSearch_1_1_2 = new JButton("Search");
			btnSearch_1_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String S_Transfer_Acc = tacc_no.getText().trim();
					
					Account_Service acs = new Account_Service_empl();
					acs.getAccById(S_Transfer_Acc);
					Display_Transfer_Balances(S_Transfer_Acc);	
									
				}
			});
			btnSearch_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_1_2.setBounds(580, 38, 113, 30);
		}
		return btnSearch_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_6() {
		if (lblNewLabel_1_1_1_4_1_1_1_6 == null) {
			lblNewLabel_1_1_1_4_1_1_1_6 = new JLabel("Depositer Number");
			lblNewLabel_1_1_1_4_1_1_1_6.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_6.setBounds(119, 282, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_6;
	}
	private JLabel getLblNewLabel_2_1_5() {
		if (lblNewLabel_2_1_5 == null) {
			lblNewLabel_2_1_5 = new JLabel(":");
			lblNewLabel_2_1_5.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_5.setBounds(295, 282, 26, 27);
		}
		return lblNewLabel_2_1_5;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_6_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_6_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_6_1 = new JLabel("Depositer Name");
			lblNewLabel_1_1_1_4_1_1_1_6_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_6_1.setBounds(119, 246, 143, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_6_1;
	}
	private JLabel getLblNewLabel_2_1_5_1() {
		if (lblNewLabel_2_1_5_1 == null) {
			lblNewLabel_2_1_5_1 = new JLabel(":");
			lblNewLabel_2_1_5_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_5_1.setBounds(295, 246, 26, 27);
		}
		return lblNewLabel_2_1_5_1;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setBounds(21, 232, 714, 13);
		}
		return separator_2;
	}
	private JTextField getDdeposite_name() {
		if (ddeposite_name == null) {
			ddeposite_name = new JTextField();
			ddeposite_name.setColumns(10);
			ddeposite_name.setBounds(332, 246, 184, 27);
		}
		return ddeposite_name;
	}
	private JTextField getDdeposite_num() {
		if (ddeposite_num == null) {
			ddeposite_num = new JTextField();
			ddeposite_num.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			ddeposite_num.setColumns(10);
			ddeposite_num.setBounds(332, 282, 184, 27);
		}
		return ddeposite_num;
	}
	private JPanel getMalebtn() {
		if (malebtn == null) {
			malebtn = new JPanel();
			malebtn.setLayout(null);
			malebtn.add(getLblNewLabel_1_2_1_2_1());
			malebtn.add(getCmbacctype());
			malebtn.add(getMicrinput());
			malebtn.add(getAcc_noinput());
			malebtn.add(getLblNewLabel_1_3_1());
			malebtn.add(getLblNewLabel_1_2_2());
			malebtn.add(getLblNewLabel_1_1_1_3_1_1_1());
			malebtn.add(getLblNewLabel_1_2_1_1_1());
			malebtn.add(getCmbreligions());
			malebtn.add(getDobinput());
			malebtn.add(getBalanceinput());
			malebtn.add(getAddressinput());
			malebtn.add(getNumberinput());
			malebtn.add(getFullnameinput());
			malebtn.add(getLblNewLabel_1_1_1_5());
			malebtn.add(getLblNewLabel_1_1_1_1_2());
			malebtn.add(getLblNewLabel_1_1_1_1_1_1());
			malebtn.add(getLblNewLabel_1_1_1_2_1());
			malebtn.add(getLblNewLabel_1_1_1_3_2());
			malebtn.add(getLblNewLabel_1_1_1_3_1_2());
			malebtn.add(getBtnClear());
			malebtn.add(getBtnNewButton_1_1_1());
			malebtn.add(getLblNewLabel_1_2_1_2_1_1());
			malebtn.add(getSecanser());
			malebtn.add(getCmbsecqstn());
			malebtn.add(getCmbgender());
			malebtn.add(getLblNewLabel_1_2_1_2_1_1_1());
			malebtn.add(getPin_noinput());
			malebtn.add(getNominationinput());
			malebtn.add(getNomination());
		}
		return malebtn;
	}
	private JLabel getLblNewLabel_1_2_1_2_1() {
		if (lblNewLabel_1_2_1_2_1 == null) {
			lblNewLabel_1_2_1_2_1 = new JLabel("Sec Question");
			lblNewLabel_1_2_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_2_1.setBounds(402, 133, 116, 27);
		}
		return lblNewLabel_1_2_1_2_1;
	}
	private JComboBox getCmbacctype() {
		if (cmbacctype == null) {
			cmbacctype = new JComboBox();
			cmbacctype.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Account--- ]", "Saving Account", "Current Account", "Salary Account", "Fixed Deposite Account"}));
			cmbacctype.setFont(new Font("Arial Black", Font.BOLD, 12));
			cmbacctype.setBounds(528, 179, 184, 27);
		}
		return cmbacctype;
	}
	private JTextField getMicrinput() {
		if (micrinput == null) {
			micrinput = new JTextField();
			micrinput.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			micrinput.setColumns(10);
			micrinput.setBounds(528, 86, 184, 27);
		}
		return micrinput;
	}
	private JTextField getAcc_noinput() {
		if (acc_noinput == null) {
			acc_noinput = new JTextField();
			acc_noinput.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			acc_noinput.setColumns(10);
			acc_noinput.setBounds(528, 38, 184, 27);
		}
		return acc_noinput;
	}
	private JLabel getLblNewLabel_1_3_1() {
		if (lblNewLabel_1_3_1 == null) {
			lblNewLabel_1_3_1 = new JLabel("Account No.");
			lblNewLabel_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_3_1.setBounds(402, 38, 116, 27);
		}
		return lblNewLabel_1_3_1;
	}
	private JLabel getLblNewLabel_1_2_2() {
		if (lblNewLabel_1_2_2 == null) {
			lblNewLabel_1_2_2 = new JLabel("MICR No.");
			lblNewLabel_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_2.setBounds(402, 86, 116, 27);
		}
		return lblNewLabel_1_2_2;
	}
	private JLabel getLblNewLabel_1_1_1_3_1_1_1() {
		if (lblNewLabel_1_1_1_3_1_1_1 == null) {
			lblNewLabel_1_1_1_3_1_1_1 = new JLabel("Account Type");
			lblNewLabel_1_1_1_3_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1_1_1.setBounds(402, 180, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1_1_1;
	}
	private JLabel getLblNewLabel_1_2_1_1_1() {
		if (lblNewLabel_1_2_1_1_1 == null) {
			lblNewLabel_1_2_1_1_1 = new JLabel("Gender");
			lblNewLabel_1_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_1_1.setBounds(402, 222, 78, 27);
		}
		return lblNewLabel_1_2_1_1_1;
	}
	private JComboBox getCmbreligions() {
		if (cmbreligions == null) {
			cmbreligions = new JComboBox();
			cmbreligions.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Religions --- ]", "Hindu", "Muslim", "Baudh", "Cristan"}));
			cmbreligions.setFont(new Font("Arial Black", Font.BOLD, 12));
			cmbreligions.setBounds(161, 269, 184, 27);
		}
		return cmbreligions;
	}
	private JDateChooser getDobinput() {
		if (dobinput == null) {
			dobinput = new JDateChooser();
			dobinput.setBounds(161, 222, 184, 27);
		}
		return dobinput;
	}
	private JTextField getBalanceinput() {
		if (balanceinput == null) {
			balanceinput = new JTextField();
			balanceinput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			balanceinput.setColumns(10);
			balanceinput.setBounds(161, 177, 184, 27);
		}
		return balanceinput;
	}
	private JTextField getAddressinput() {
		if (addressinput == null) {
			addressinput = new JTextField();
			addressinput.setColumns(10);
			addressinput.setBounds(161, 133, 184, 27);
		}
		return addressinput;
	}
	private JTextField getNumberinput() {
		if (numberinput == null) {
			numberinput = new JTextField();
			numberinput.setColumns(10);
			numberinput.setBounds(161, 86, 184, 27);
		}
		return numberinput;
	}
	private JTextField getFullnameinput() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setColumns(10);
			fullnameinput.setBounds(161, 38, 184, 27);
		}
		return fullnameinput;
	}
	private JLabel getLblNewLabel_1_1_1_5() {
		if (lblNewLabel_1_1_1_5 == null) {
			lblNewLabel_1_1_1_5 = new JLabel("Full Name");
			lblNewLabel_1_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_5.setBounds(45, 38, 101, 27);
		}
		return lblNewLabel_1_1_1_5;
	}
	private JLabel getLblNewLabel_1_1_1_1_2() {
		if (lblNewLabel_1_1_1_1_2 == null) {
			lblNewLabel_1_1_1_1_2 = new JLabel("Number");
			lblNewLabel_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_1_2.setBounds(45, 86, 101, 27);
		}
		return lblNewLabel_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1 = new JLabel("Address");
			lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_1_1_1.setBounds(45, 133, 101, 27);
		}
		return lblNewLabel_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_2_1 = new JLabel("Balance");
			lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_2_1.setBounds(45, 177, 101, 27);
		}
		return lblNewLabel_1_1_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_3_2() {
		if (lblNewLabel_1_1_1_3_2 == null) {
			lblNewLabel_1_1_1_3_2 = new JLabel("Date of Birth");
			lblNewLabel_1_1_1_3_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_2.setBounds(45, 222, 116, 27);
		}
		return lblNewLabel_1_1_1_3_2;
	}
	private JLabel getLblNewLabel_1_1_1_3_1_2() {
		if (lblNewLabel_1_1_1_3_1_2 == null) {
			lblNewLabel_1_1_1_3_1_2 = new JLabel("Religions");
			lblNewLabel_1_1_1_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1_2.setBounds(45, 270, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1_2;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnClear.setBounds(596, 376, 116, 48);
		}
		return btnClear;
	}
	
	
	private JButton getBtnNewButton_1_1_1() {
		if (btnNewButton_1_1_1 == null) {
			btnNewButton_1_1_1 = new JButton("Create Account");
			btnNewButton_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(fullnameinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Full Name");
						return;
					}
					if(numberinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Number");
						return;
					}
					if(addressinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Address");
						return;
					}
					if(Nominationinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Nomination Name");
						return;
					}
					if(balanceinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Deposite Balance");
						return;
					}	
					
//		------------------------------------------------------------
					Account acc = new Account();
					
					acc.setFullname(fullnameinput.getText());
					acc.setNumber(numberinput.getText());
					acc.setAddress(addressinput.getText());
					acc.setBalance(Integer.parseInt(balanceinput.getText()));
					acc.setAac_no(acc_noinput.getText());
					acc.setMicr_no(micrinput.getText());
					acc.setSec_ans(secanser.getText());
					acc.setPinno(Integer.parseInt(pin_noinput.getText()));
					acc.setNomination(Nominationinput.getText());
					
		// ---------------------------- Random Username --------------------------------------			
					
					String name = fullnameinput.getText();
					int first = name.indexOf(" ");
					String fword = name.substring(0,first);
					
					Random rn1 = new Random();
					acc.setUsername(fword+rn1.nextInt(100000+1));
					
		// ------------------------------------------------------------------	
					
					// Combo box Code
					acc.setReligions(cmbreligions.getSelectedItem().toString());
					acc.setSec_qstn(cmbsecqstn.getSelectedItem().toString());
					acc.setAcc_type(cmbacctype.getSelectedItem().toString());
					acc.setGender(cmbgender.getSelectedItem().toString());
					
					// Date Code
					acc.setDob(new Date(dobinput.getDate().getTime()));
					
					Account_Service accs = new Account_Service_empl();
					boolean res = accs.CreateAcc(acc);
					
					if(res) {
						JOptionPane.showMessageDialog(null,"Account Created Success");
						setVisible(false);
						new Home_Page().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Create Account");
					}
					
					
				}
			});
			btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_1_1_1.setBounds(359, 376, 211, 48);
		}
		return btnNewButton_1_1_1;
	}
	private JLabel getLblNewLabel_1_2_1_2_1_1() {
		if (lblNewLabel_1_2_1_2_1_1 == null) {
			lblNewLabel_1_2_1_2_1_1 = new JLabel("Sec Answer");
			lblNewLabel_1_2_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_2_1_1.setBounds(402, 270, 116, 27);
		}
		return lblNewLabel_1_2_1_2_1_1;
	}
	private JTextField getSecanser() {
		if (secanser == null) {
			secanser = new JTextField();
			secanser.setColumns(10);
			secanser.setBounds(528, 270, 184, 27);
		}
		return secanser;
	}
	private JComboBox getCmbsecqstn() {
		if (cmbsecqstn == null) {
			cmbsecqstn = new JComboBox();
			cmbsecqstn.setModel(new DefaultComboBoxModel(new String[] {"[ -- Select Question -- ]", "What i your Nick Name", "Where You Born", "What is your Favourite flower"}));
			cmbsecqstn.setFont(new Font("Arial Black", Font.BOLD, 12));
			cmbsecqstn.setBounds(528, 133, 184, 27);
		}
		return cmbsecqstn;
	}
	private JComboBox getCmb_genders() {
		if (cmb_genders == null) {
			cmb_genders = new JComboBox();
			cmb_genders.setModel(new DefaultComboBoxModel(new String[] {"[ -- Select Gender --- ]", "Male ", "Female"}));
			cmb_genders.setFont(new Font("Arial Black", Font.BOLD, 12));
			cmb_genders.setBounds(526, 224, 184, 27);
		}
		return cmb_genders;
	}
	private JComboBox getCmbgender() {
		if (cmbgender == null) {
			cmbgender = new JComboBox();
			cmbgender.setModel(new DefaultComboBoxModel(new String[] {"[ -- Select Gender --- ]", "Male ", "Female"}));
			cmbgender.setFont(new Font("Arial Black", Font.BOLD, 12));
			cmbgender.setBounds(528, 224, 184, 27);
		}
		return cmbgender;
	}
	
	private JLabel getLblNewLabel_1_2_1_2_1_1_1() {
		if (lblNewLabel_1_2_1_2_1_1_1 == null) {
			lblNewLabel_1_2_1_2_1_1_1 = new JLabel("Pin_No");
			lblNewLabel_1_2_1_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_2_1_1_1.setBounds(402, 312, 116, 27);
		}
		return lblNewLabel_1_2_1_2_1_1_1;
	}
	private JTextField getPin_noinput() {
		if (pin_noinput == null) {
			pin_noinput = new JTextField();
			pin_noinput.setColumns(10);
			pin_noinput.setBounds(528, 312, 184, 27);
		}
		return pin_noinput;
	}
	private JTextField getNominationinput() {
		if (Nominationinput == null) {
			Nominationinput = new JTextField();
			Nominationinput.setColumns(10);
			Nominationinput.setBounds(161, 312, 184, 27);
		}
		return Nominationinput;
	}
	private JLabel getNomination() {
		if (Nomination == null) {
			Nomination = new JLabel("Nomination");
			Nomination.setFont(new Font("Arial Black", Font.BOLD, 14));
			Nomination.setBounds(45, 312, 101, 27);
		}
		return Nomination;
	}
	
	// ------------------------------ Show date in Input Box ----------------------------------
	
	public void CurDate() {
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		datefield.setText(+day+"-"+(month+1)+"-"+year);
		
	}

//	---------------------------------- Display_Customer_List -----------------------------------------
	
	private void Display_Customer_List() {
		
		Account_Service acs = new Account_Service_empl();
		List<Account> ac_list = acs.getAllAcc();
		
		DefaultTableModel tmodel = (DefaultTableModel) customerTable.getModel();
		tmodel.setRowCount(0);
		
		for(Account ac : ac_list) {
			tmodel.addRow(new Object[] {ac.getAac_no(),ac.getFullname(),ac.getDob(),ac.getAcc_type(),ac.getGender(),ac.getNumber(),ac.getAddress()});
		}
	}
	
	
//	---------------------------------- Display_Customer_Data in Profile Input Box -----------------------------------------
	private void Display_InputBox(String bid) {
			
		eid = bid;
		Account_Service accs = new Account_Service_empl();
		Account ac = accs.getAccById(eid);
		
		fullname.setText(ac.getFullname());
		number.setText(ac.getNumber());
		address.setText(ac.getAddress());
		dobinputs.setDate(ac.getDob());
		acc_noinputs.setText(String.valueOf(ac.getAac_no()));
		micr_noinputs.setText(String.valueOf(ac.getMicr_no()));
		pin_noinputs.setText(String.valueOf(ac.getRandom()));
		answer_qsntinputs.setText(ac.getSec_ans());
		usernameinputs.setText(ac.getUsername());
				
//		Combo box Set Text
		cmbreligious.setSelectedItem(ac.getReligions());
		cmbac_types.setSelectedItem(ac.getAcc_type());
		cmb_genders.setSelectedItem(ac.getGender());
		
		acc_num = ac.getAac_no();
	}
	
//	---------------------------------- Display_Customer_Pin in Change Pin Input Box -----------------------------------------
	private void Change_Pin(String bid) {
		
		eid = bid;
		Account_Service accs = new Account_Service_empl();
		Account ac = accs.getAccById(eid);
		
		oldpininput.setText(String.valueOf(ac.getRandom()));
		C_Customer_Number.setText(String.valueOf(ac.getNumber()));
	}
	
	
//	---------------------------------- Display_Customer_Data in view Balances -----------------------------------------
	private void Display_Balances(String bid) {
		
		eid = bid;
		Account_Service accs = new Account_Service_empl();
		Account ac = accs.getAccById(eid);
		
		vfullname.setText(ac.getFullname());
		vmicrno.setText(String.valueOf(ac.getMicr_no()));
		vusername.setText(ac.getUsername());
		vbalances.setText(String.valueOf(ac.getBalance()));
		vnomination.setText(ac.getNomination());
				
	}
	
//	---------------------------------- Display_Customer_Data in Withdrawal Balances -----------------------------------------
	private void Display_Withdrawal_Balances(String bid) {
		
		eid = bid;
		Account_Service accs = new Account_Service_empl();
		Account ac = accs.getAccById(eid);
		
		wfullname.setText(ac.getFullname());
		wusername.setText(ac.getUsername());
		wnumber.setText(ac.getNumber());
		wavbalance.setText(String.valueOf(ac.getBalance()));
				
	}
	
//	---------------------------------- Display_Customer_Data in Deposite Balances -----------------------------------------
	private void Display_Deposite_Balances(String bid) {
		
		eid = bid;
		Account_Service accs = new Account_Service_empl();
		Account ac = accs.getAccById(eid);
				
		dfullname.setText(ac.getFullname());
		dusername.setText(ac.getUsername());
		dnumber.setText(ac.getNumber());
		d_av_balance.setText(String.valueOf(ac.getBalance()));
		
	}

//	---------------------------------- Display_Transfer Balance One Acc To Another Acc -----------------------------------------
	private void Display_Transfer_Balances(String bid) {
		
		eid = bid;
		Account_Service accs = new Account_Service_empl();
		Account ac = accs.getAccById(eid);
				
		tfullname.setText(ac.getFullname());
		tav_balance.setText(String.valueOf(ac.getBalance()));
		
	}
	
//	---------------------------------- Display_Transfer Credit Account Balance One Acc To Another Acc -----------------------------------------
	private void Display_Credit_Transfer_Balances(String bid) {
		
		eid = bid;
		Account_Service accs = new Account_Service_empl();
		Account ac = accs.getAccById(eid);
				
		tc_fullname.setText(ac.getFullname());
		tc_number.setText(ac.getNumber());
		
		trans_and_upd_bal = ac.getBalance();
		
	}
	
	
//	---------------------------------- Display_Customer_Random_Data in Input Box -----------------------------------------
		
	// Set And Generate Random Code and Numbers
	public void GenrateRandom_Number() {
		
		Random rn = new Random();
		acc_noinput.setText(""+rn.nextInt(1000000000+1)+rn.nextInt(10000+1));
		micrinput.setText(""+rn.nextInt(100000000+1));
		pin_noinput.setText(""+rn.nextInt(1000000+1));
		
	}
	
//	---------------------------------- Display_Customer_Withdrawal data in Withdrawal Table -----------------------------------------
	
	public void Withdrawal_Table() {
		
		Withdrawal_Service ws = new Withdrawal_Service_empl();
		List<Withdrawal> w_list = ws.Show_withdrawal_Amount();
		
		DefaultTableModel tmodel = (DefaultTableModel) withdrawal_table.getModel();
		tmodel.setRowCount(0);
		
		for(Withdrawal w : w_list) {
			tmodel.addRow(new Object[] {w.getWid(),w.getAcc_number(),w.getFullname(),w.getUsername(),w.getNumber(),w.getAv_balance(),w.getWith_balance(),w.getTotal_amount()});
		}
		
	}

//	---------------------------------- Display_Customer_Deposite data in Deposite Table -----------------------------------------
	
	public void Deposite_Table() {
		
		Deposite_Service ds = new Deposite_Service_empl();
		List<Deposite> d_list = ds.Show_All_Deposite();

		DefaultTableModel tmodel = (DefaultTableModel) deposite_table.getModel();
		tmodel.setRowCount(0);
		
		for(Deposite d : d_list) {
			tmodel.addRow(new Object[] {d.getDid(),d.getAcc_no(),d.getFullname(),d.getUsername(),d.getNumber(),d.getAv_balance(),d.getDep_name(),d.getDep_num(),d.getDep_amount(),d.getTotal_amount()});
		}
		
	}
	
//	---------------------------------- Display_Customer_Transfer transaction data in Transfer Table -----------------------------------------
	
	public void Transfer_Table() {
		
		Transfer_Service ts = new Transfer_Service_empl();
		List<Transfer> t_list = ts.getAllTransferData();
		
		DefaultTableModel tmodel = (DefaultTableModel) transfer_table.getModel();
		tmodel.setRowCount(0);
		
		for(Transfer t : t_list) {
			tmodel.addRow(new Object[] {t.getTid(),t.getTacc_no(),t.getTfullname(),t.getTav_balance(),t.getTtransfer_amount(),t.getTtotal_amount(),t.getCacc_no(),t.getCfullname(),t.getCnumber(),t.getCtransfer_balance()});
		}
		
	}

//  ------------------------------------------------------------------------------------------------------------------
	
	private JPanel getPanel_11() {
		if (panel_11 == null) {
			panel_11 = new JPanel();
			panel_11.setLayout(null);
			panel_11.add(getScrollPane_2());
			panel_11.add(getSearch_withdrawal());
			panel_11.add(getBtnNewButton_1());
		}
		return panel_11;
	}
	private JPanel getPanel_12() {
		if (panel_12 == null) {
			panel_12 = new JPanel();
			panel_12.setLayout(null);
			panel_12.add(getScrollPane_3());
			panel_12.add(getSearch_deposite());
		}
		return panel_12;
	}
	private JScrollPane getScrollPane_2() {
		if (scrollPane_2 == null) {
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(10, 49, 739, 389);
			scrollPane_2.setViewportView(getWithdrawal_table());
		}
		return scrollPane_2;
	}
	private JTable getWithdrawal_table() {
		if (withdrawal_table == null) {
			withdrawal_table = new JTable();
			withdrawal_table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"With_ID", "Acc No", "Full Name", "Username", "Number", "Available Balance", "Withdrawal Balance", "Total Balance"
				}
			));
		}
		return withdrawal_table;
	}
	private JScrollPane getScrollPane_3() {
		if (scrollPane_3 == null) {
			scrollPane_3 = new JScrollPane();
			scrollPane_3.setBounds(10, 49, 739, 389);
			scrollPane_3.setViewportView(getDeposite_table());
		}
		return scrollPane_3;
	}
	private JTable getDeposite_table() {
		if (deposite_table == null) {
			deposite_table = new JTable();
			deposite_table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Dep_ID", "Acc_No", "Full Name", "Username", "Number", "Available Balance", "Dep_Name", "Dep_Num", "Dep_Amount", "Total Amount"
				}
			));
		}
		return deposite_table;
	}
	private JLabel getLblNewLabel_1_1_1_4_5_3() {
		if (lblNewLabel_1_1_1_4_5_3 == null) {
			lblNewLabel_1_1_1_4_5_3 = new JLabel("Acc No");
			lblNewLabel_1_1_1_4_5_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5_3.setBounds(100, 60, 143, 27);
		}
		return lblNewLabel_1_1_1_4_5_3;
	}
	private JTextField getChange_Acc_no() {
		if (change_Acc_no == null) {
			change_Acc_no = new JTextField();
			change_Acc_no.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			change_Acc_no.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			change_Acc_no.setColumns(10);
			change_Acc_no.setBounds(271, 60, 300, 32);
		}
		return change_Acc_no;
	}
	private JButton getBtnSearch_2_1_1_1() {
		if (btnSearch_2_1_1_1 == null) {
			btnSearch_2_1_1_1 = new JButton("Search");
			btnSearch_2_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Change_acc_pin = change_Acc_no.getText().trim();
					
					Account_Service acs = new Account_Service_empl();
					acs.getAccById(Change_acc_pin);
					
					Change_Pin(Change_acc_pin);
					
				}
			});
			btnSearch_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch_2_1_1_1.setBounds(584, 60, 116, 32);
		}
		return btnSearch_2_1_1_1;
	}
	private JTextField getSeach_Customer_List() {
		if (Seach_Customer_List == null) {
			Seach_Customer_List = new JTextField();
			Seach_Customer_List.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					String Search_Customer = Seach_Customer_List.getText().trim();
					
					Account_Service acs = new Account_Service_empl();
					List<Account> ac_list = acs.SearchAcc(Search_Customer);
					
					DefaultTableModel tmodel = (DefaultTableModel) customerTable.getModel();
					tmodel.setRowCount(0);
					
					for(Account ac : ac_list) {
						tmodel.addRow(new Object[] {ac.getAac_no(),ac.getFullname(),ac.getDob(),ac.getAcc_type(),ac.getGender(),ac.getNumber(),ac.getAddress()});
					}
					
				}
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			Seach_Customer_List.setBounds(533, 10, 216, 29);
			Seach_Customer_List.setColumns(10);
		}
		return Seach_Customer_List;
	}
	private JTextField getTo_transfer_Search() {
		if (to_transfer_Search == null) {
			to_transfer_Search = new JTextField();
			to_transfer_Search.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					String Search_transfer_to = to_transfer_Search.getText().trim();
					
					Transfer_Service ts = new Transfer_Service_empl();
					List<Transfer> t_list = ts.To_SearchTransferData(Search_transfer_to);
					
					DefaultTableModel tmodel = (DefaultTableModel) transfer_table.getModel();
					tmodel.setRowCount(0);
					
					for(Transfer t : t_list) {
						tmodel.addRow(new Object[] {t.getTid(),t.getTacc_no(),t.getTfullname(),t.getTav_balance(),t.getTtransfer_amount(),t.getTtotal_amount(),t.getCacc_no(),t.getCfullname(),t.getCnumber(),t.getCtransfer_balance()});
					}
					
				}
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			to_transfer_Search.setColumns(10);
			to_transfer_Search.setBounds(508, 10, 164, 29);
		}
		return to_transfer_Search;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("From");
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_2.setBounds(81, 10, 63, 28);
		}
		return lblNewLabel_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_3() {
		if (lblNewLabel_1_1_3 == null) {
			lblNewLabel_1_1_3 = new JLabel("To");
			lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_3.setBounds(451, 10, 51, 28);
		}
		return lblNewLabel_1_1_3;
	}
	private JTextField getFrom_transfer_Search() {
		if (from_transfer_Search == null) {
			from_transfer_Search = new JTextField();
			from_transfer_Search.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					String Search_transfer_from = from_transfer_Search.getText().trim();
					
					Transfer_Service ts = new Transfer_Service_empl();
					List<Transfer> t_list = ts.From_SearchTransferData(Search_transfer_from);
					
					DefaultTableModel tmodel = (DefaultTableModel) transfer_table.getModel();
					tmodel.setRowCount(0);
					
					for(Transfer t : t_list) {
						tmodel.addRow(new Object[] {t.getTid(),t.getTacc_no(),t.getTfullname(),t.getTav_balance(),t.getTtransfer_amount(),t.getTtotal_amount(),t.getCacc_no(),t.getCfullname(),t.getCnumber(),t.getCtransfer_balance()});
					}
					
				}
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			from_transfer_Search.setColumns(10);
			from_transfer_Search.setBounds(141, 10, 164, 29);
		}
		return from_transfer_Search;
	}
	private JTextField getSearch_deposite() {
		if (search_deposite == null) {
			search_deposite = new JTextField();
			search_deposite.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					String Search_Dep = search_deposite.getText().trim();
					
					Deposite_Service ds = new Deposite_Service_empl();
					List<Deposite> d_list = ds.Search_All_Deposite(Search_Dep);

					DefaultTableModel tmodel = (DefaultTableModel) deposite_table.getModel();
					tmodel.setRowCount(0);
					
					for(Deposite d : d_list) {
						tmodel.addRow(new Object[] {d.getDid(),d.getAcc_no(),d.getFullname(),d.getUsername(),d.getNumber(),d.getAv_balance(),d.getDep_name(),d.getDep_num(),d.getDep_amount(),d.getTotal_amount()});
					}
				}
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			search_deposite.setColumns(10);
			search_deposite.setBounds(585, 10, 164, 29);
		}
		return search_deposite;
	}
	private JTextField getSearch_withdrawal() {
		if (search_withdrawal == null) {
			search_withdrawal = new JTextField();
			search_withdrawal.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					String Search_with = search_withdrawal.getText().trim();
					
					Withdrawal_Service ws = new Withdrawal_Service_empl();
					List<Withdrawal> w_list = ws.Search_withdrawal_Amount(Search_with);
					
					DefaultTableModel tmodel = (DefaultTableModel) withdrawal_table.getModel();
					tmodel.setRowCount(0);
					
					for(Withdrawal w : w_list) {
						tmodel.addRow(new Object[] {w.getWid(),w.getAcc_number(),w.getFullname(),w.getUsername(),w.getNumber(),w.getAv_balance(),w.getWith_balance(),w.getTotal_amount()});
					}
					
					
				}
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
						JOptionPane.showMessageDialog(null,"We Accept Number Only !!");
					}
				}
			});
			search_withdrawal.setColumns(10);
			search_withdrawal.setBounds(585, 10, 164, 29);
		}
		return search_withdrawal;
	}
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton("Logout");
			btnLogout.setBackground(Color.RED);
			btnLogout.setForeground(Color.WHITE);
			btnLogout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			btnLogout.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnLogout.setBounds(705, 71, 100, 32);
		}
		return btnLogout;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Print Data");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						deposite_table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnNewButton_1.setBounds(47, 12, 124, 32);
		}
		return btnNewButton_1;
	}
}
