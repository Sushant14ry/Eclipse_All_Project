package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

import db.db;
import model.Bill;
import model.Stock;
import service.Bill_Service;
import service.Bill_Service_empl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.awt.event.ItemEvent;

public class new_bill extends JFrame {

	private JPanel contentPane;
	private JTextField b_custom_name_input;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JTextField bill_no_input;
	private JLabel lblNewLabel_1_1_2;
	private JLabel lblNewLabel_1_1_2_1;
	private JLabel lblNewLabel_1_1_2_1_1;
	private JLabel lblNewLabel_1_1_2_1_1_1;
	private JTextField prod_name_input;
	private JTextField prod_mrp_input;
	private JTextField prod_qty_input;
	private JComboBox cmbprod_id_b;
	private JTextField prod_dis_input;
	private JButton btnRemove;
	private JButton btnAdd;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_1_1_2_1_1_1_1;
	private JTextField textField;
	private JButton btnAdd_1;
	private JButton btnPrint;
	private int bill_no;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new_bill frame = new new_bill();
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
	public new_bill() {
		setResizable(false);
		setTitle("New Bill");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(260, 100, 1044, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getB_custom_name_input());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getBill_no_input());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getLblNewLabel_1_1_2_1());
		contentPane.add(getLblNewLabel_1_1_2_1_1());
		contentPane.add(getLblNewLabel_1_1_2_1_1_1());
		contentPane.add(getProd_name_input());
		contentPane.add(getProd_mrp_input());
		contentPane.add(getProd_qty_input());
		contentPane.add(getCmbprod_id_b());
		contentPane.add(getProd_dis_input());
		contentPane.add(getBtnRemove());
		contentPane.add(getBtnAdd());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_1_1_2_1_1_1_1());
		contentPane.add(getTextField());
		contentPane.add(getBtnAdd_1());
		contentPane.add(getBtnPrint());
		
		// Display Bill Data
		DisplayBillData();
	}
	private JTextField getB_custom_name_input() {
		if (b_custom_name_input == null) {
			b_custom_name_input = new JTextField();
			b_custom_name_input.setColumns(10);
			b_custom_name_input.setBounds(167, 82, 203, 30);
		}
		return b_custom_name_input;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Customer Name");
			lblNewLabel_1.setForeground(Color.BLACK);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1.setBounds(20, 82, 137, 30);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Product ID");
			lblNewLabel_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(20, 130, 102, 30);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Bill No");
			lblNewLabel_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1.setBounds(20, 30, 102, 30);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getBill_no_input() {
		if (bill_no_input == null) {
			bill_no_input = new JTextField();
			bill_no_input.setColumns(10);
			bill_no_input.setBounds(167, 30, 203, 30);
		}
		return bill_no_input;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Name");
			lblNewLabel_1_1_2.setForeground(Color.BLACK);
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_2.setBounds(20, 176, 102, 30);
		}
		return lblNewLabel_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_2_1() {
		if (lblNewLabel_1_1_2_1 == null) {
			lblNewLabel_1_1_2_1 = new JLabel("MRP");
			lblNewLabel_1_1_2_1.setForeground(Color.BLACK);
			lblNewLabel_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_2_1.setBounds(20, 224, 102, 30);
		}
		return lblNewLabel_1_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_2_1_1() {
		if (lblNewLabel_1_1_2_1_1 == null) {
			lblNewLabel_1_1_2_1_1 = new JLabel("Quantity");
			lblNewLabel_1_1_2_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_2_1_1.setBounds(20, 270, 102, 30);
		}
		return lblNewLabel_1_1_2_1_1;
	}
	private JLabel getLblNewLabel_1_1_2_1_1_1() {
		if (lblNewLabel_1_1_2_1_1_1 == null) {
			lblNewLabel_1_1_2_1_1_1 = new JLabel("Discount");
			lblNewLabel_1_1_2_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_2_1_1_1.setBounds(20, 320, 102, 30);
		}
		return lblNewLabel_1_1_2_1_1_1;
	}
	private JTextField getProd_name_input() {
		if (prod_name_input == null) {
			prod_name_input = new JTextField();
			prod_name_input.setColumns(10);
			prod_name_input.setBounds(167, 176, 203, 30);
		}
		return prod_name_input;
	}
	private JTextField getProd_mrp_input() {
		if (prod_mrp_input == null) {
			prod_mrp_input = new JTextField();
			prod_mrp_input.setColumns(10);
			prod_mrp_input.setBounds(167, 224, 203, 30);
		}
		return prod_mrp_input;
	}
	private JTextField getProd_qty_input() {
		if (prod_qty_input == null) {
			prod_qty_input = new JTextField();
			prod_qty_input.setColumns(10);
			prod_qty_input.setBounds(167, 270, 203, 30);
		}
		return prod_qty_input;
	}
	private JComboBox getCmbprod_id_b() {
		if (cmbprod_id_b == null) {
			cmbprod_id_b = new JComboBox();
			cmbprod_id_b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Stock s = new Stock();
					
					String fetch_data = "SELECT * FROM stock where p_id=? ";
					
					try {
						PreparedStatement pstm = db.getDB().prepareStatement(fetch_data);
						
						pstm.setString(1,cmbprod_id_b.getSelectedItem().toString());
						ResultSet res = pstm.executeQuery();
						
						while(res.next()) {
							
							prod_name_input.setText(res.getString("p_name"));
							prod_mrp_input.setText(String.valueOf(res.getInt("p_mrp")));
						}
						 
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
			});
			cmbprod_id_b.setBounds(167, 130, 205, 30);
		}
		product_dropdown();
		return cmbprod_id_b;
	}
	private JTextField getProd_dis_input() {
		if (prod_dis_input == null) {
			prod_dis_input = new JTextField();
			prod_dis_input.setColumns(10);
			prod_dis_input.setBounds(167, 320, 203, 30);
		}
		return prod_dis_input;
	}
	private JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton("Remove");
			btnRemove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow() < 0 ) {
						JOptionPane.showMessageDialog(null,"Please Select Any Data from Table");
						return;
					}
//					
//					int sel_row = table.getSelectedRow();
//					int id = (int) table.getModel().getValueAt(sel_row,0);
					
					Bill_Service bs = new Bill_Service_empl();
					if(bs.removeBill(bill_no)) {
						JOptionPane.showMessageDialog(null,"Deleted Sucess");
						// Display Bill Data
						DisplayBillData();
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Delete");
					}
					
				}
			});
			btnRemove.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnRemove.setBounds(226, 387, 144, 37);
		}
		return btnRemove;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Bill bl = new Bill();
					
					bl.setBill_no(Integer.parseInt(bill_no_input.getText()));
					bl.setCustomerName(b_custom_name_input.getText());
					bl.setProd_id(Integer.parseInt(cmbprod_id_b.getSelectedItem().toString()));
					bl.setProductName(prod_name_input.getText());
					bl.setProd_mrp(Integer.parseInt(prod_mrp_input.getText()));
					bl.setProd_qty(Integer.parseInt(prod_qty_input.getText()));
					bl.setProd_disc(Integer.parseInt(prod_dis_input.getText()));
//					bl.setDate(dattte.getText()));
					
					Bill_Service bs = new Bill_Service_empl();
					boolean respond = bs.addBill(bl);
					
					if(respond) {
						JOptionPane.showMessageDialog(null,"Bill Added Sucess");
						// Display Bill Data
						DisplayBillData();
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Add Bill");
					}
					
					
				}
			});
			btnAdd.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnAdd.setBounds(20, 387, 144, 37);
		}
		return btnAdd;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(433, 34, 556, 390);
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
				 "Name", "MRP","Quantity","Price"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel_1_1_2_1_1_1_1() {
		if (lblNewLabel_1_1_2_1_1_1_1 == null) {
			lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Total");
			lblNewLabel_1_1_2_1_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_2_1_1_1_1.setBounds(433, 430, 66, 30);
		}
		return lblNewLabel_1_1_2_1_1_1_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			textField.setColumns(10);
			textField.setBounds(507, 433, 203, 30);
		}
		return textField;
	}
	private JButton getBtnAdd_1() {
		if (btnAdd_1 == null) {
			btnAdd_1 = new JButton("Add");
			btnAdd_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnAdd_1.setBounds(20, 387, 144, 37);
		}
		return btnAdd_1;
	}
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton("Print");
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnPrint.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnPrint.setBounds(845, 430, 144, 37);
		}
		return btnPrint;
	}
	
	// Product ID Changed then Product Name and Price also Changed
	private void product_dropdown() {
		String product = "SELECT * FROM stock ";
		
		try {
			Statement stm = db.getDB().createStatement();
			ResultSet rs = stm.executeQuery(product);
			
			while(rs.next()) {
				cmbprod_id_b.addItem(rs.getInt("p_id"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	----------------------------------------------------
	// Display bill data in table
	private void DisplayBillData() {
		
		Bill_Service bs = new Bill_Service_empl();
		
		List<Bill> b_list  = bs.getAllBills();
		
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Bill b : b_list) {
			bill_no = b.getBill_no();
			tmodel.addRow(new Object[] {b.getProductName(),b.getProd_mrp(),b.getProd_qty(),b.getProd_mrp()*b.getProd_qty()-b.getProd_disc()} );
		}
		
	}
	
	
	
}
