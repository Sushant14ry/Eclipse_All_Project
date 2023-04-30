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

public class update_Stock extends JFrame {

	private JPanel contentPane;
	private JTextField pidinput;
	private JTextField pnameinput;
	private JTextField pqtyinput;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_2;
	private JSeparator separator;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_1_2;
	private JTextField new_qtyinput;
	private JTextField pmrpinput;
	private JLabel lblNewLabel_1_1_1;
	private JButton Update;
	private JButton btnUpdate;
	private JButton btnNewButton;
	private int sid = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update_Stock frame = new update_Stock();
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
	public update_Stock() {
		setResizable(false);
		setTitle("Update Stock");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 100, 519, 541);
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
		contentPane.add(getLblNewLabel_1_3());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getNew_qtyinput());
		contentPane.add(getPmrpinput());
		contentPane.add(getLblNewLabel_1_1_1_2());
		contentPane.add(getUpdate());
		contentPane.add(getBtnNewButton());
	}

	private JTextField getPidinput() {
		if (pidinput == null) {
			pidinput = new JTextField();
			pidinput.setEnabled(false);
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
			lblNewLabel_1_2 = new JLabel("Update Stock");
			lblNewLabel_1_2.setForeground(Color.BLACK);
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1_2.setBounds(147, 26, 158, 30);
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
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Quantity Added");
			lblNewLabel_1_3.setForeground(Color.BLACK);
			lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_3.setBounds(55, 240, 162, 30);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("MRP");
			lblNewLabel_1_1_2.setForeground(Color.BLACK);
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_2.setBounds(55, 288, 102, 30);
		}
		return lblNewLabel_1_1_2;
	}
	private JTextField getNew_qtyinput() {
		if (new_qtyinput == null) {
			new_qtyinput = new JTextField();
			new_qtyinput.setColumns(10);
			new_qtyinput.setBounds(263, 240, 203, 30);
		}
		return new_qtyinput;
	}
	private JTextField getPmrpinput() {
		if (pmrpinput == null) {
			pmrpinput = new JTextField();
			pmrpinput.setColumns(10);
			pmrpinput.setBounds(263, 288, 203, 30);
		}
		return pmrpinput;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Quantity Available");
			lblNewLabel_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(55, 194, 177, 30);
		}
		return lblNewLabel_1_1_1;
	}
	private JButton getUpdate() {
		if (Update == null) {
			Update = new JButton("Update");
			Update.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						Stock stk = new Stock();
						
						stk.setPid(sid);
						stk.setPname(pnameinput.getText());
						stk.setPqty(Integer.parseInt(pqtyinput.getText()));
						stk.setPnqty(Integer.parseInt(new_qtyinput.getText()));
						stk.setPmrp(Integer.parseInt(pmrpinput.getText()));
						
						Stock_service ss = new Stock_service_empl();
						boolean respond = ss.UpdStock(stk);
						
						if(respond) {
							JOptionPane.showMessageDialog(null,"Stock Update Sucess");
							new add_Stock().setVisible(true);
							dispose();
						}else {
							JOptionPane.showMessageDialog(null,"Failed to Update Stock");
						}
				}
			});
			Update.setFont(new Font("Arial Black", Font.BOLD, 20));
			Update.setBounds(299, 374, 156, 37);
		}
		return Update;
	}
	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new add_Stock().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(83, 374, 134, 37);
		}
		return btnNewButton;
	}
	
	// Update Stock
	public void Update_Stock(int id) {
		
		sid = id;
		
		Stock_service ss = new Stock_service_empl();
		Stock s = ss.getStockId(id);
		
		pidinput.setText(String.valueOf(s.getPid()));
		pnameinput.setText(s.getPname());
		pqtyinput.setText(String.valueOf(s.getPqty()));
		new_qtyinput.setText(String.valueOf(s.getPnqty()));
		pmrpinput.setText(String.valueOf(s.getPmrp()));
		
		
	}
}
