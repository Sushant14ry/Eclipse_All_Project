package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Stock;
import service.Stock_service;
import service.Stock_service_empl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class product_information extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JTextField textField;
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
					product_information frame = new product_information();
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
	public product_information() {
		setResizable(false);
		setTitle("Product Information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 100, 665, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextField());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
		
		// Show Stock Data
		Display_Stock_Data();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Product Information");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(207, 37, 238, 29);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(179, 74, 283, 17);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Product");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(89, 109, 75, 23);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					String Search_billno = textField.getText().trim();
					Stock_service ss = new Stock_service_empl();
					
					List<Stock> s_list = ss.SearchStock(Search_billno);	
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Stock s : s_list) {
						tmodel.addRow(new Object[] {s.getPid(),s.getPname(),s.getPqty(),s.getPmrp()});
					}
				}
			});
			textField.setBounds(189, 109, 238, 29);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Search");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					String Search_billno = textField.getText().trim();
					Stock_service ss = new Stock_service_empl();
					
					List<Stock> s_list = ss.SearchStock(Search_billno);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Stock s : s_list) {
						tmodel.addRow(new Object[] {s.getPid(),s.getPname(),s.getPqty(),s.getPmrp()});
					}
				}
			});
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
					"Product ID", "Product Name", "Product Available", "MRP"
				}
			));
		}
		return table;
	}
	
	
	// Display Update Stock
	private void Display_Stock_Data() {
		Stock_service ss = new Stock_service_empl();
		List<Stock> s_list = ss.getStocks();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Stock s : s_list) {
			
			tmodel.addRow(new Object[] {s.getPid(),s.getPname(),s.getPqty(),s.getPmrp()});
		}			
	}
}
