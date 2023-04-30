package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

import Model.Employee;
import Service.Emp_Service;
import Service.Emp_Service_empl;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JCalendar;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField empidinput;
	private JLabel lblName;
	private JTextField empnameinput;
	private JLabel lblNewLabel_1_1;
	private JTextField empnumberinput;
	private JRadioButton btnmale;
	private JRadioButton btnfemale;
	private JLabel lblNewLabel_1_1_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel_1_1_2;
	private JTextField empageinput;
	private JLabel lblAge;
	private JLabel lblNewLabel_1_1_3;
	private JLabel lblNewLabel_1_1_4;
	private JLabel lblNewLabel_1_1_3_1;
	private JComboBox cmbshift;
	private JComboBox cmbdepartment;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnDelete;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_1_1;
	private JButton btnNewButton_1_1_1_1;
	private JButton btnNewButton_1_1_1_1_1;
	private JButton btnNewButton_1_1_1_1_1_1;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_2;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JDateChooser dobinput;
	private JTextField salaryinput;
	private JLabel lblNewLabel_1_1_5;
	private JTextField search;
	private JLabel photo;
	private JButton btnNewButton_1_1_1_2;
	private int eid;
	private JPanel panel_3;
	private JCalendar calendar;
	private JPanel panel_4;
	private JButton btnNewButton_1_1_1_1_2;
	private JButton btnNewButton_1_1_1_1_2_1;
	private JButton btnNewButton_1_1_1_1_2_1_1;
	private JButton btnNewButton_1_1_1_1_2_1_1_1;
	private JSeparator separator_1;
	private String Image_name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 20, 1289, 778);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getEmpidinput());
		contentPane.add(getLblName());
		contentPane.add(getEmpnameinput());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getEmpnumberinput());
		contentPane.add(getBtnmale());
		contentPane.add(getBtnfemale());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getEmpageinput());
		contentPane.add(getLblName_1_1());
		contentPane.add(getLblNewLabel_1_1_3());
		contentPane.add(getLblNewLabel_1_1_4());
		contentPane.add(getLblNewLabel_1_1_3_1());
		contentPane.add(getCmbshift());
		contentPane.add(getCmbdepartment());
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getPanel_2());
		contentPane.add(getPanel_3_1());
		contentPane.add(getPanel_4());
		
		Display_Emp_Data();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Employee ID");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel.setBounds(25, 283, 123, 29);
		}
		return lblNewLabel;
	}
	private JTextField getEmpidinput() {
		if (empidinput == null) {
			empidinput = new JTextField();
			empidinput.setBounds(152, 283, 198, 29);
			empidinput.setColumns(10);
		}
		return empidinput;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblName.setBounds(25, 332, 57, 29);
		}
		return lblName;
	}
	private JTextField getEmpnameinput() {
		if (empnameinput == null) {
			empnameinput = new JTextField();
			empnameinput.setColumns(10);
			empnameinput.setBounds(152, 332, 198, 29);
		}
		return empnameinput;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Number");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(25, 384, 94, 29);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getEmpnumberinput() {
		if (empnumberinput == null) {
			empnumberinput = new JTextField();
			empnumberinput.setColumns(10);
			empnumberinput.setBounds(152, 384, 198, 29);
		}
		return empnumberinput;
	}
	private JRadioButton getBtnmale() {
		if (btnmale == null) {
			btnmale = new JRadioButton("Male");
			buttonGroup.add(btnmale);
			btnmale.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnmale.setBounds(152, 495, 74, 21);
		}
		return btnmale;
	}
	private JRadioButton getBtnfemale() {
		if (btnfemale == null) {
			btnfemale = new JRadioButton("Female");
			buttonGroup.add(btnfemale);
			btnfemale.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnfemale.setBounds(245, 496, 103, 21);
		}
		return btnfemale;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Gender");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(25, 488, 82, 29);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Department");
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_2.setBounds(25, 541, 123, 29);
		}
		return lblNewLabel_1_1_2;
	}
	private JTextField getEmpageinput() {
		if (empageinput == null) {
			empageinput = new JTextField();
			empageinput.setColumns(10);
			empageinput.setBounds(152, 435, 198, 29);
		}
		return empageinput;
	}
	private JLabel getLblName_1_1() {
		if (lblAge == null) {
			lblAge = new JLabel("Age");
			lblAge.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAge.setBounds(25, 435, 57, 29);
		}
		return lblAge;
	}
	private JLabel getLblNewLabel_1_1_3() {
		if (lblNewLabel_1_1_3 == null) {
			lblNewLabel_1_1_3 = new JLabel("Shift");
			lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_3.setBounds(25, 588, 94, 29);
		}
		return lblNewLabel_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_4() {
		if (lblNewLabel_1_1_4 == null) {
			lblNewLabel_1_1_4 = new JLabel("Salary");
			lblNewLabel_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_4.setBounds(25, 633, 65, 29);
		}
		return lblNewLabel_1_1_4;
	}
	private JLabel getLblNewLabel_1_1_3_1() {
		if (lblNewLabel_1_1_3_1 == null) {
			lblNewLabel_1_1_3_1 = new JLabel("Date of Birth");
			lblNewLabel_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_3_1.setBounds(25, 672, 123, 29);
		}
		return lblNewLabel_1_1_3_1;
	}
	private JComboBox getCmbshift() {
		if (cmbshift == null) {
			cmbshift = new JComboBox();
			cmbshift.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbshift.setModel(new DefaultComboBoxModel(new String[] {" ---- Select ----", "Morning", "Day", "Evening", "Night"}));
			cmbshift.setBounds(152, 588, 198, 28);
		}
		return cmbshift;
	}
	private JComboBox getCmbdepartment() {
		if (cmbdepartment == null) {
			cmbdepartment = new JComboBox();
			cmbdepartment.setModel(new DefaultComboBoxModel(new String[] {" ----  Select  ----", "Computer", "Civil", "Electrical", "Mechanical"}));
			cmbdepartment.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbdepartment.setBounds(152, 541, 198, 28);
		}
		return cmbdepartment;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 269, 355, 446);
			panel.setLayout(null);
			panel.add(getDobinput());
			panel.add(getSalaryinput());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(387, 264, 205, 451);
			panel_1.setLayout(null);
			panel_1.add(getBtnNewButton());
			panel_1.add(getBtnDelete());
			panel_1.add(getBtnNewButton_1_1());
			panel_1.add(getBtnNewButton_1_1_1());
			panel_1.add(getBtnNewButton_1_1_1_1());
			panel_1.add(getBtnNewButton_1_1_1_1_1());
			panel_1.add(getBtnNewButton_1_1_1_1_1_1());
			panel_1.add(getSeparator());
		}
		return panel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Save");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Employee emp = new Employee();
					
					emp.setEmpid(eid);
//					emp.setEmpid(Integer.parseInt(empidinput.getText()));
					emp.setName(empnameinput.getText());
					emp.setNumber(empnumberinput.getText());
					emp.setAge(Integer.parseInt(empageinput.getText()));
					emp.setDepartment(cmbdepartment.getSelectedItem().toString());
					emp.setShift(cmbshift.getSelectedItem().toString());
					emp.setSalary(Integer.parseInt(salaryinput.getText()));
					emp.setDob(new Date(dobinput.getDate().getTime()));
					
					// Gender Code
					
					if(btnmale.isSelected()) {
						emp.setGender("Male");
					}else {
						emp.setGender("Female");
					}
					
					// Insert Image Code
					
					emp.setImage(Image_name);
					
					Emp_Service es = new Emp_Service_empl();
					boolean res = es.AddEmp(emp);
					
					if(res) {
						JOptionPane.showMessageDialog(null,"Data Sucessfully Update");
						new Dashboard().setVisible(true);
						dispose();
						
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Update Data");
					}
					
					
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(33, 26, 140, 37);
		}
		return btnNewButton;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null,"Please Select Any Data From Table");
						return;
					}
				
					int sel_row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(sel_row,0);
					
					Emp_Service es = new Emp_Service_empl();
					System.out.println(id);
					if(es.DelEmp(id)) {
						JOptionPane.showMessageDialog(null,"Data Deleted Sucessfully");
						Display_Emp_Data();
					}else {
						JOptionPane.showConfirmDialog(null,"Failed to Delete Data");
					}			
				}
			});
			btnDelete.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnDelete.setBounds(33, 83, 140, 37);
		}
		return btnDelete;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Edit");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null,"Please Select Any Data from Table");
						return;
					}
					
					int sel_row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(sel_row,0);
					
					Update_Emp ef = new Update_Emp();
					ef.View_Update_Employee_Data(id);
					ef.setVisible(true);
					dispose();
				}
			});
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1.setBounds(33, 143, 140, 37);
		}
		return btnNewButton_1_1;
	}
	private JButton getBtnNewButton_1_1_1() {
		if (btnNewButton_1_1_1 == null) {
			btnNewButton_1_1_1 = new JButton("Clear");
			btnNewButton_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Clear Input Box
					Clear_inputBox();
				}
			});
			btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1.setBounds(33, 197, 140, 37);
		}
		return btnNewButton_1_1_1;
	}
	private JButton getBtnNewButton_1_1_1_1() {
		if (btnNewButton_1_1_1_1 == null) {
			btnNewButton_1_1_1_1 = new JButton("Print");
			btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1_1.setBounds(33, 390, 140, 37);
		}
		return btnNewButton_1_1_1_1;
	}
	private JButton getBtnNewButton_1_1_1_1_1() {
		if (btnNewButton_1_1_1_1_1 == null) {
			btnNewButton_1_1_1_1_1 = new JButton("Export");
			btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						FileWriter fw = new FileWriter("d://Covid.csv");
						
						fw.write("Sushant Chadhary");
						int[] rows = table.getSelectedRows();
						
						DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
						
						for(int r : rows) {
							table.getModel();
						}
						
						fw.close();
						System.out.println("Data Export Sucessfull");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
				}
			});
			btnNewButton_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1_1_1.setBounds(33, 335, 140, 37);
		}
		return btnNewButton_1_1_1_1_1;
	}
	private JButton getBtnNewButton_1_1_1_1_1_1() {
		if (btnNewButton_1_1_1_1_1_1 == null) {
			btnNewButton_1_1_1_1_1_1 = new JButton("Import");
			btnNewButton_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1_1_1_1.setBounds(33, 281, 140, 37);
		}
		return btnNewButton_1_1_1_1_1_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(10, 260, 185, 20);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Operations");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1.setBounds(423, 228, 135, 29);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Employee Information");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1_2.setBounds(74, 233, 260, 29);
		}
		return lblNewLabel_1_2;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(621, 264, 644, 451);
			panel_2.setLayout(null);
			panel_2.add(getScrollPane());
		}
		return panel_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(new MouseAdapter() {
			});
			scrollPane.setBounds(10, 10, 624, 431);
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
					"Emp ID", "Name", "Number", "Age", "Gender", "Department", "Shift", "Salary", "DOB",
				}
			));
		}
		return table;
	}
	private JDateChooser getDobinput() {
		if (dobinput == null) {
			dobinput = new JDateChooser();
			dobinput.setBounds(140, 400, 198, 29);
		}
		return dobinput;
	}
	private JTextField getSalaryinput() {
		if (salaryinput == null) {
			salaryinput = new JTextField();
			salaryinput.setColumns(10);
			salaryinput.setBounds(140, 361, 198, 29);
		}
		return salaryinput;
	}
	

	private JLabel getLblNewLabel_1_1_5() {
		if (lblNewLabel_1_1_5 == null) {
			lblNewLabel_1_1_5 = new JLabel("Search");
			lblNewLabel_1_1_5.setBounds(10, 208, 94, 29);
			lblNewLabel_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 16));
		}
		return lblNewLabel_1_1_5;
	}
	private JTextField getSearch() {
		if (search == null) {
			search = new JTextField();
			search.setBounds(109, 208, 152, 29);
			search.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					String Search_data = search.getText().trim();
					Emp_Service es = new Emp_Service_empl();
					
					List<Employee> e_list = es.SearchEmp(Search_data);
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					for(Employee em : e_list) {
						tmodel.addRow(new Object[] {em.getEmpid(),em.getName(),em.getNumber(),em.getAge(),em.getGender(),em.getDepartment(),em.getShift(),em.getSalary(),em.getDob()});
					}
					
					
				}
			});
			search.setColumns(10);
		}
		return search;
	}
	private JLabel getPhoto() {
		if (photo == null) {
			photo = new JLabel("");
			photo.setBounds(286, 10, 162, 183);
			photo.setBorder(new LineBorder(new Color(0, 0, 0)));
		}
		return photo;
	}
	private JButton getBtnNewButton_1_1_1_2() {
		if (btnNewButton_1_1_1_2 == null) {
			btnNewButton_1_1_1_2 = new JButton("Upload");
			btnNewButton_1_1_1_2.setBounds(300, 200, 140, 37);
			btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser jfc = new JFileChooser();
					jfc.showOpenDialog(jfc);
					
					File Image = jfc.getSelectedFile();
					Image_name = Image.getName();
					
					photo.setIcon(new ImageIcon(new ImageIcon(Image.getAbsolutePath()).getImage().getScaledInstance(photo.getHeight(),photo.getWidth(),DO_NOTHING_ON_CLOSE)));
					
					// Save Photos on Img Folder
					File file_destin = new File("src/img/"+Image.getName());
					
					try {
						Files.copy(Image.toPath(),file_destin.toPath());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			btnNewButton_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		}
		return btnNewButton_1_1_1_2;
	}
	

	private JPanel getPanel_3_1() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3.setBounds(621, 10, 464, 247);
			panel_3.setLayout(null);
			panel_3.add(getLblNewLabel_1_1_5());
			panel_3.add(getSearch());
			panel_3.add(getBtnNewButton_1_1_1_2());
			panel_3.add(getPhoto());
			panel_3.add(getCalendar());
		}
		return panel_3;
	}
	private JCalendar getCalendar() {
		if (calendar == null) {
			calendar = new JCalendar();
			calendar.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			calendar.setBounds(10, 10, 254, 188);
		}
		return calendar;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_4.setBounds(1104, 10, 161, 246);
			panel_4.setLayout(null);
			panel_4.add(getBtnNewButton_1_1_1_1_2());
			panel_4.add(getBtnNewButton_1_1_1_1_2_1());
			panel_4.add(getBtnNewButton_1_1_1_1_2_1_1());
			panel_4.add(getBtnNewButton_1_1_1_1_2_1_1_1());
			panel_4.add(getSeparator_1());
		}
		return panel_4;
	}
	private JButton getBtnNewButton_1_1_1_1_2() {
		if (btnNewButton_1_1_1_1_2 == null) {
			btnNewButton_1_1_1_1_2 = new JButton("Logout");
			btnNewButton_1_1_1_1_2.setForeground(Color.WHITE);
			btnNewButton_1_1_1_1_2.setBackground(Color.RED);
			btnNewButton_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1_1_2.setBounds(10, 20, 140, 37);
		}
		return btnNewButton_1_1_1_1_2;
	}
	private JButton getBtnNewButton_1_1_1_1_2_1() {
		if (btnNewButton_1_1_1_1_2_1 == null) {
			btnNewButton_1_1_1_1_2_1 = new JButton("Report");
			btnNewButton_1_1_1_1_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Report().setVisible(true);
				}
			});
			btnNewButton_1_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1_1_2_1.setBounds(10, 95, 140, 37);
		}
		return btnNewButton_1_1_1_1_2_1;
	}
	private JButton getBtnNewButton_1_1_1_1_2_1_1() {
		if (btnNewButton_1_1_1_1_2_1_1 == null) {
			btnNewButton_1_1_1_1_2_1_1 = new JButton("Feed");
			btnNewButton_1_1_1_1_2_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new FeedBack().setVisible(true);
					
				}
			});
			btnNewButton_1_1_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1_1_2_1_1.setBounds(10, 145, 140, 37);
		}
		return btnNewButton_1_1_1_1_2_1_1;
	}
	private JButton getBtnNewButton_1_1_1_1_2_1_1_1() {
		if (btnNewButton_1_1_1_1_2_1_1_1 == null) {
			btnNewButton_1_1_1_1_2_1_1_1 = new JButton("About");
			btnNewButton_1_1_1_1_2_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new About().setVisible(true);
			
				}
			});
			btnNewButton_1_1_1_1_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1_1_2_1_1_1.setBounds(10, 195, 140, 37);
		}
		return btnNewButton_1_1_1_1_2_1_1_1;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(0, 78, 161, 27);
		}
		return separator_1;
	}
	
	
	
//	-----------------------------------------------------------------------------
	
	
	
	// Display Employee Data in Table
	
	private void Display_Emp_Data() {
		Emp_Service es = new Emp_Service_empl();
		List<Employee> emp_list = es.AllEmployee();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Employee em : emp_list) {
			eid = em.getEmpid();
			tmodel.addRow(new Object[] {em.getEmpid(),em.getName(),em.getNumber(),em.getAge(),em.getGender(),em.getDepartment(),em.getShift(),em.getSalary(),em.getDob()});
		}
	}
	
	//  Clear input box
	private void Clear_inputBox() {
		
		empidinput.setText("");
		empnameinput.setText("");
		empnumberinput.setText("");
		empageinput.setText("");
		cmbdepartment.setSelectedIndex(0);
		cmbshift.setSelectedIndex(0);
		salaryinput.setText("");
		dobinput.setDate(null);
		photo.setText("");
	}
	
	// View Emp Data From Table in InputBox
	
	public void View_Update_Employee_Data(int id) {
		
			eid = id;
	
		Emp_Service es = new Emp_Service_empl();
		Employee emp = es.getEmpById(id);
		
		empidinput.setText(String.valueOf(emp.getEmpid()));
		empnameinput.setText(emp.getName());
		empnumberinput.setText(emp.getNumber());
		empageinput.setText(String.valueOf(emp.getAge()));
		
		salaryinput.setText(String.valueOf(emp.getSalary()));
		dobinput.setDate(emp.getDob());
		
		// Combo box Code Set
		cmbdepartment.setSelectedItem(emp.getDepartment());
		cmbshift.setSelectedItem(emp.getShift());
		photo.setText(emp.getImage());
			
	}
	
}
