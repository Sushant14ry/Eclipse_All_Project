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
import java.net.Inet4Address;
import java.util.List;

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
import java.awt.event.ActionEvent;

public class Customer_details_bill extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblRoomNumber_5;
	private JTextField textField_8;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblRoomNumber_5_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_details_bill frame = new Customer_details_bill();
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
	public Customer_details_bill() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(94, 130, 1375, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		
		//Show Checkout Customer data in Table
		Show_Checkout_Customer_Bill();
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(51, 204, 153));
			panel.setBounds(0, 0, 1374, 632);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getPanel_1());
			panel.add(getLblRoomNumber_5());
			panel.add(getTextField_8());
			panel.add(getBtnSearch());
			panel.add(getLblRoomNumber_5_1());
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
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(40, 140, 1296, 408);
			panel_1.setLayout(null);
			panel_1.add(getScrollPane());
		}
		return panel_1;
	}
	private JLabel getLblRoomNumber_5() {
		if (lblRoomNumber_5 == null) {
			lblRoomNumber_5 = new JLabel("Search by Check Out Date");
			lblRoomNumber_5.setForeground(Color.BLACK);
			lblRoomNumber_5.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_5.setBounds(396, 80, 257, 35);
		}
		return lblRoomNumber_5;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(668, 84, 146, 28);
		}
		return textField_8;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch.setBackground(new Color(220, 20, 60));
			btnSearch.setBounds(835, 84, 105, 28);
		}
		return btnSearch;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 10, 1276, 388);
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
					"ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "Check In", "Room Number", "No. Bed", "Room Type", "Price Per Day", "No. Days", "Total Amount", "Check Out"
				}
			));
		}
		return table;
	}
	private JLabel getLblRoomNumber_5_1() {
		if (lblRoomNumber_5_1 == null) {
			lblRoomNumber_5_1 = new JLabel("Click on Table Row to Open Bill");
			lblRoomNumber_5_1.setForeground(Color.BLACK);
			lblRoomNumber_5_1.setFont(new Font("Algerian", Font.BOLD, 18));
			lblRoomNumber_5_1.setBounds(495, 580, 355, 35);
		}
		return lblRoomNumber_5_1;
	}
	
	public void Show_Checkout_Customer_Bill() {
		
		Check_In_Service cis = new Check_In_Service_empl();
		List<Customer_CheckIN> ci_list = cis.getAllCheck_In_Customer();
		
//		DefaultTableModel tmodels = (DefaultTableModel) table.getModel();
//		tmodels.setRowCount(0);
		
		Check_Out_Service cos = new Check_Out_Service_empl();
		List<Customer_CheckOut> cco_list = cos.getAllCheck_Out_Customer();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Customer_CheckOut co : cco_list ) {
			for(Customer_CheckIN cin : ci_list){
			tmodel.addRow(new Object[] {co.getCid(),co.getCustomer_name(),co.getMobile_num(),cin.getNationality(),co.getGender(),co.getEmail(),cin.getId_proof(),cin.getAddress(),co.getCheckdate(),co.getRoom_no(),cin.getBed_no(),co.getRoom_type(),co.getPer_day(),co.getNo_days(),co.getTotal_amount(),co.getCheckdate_today()});
			}
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
}
