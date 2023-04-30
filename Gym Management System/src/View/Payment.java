package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Member;
//import Model.Payment;
import Service.Member_Service;
import Service.Member_Service_Empl;
import Service.Payment_Service;
import Service.Payment_Service_empl;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.awt.event.ActionEvent;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField fullnameinput;
	private JLabel lblMemberId;
	private JLabel lblMobileNumber;
	private JTextField mobileinput;
	private JLabel lblNewLabel_1_1;
	private JTextField emailinput;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_2;
	private JButton paybtn;
	private JButton btnReset;
	private JTextField m_id;
	private JButton btnSearch;
	private JTextField amountinput;
	private JLabel lblDate;
	private JLabel today_date;
	private JSeparator separator;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnX;
	private JSeparator separator_1;
	private int eid;
	private int pay_id;
	
	private String paydate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
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
		contentPane.add(getMobileinput());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getEmailinput());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getPaybtn());
		contentPane.add(getBtnReset());
		contentPane.add(getM_id());
		contentPane.add(getBtnSearch());
		contentPane.add(getTextField_4_1());
		contentPane.add(getLblDate());
		contentPane.add(getToday_date());
		contentPane.add(getSeparator());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnX());
		contentPane.add(getSeparator_1());
		
		// Display Current Date
			CurrentDate();
		
		// Display Payment Data in Table
			Display_Payment();
			
			
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Full Name");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel.setBounds(76, 178, 127, 35);
		}
		return lblNewLabel;
	}
	private JTextField getFullnameinput() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setColumns(10);
			fullnameinput.setBounds(76, 220, 352, 28);
		}
		return fullnameinput;
	}
	private JLabel getLblMemberId() {
		if (lblMemberId == null) {
			lblMemberId = new JLabel("Member ID : ");
			lblMemberId.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblMemberId.setBounds(76, 132, 155, 34);
		}
		return lblMemberId;
	}
	private JLabel getLblMobileNumber() {
		if (lblMobileNumber == null) {
			lblMobileNumber = new JLabel("Mobile Number");
			lblMobileNumber.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblMobileNumber.setBounds(76, 270, 172, 35);
		}
		return lblMobileNumber;
	}
	private JTextField getMobileinput() {
		if (mobileinput == null) {
			mobileinput = new JTextField();
			mobileinput.setColumns(10);
			mobileinput.setBounds(76, 312, 352, 28);
		}
		return mobileinput;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Email ID");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1.setBounds(76, 364, 127, 35);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getEmailinput() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setColumns(10);
			emailinput.setBounds(76, 404, 352, 28);
		}
		return emailinput;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Amount To Pay");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1_1.setBounds(76, 457, 155, 35);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Payment");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel_1_2.setBounds(425, 4, 182, 64);
		}
		return lblNewLabel_1_2;
	}
	private JButton getPaybtn() {
		if (paybtn == null) {
			paybtn = new JButton("Pay");
			paybtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Model.Payment py = new Model.Payment();
					
					py.setPid(Integer.parseInt(m_id.getText()));
					py.setFullname(fullnameinput.getText());
					py.setNumber(mobileinput.getText());
					py.setEmail(emailinput.getText());
					py.setAmount(Integer.parseInt(amountinput.getText()));
					py.setPdate(today_date.getText());
					
					Payment_Service ps = new Payment_Service_empl();
					boolean payres = ps.PayPayment(py);
					
					if(payres) {
						JOptionPane.showMessageDialog(null, "Payment Successfull");
						// Display Payment Data in Table
						Display_Payment();
						
						setVisible(false);
						new Payment().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Pay Payment");
					}
				}
			});
			paybtn.setFont(new Font("Arial Black", Font.BOLD, 20));
			paybtn.setBounds(76, 554, 108, 42);
		}
		return paybtn;
	}
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("Reset");
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new Payment().setVisible(true);
				}
			});
			btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnReset.setBounds(208, 554, 100, 42);
		}
		return btnReset;
	}
	private JTextField getM_id() {
		if (m_id == null) {
			m_id = new JTextField();
			m_id.setColumns(10);
			m_id.setBounds(208, 132, 96, 34);
		}
		return m_id;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(m_id.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Member ID");
						return;
					}
					
						int mbr_id = Integer.parseInt(m_id.getText());
						Member mbr = new Member();
						
						int Search_id = Integer.parseInt(m_id.getText().trim());
						Member_Service ms = new Member_Service_Empl();
						ms.getMemeberByID(Search_id);
						
						Update_Payment(Search_id);
						
			
				// Get and fetch data from database
						Payment_Service ps = new Payment_Service_empl();
						Model.Payment p = ps.GetPaymentById(Search_id);
						
						String date = p.getPdate();
						System.out.println(date);
						
						
			

						
		// Monthly Payment Validate
						
						if(today_date.equals(paybtn)) {
							JOptionPane.showMessageDialog(null, "Payment is Already done for this Month.");
							paybtn.setVisible(false);
						}
				}
			});
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnSearch.setBounds(311, 132, 118, 34);
		}
		return btnSearch;
	}
	private JTextField getTextField_4_1() {
		if (amountinput == null) {
			amountinput = new JTextField();
			amountinput.setColumns(10);
			amountinput.setBounds(76, 499, 352, 28);
		}
		return amountinput;
	}
	private JLabel getLblDate() {
		if (lblDate == null) {
			lblDate = new JLabel("Date :- ");
			lblDate.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblDate.setBounds(76, 80, 96, 35);
		}
		return lblDate;
	}
	private JLabel getToday_date() {
		if (today_date == null) {
			today_date = new JLabel("");
			today_date.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			today_date.setBounds(160, 80, 148, 35);
		}
		return today_date;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(76, 116, 210, 2);
		}
		return separator;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(479, 113, 571, 414);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Member ID", "Full Name", "Mobile Number", "Email ID", "Amount", "Date"
				}
			));
		}
		return table;
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
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(400, 64, 225, 19);
		}
		return separator_1;
	}
	
	// Fetch Member Data by Id
	
	private void Update_Payment(int id) {
		
		eid = id;
		Member_Service ms = new Member_Service_Empl();
		Member mbr = ms.getMemeberByID(id);
		
		fullnameinput.setText(mbr.getFullname());
		mobileinput.setText(mbr.getMobileNumber());
		emailinput.setText(mbr.getEmailid());
		amountinput.setText(String.valueOf(mbr.getAmountpay()));
		
		
	}
	
	
	// Display Payment Data in table
	
	private void Display_Payment() {
		
		Payment_Service pys = new Payment_Service_empl();
		
		List<Model.Payment> p_list = pys.GetAllPayment();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Model.Payment p : p_list) {
			pay_id = p.getPid();
			paydate = p.getPdate();
			tmodel.addRow(new Object[] {p.getPid(),p.getFullname(),p.getNumber(),p.getEmail(),p.getAmount(),p.getPdate()});
		}
		
	}
	
	// Show Date in Label in Payment JFrame 
	
	public void CurrentDate() {
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
				
		today_date.setText(+day+" - "+(mon+1)+" - "+year);
		
		
	}
	

}
