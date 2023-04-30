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

import Service.Check_In_Service;
import Service.Check_In_Service_empl;
import Service.Check_Out_Service;
import Service.Check_Out_Service_empl;
import model.Customer_CheckIN;
import model.Customer_CheckOut;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;

public class Customer_check_out extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel price_per_day;
	private JTextField cname;
	private JLabel lblRoomNumber;
	private JLabel lblMobileNumber;
	private JTextField price_perday;
	private JButton btnAllotRoom;
	private JButton btnClear;
	private JLabel lblRoomNumber_1;
	private JLabel lblMobileNumber_1;
	private JTextField no_of_days;
	private JLabel lblRoomNumber_2;
	private JLabel lblMobileNumber_2;
	private JTextField total_amount;
	private JTextField mobile_number;
	private JLabel lblRoomNumber_3;
	private JLabel lblMobileNumber_3;
	private JTextField email;
	private JLabel lblRoomNumber_5;
	private JTextField search_room_no_input;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable table;
	private JDateChooser checkdate;
	private JLabel lblRoomNumber_3_1;
	private JLabel lblMobileNumber_3_1;
	private JComboBox cmbroomtype;
	private JComboBox cmbgenders;
	private JTextField today_date;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_check_out frame = new Customer_check_out();
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
	public Customer_check_out() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(94, 130, 1375, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		
		// Show Current Date
		CurrentDate();
		
		// Show Checkout Customer in Table
		Diplay_Checkout_Customer();
	
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(51, 204, 153));
			panel.setBounds(0, 0, 1374, 632);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getPrice_per_day());
			panel.add(getLblRoomNumber_5());
			panel.add(getSearch_room_no_input());
			panel.add(getBtnSearch());
			panel.add(getBtnNewButton());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("CUSTOMER CHECK OUT");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(40, 16, 299, 54);
		}
		return lblNewLabel;
	}
	private JPanel getPrice_per_day() {
		if (price_per_day == null) {
			price_per_day = new JPanel();
			price_per_day.setBounds(40, 113, 1296, 498);
			price_per_day.setLayout(null);
			price_per_day.add(getTextField_4());
			price_per_day.add(getLblRoomNumber_1());
			price_per_day.add(getLblRoomNumber_1_1());
			price_per_day.add(getPrice_perday());
			price_per_day.add(getBtnAllotRoom());
			price_per_day.add(getBtnClear());
			price_per_day.add(getLblRoomNumber_1_3());
			price_per_day.add(getLblMobileNumber_1());
			price_per_day.add(getNo_of_days());
			price_per_day.add(getLblRoomNumber_2());
			price_per_day.add(getLblMobileNumber_2());
			price_per_day.add(getTextField_5_1());
			price_per_day.add(getTextField_6_1());
			price_per_day.add(getLblRoomNumber_3());
			price_per_day.add(getLblMobileNumber_3());
			price_per_day.add(getTextField_7_1());
			price_per_day.add(getScrollPane());
			price_per_day.add(getCheckdate());
			price_per_day.add(getLblRoomNumber_3_1());
			price_per_day.add(getLblMobileNumber_3_1());
			price_per_day.add(getCmbroomtype());
			price_per_day.add(getCmbgenders());
			price_per_day.add(getToday_date());
		}
		return price_per_day;
	}
	private JTextField getTextField_4() {
		if (cname == null) {
			cname = new JTextField();
			cname.setEditable(false);
			cname.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			cname.setColumns(10);
			cname.setBounds(33, 72, 185, 26);
		}
		return cname;
	}
	private JLabel getLblRoomNumber_1() {
		if (lblRoomNumber == null) {
			lblRoomNumber = new JLabel("Customer Name");
			lblRoomNumber.setForeground(Color.BLACK);
			lblRoomNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber.setBounds(34, 30, 176, 35);
		}
		return lblRoomNumber;
	}
	private JLabel getLblRoomNumber_1_1() {
		if (lblMobileNumber == null) {
			lblMobileNumber = new JLabel("Price Per Day");
			lblMobileNumber.setForeground(Color.BLACK);
			lblMobileNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber.setBounds(34, 123, 157, 35);
		}
		return lblMobileNumber;
	}
	private JTextField getPrice_perday() {
		if (price_perday == null) {
			price_perday = new JTextField();
			price_perday.setEditable(false);
			price_perday.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			price_perday.setColumns(10);
			price_perday.setBounds(33, 165, 185, 26);
		}
		return price_perday;
	}
	private JButton getBtnAllotRoom() {
		if (btnAllotRoom == null) {
			btnAllotRoom = new JButton("Check Out");
			btnAllotRoom.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 
					
					Customer_CheckOut cco = new Customer_CheckOut();
					
					cco.setRoom_no(Integer.parseInt(search_room_no_input.getText()));
					cco.setCustomer_name(cname.getText());
					cco.setCheckdate(new Date(checkdate.getDate().getTime()));
					cco.setCheckdate_today(today_date.getText());
					cco.setMobile_num(mobile_number.getText());
					cco.setGender(cmbgenders.getSelectedItem().toString());
					cco.setPer_day(Integer.parseInt(price_perday.getText()));
					cco.setNo_days(Integer.parseInt(no_of_days.getText()));
					cco.setTotal_amount(Integer.parseInt(total_amount.getText()));
					cco.setEmail(email.getText());
					cco.setRoom_type(cmbroomtype.getSelectedItem().toString());
					
					Check_Out_Service cos = new Check_Out_Service_empl();
					boolean res = cos.AddCheckOut(cco);
					
					if(res) {
						JOptionPane.showMessageDialog(null, "Customer CheckOut Success");
//						new Customer_check_out().setVisible(true);
//						// Show Check Out Customer in Table
						Diplay_Checkout_Customer();
					}else {
						JOptionPane.showMessageDialog(null, "Customer CheckOut Failed");
					}
					
					
				}
			});
			btnAllotRoom.setForeground(Color.WHITE);
			btnAllotRoom.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnAllotRoom.setBackground(new Color(220, 20, 60));
			btnAllotRoom.setBounds(33, 212, 127, 32);
		}
		return btnAllotRoom;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new Customer_check_out().setVisible(true);
				}
			});
			btnClear.setForeground(Color.WHITE);
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnClear.setBackground(new Color(220, 20, 60));
			btnClear.setBounds(197, 212, 98, 32);
		}
		return btnClear;
	}
	private JLabel getLblRoomNumber_1_3() {
		if (lblRoomNumber_1 == null) {
			lblRoomNumber_1 = new JLabel("Check In Date");
			lblRoomNumber_1.setForeground(Color.BLACK);
			lblRoomNumber_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_1.setBounds(294, 30, 176, 35);
		}
		return lblRoomNumber_1;
	}
	
	private JLabel getLblMobileNumber_1() {
		if (lblMobileNumber_1 == null) {
			lblMobileNumber_1 = new JLabel("Number of Days Stay");
			lblMobileNumber_1.setForeground(Color.BLACK);
			lblMobileNumber_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblMobileNumber_1.setBounds(293, 123, 200, 35);
		}
		return lblMobileNumber_1;
	}
	private JTextField getNo_of_days() {
		if (no_of_days == null) {
			no_of_days = new JTextField();
			no_of_days.setEditable(false);
			no_of_days.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			no_of_days.setColumns(10);
			no_of_days.setBounds(292, 165, 185, 26);
		}
		return no_of_days;
	}
	private JLabel getLblRoomNumber_2() {
		if (lblRoomNumber_2 == null) {
			lblRoomNumber_2 = new JLabel("Check Out Date ( Today )");
			lblRoomNumber_2.setForeground(Color.BLACK);
			lblRoomNumber_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblRoomNumber_2.setBounds(522, 30, 229, 35);
		}
		return lblRoomNumber_2;
	}
	private JLabel getLblMobileNumber_2() {
		if (lblMobileNumber_2 == null) {
			lblMobileNumber_2 = new JLabel("Toal Amount");
			lblMobileNumber_2.setForeground(Color.BLACK);
			lblMobileNumber_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber_2.setBounds(522, 123, 157, 35);
		}
		return lblMobileNumber_2;
	}
	private JTextField getTextField_5_1() {
		if (total_amount == null) {
			total_amount = new JTextField();
			total_amount.setEditable(false);
			total_amount.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			total_amount.setColumns(10);
			total_amount.setBounds(521, 165, 200, 26);
		}
		return total_amount;
	}
	private JTextField getTextField_6_1() {
		if (mobile_number == null) {
			mobile_number = new JTextField();
			mobile_number.setEditable(false);
			mobile_number.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			mobile_number.setColumns(10);
			mobile_number.setBounds(785, 72, 194, 26);
		}
		return mobile_number;
	}
	private JLabel getLblRoomNumber_3() {
		if (lblRoomNumber_3 == null) {
			lblRoomNumber_3 = new JLabel("Mobile Number");
			lblRoomNumber_3.setForeground(Color.BLACK);
			lblRoomNumber_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_3.setBounds(786, 30, 176, 35);
		}
		return lblRoomNumber_3;
	}
	private JLabel getLblMobileNumber_3() {
		if (lblMobileNumber_3 == null) {
			lblMobileNumber_3 = new JLabel("Email ID");
			lblMobileNumber_3.setForeground(Color.BLACK);
			lblMobileNumber_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber_3.setBounds(786, 123, 157, 35);
		}
		return lblMobileNumber_3;
	}
	private JTextField getTextField_7_1() {
		if (email == null) {
			email = new JTextField();
			email.setEditable(false);
			email.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			email.setColumns(10);
			email.setBounds(785, 165, 194, 26);
		}
		return email;
	}
	private JLabel getLblRoomNumber_5() {
		if (lblRoomNumber_5 == null) {
			lblRoomNumber_5 = new JLabel("Room Number");
			lblRoomNumber_5.setForeground(Color.BLACK);
			lblRoomNumber_5.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_5.setBounds(443, 60, 146, 35);
		}
		return lblRoomNumber_5;
	}
	private JTextField getSearch_room_no_input() {
		if (search_room_no_input == null) {
			search_room_no_input = new JTextField();
			search_room_no_input.setColumns(10);
			search_room_no_input.setBounds(604, 64, 146, 28);
		}
		return search_room_no_input;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int Search_Room = Integer.parseInt(search_room_no_input.getText().trim());
					Check_In_Service cis = new Check_In_Service_empl();
					cis.getCustomerById(Search_Room);
					Display_InputBox(Search_Room);
					
					int sdate = Integer.parseInt(today_date.getText().split("-")[0]) - Integer.parseInt(new Date(checkdate.getDate().getTime()).toString().split("-")[2]);
					System.out.println();
					no_of_days.setText(String.valueOf(sdate));
					
					// Set Total Amount
					int roomp = Integer.parseInt(price_perday.getText());
					int no_days = Integer.parseInt(no_of_days.getText());
					total_amount.setText(String.valueOf(roomp*no_days));
					
				}
			});
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch.setBackground(new Color(220, 20, 60));
			btnSearch.setBounds(771, 64, 105, 28);
		}
		return btnSearch;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(33, 271, 1224, 205);
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
					"Room No", "Customer Name", "Mobile Number", "Gender", "Price Per Day", "No of Days", "Total Amount", "Email", "Room Type", "Check In Date", "Check Out Date"
				}
			));
		}
		return table;
	}
	
	private JDateChooser getCheckdate() {
		if (checkdate == null) {
			checkdate = new JDateChooser();
			checkdate.setEnabled(false);
			checkdate.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			checkdate.setBounds(293, 72, 166, 26);
		}
		return checkdate;
	}
	
	private JTextField getToday_date() {
		if (today_date == null) {
			today_date = new JTextField();
			today_date.setEditable(false);
			today_date.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			today_date.setColumns(10);
			today_date.setBounds(522, 72, 194, 26);
		}
		return today_date;
	}

	private JLabel getLblRoomNumber_3_1() {
		if (lblRoomNumber_3_1 == null) {
			lblRoomNumber_3_1 = new JLabel("Gender");
			lblRoomNumber_3_1.setForeground(Color.BLACK);
			lblRoomNumber_3_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_3_1.setBounds(1052, 30, 176, 35);
		}
		return lblRoomNumber_3_1;
	}
	private JLabel getLblMobileNumber_3_1() {
		if (lblMobileNumber_3_1 == null) {
			lblMobileNumber_3_1 = new JLabel("Room Type");
			lblMobileNumber_3_1.setForeground(Color.BLACK);
			lblMobileNumber_3_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber_3_1.setBounds(1052, 123, 157, 35);
		}
		return lblMobileNumber_3_1;
	}
	private JComboBox getCmbroomtype() {
		if (cmbroomtype == null) {
			cmbroomtype = new JComboBox();
			cmbroomtype.setEnabled(false);
			cmbroomtype.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select Room Type ---- ]", "AC", "Non AC", "VIP"}));
			cmbroomtype.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbroomtype.setBounds(1052, 165, 194, 26);
		}
		return cmbroomtype;
	}
		
	private JComboBox getCmbgenders() {
		if (cmbgenders == null) {
			cmbgenders = new JComboBox();
			cmbgenders.setEnabled(false);
			cmbgenders.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Gender --- ]", "Male", "Female"}));
			cmbgenders.setFont(new Font("Arial Black", Font.BOLD, 13));
			cmbgenders.setBounds(1052, 72, 194, 26);
		}
		return cmbgenders;
	}
	
	
	// Search by Room Number and Set data in Input Box
	
	private void Display_InputBox(int id) {
		Check_In_Service cis = new Check_In_Service_empl();
		Customer_CheckIN cci = cis.getCustomerById(id);
		
		cname.setText(cci.getFullname());
		checkdate.setDate(cci.getCheck_date());
		mobile_number.setText(cci.getMobile());
		cmbgenders.setSelectedItem(cci.getGender());
		price_perday.setText(String.valueOf(cci.getRoom_price()));
		email.setText(cci.getEmail());
		cmbroomtype.setSelectedItem(cci.getRoom_type());	
		
	}
	
	
	// Display check Out Customer in Table
	
	private void Diplay_Checkout_Customer() {
		
		Check_Out_Service cos = new Check_Out_Service_empl();
		List<Customer_CheckOut> co_list = cos.getAllCheck_Out_Customer();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Customer_CheckOut co : co_list) {
			tmodel.addRow(new Object [] {co.getRoom_no(),co.getCustomer_name(),co.getMobile_num(),co.getGender(),co.getPer_day(),co.getNo_days(),co.getTotal_amount(),co.getEmail(),co.getRoom_type(),co.getCheckdate(),co.getCheckdate_today()});
		}
		
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("X");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit This Application","select",JOptionPane.YES_NO_OPTION);
					if(a == 0) {
						System.exit(a);
					}
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBackground(Color.RED);
			btnNewButton.setBounds(1314, 10, 50, 40);
		}
		return btnNewButton;
	}
	
	// Show Current Date
	public void CurrentDate() {
		
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		today_date.setText(+day+"-"+(month+1)+"-"+year);
	}
	
	
}
