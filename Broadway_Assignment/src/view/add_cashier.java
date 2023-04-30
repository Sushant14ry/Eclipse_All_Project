package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import db.db;
import model.Cashier;
import service.Cashier_Service;
import service.Cashier_Service_empl;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class add_cashier extends JFrame {

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
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnUpdate;
	private JButton btnNewButton_1_1;
	private JLabel lblNewLabel_1_4;
	private JTextField textField;
	private int eid = 0;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_cashier frame = new add_cashier();
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
	public add_cashier() {
		setResizable(false);
		setTitle("Add Cashier");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(290, 150, 1030, 541);
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
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnUpdate());
		contentPane.add(getBtnNewButton_1_1());
		contentPane.add(getLblNewLabel_1_4());
		contentPane.add(getTextField());
		contentPane.add(getBtnNewButton_1());
		
		// Show Cashier Data Table
		Display_Cashier_Data();
	}

	private JTextField getCidinput() {
		if (cidinput == null) {
			cidinput = new JTextField();
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
			lblNewLabel_1.setForeground(Color.BLACK);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(55, 96, 102, 30);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Add Cashier Details");
			lblNewLabel_1_2.setForeground(Color.BLACK);
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1_2.setBounds(141, 28, 237, 30);
		}
		return lblNewLabel_1_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(128, 68, 249, 13);
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
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(500, 96, 516, 366);
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
					"ID", "Name", "Number", "Address", "Email", "Password"
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
					
					Cashier cash = new Cashier();
					
					cash.setCashierid(Integer.parseInt(cidinput.getText()));
					cash.setCashiername(cninput.getText());
					cash.setCashiernum(cnuminput.getText());
					cash.setCashieraddress(cadinput.getText());
					cash.setCashieremail(ceidinput.getText());
					cash.setCashierpsw(cpswinput.getText());
					
					Cashier_Service cs = new Cashier_Service_empl();
					boolean respond = cs.AddCashier(cash);
					
					if(respond) {
						JOptionPane.showMessageDialog(null,"Cashier Added Sucess");
						// Show Cashier Data Table
						Display_Cashier_Data();
					}else {
						JOptionPane.showMessageDialog(null,"Fail to Add Cashier");
					}
					
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBounds(55, 409, 133, 30);
		}
		return btnNewButton;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Edit");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null,"Please a Any Data From Table");
						return;
					}
					
					int sel_row = table.getSelectedRow();
					int ids = (int) table.getModel().getValueAt(sel_row,0);
					
					update_cashier_data ucd = new update_cashier_data();
					ucd.SetDataForUpdate(ids);
					ucd.setVisible(true);
					dispose();
				}
			});
			btnUpdate.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnUpdate.setBounds(216, 409, 119, 30);
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
					
					Cashier_Service cs = new Cashier_Service_empl();
					if(cs.DelCashier(ids)) {
						JOptionPane.showMessageDialog(null,"Deleted Sucess");
						Display_Cashier_Data();
					}else {
						JOptionPane.showMessageDialog(null,"Delete Failed");
					}
				}
			});
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1.setBounds(362, 409, 119, 30);
		}
		return btnNewButton_1_1;
	}

	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Search");
			lblNewLabel_1_4.setForeground(Color.BLACK);
			lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_4.setBounds(511, 51, 102, 30);
		}
		return lblNewLabel_1_4;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					
					String search_cashier = textField.getText().trim();
					Cashier_Service cs = new Cashier_Service_empl();
					
					List<Cashier> c_list = cs.SearchCashierUser(search_cashier);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Cashier c : c_list) {
						tmodel.addRow(new Object[] {c.getCashierid(),c.getCashiername(),c.getCashiernum(),c.getCashieraddress(),c.getCashieremail(),c.getCashierpsw()});
					}
					
					
				}
			});
			textField.setColumns(10);
			textField.setBounds(623, 51, 205, 30);
		}
		return textField;
	}
	
	// Show data in Cashier Table
	
	private void Display_Cashier_Data() {
		
		Cashier_Service cs = new Cashier_Service_empl();
		List<Cashier> c_list = cs.getAllCashierUser();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Cashier c : c_list) {
			tmodel.addRow(new Object[] {c.getCashierid(),c.getCashiername(),c.getCashiernum(),c.getCashieraddress(),c.getCashieremail(),c.getCashierpsw()});
		}
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Import");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser jfc = new JFileChooser();
					FileNameExtensionFilter filter = new FileNameExtensionFilter("Files","csv","xls");
					
					jfc.setFileFilter(filter);
					jfc.showOpenDialog(null);
					
					File f = jfc.getSelectedFile();
					
//					-------------
					
//					BufferedReader read = new BufferedReader(new FileReader("d://Covid/Book1.csv"));
					
					try {
						FileReader read = new FileReader(f);
						BufferedReader br = new BufferedReader(read);
						
						br.readLine();
						
						String data;
						while((data = br.readLine()) != null) {
//							System.out.println(data);
							
							String[]  value = data.split(",");
							
							String addCashier = "insert into cashier(cid,cash_name,cash_num,cash_address,cash_email,cash_psw)values(?,?,?,?,?,?) ";
							
							try {
								PreparedStatement pstm = db.getDB().prepareStatement(addCashier);
								
								pstm.setInt(1,Integer.parseInt(value[0]));
								pstm.setString(2,value[1]);
								pstm.setString(3,value[2]);
								pstm.setString(4,value[3]);
								pstm.setString(5,value[4]);
								pstm.setString(6,value[5]);
								
								pstm.execute();
								
								// Display and Refresh Table data
								Display_Cashier_Data();
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						JOptionPane.showMessageDialog(null,"Data Imported Sucessfully");
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
				}
			});
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1.setBounds(699, 463, 129, 41);
		}
		return btnNewButton_1;
	}
}
