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
import model.Account;

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
	private JLabel Balance;
	private JLabel lblNewLabel_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_3_1;
	private JTextField c_fullname;
	private JTextField c_number;
	private JTextField c_address;
	private JTextField c_balances;
	private JDateChooser c_dobinputs;
	private JComboBox c_cmbreligious;
	private JTextField c_acc_noinputs;
	private JTextField c_micr_noinputs;
	private JTextField c_pin_noinputs;
	private JComboBox c_cmbac_type;
	private JLabel lblNewLabel_1_2_1_1;
	private JLabel lblNewLabel_1_1_1_3_1_1;
	private JLabel lblNewLabel_1_2_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JTextField c_answer_qsntinputs;
	private JLabel lblNewLabel_1_2_1_2;
	private JSeparator separator;
	private JButton btnSave;
	private JButton btnNewButton_1_1;
	private JLabel lblNewLabel_1_1_1_4;
	private JTextField textField_10;
	private JLabel lblNewLabel_1_1_1_4_1;
	private JTextField textField_11;
	private JLabel lblNewLabel_1_1_1_4_1_1;
	private JTextField textField_12;
	private JTextField textField_13;
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
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1;
	private JButton btnTotal_1;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel lblNewLabel_1_1_1_4_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_4_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_2;
	private JTextField textField_17;
	private JLabel lblNewLabel_2_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_1_1_1;
	private JLabel lblNewLabel_2_1_2;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_1_1_1_4_2_1;
	private JTextField textField_18;
	private JLabel lblNewLabel_2_2_1;
	private JButton btnSearch_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_2_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_3_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1;
	private JLabel lblNewLabel_2_2_1_1;
	private JLabel lblNewLabel_2_2_1_1_1;
	private JTextField textField_16;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1;
	private JLabel lblNewLabel_2_2_1_1_1_1;
	private JButton btnSearch_1_1_1;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1_1_1_4_3;
	private JTextField textField_19;
	private JButton btnSearch_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_1;
	private JTextField textField_20;
	private JTextField textField_21;
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
	private JTextField textField_22;
	private JButton btnSearch_1_2;
	private JButton btnSearch_1_2_1;
	private JScrollPane scrollPane;
	private JTable customerTable;
	private JScrollPane scrollPane_1;
	private JTable transactionTable;
	private JLabel lblNewLabel_1_1_1_4_4;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_5;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_3;
	private JLabel lblNewLabel_2_1_1_3;
	private JLabel lblNewLabel_2_1_4;
	private JLabel lblNewLabel_2_4;
	private JTextField textField_23;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_4;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2;
	private JButton btnSearch_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1;
	private JLabel lblNewLabel_2_1_1_1_3_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1;
	private JLabel lblNewLabel_2_1_1_1_3_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2;
	private JLabel lblNewLabel_2_1_1_1_3_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1;
	private JLabel lblNewLabel_2_1_1_1_3_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_5;
	private JTextField textField_24;
	private JLabel lblNewLabel_1_1_1_4_5_1;
	private JTextField textField_25;
	private JLabel lblNewLabel_1_1_1_4_5_2;
	private JTextField textField_26;
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
	private JTextField textField_27;
	private JButton btnSearch_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_6;
	private JLabel lblNewLabel_2_1_5;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_6_1;
	private JLabel lblNewLabel_2_1_5_1;
	private JSeparator separator_2;
	private JTextField textField_28;
	private JTextField textField_29;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel malebtn;
	private JLabel lblNewLabel_1_2_1_2_1;
	private JComboBox ca_cmbacctype;
	private JTextField ca_micrinput;
	private JTextField ca_acc_noinput;
	private JLabel lblNewLabel_1_3_1;
	private JLabel lblNewLabel_1_2_2;
	private JLabel lblNewLabel_1_1_1_3_1_1_1;
	private JLabel lblNewLabel_1_2_1_1_1;
	private JComboBox ca_cmbreligions;
	private JDateChooser ca_dobinput;
	private JTextField ca_balanceinput;
	private JTextField ca_addressinput;
	private JTextField ca_numberinput;
	private JTextField ca_fullnameinput;
	private JLabel lblNewLabel_1_1_1_5;
	private JLabel lblNewLabel_1_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_2_1;
	private JLabel lblNewLabel_1_1_1_3_2;
	private JLabel lblNewLabel_1_1_1_3_1_2;
	private JButton btnClear;
	private JButton btnNewButton_1_1_1;
	private JLabel lblNewLabel_1_2_1_2_1_1;
	private JTextField ca_secanswer;
	private JComboBox ca_cmbsecqstn;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JComboBox ca_cmbgender;
	private JComboBox c_cmbgenders;
	
	private String eid;
	private JPanel panel_11;
	private JPanel panel_12;

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
		setBounds(400, 100, 829, 645);
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
		
		// Curent Date Show in Input Box
		CurDate();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
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
			S_ac_no.setBounds(505, 26, 190, 30);
			S_ac_no.setColumns(10);
		}
		return S_ac_no;
	}
	private JTextField getDatefield() {
		if (datefield == null) {
			datefield = new JTextField();
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
	
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnNewButton.setBounds(705, 24, 81, 32);
		}
		return btnNewButton;
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(22, 140, 764, 446);
			tabbedPane.addTab("Profile", null, getPanel(), null);
			tabbedPane.addTab("Deposite", null, getPanel_1(), null);
			tabbedPane.addTab("Withdrawal", null, getPanel_3(), null);
			tabbedPane.addTab("Create Account", null, getMalebtn(), null);
			tabbedPane.addTab("Customer List", null, getPanel_4(), null);
			tabbedPane.addTab("Transaction\r\n", null, getPanel_5(), null);
			tabbedPane.addTab("View Balance", null, getPanel_6(), null);
			tabbedPane.addTab("Transfer", null, getPanel_2(), null);
			tabbedPane.addTab("Change Pin", null, getPanel_7(), null);
			tabbedPane.addTab("About Us", null, getPanel_8(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getBtnSave());
			panel.add(getBtnNewButton_1_1());
			panel.add(getPanel_11());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1_1_1_4());
			panel_1.add(getTextField_10());
			panel_1.add(getLblNewLabel_1_1_1_4_1());
			panel_1.add(getTextField_11());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1());
			panel_1.add(getTextField_12());
			panel_1.add(getTextField_13());
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
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_2());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_2_1());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_6());
			panel_1.add(getLblNewLabel_2_1_5());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_6_1());
			panel_1.add(getLblNewLabel_2_1_5_1());
			panel_1.add(getSeparator_2());
			panel_1.add(getTextField_28());
			panel_1.add(getTextField_29());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getBtnTotal_1());
			panel_2.add(getTextField_14());
			panel_2.add(getTextField_15());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_2());
			panel_2.add(getLblNewLabel_1_1_1_4_1_2());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_3());
			panel_2.add(getLblNewLabel_1_1_1_4_2());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_2_2());
			panel_2.add(getTextField_17());
			panel_2.add(getLblNewLabel_2_1_1_1_1_2());
			panel_2.add(getLblNewLabel_2_1_1_1_1_1_1());
			panel_2.add(getLblNewLabel_2_1_2());
			panel_2.add(getLblNewLabel_2_2());
			panel_2.add(getLblNewLabel_1_1_1_4_2_1());
			panel_2.add(getTextField_18());
			panel_2.add(getLblNewLabel_2_2_1());
			panel_2.add(getBtnSearch_1_1());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_2_2_1());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_3_1());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1());
			panel_2.add(getLblNewLabel_2_2_1_1());
			panel_2.add(getLblNewLabel_2_2_1_1_1());
			panel_2.add(getTextField_16());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1());
			panel_2.add(getLblNewLabel_2_2_1_1_1_1());
			panel_2.add(getBtnSearch_1_1_1());
			panel_2.add(getSeparator_1());
			panel_2.add(getTextField_27());
			panel_2.add(getBtnSearch_1_1_2());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(null);
			panel_3.add(getLblNewLabel_1_1_1_4_3());
			panel_3.add(getTextField_19());
			panel_3.add(getBtnSearch_1());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_2_3());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_2());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_1());
			panel_3.add(getTextField_20());
			panel_3.add(getTextField_21());
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
			panel_3.add(getTextField_22());
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
		}
		return panel_4;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setLayout(null);
			panel_5.add(getScrollPane_1());
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
			panel_6.add(getTextField_23());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_4());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_3());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2());
			panel_6.add(getBtnSearch_2());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1_2());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1());
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
			panel_7.add(getTextField_24());
			panel_7.add(getLblNewLabel_1_1_1_4_5_1());
			panel_7.add(getTextField_25());
			panel_7.add(getLblNewLabel_1_1_1_4_5_2());
			panel_7.add(getTextField_26());
			panel_7.add(getBtnSearch_2_1());
			panel_7.add(getBtnSearch_2_1_1());
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
			lblNewLabel_1_1_1.setBounds(23, 30, 101, 27);
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1_1.setBounds(23, 80, 101, 27);
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Address");
			lblNewLabel_1_1_1_1_1.setBounds(23, 127, 101, 27);
			lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JLabel getBalance() {
		if (Balance == null) {
			Balance = new JLabel("Balance");
			Balance.setBounds(23, 171, 101, 27);
			Balance.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return Balance;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("Date of Birth");
			lblNewLabel_1_1_1_3.setBounds(23, 216, 116, 27);
			lblNewLabel_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_3_1() {
		if (lblNewLabel_1_1_1_3_1 == null) {
			lblNewLabel_1_1_1_3_1 = new JLabel("Religions");
			lblNewLabel_1_1_1_3_1.setBounds(23, 264, 116, 27);
			lblNewLabel_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1_3_1;
	}
	private JTextField getC_fullname() {
		if (c_fullname == null) {
			c_fullname = new JTextField();
			c_fullname.setBounds(139, 32, 184, 27);
			c_fullname.setColumns(10);
		}
		return c_fullname;
	}
	private JTextField getC_number() {
		if (c_number == null) {
			c_number = new JTextField();
			c_number.setBounds(139, 80, 184, 27);
			c_number.setColumns(10);
		}
		return c_number;
	}
	private JTextField getC_address() {
		if (c_address == null) {
			c_address = new JTextField();
			c_address.setBounds(139, 127, 184, 27);
			c_address.setColumns(10);
		}
		return c_address;
	}
	private JTextField getC_balances() {
		if (c_balances == null) {
			c_balances = new JTextField();
			c_balances.setBounds(139, 171, 184, 27);
			c_balances.setColumns(10);
		}
		return c_balances;
	}
	private JDateChooser getC_dobinputs() {
		if (c_dobinputs == null) {
			c_dobinputs = new JDateChooser();
			c_dobinputs.setBounds(139, 216, 184, 27);
		}
		return c_dobinputs;
	}
	private JComboBox getC_cmbreligious() {
		if (c_cmbreligious == null) {
			c_cmbreligious = new JComboBox();
			c_cmbreligious.setBounds(139, 263, 184, 27);
			c_cmbreligious.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Nationality --- ]", "Hindu", "Muslim", "Baudh", "Cristan"}));
			c_cmbreligious.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return c_cmbreligious;
	}
	private JTextField getC_acc_noinputs() {
		if (c_acc_noinputs == null) {
			c_acc_noinputs = new JTextField();
			c_acc_noinputs.setBounds(498, 32, 184, 27);
			c_acc_noinputs.setColumns(10);
		}
		return c_acc_noinputs;
	}
	private JTextField getC_micr_noinputs() {
		if (c_micr_noinputs == null) {
			c_micr_noinputs = new JTextField();
			c_micr_noinputs.setBounds(498, 80, 184, 27);
			c_micr_noinputs.setColumns(10);
		}
		return c_micr_noinputs;
	}
	private JTextField getC_pin_noinputs() {
		if (c_pin_noinputs == null) {
			c_pin_noinputs = new JTextField();
			c_pin_noinputs.setBounds(498, 129, 184, 27);
			c_pin_noinputs.setColumns(10);
		}
		return c_pin_noinputs;
	}
	private JComboBox getC_cmbac_type() {
		if (c_cmbac_type == null) {
			c_cmbac_type = new JComboBox();
			c_cmbac_type.setBounds(498, 173, 184, 27);
			c_cmbac_type.setFont(new Font("Arial Black", Font.BOLD, 12));
			c_cmbac_type.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Account--- ]", "Saving Account", "Current Account", "Salary Account", "Fixed Deposite Account"}));
		}
		return c_cmbac_type;
	}
	private JLabel getLblNewLabel_1_2_1_1() {
		if (lblNewLabel_1_2_1_1 == null) {
			lblNewLabel_1_2_1_1 = new JLabel("Gender");
			lblNewLabel_1_2_1_1.setBounds(372, 216, 78, 27);
			lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_2_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_3_1_1() {
		if (lblNewLabel_1_1_1_3_1_1 == null) {
			lblNewLabel_1_1_1_3_1_1 = new JLabel("Account Type");
			lblNewLabel_1_1_1_3_1_1.setBounds(372, 174, 116, 27);
			lblNewLabel_1_1_1_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1_3_1_1;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("Pin No.");
			lblNewLabel_1_2_1.setBounds(372, 127, 116, 27);
			lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_2_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("MICR No.");
			lblNewLabel_1_2.setBounds(372, 80, 116, 27);
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Account No.");
			lblNewLabel_1_3.setBounds(372, 32, 116, 27);
			lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblNewLabel_1_3;
	}
	private JTextField getC_answer_qsntinputs() {
		if (c_answer_qsntinputs == null) {
			c_answer_qsntinputs = new JTextField();
			c_answer_qsntinputs.setBounds(498, 264, 184, 27);
			c_answer_qsntinputs.setColumns(10);
		}
		return c_answer_qsntinputs;
	}
	private JLabel getLblNewLabel_1_2_1_2() {
		if (lblNewLabel_1_2_1_2 == null) {
			lblNewLabel_1_2_1_2 = new JLabel("Sec Question");
			lblNewLabel_1_2_1_2.setBounds(372, 264, 116, 27);
			lblNewLabel_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
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
			btnSave.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSave.setBounds(594, 334, 116, 48);
		}
		return btnSave;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Edit");
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_1_1.setBounds(424, 334, 116, 48);
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
	private JTextField getTextField_10() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(332, 24, 184, 27);
		}
		return textField_10;
	}
	private JLabel getLblNewLabel_1_1_1_4_1() {
		if (lblNewLabel_1_1_1_4_1 == null) {
			lblNewLabel_1_1_1_4_1 = new JLabel("Available Balance");
			lblNewLabel_1_1_1_4_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1.setBounds(119, 186, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1;
	}
	private JTextField getTextField_11() {
		if (textField_11 == null) {
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(332, 186, 184, 27);
		}
		return textField_11;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1() {
		if (lblNewLabel_1_1_1_4_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1 = new JLabel("Amount");
			lblNewLabel_1_1_1_4_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1.setBounds(119, 319, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1;
	}
	private JTextField getTextField_12() {
		if (textField_12 == null) {
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(332, 319, 184, 27);
		}
		return textField_12;
	}
	private JTextField getTextField_13() {
		if (textField_13 == null) {
			textField_13 = new JTextField();
			textField_13.setColumns(10);
			textField_13.setBounds(537, 319, 87, 27);
		}
		return textField_13;
	}
	private JButton getBtnTotal() {
		if (btnTotal == null) {
			btnTotal = new JButton("Total");
			btnTotal.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnTotal.setBounds(650, 317, 81, 30);
		}
		return btnTotal;
	}
	private JButton getBtnDeposite() {
		if (btnDeposite == null) {
			btnDeposite = new JButton("Deposite");
			btnDeposite.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnDeposite.setBounds(358, 367, 124, 42);
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
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch.setBounds(540, 21, 113, 30);
		}
		return btnSearch;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2.setBounds(332, 61, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1 = new JLabel("Sushant1530");
			lblNewLabel_1_1_1_4_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1.setBounds(332, 103, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1.setBounds(332, 144, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1;
	}
	private JButton getBtnTotal_1() {
		if (btnTotal_1 == null) {
			btnTotal_1 = new JButton("Total");
			btnTotal_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnTotal_1.setBounds(622, 162, 81, 30);
		}
		return btnTotal_1;
	}
	private JTextField getTextField_14() {
		if (textField_14 == null) {
			textField_14 = new JTextField();
			textField_14.setColumns(10);
			textField_14.setBounds(507, 162, 87, 27);
		}
		return textField_14;
	}
	private JTextField getTextField_15() {
		if (textField_15 == null) {
			textField_15 = new JTextField();
			textField_15.setColumns(10);
			textField_15.setBounds(302, 162, 184, 27);
		}
		return textField_15;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_2 = new JLabel("Amount");
			lblNewLabel_1_1_1_4_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_2.setBounds(89, 162, 101, 27);
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
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_2 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_2.setBounds(302, 78, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_2;
	}
	private JTextField getTextField_17() {
		if (textField_17 == null) {
			textField_17 = new JTextField();
			textField_17.setColumns(10);
			textField_17.setBounds(302, 117, 184, 27);
		}
		return textField_17;
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
	private JTextField getTextField_18() {
		if (textField_18 == null) {
			textField_18 = new JTextField();
			textField_18.setColumns(10);
			textField_18.setBounds(302, 255, 184, 27);
		}
		return textField_18;
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
			btnSearch_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_1.setBounds(502, 253, 113, 30);
		}
		return btnSearch_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_2_1 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_2_1.setBounds(302, 292, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_2_1;
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
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1.setBounds(302, 329, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1;
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
	private JTextField getTextField_16() {
		if (textField_16 == null) {
			textField_16 = new JTextField();
			textField_16.setColumns(10);
			textField_16.setBounds(302, 366, 184, 27);
		}
		return textField_16;
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
	private JTextField getTextField_19() {
		if (textField_19 == null) {
			textField_19 = new JTextField();
			textField_19.setColumns(10);
			textField_19.setBounds(313, 36, 184, 27);
		}
		return textField_19;
	}
	private JButton getBtnSearch_1() {
		if (btnSearch_1 == null) {
			btnSearch_1 = new JButton("Search");
			btnSearch_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1.setBounds(531, 33, 113, 30);
		}
		return btnSearch_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_3() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_3 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_3 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_3.setBounds(313, 73, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_2 = new JLabel("Sushant1530");
			lblNewLabel_1_1_1_4_1_1_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_2.setBounds(313, 115, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1.setBounds(313, 156, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_1;
	}
	private JTextField getTextField_20() {
		if (textField_20 == null) {
			textField_20 = new JTextField();
			textField_20.setColumns(10);
			textField_20.setBounds(313, 200, 184, 27);
		}
		return textField_20;
	}
	private JTextField getTextField_21() {
		if (textField_21 == null) {
			textField_21 = new JTextField();
			textField_21.setColumns(10);
			textField_21.setBounds(313, 246, 184, 27);
		}
		return textField_21;
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
			lblNewLabel_1_1_1_4_1_1_3 = new JLabel("Amount");
			lblNewLabel_1_1_1_4_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_3.setBounds(100, 246, 101, 27);
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
	private JTextField getTextField_22() {
		if (textField_22 == null) {
			textField_22 = new JTextField();
			textField_22.setColumns(10);
			textField_22.setBounds(313, 296, 184, 27);
		}
		return textField_22;
	}
	private JButton getBtnSearch_1_2() {
		if (btnSearch_1_2 == null) {
			btnSearch_1_2 = new JButton("Total");
			btnSearch_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_2.setBounds(531, 296, 113, 30);
		}
		return btnSearch_1_2;
	}
	private JButton getBtnSearch_1_2_1() {
		if (btnSearch_1_2_1 == null) {
			btnSearch_1_2_1 = new JButton("Withdrawal");
			btnSearch_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnSearch_1_2_1.setBounds(313, 350, 184, 51);
		}
		return btnSearch_1_2_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 10, 739, 399);
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
			scrollPane_1.setBounds(10, 10, 739, 399);
			scrollPane_1.setViewportView(getTransactionTable());
		}
		return scrollPane_1;
	}
	private JTable getTransactionTable() {
		if (transactionTable == null) {
			transactionTable = new JTable();
			transactionTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Acc_No", "Full Name", "Mobile_No", "MICR_No", "Balance"
				}
			));
		}
		return transactionTable;
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
			lblNewLabel_1_1_1_4_1_1_1_5.setBounds(109, 85, 101, 27);
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
	private JTextField getTextField_23() {
		if (textField_23 == null) {
			textField_23 = new JTextField();
			textField_23.setColumns(10);
			textField_23.setBounds(376, 37, 184, 27);
		}
		return textField_23;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_4() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_4 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_4 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_4.setBounds(376, 83, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_4;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_3() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_3 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_3 = new JLabel("Sushant1530");
			lblNewLabel_1_1_1_4_1_1_1_2_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_3.setBounds(376, 125, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2.setBounds(376, 162, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2;
	}
	private JButton getBtnSearch_2() {
		if (btnSearch_2 == null) {
			btnSearch_2 = new JButton("Search");
			btnSearch_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_2.setBounds(571, 34, 113, 30);
		}
		return btnSearch_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1 = new JLabel("Rate of Intrest ( % ) ");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1.setBounds(109, 199, 101, 27);
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
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1.setBounds(376, 199, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1.setBounds(376, 236, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1;
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
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1.setBounds(109, 236, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2.setBounds(376, 273, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2;
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
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2.setBounds(109, 273, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1.setBounds(376, 310, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1;
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
			lblNewLabel_1_1_1_4_5 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_5.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5.setBounds(151, 75, 143, 27);
		}
		return lblNewLabel_1_1_1_4_5;
	}
	private JTextField getTextField_24() {
		if (textField_24 == null) {
			textField_24 = new JTextField();
			textField_24.setColumns(10);
			textField_24.setBounds(322, 75, 300, 27);
		}
		return textField_24;
	}
	private JLabel getLblNewLabel_1_1_1_4_5_1() {
		if (lblNewLabel_1_1_1_4_5_1 == null) {
			lblNewLabel_1_1_1_4_5_1 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_5_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5_1.setBounds(151, 138, 143, 27);
		}
		return lblNewLabel_1_1_1_4_5_1;
	}
	private JTextField getTextField_25() {
		if (textField_25 == null) {
			textField_25 = new JTextField();
			textField_25.setColumns(10);
			textField_25.setBounds(322, 138, 300, 27);
		}
		return textField_25;
	}
	private JLabel getLblNewLabel_1_1_1_4_5_2() {
		if (lblNewLabel_1_1_1_4_5_2 == null) {
			lblNewLabel_1_1_1_4_5_2 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_5_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5_2.setBounds(151, 197, 143, 27);
		}
		return lblNewLabel_1_1_1_4_5_2;
	}
	private JTextField getTextField_26() {
		if (textField_26 == null) {
			textField_26 = new JTextField();
			textField_26.setColumns(10);
			textField_26.setBounds(322, 197, 300, 27);
		}
		return textField_26;
	}
	private JButton getBtnSearch_2_1() {
		if (btnSearch_2_1 == null) {
			btnSearch_2_1 = new JButton("Change");
			btnSearch_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch_2_1.setBounds(322, 268, 123, 41);
		}
		return btnSearch_2_1;
	}
	private JButton getBtnSearch_2_1_1() {
		if (btnSearch_2_1_1 == null) {
			btnSearch_2_1_1 = new JButton("Clear");
			btnSearch_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch_2_1_1.setBounds(499, 268, 123, 41);
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
	private JTextField getTextField_27() {
		if (textField_27 == null) {
			textField_27 = new JTextField();
			textField_27.setColumns(10);
			textField_27.setBounds(302, 40, 184, 27);
		}
		return textField_27;
	}
	private JButton getBtnSearch_1_1_2() {
		if (btnSearch_1_1_2 == null) {
			btnSearch_1_1_2 = new JButton("Search");
			btnSearch_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_1_2.setBounds(502, 38, 113, 30);
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
	private JTextField getTextField_28() {
		if (textField_28 == null) {
			textField_28 = new JTextField();
			textField_28.setColumns(10);
			textField_28.setBounds(332, 246, 184, 27);
		}
		return textField_28;
	}
	private JTextField getTextField_29() {
		if (textField_29 == null) {
			textField_29 = new JTextField();
			textField_29.setColumns(10);
			textField_29.setBounds(332, 282, 184, 27);
		}
		return textField_29;
	}
	private JPanel getMalebtn() {
		if (malebtn == null) {
			malebtn = new JPanel();
			malebtn.setLayout(null);
			malebtn.add(getLblNewLabel_1_2_1_2_1());
			malebtn.add(getCa_cmbacctype());
			malebtn.add(getCa_micrinput());
			malebtn.add(getCa_acc_noinput());
			malebtn.add(getLblNewLabel_1_3_1());
			malebtn.add(getLblNewLabel_1_2_2());
			malebtn.add(getLblNewLabel_1_1_1_3_1_1_1());
			malebtn.add(getLblNewLabel_1_2_1_1_1());
			malebtn.add(getCa_cmbreligions());
			malebtn.add(getCa_dobinput());
			malebtn.add(getCa_balanceinput());
			malebtn.add(getCa_addressinput());
			malebtn.add(getCa_numberinput());
			malebtn.add(getCa_fullnameinput());
			malebtn.add(getLblNewLabel_1_1_1_5());
			malebtn.add(getLblNewLabel_1_1_1_1_2());
			malebtn.add(getLblNewLabel_1_1_1_1_1_1());
			malebtn.add(getLblNewLabel_1_1_1_2_1());
			malebtn.add(getLblNewLabel_1_1_1_3_2());
			malebtn.add(getLblNewLabel_1_1_1_3_1_2());
			malebtn.add(getBtnClear());
			malebtn.add(getBtnNewButton_1_1_1());
			malebtn.add(getLblNewLabel_1_2_1_2_1_1());
			malebtn.add(getCa_secanswer());
			malebtn.add(getCa_cmbsecqstn());
			malebtn.add(getCa_cmbgender());
			malebtn.add(getPanel_12());
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
	private JComboBox getCa_cmbacctype() {
		if (ca_cmbacctype == null) {
			ca_cmbacctype = new JComboBox();
			ca_cmbacctype.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Account--- ]", "Saving Account", "Current Account", "Salary Account", "Fixed Deposite Account"}));
			ca_cmbacctype.setFont(new Font("Arial Black", Font.BOLD, 12));
			ca_cmbacctype.setBounds(528, 179, 184, 27);
		}
		return ca_cmbacctype;
	}
	private JTextField getCa_micrinput() {
		if (ca_micrinput == null) {
			ca_micrinput = new JTextField();
			ca_micrinput.setColumns(10);
			ca_micrinput.setBounds(528, 86, 184, 27);
		}
		return ca_micrinput;
	}
	private JTextField getCa_acc_noinput() {
		if (ca_acc_noinput == null) {
			ca_acc_noinput = new JTextField();
			ca_acc_noinput.setColumns(10);
			ca_acc_noinput.setBounds(528, 38, 184, 27);
		}
		return ca_acc_noinput;
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
	private JComboBox getCa_cmbreligions() {
		if (ca_cmbreligions == null) {
			ca_cmbreligions = new JComboBox();
			ca_cmbreligions.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Religions --- ]", "Hindu", "Muslim", "Baudh", "Cristan"}));
			ca_cmbreligions.setFont(new Font("Arial Black", Font.BOLD, 12));
			ca_cmbreligions.setBounds(161, 269, 184, 27);
		}
		return ca_cmbreligions;
	}
	private JDateChooser getCa_dobinput() {
		if (ca_dobinput == null) {
			ca_dobinput = new JDateChooser();
			ca_dobinput.setBounds(161, 222, 184, 27);
		}
		return ca_dobinput;
	}
	private JTextField getCa_balanceinput() {
		if (ca_balanceinput == null) {
			ca_balanceinput = new JTextField();
			ca_balanceinput.setColumns(10);
			ca_balanceinput.setBounds(161, 177, 184, 27);
		}
		return ca_balanceinput;
	}
	private JTextField getCa_addressinput() {
		if (ca_addressinput == null) {
			ca_addressinput = new JTextField();
			ca_addressinput.setColumns(10);
			ca_addressinput.setBounds(161, 133, 184, 27);
		}
		return ca_addressinput;
	}
	private JTextField getCa_numberinput() {
		if (ca_numberinput == null) {
			ca_numberinput = new JTextField();
			ca_numberinput.setColumns(10);
			ca_numberinput.setBounds(161, 86, 184, 27);
		}
		return ca_numberinput;
	}
	private JTextField getCa_fullnameinput() {
		if (ca_fullnameinput == null) {
			ca_fullnameinput = new JTextField();
			ca_fullnameinput.setColumns(10);
			ca_fullnameinput.setBounds(161, 38, 184, 27);
		}
		return ca_fullnameinput;
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
					
					ca_fullnameinput.setText("");
					ca_numberinput.setText("");
					ca_addressinput.setText("");
					ca_balanceinput.setText("");
					ca_dobinput.setDate(null);
					ca_cmbreligions.setSelectedItem("");
					
					ca_acc_noinput.setText("");
					ca_micrinput.setText("");
					ca_cmbsecqstn.setSelectedItem("");
					ca_cmbacctype.setSelectedItem("");
					ca_cmbgender.setSelectedItem("");
					ca_secanswer.setText("");
					
				}
			});
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnClear.setBounds(596, 334, 116, 48);
		}
		return btnClear;
	}
	private JButton getBtnNewButton_1_1_1() {
		if (btnNewButton_1_1_1 == null) {
			btnNewButton_1_1_1 = new JButton("Create Account");
			btnNewButton_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_1_1_1.setBounds(359, 334, 211, 48);
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
	private JTextField getCa_secanswer() {
		if (ca_secanswer == null) {
			ca_secanswer = new JTextField();
			ca_secanswer.setColumns(10);
			ca_secanswer.setBounds(528, 270, 184, 27);
		}
		return ca_secanswer;
	}
	private JComboBox getCa_cmbsecqstn() {
		if (ca_cmbsecqstn == null) {
			ca_cmbsecqstn = new JComboBox();
			ca_cmbsecqstn.setModel(new DefaultComboBoxModel(new String[] {"[ -- Select Question -- ]", "What i your Nick Name", "Where You Born", "What is your Favourite flower"}));
			ca_cmbsecqstn.setFont(new Font("Arial Black", Font.BOLD, 12));
			ca_cmbsecqstn.setBounds(528, 133, 184, 27);
		}
		return ca_cmbsecqstn;
	}
	private JComboBox getC_cmbgenders() {
		if (c_cmbgenders == null) {
			c_cmbgenders = new JComboBox();
			c_cmbgenders.setBounds(498, 218, 184, 27);
			c_cmbgenders.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Gender]", "Male", "Female"}));
			c_cmbgenders.setFont(new Font("Arial Black", Font.BOLD, 12));
		}
		return c_cmbgenders;
	}
	private JComboBox getCa_cmbgender() {
		if (ca_cmbgender == null) {
			ca_cmbgender = new JComboBox();
			ca_cmbgender.setModel(new DefaultComboBoxModel(new String[] {"[ -- Select Gender --- ]", "Male ", "Female"}));
			ca_cmbgender.setFont(new Font("Arial Black", Font.BOLD, 12));
			ca_cmbgender.setBounds(528, 224, 184, 27);
		}
		return ca_cmbgender;
	}
	
	private JPanel getPanel_11() {
		if (panel_11 == null) {
			panel_11 = new JPanel();
			panel_11.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Customer Profiles", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_11.setBounds(26, 22, 704, 376);
			panel_11.setLayout(null);
			panel_11.add(getLblNewLabel_1_1_1());
			panel_11.add(getLblNewLabel_1_1_1_1());
			panel_11.add(getLblNewLabel_1_1_1_1_1());
			panel_11.add(getBalance());
			panel_11.add(getLblNewLabel_1_1_1_3());
			panel_11.add(getLblNewLabel_1_1_1_3_1());
			panel_11.add(getC_cmbreligious());
			panel_11.add(getC_dobinputs());
			panel_11.add(getC_balances());
			panel_11.add(getC_address());
			panel_11.add(getC_number());
			panel_11.add(getLblNewLabel_1_2_1_2());
			panel_11.add(getC_answer_qsntinputs());
			panel_11.add(getLblNewLabel_1_2_1_1());
			panel_11.add(getC_cmbgenders());
			panel_11.add(getC_cmbac_type());
			panel_11.add(getC_pin_noinputs());
			panel_11.add(getC_micr_noinputs());
			panel_11.add(getC_acc_noinputs());
			panel_11.add(getLblNewLabel_1_3());
			panel_11.add(getLblNewLabel_1_2());
			panel_11.add(getLblNewLabel_1_2_1());
			panel_11.add(getLblNewLabel_1_1_1_3_1_1());
			panel_11.add(getC_fullname());
		}
		return panel_11;
	}
	private JPanel getPanel_12() {
		if (panel_12 == null) {
			panel_12 = new JPanel();
			panel_12.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "New Account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12.setBounds(23, 10, 707, 399);
		}
		return panel_12;
	}
	
	
	
	
	// Show date in Input Box
	
	public void CurDate() {
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		datefield.setText(+day+"-"+(month+1)+"-"+year);
			
	}
}
