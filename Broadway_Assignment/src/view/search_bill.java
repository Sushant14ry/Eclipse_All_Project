package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Bill;
import service.Bill_Service;
import service.Bill_Service_empl;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class search_bill extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JTextField searchinput;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_bill frame = new search_bill();
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
	public search_bill() {
		setResizable(false);
		setTitle("Search Bill");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 100, 665, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getSearchinput());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
		
		// Display Bill data in table
		DisplayBillData();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Search Bill");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(249, 38, 155, 29);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(229, 76, 168, 17);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Bill No");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(89, 109, 75, 23);
		}
		return lblNewLabel_1;
	}
	private JTextField getSearchinput() {
		if (searchinput == null) {
			searchinput = new JTextField();
			searchinput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					String search_bill = searchinput.getText().trim();
					Bill_Service bl = new Bill_Service_empl();
					
					List<Bill> b_list = bl.Search_bill(search_bill);
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Bill b : b_list) {
						tmodel.addRow(new Object[] {b.getBill_no(),b.getCustomerName(),b.getProd_mrp(),b.getDate()});
					}			
				}
			});
			searchinput.setBounds(176, 103, 168, 39);
			searchinput.setColumns(10);
		}
		return searchinput;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Search");
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(470, 103, 149, 39);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(39, 168, 580, 427);
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
					"Bill No", "Customer Name", "Amount", "Date"
				}
			));
		}
		return table;
	}
	
//	----------------------------------------------------
	// Display bill data in table
	private void DisplayBillData() {
		
		Bill_Service bs = new Bill_Service_empl();
		List<Bill> b_list  = bs.getAllBills();
		
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Bill b : b_list) {
			tmodel.addRow(new Object[] {b.getBill_no(),b.getCustomerName(),b.getProd_mrp(),b.getDate()} );
		}
		
	}
}
