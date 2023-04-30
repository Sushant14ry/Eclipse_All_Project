package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Stock;
import service.Stock_service;
import service.Stock_service_empl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class add_Stock extends JFrame {

	private JPanel contentPane;
	private JTextField pidinput;
	private JTextField pnameinput;
	private JTextField pqtyinput;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_2;
	private JSeparator separator;
	private JLabel lblNewLabel_1_1_2;
	private JTextField pmrpinput;
	private JLabel lblNewLabel_1_1_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnUpdate;
	private JButton btnNewButton_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_Stock frame = new add_Stock();
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
	public add_Stock() {
		setResizable(false);
		setTitle("Add Stock");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 160, 1185, 541);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPidinput());
		contentPane.add(getPnameinput());
		contentPane.add(getPqtyinput());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getPmrpinput());
		contentPane.add(getLblNewLabel_1_1_1_2());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnUpdate());
		contentPane.add(getBtnNewButton_1_1());
		
		// Show Stock Data
		Display_Stock_Data();
	}

	private JTextField getPidinput() {
		if (pidinput == null) {
			pidinput = new JTextField();
			pidinput.setColumns(10);
			pidinput.setBounds(263, 96, 203, 30);
		}
		return pidinput;
	}
	private JTextField getPnameinput() {
		if (pnameinput == null) {
			pnameinput = new JTextField();
			pnameinput.setColumns(10);
			pnameinput.setBounds(263, 144, 203, 30);
		}
		return pnameinput;
	}
	private JTextField getPqtyinput() {
		if (pqtyinput == null) {
			pqtyinput = new JTextField();
			pqtyinput.setColumns(10);
			pqtyinput.setBounds(263, 194, 203, 30);
		}
		return pqtyinput;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Product Name");
			lblNewLabel_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(55, 144, 144, 30);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Product ID");
			lblNewLabel_1.setForeground(Color.BLACK);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(55, 96, 102, 30);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Add Stock");
			lblNewLabel_1_2.setForeground(Color.BLACK);
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1_2.setBounds(146, 28, 162, 30);
		}
		return lblNewLabel_1_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(128, 66, 188, 13);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("MRP");
			lblNewLabel_1_1_2.setForeground(Color.BLACK);
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_2.setBounds(55, 244, 102, 30);
		}
		return lblNewLabel_1_1_2;
	}
	private JTextField getPmrpinput() {
		if (pmrpinput == null) {
			pmrpinput = new JTextField();
			pmrpinput.setColumns(10);
			pmrpinput.setBounds(263, 244, 203, 30);
		}
		return pmrpinput;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Quantity Added");
			lblNewLabel_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(55, 194, 177, 30);
		}
		return lblNewLabel_1_1_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(500, 28, 661, 411);
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
					"Product ID", "Product Name", "Available", "MRP"
				}
			));
		}
		return table;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add New ");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						Stock stk = new Stock();
						
							if(pidinput.getText().isBlank()) {
								JOptionPane.showMessageDialog(null,"Please Enter the Product ID");
							}
							if(pnameinput.getText().isBlank()) {
								JOptionPane.showMessageDialog(null,"Please Enter the Product Name");
							}
						
						stk.setPid(Integer.parseInt(pidinput.getText()));
						stk.setPname(pnameinput.getText());
						stk.setPqty(Integer.parseInt(pqtyinput.getText()));
						stk.setPmrp(Integer.parseInt(pmrpinput.getText()));
						
						Stock_service ss = new Stock_service_empl();
						boolean respond = ss.AddStock(stk);
						
						if(respond) {
							JOptionPane.showMessageDialog(null,"Stock Added Sucess");
							// Show Stock Data
							Display_Stock_Data();
						}else {
							JOptionPane.showMessageDialog(null,"Failed to Add Stock");
							JOptionPane.showMessageDialog(null,"Product ID is Already Exist");
						}
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(97, 334, 144, 37);
		}
		return btnNewButton;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Edit");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 if(table.getSelectedRow() < 0 ) {
						 JOptionPane.showMessageDialog(null,"Please Select Any Row Data From Table");
						 return;
					 }
					 
					 int sel_row = table.getSelectedRow();
					 int id = (int) table.getModel().getValueAt(sel_row,0);
					 
					 update_Stock us = new update_Stock();
					 us.Update_Stock(id);
					 us.setVisible(true);
					 dispose();
					 
				}
			});
			btnUpdate.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnUpdate.setBounds(306, 334, 144, 37);
		}
		return btnUpdate;
	}

	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Delete");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null,"Please a Any Data From Table");
						return;
					}
					
					int sel_row = table.getSelectedRow();
					int ids = (int) table.getModel().getValueAt(sel_row,0);
					
					Stock_service ss = new Stock_service_empl();
					if(ss.DelStock(ids)) {
						JOptionPane.showMessageDialog(null,"Deleted Sucess");
						Display_Stock_Data();
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Delete");
					}
				}
			});
			btnNewButton_1_1.setBackground(Color.RED);
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1.setBounds(198, 402, 162, 37);
		}
		return btnNewButton_1_1;
	}
	
	// Display Stock Data in Table
	private void Display_Stock_Data() {
		Stock_service ss = new Stock_service_empl();
		List<Stock> s_list = ss.getStocks();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Stock s : s_list) {
			
			tmodel.addRow(new Object[] {s.getPid(),s.getPname(),(s.getPqty()+s.getPnqty()),s.getPmrp()});
		}			
	}
	
	
	// Update Stock
	public void Update_Stock(int id) {
		
		Stock_service ss = new Stock_service_empl();
		Stock s = ss.getStockId(id);
		
		pidinput.setText(String.valueOf(s.getPid()));
		pnameinput.setText(s.getPname());
		pqtyinput.setText(String.valueOf(s.getPqty()));
		pmrpinput.setText(String.valueOf(s.getPmrp()));
		
	}
}
