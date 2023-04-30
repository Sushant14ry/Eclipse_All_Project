package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;

import DB.conect;
import Model.emp;
import Service.emp_service;
import Service.emp_service_empl;

import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.border.LineBorder;

public class employ_form extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator_2;
	private JTextField fninput;
	private JLabel lblNewLabel_1;
	private JLabel lblLastName;
	private JTextField lninput;
	private JLabel lblCountry;
	private JComboBox cmbcountry;
	private JLabel lblState;
	private JComboBox cmbstate;
	private JLabel lblCity;
	private JTextField cityinput;
	private JButton btnNewButton_1;
	private JTextField ageinput;
	private JDateChooser dobinput;
	private JTextField phoneinput;
	private JLabel lblPhoneNo;
	private JLabel lblDateOfBirth;
	private JRadioButton otherbtn;
	private JRadioButton femalebtn;
	private JRadioButton malebtn;
	private JTextField emailinput;
	private JLabel lblEmail;
	private JLabel lblGender;
	private JLabel lblCompany;
	private JTextField cominput;
	private JLabel lblServiceType;
	private JRadioButton btnp;
	private JRadioButton btnc;
	private JLabel lblDepartment;
	private JComboBox cmbdepart;
	private JLabel lblPost;
	private JComboBox cmbpost;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_1_1;
	private JDateChooser jdateinput;
	private JLabel lblJoinDate_1;
	private JTextField salaryinput;
	private JLabel lblSalary;
	private JTextField zipinput;
	private JLabel lblAge_1;
	private JComboBox cmbqfn;
	private JLabel lblAge_1_1_1;
	private JLabel lblSearch;
	private JTextField textField_10;
	private JButton btnNewButton;
	private JButton btnClearForm_1;
	private JButton btnUpdateEmployee;
	private JButton btnUpdateEmployee_2;
	private JButton btnClearForm;
	private JSeparator separator_1;
	private JSeparator separator;
	private JScrollPane scrollPane;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblAge;
	private JLabel photos;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employ_form frame = new employ_form();
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
	public employ_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1223, 802);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator_2());
		contentPane.add(getFninput());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblLastName());
		contentPane.add(getLninput());
		contentPane.add(getLblCountry());
		contentPane.add(getCmbcountry());
		contentPane.add(getLblState());
		contentPane.add(getCmbstate());
		contentPane.add(getLblCity());
		contentPane.add(getCityinput());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getAgeinput());
		contentPane.add(getDobinput());
		contentPane.add(getPhoneinput());
		contentPane.add(getLblPhoneNo());
		contentPane.add(getLblDateOfBirth());
		contentPane.add(getOtherbtn());
		contentPane.add(getFemalebtn());
		contentPane.add(getMalebtn());
		contentPane.add(getEmailinput());
		contentPane.add(getLblEmail());
		contentPane.add(getLblGender());
		contentPane.add(getLblCompany());
		contentPane.add(getCominput());
		contentPane.add(getLblServiceType());
		contentPane.add(getBtnp());
		contentPane.add(getBtnc());
		contentPane.add(getLblDepartment());
		contentPane.add(getCmbdepart());
		contentPane.add(getLblPost());
		contentPane.add(getCmbpost());
		contentPane.add(getBtnNewButton_1_1());
		contentPane.add(getBtnNewButton_1_1_1());
		contentPane.add(getJdateinput());
		contentPane.add(getLblJoinDate_1());
		contentPane.add(getSalaryinput());
		contentPane.add(getLblSalary());
		contentPane.add(getZipinput());
		contentPane.add(getLblAge_1());
		contentPane.add(getCmbqfn());
		contentPane.add(getLblAge_1_1_1());
		contentPane.add(getLblSearch());
		contentPane.add(getTextField_10());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnClearForm_1());
		contentPane.add(getBtnUpdateEmployee());
		contentPane.add(getBtnUpdateEmployee_2());
		contentPane.add(getBtnClearForm());
		contentPane.add(getSeparator_1());
		contentPane.add(getSeparator());
		contentPane.add(getScrollPane());
		contentPane.add(getLblAge());
		contentPane.add(getPhotos());
		contentPane.add(getLblNewLabel_3());
		
//		 Show and Fetch all Data in Table from Database
		Display_Data();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Add Employees");
			lblNewLabel.setForeground(Color.GREEN);
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 22));
			lblNewLabel.setBounds(464, 10, 214, 46);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setBounds(446, 55, 222, 18);
		}
		return separator_2;
	}
	private JTextField getFninput() {
		if (fninput == null) {
			fninput = new JTextField();
			fninput.setColumns(10);
			fninput.setBounds(142, 76, 346, 32);
		}
		return fninput;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("First Name");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(28, 77, 112, 32);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblLastName.setBounds(532, 77, 105, 32);
		}
		return lblLastName;
	}
	private JTextField getLninput() {
		if (lninput == null) {
			lninput = new JTextField();
			lninput.setColumns(10);
			lninput.setBounds(654, 77, 346, 32);
		}
		return lninput;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCountry.setBounds(28, 123, 88, 32);
		}
		return lblCountry;
	}
	private JComboBox getCmbcountry() {
		if (cmbcountry == null) {
			cmbcountry = new JComboBox();
			cmbcountry.setModel(new DefaultComboBoxModel(new String[] {"---- Select ---", "NEPAL", "INDIA", "CANADA", "AUSTRALIA"}));
			cmbcountry.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbcountry.setBounds(145, 125, 123, 30);
		}
		return cmbcountry;
	}
	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblState.setBounds(295, 123, 65, 32);
		}
		return lblState;
	}
	private JComboBox getCmbstate() {
		if (cmbstate == null) {
			cmbstate = new JComboBox();
			cmbstate.setModel(new DefaultComboBoxModel(new String[] {"---- Select ----", "1", "2", "3", "4", "5", "6", "7"}));
			cmbstate.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbstate.setBounds(365, 125, 123, 30);
		}
		return cmbstate;
	}
	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCity.setBounds(532, 123, 59, 32);
		}
		return lblCity;
	}
	private JTextField getCityinput() {
		if (cityinput == null) {
			cityinput = new JTextField();
			cityinput.setColumns(10);
			cityinput.setBounds(654, 123, 346, 32);
		}
		return cityinput;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Upload");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JFileChooser jf = new JFileChooser();
					jf.showOpenDialog(null);
					
					File Image = jf.getSelectedFile();
					
					photos.setIcon(new ImageIcon( new ImageIcon(Image.getAbsolutePath()).getImage().getScaledInstance(photos.getWidth(),photos.getHeight(), DO_NOTHING_ON_CLOSE)));
					
//					Save Image in Folder
					File Destin_file = new File("src/Image/"+Image.getName());
					
					try {
						Files.copy(Image.toPath(),Destin_file.toPath());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1.setBounds(1022, 239, 150, 37);
		}
		return btnNewButton_1;
	}
	private JTextField getAgeinput() {
		if (ageinput == null) {
			ageinput = new JTextField();
			ageinput.setColumns(10);
			ageinput.setBounds(901, 244, 99, 32);
		}
		return ageinput;
	}
	private JDateChooser getDobinput() {
		if (dobinput == null) {
			dobinput = new JDateChooser();
			dobinput.setBounds(654, 244, 164, 30);
		}
		return dobinput;
	}
	private JTextField getPhoneinput() {
		if (phoneinput == null) {
			phoneinput = new JTextField();
			phoneinput.setColumns(10);
			phoneinput.setBounds(654, 187, 346, 32);
		}
		return phoneinput;
	}
	private JLabel getLblPhoneNo() {
		if (lblPhoneNo == null) {
			lblPhoneNo = new JLabel("Phone No");
			lblPhoneNo.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPhoneNo.setBounds(532, 182, 99, 32);
		}
		return lblPhoneNo;
	}
	private JLabel getLblDateOfBirth() {
		if (lblDateOfBirth == null) {
			lblDateOfBirth = new JLabel("Date of Birth");
			lblDateOfBirth.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblDateOfBirth.setBounds(532, 244, 123, 32);
		}
		return lblDateOfBirth;
	}
	private JRadioButton getOtherbtn() {
		if (otherbtn == null) {
			otherbtn = new JRadioButton("Other");
			buttonGroup_1.add(otherbtn);
			otherbtn.setFont(new Font("Arial Black", Font.BOLD, 14));
			otherbtn.setBackground(Color.WHITE);
			otherbtn.setBounds(383, 244, 105, 32);
		}
		return otherbtn;
	}
	private JRadioButton getFemalebtn() {
		if (femalebtn == null) {
			femalebtn = new JRadioButton("Female");
			buttonGroup_1.add(femalebtn);
			femalebtn.setFont(new Font("Arial Black", Font.BOLD, 14));
			femalebtn.setBackground(Color.WHITE);
			femalebtn.setBounds(247, 245, 105, 32);
		}
		return femalebtn;
	}
	private JRadioButton getMalebtn() {
		if (malebtn == null) {
			malebtn = new JRadioButton("Male");
			buttonGroup_1.add(malebtn);
			malebtn.setFont(new Font("Arial Black", Font.BOLD, 14));
			malebtn.setBackground(Color.WHITE);
			malebtn.setBounds(142, 246, 76, 30);
		}
		return malebtn;
	}
	private JTextField getEmailinput() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setColumns(10);
			emailinput.setBounds(142, 186, 346, 32);
		}
		return emailinput;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(28, 187, 112, 32);
		}
		return lblEmail;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblGender.setBounds(28, 244, 88, 32);
		}
		return lblGender;
	}
	private JLabel getLblCompany() {
		if (lblCompany == null) {
			lblCompany = new JLabel("Company");
			lblCompany.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCompany.setBounds(28, 298, 112, 32);
		}
		return lblCompany;
	}
	private JTextField getCominput() {
		if (cominput == null) {
			cominput = new JTextField();
			cominput.setColumns(10);
			cominput.setBounds(142, 302, 346, 32);
		}
		return cominput;
	}
	private JLabel getLblServiceType() {
		if (lblServiceType == null) {
			lblServiceType = new JLabel("Service Type");
			lblServiceType.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblServiceType.setBounds(532, 298, 128, 32);
		}
		return lblServiceType;
	}
	private JRadioButton getBtnp() {
		if (btnp == null) {
			btnp = new JRadioButton("Permanent");
			buttonGroup.add(btnp);
			btnp.setFont(new Font("Arial Black", Font.BOLD, 13));
			btnp.setBackground(Color.WHITE);
			btnp.setBounds(656, 299, 162, 32);
		}
		return btnp;
	}
	private JRadioButton getBtnc() {
		if (btnc == null) {
			btnc = new JRadioButton("Contract");
			buttonGroup.add(btnc);
			btnc.setFont(new Font("Arial Black", Font.BOLD, 13));
			btnc.setBackground(Color.WHITE);
			btnc.setBounds(862, 299, 138, 32);
		}
		return btnc;
	}
	private JLabel getLblDepartment() {
		if (lblDepartment == null) {
			lblDepartment = new JLabel("Department");
			lblDepartment.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblDepartment.setBounds(28, 345, 112, 32);
		}
		return lblDepartment;
	}
	private JComboBox getCmbdepart() {
		if (cmbdepart == null) {
			cmbdepart = new JComboBox();
			cmbdepart.setModel(new DefaultComboBoxModel(new String[] {"---- Select ----", "COMPUTER", "CIVIL", "ELECTRICAL", "MECHANICAL"}));
			cmbdepart.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbdepart.setBounds(142, 347, 346, 30);
		}
		return cmbdepart;
	}
	private JLabel getLblPost() {
		if (lblPost == null) {
			lblPost = new JLabel("Post");
			lblPost.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPost.setBounds(535, 345, 65, 32);
		}
		return lblPost;
	}
	private JComboBox getCmbpost() {
		if (cmbpost == null) {
			cmbpost = new JComboBox();
			cmbpost.setModel(new DefaultComboBoxModel(new String[] {"---- Select ----", "Senior", "junior", "intern", "manager"}));
			cmbpost.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbpost.setBounds(654, 347, 344, 30);
		}
		return cmbpost;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Export Data");
			btnNewButton_1_1.setForeground(Color.WHITE);
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1.setBackground(Color.GREEN);
			btnNewButton_1_1.setBounds(1022, 340, 150, 37);
		}
		return btnNewButton_1_1;
	}
	private JButton getBtnNewButton_1_1_1() {
		if (btnNewButton_1_1_1 == null) {
			btnNewButton_1_1_1 = new JButton("Print Record");
			btnNewButton_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_1_1_1.setForeground(Color.WHITE);
			btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1.setBackground(Color.MAGENTA);
			btnNewButton_1_1_1.setBounds(1021, 394, 150, 37);
		}
		return btnNewButton_1_1_1;
	}
	private JDateChooser getJdateinput() {
		if (jdateinput == null) {
			jdateinput = new JDateChooser();
			jdateinput.setBounds(888, 399, 112, 30);
		}
		return jdateinput;
	}
	private JLabel getLblJoinDate_1() {
		if (lblJoinDate_1 == null) {
			lblJoinDate_1 = new JLabel("Join Date");
			lblJoinDate_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblJoinDate_1.setBounds(790, 399, 88, 32);
		}
		return lblJoinDate_1;
	}
	private JTextField getSalaryinput() {
		if (salaryinput == null) {
			salaryinput = new JTextField();
			salaryinput.setColumns(10);
			salaryinput.setBounds(654, 399, 99, 32);
		}
		return salaryinput;
	}
	private JLabel getLblSalary() {
		if (lblSalary == null) {
			lblSalary = new JLabel("Salary");
			lblSalary.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblSalary.setBounds(532, 399, 112, 32);
		}
		return lblSalary;
	}
	private JTextField getZipinput() {
		if (zipinput == null) {
			zipinput = new JTextField();
			zipinput.setColumns(10);
			zipinput.setBounds(389, 399, 99, 32);
		}
		return zipinput;
	}
	private JLabel getLblAge_1() {
		if (lblAge_1 == null) {
			lblAge_1 = new JLabel("Zip");
			lblAge_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAge_1.setBounds(336, 399, 41, 32);
		}
		return lblAge_1;
	}
	private JComboBox getCmbqfn() {
		if (cmbqfn == null) {
			cmbqfn = new JComboBox();
			cmbqfn.setModel(new DefaultComboBoxModel(new String[] {"---- Select ----", "+2 PASS", "CSIT", "BSC", "BTECH", "BIT", ""}));
			cmbqfn.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbqfn.setBounds(142, 399, 164, 30);
		}
		return cmbqfn;
	}
	private JLabel getLblAge_1_1_1() {
		if (lblAge_1_1_1 == null) {
			lblAge_1_1_1 = new JLabel("Qualification");
			lblAge_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAge_1_1_1.setBounds(28, 396, 112, 32);
		}
		return lblAge_1_1_1;
	}
	private JLabel getLblSearch() {
		if (lblSearch == null) {
			lblSearch = new JLabel("Search");
			lblSearch.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblSearch.setBounds(46, 482, 88, 32);
		}
		return lblSearch;
	}
	private JTextField getTextField_10() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String Search_data = textField_10.getText().trim();
					emp_service es = new emp_service_empl();
					
					List<emp> e_lists = es.SearchEmp(Search_data);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(emp emp : e_lists) {
//						tmodel.addRow(new Object[] {emp.getId(),emp.getFname(),emp.getCity(),emp.getPost(),emp.getPhone()});
						tmodel.addRow(new Object[] {emp.getId(),emp.getFname()+" "+emp.getLname(),emp.getCity(),emp.getEmail(),emp.getPhone(),emp.getGender(),emp.getDob(),emp.getCompany(),emp.getService(),emp.getDepartment(),emp.getPost(),emp.getSalary(),emp.getJoinDate()});
					}
					
					
				}
			});
			textField_10.setColumns(10);
			textField_10.setBounds(142, 477, 190, 40);
		}
		return textField_10;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add Employee");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					emp employ = new emp();
					
					employ.setFname(fninput.getText());
					employ.setLname(lninput.getText());
					employ.setCountry(cmbcountry.getSelectedItem().toString());
					employ.setState(cmbstate.getSelectedItem().toString());
					employ.setCity(cityinput.getText());;
					employ.setEmail(emailinput.getText());
					employ.setPhone(phoneinput.getText());
					employ.setCompany(cominput.getText());
					employ.setDepartment(cmbdepart.getSelectedItem().toString());
					employ.setPost(cmbpost.getSelectedItem().toString());
					employ.setQualification(cmbqfn.getSelectedItem().toString());
					employ.setSalary(Integer.parseInt(salaryinput.getText()));
					employ.setZip(zipinput.getText());
					employ.setAge(Integer.parseInt(ageinput.getText()));
					
					// Radio Button Get Data
					if(malebtn.isSelected()) {
						employ.setGender("Male");
					}else if(femalebtn.isSelected()) {
						employ.setGender("Male");
					}else {
						employ.setGender("other");
					}
					
					// Service type Get Data
					if(btnp.isSelected()) {
						employ.setService("Parmanent");
					}else {
						employ.setService("Contract");
					}
				
					// Get Date Input Data
					employ.setDob(new Date(dobinput.getDate().getTime()));
					employ.setJoinDate(new Date(jdateinput.getDate().getTime()));
					
//					------------------- Input data From User Finished ------------------
					
					// Set Employee Object to Employee Table
					emp_service es = new emp_service_empl();
					boolean res = es.addEmp(employ);
					
					if(res) {
						JOptionPane.showMessageDialog(null,"Employee Added Success");
//						 Show and Fetch all Data in Table from Database
						Display_Data();
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Added Employee");
					}
					
//					--------------------------------------------------------------------
					
				}
				
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnNewButton.setBackground(Color.BLUE);
			btnNewButton.setBounds(446, 477, 174, 40);
		}
		return btnNewButton;
	}
	private JButton getBtnClearForm_1() {
		if (btnClearForm_1 == null) {
			btnClearForm_1 = new JButton("View");
			btnClearForm_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow() < 0 ) {
						JOptionPane.showMessageDialog(null,"Select Any Row Data");
						return;
					}
					
					int sel_row = table.getSelectedRow();
					int ids = (int) table.getModel().getValueAt(sel_row,0);
					
					view_emp_data ved = new view_emp_data();
					ved.SetDataForEdit(ids);
					ved.setVisible(true);
					dispose();
					
				}
			});
			btnClearForm_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnClearForm_1.setBackground(Color.WHITE);
			btnClearForm_1.setBounds(342, 477, 94, 40);
		}
		return btnClearForm_1;
	}
	private JButton getBtnUpdateEmployee() {
		if (btnUpdateEmployee == null) {
			btnUpdateEmployee = new JButton("Delete Employee");
			btnUpdateEmployee.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow() < 0 ) {
						JOptionPane.showMessageDialog(null,"Select Any Row Data");
						return;
					}
					
					int sel_row = table.getSelectedRow();
					int ids = (int) table.getModel().getValueAt(sel_row,0);
					
					emp_service ess = new emp_service_empl();
					if(ess.delEmp(ids)) {
						JOptionPane.showMessageDialog(null,"Deleted Sucess");
						Display_Data();
					}else {
						JOptionPane.showMessageDialog(null,"Delete Failed");
					}
				}
			});
			btnUpdateEmployee.setForeground(Color.WHITE);
			btnUpdateEmployee.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnUpdateEmployee.setBackground(Color.RED);
			btnUpdateEmployee.setBounds(636, 477, 174, 40);
		}
		return btnUpdateEmployee;
	}
	private JButton getBtnUpdateEmployee_2() {
		if (btnUpdateEmployee_2 == null) {
			btnUpdateEmployee_2 = new JButton("Edit Employee");
			btnUpdateEmployee_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null,"Please Select Any Data from Table");
						return;
					}
					
					int sel_row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(sel_row,0);
					
					edit_employ_data ef = new edit_employ_data();
					ef.SetDataForEdit(id);
					ef.setVisible(true);
					dispose();
				}
			});
			btnUpdateEmployee_2.setForeground(Color.BLACK);
			btnUpdateEmployee_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnUpdateEmployee_2.setBackground(Color.CYAN);
			btnUpdateEmployee_2.setBounds(825, 477, 187, 40);
		}
		return btnUpdateEmployee_2;
	}
	private JButton getBtnClearForm() {
		if (btnClearForm == null) {
			btnClearForm = new JButton("Clear Form");
			btnClearForm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fninput.setText(" ");
					lninput.setText(" ");
					cmbcountry.setSelectedIndex(0);
					cmbstate.setSelectedIndex(0);
					cityinput.setText(" ");
					emailinput.setText(" ");
					phoneinput.setText(" ");
					cominput.setText(" ");
					cmbdepart.setSelectedIndex(0);
					cmbpost.setSelectedIndex(0);
					cmbqfn.setSelectedIndex(0);
					zipinput.setText("");
					salaryinput.setText("");
					buttonGroup.clearSelection();
					buttonGroup_1.clearSelection();
					dobinput.setDate(null);
					jdateinput.setDate(null);
					
						
				}
			});
			btnClearForm.setForeground(Color.WHITE);
			btnClearForm.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnClearForm.setBackground(Color.LIGHT_GRAY);
			btnClearForm.setBounds(1026, 477, 145, 40);
		}
		return btnClearForm;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(28, 532, 1143, 30);
		}
		return separator_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(28, 451, 1143, 30);
		}
		return separator;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(28, 545, 1143, 216);
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
						"ID", "Full Name", "City", "Email", "Phone No", "Gender", "DOB", "Company", "Service", "Department", "Post", "Salary", "Join Date"
				}
			));
		}
		return table;
	}
	private JLabel getLblAge() {
		if (lblAge == null) {
			lblAge = new JLabel("Age");
			lblAge.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAge.setBounds(852, 244, 41, 32);
		}
		return lblAge;
	}
	
//	Show Data in JTable
	
	private void Display_Data() {
		emp_service es = new emp_service_empl();
		List<emp> emp_list = es.getAllEmp();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(emp emp_l : emp_list) {
			tmodel.addRow(new Object[] {emp_l.getId(),emp_l.getFname()+" "+emp_l.getLname(),emp_l.getCity(),emp_l.getEmail(),emp_l.getPhone(),emp_l.getGender(),emp_l.getDob(),emp_l.getCompany(),emp_l.getService(),emp_l.getDepartment(),emp_l.getPost(),emp_l.getSalary(),emp_l.getJoinDate()});
		}
	}
	private JLabel getPhotos() {
		if (photos == null) {
			photos = new JLabel("");
			photos.setBorder(new LineBorder(new Color(0, 0, 0)));
			photos.setBounds(1022, 76, 150, 157);
		}
		return photos;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Photos");
			lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_3.setBounds(1069, 151, 65, 18);
		}
		return lblNewLabel_3;
	}
}
