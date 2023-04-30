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

import model.Cashier;
import service.Cashier_Service;
import service.Cashier_Service_empl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class update_cashier_data extends JFrame {

	private JPanel contentPane;
	private JTextField cidinput;
	private JTextField cninput;
	private JTextField cnuminput;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_2;
	private JSeparator separator;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_1_1_1;
	private JLabel lblNewLabel_1_1_2;
	private JTextField cadinput;
	private JTextField ceidinput;
	private JTextField cpswinput;
	private JLabel lblNewLabel_1_1_1;
	private JButton btnNewButton;
	private JButton btnUpdate;
	private int eid = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update_cashier_data frame = new update_cashier_data();
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
	public update_cashier_data() {
		setResizable(false);
		setTitle("Update Cashier");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 150, 507, 541);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCidinput());
		contentPane.add(getCninput());
		contentPane.add(getCnuminput());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1_3());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getCadinput());
		contentPane.add(getCeidinput());
		contentPane.add(getCpswinput());
		contentPane.add(getLblNewLabel_1_1_1_2());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnUpdate());
		
	}

	private JTextField getCidinput() {
		if (cidinput == null) {
			cidinput = new JTextField();
			cidinput.setEnabled(false);
			cidinput.setColumns(10);
			cidinput.setBounds(242, 96, 205, 30);
		}
		return cidinput;
	}
	private JTextField getCninput() {
		if (cninput == null) {
			cninput = new JTextField();
			cninput.setColumns(10);
			cninput.setBounds(242, 144, 205, 30);
		}
		return cninput;
	}
	private JTextField getCnuminput() {
		if (cnuminput == null) {
			cnuminput = new JTextField();
			cnuminput.setColumns(10);
			cnuminput.setBounds(242, 194, 205, 30);
		}
		return cnuminput;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Cashier Name");
			lblNewLabel_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(55, 144, 144, 30);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Cashier ID");
			lblNewLabel_1.setEnabled(false);
			lblNewLabel_1.setForeground(Color.BLACK);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(55, 96, 102, 30);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Update Cashier Details");
			lblNewLabel_1_2.setForeground(Color.BLACK);
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1_2.setBounds(138, 29, 278, 30);
		}
		return lblNewLabel_1_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(128, 68, 278, 13);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Address");
			lblNewLabel_1_3.setForeground(Color.BLACK);
			lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_3.setBounds(55, 240, 102, 30);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Password");
			lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(55, 338, 102, 30);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Email - ID");
			lblNewLabel_1_1_2.setForeground(Color.BLACK);
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_2.setBounds(55, 288, 102, 30);
		}
		return lblNewLabel_1_1_2;
	}
	private JTextField getCadinput() {
		if (cadinput == null) {
			cadinput = new JTextField();
			cadinput.setColumns(10);
			cadinput.setBounds(242, 240, 205, 30);
		}
		return cadinput;
	}
	private JTextField getCeidinput() {
		if (ceidinput == null) {
			ceidinput = new JTextField();
			ceidinput.setColumns(10);
			ceidinput.setBounds(242, 288, 205, 30);
		}
		return ceidinput;
	}
	private JTextField getCpswinput() {
		if (cpswinput == null) {
			cpswinput = new JTextField();
			cpswinput.setColumns(10);
			cpswinput.setBounds(242, 338, 205, 30);
		}
		return cpswinput;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Cashier Number");
			lblNewLabel_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(55, 194, 152, 30);
		}
		return lblNewLabel_1_1_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Update");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Cashier cash = new Cashier();
					
					cash.setCashierid(eid);
					cash.setCashiername(cninput.getText());
					cash.setCashiernum(cnuminput.getText());
					cash.setCashieraddress(cadinput.getText());
					cash.setCashieremail(ceidinput.getText());
					cash.setCashierpsw(cpswinput.getText());
					
					Cashier_Service cs = new Cashier_Service_empl();
					boolean respond = cs.UpdCashier(cash);
					
					if(respond) {
						JOptionPane.showMessageDialog(null,"Cashier Update Sucess");
						new add_cashier().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null,"Fail to Update Cashier");
					}
					
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBounds(267, 416, 152, 46);
		}
		return btnNewButton;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Back");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					new add_cashier().setVisible(true);
					dispose();
				}
			});
			btnUpdate.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnUpdate.setBounds(67, 416, 132, 46);
		}
		return btnUpdate;
	}

	
	// Update Cashier 
	public void SetDataForUpdate(int id) {
			
		eid = id;
		
		Cashier_Service cs = new Cashier_Service_empl();
		Cashier c = cs.getCashierUserId(id);
		
		cidinput.setText(String.valueOf(c.getCashierid()));
		cninput.setText(c.getCashiername());
		cnuminput.setText(c.getCashiernum());
		cadinput.setText(c.getCashieraddress());
		ceidinput.setText(c.getCashieremail());
		cpswinput.setText(c.getCashierpsw());
		
	}
}
