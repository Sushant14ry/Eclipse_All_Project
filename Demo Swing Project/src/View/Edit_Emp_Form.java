package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Panel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

import Model.Employee;
import Service.Employee_Service;
import Service.Employee_Service_Impl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Edit_Emp_Form extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField fnameinput;
	private JLabel lblLastName;
	private JTextField lnameinput;
	private JLabel lblCountry;
	private JComboBox cmbcountry;
	private JComboBox cmbstate;
	private JLabel lblCity;
	private JTextField cityinput;
	private JTextField phoneinput;
	private JLabel lblAge;
	private JTextField ageinput;
	private JRadioButton btnc;
	private JRadioButton btnp;
	private JLabel lblServiceType;
	private JLabel lblDateOfBirth;
	private JLabel lblPhoneNo;
	private JLabel lblPost;
	private JComboBox cmbpost;
	private JTextField salaryinput;
	private JLabel lblSalary;
	private JComboBox cmbdepart;
	private JTextField companyinput;
	private JRadioButton otherbtn;
	private JRadioButton femalebtn;
	private JRadioButton malebtn;
	private JLabel lblGender;
	private JLabel lblEmail;
	private JTextField emailinput;
	private JLabel lblState;
	private JLabel lblCompany;
	private JLabel lblDepartment;
	private JButton btnUpdateEmployee_2;
	private JButton btnClearForm;
	private JSeparator separator;
	private JSeparator separator_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_1_1;
	private JSeparator separator_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtPhotos;
	private JDateChooser dobinput;
	private JLabel lblAge_1;
	private JTextField zipinput;
	private JLabel lblAge_1_1_1;
	private JComboBox cmbqfn;
	private JLabel lblJoinDate_1;
	private JDateChooser jdateinput;
	private int eid;
	private JButton btnBack;
	private JButton btnUpdateEmployee_2_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit_Emp_Form frame = new Edit_Emp_Form();
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
	public Edit_Emp_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 1200, 801);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getFnameinput());
		contentPane.add(getLblLastName());
		contentPane.add(getLnameinput());
		contentPane.add(getLblCountry());
		contentPane.add(getCmbcountry());
		contentPane.add(getCmbstate());
		contentPane.add(getLblCity());
		contentPane.add(getCityinput());
		contentPane.add(getPhoneinput());
		contentPane.add(getLblAge());
		contentPane.add(getAgeinput());
		contentPane.add(getBtnc());
		contentPane.add(getBtnp());
		contentPane.add(getLblServiceType());
		contentPane.add(getLblDateOfBirth());
		contentPane.add(getLblPhoneNo());
		contentPane.add(getLblPost());
		contentPane.add(getCmbpost());
		contentPane.add(getSalaryinput());
		contentPane.add(getLblSalary());
		contentPane.add(getCmbdepart());
		contentPane.add(getCompanyinput());
		contentPane.add(getOtherbtn());
		contentPane.add(getFemalebtn());
		contentPane.add(getMalebtn());
		contentPane.add(getLblGender());
		contentPane.add(getLblEmail());
		contentPane.add(getEmailinput());
		contentPane.add(getLblState());
		contentPane.add(getLblCompany());
		contentPane.add(getLblDepartment());
		contentPane.add(getBtnUpdateEmployee_2());
		contentPane.add(getBtnClearForm());
		contentPane.add(getSeparator());
		contentPane.add(getSeparator_1());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_1_1());
		contentPane.add(getBtnNewButton_1_1_1());
		contentPane.add(getSeparator_2());
		contentPane.add(getTxtPhotos());
		contentPane.add(getDobinput());
		contentPane.add(getLblAge_1());
		contentPane.add(getZipinput());
		contentPane.add(getLblAge_1_1_1());
		contentPane.add(getCmbqfn());
		contentPane.add(getLblJoinDate_1());
		contentPane.add(getJdateinput());
		contentPane.add(getBtnUpdateEmployee_2_1());
		

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Update Employee");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 22));
			lblNewLabel.setBounds(450, 10, 226, 40);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("First Name");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(32, 77, 112, 32);
		}
		return lblNewLabel_1;
	}
	private JTextField getFnameinput() {
		if (fnameinput == null) {
			fnameinput = new JTextField();
			fnameinput.setColumns(10);
			fnameinput.setBounds(146, 76, 346, 32);
		}
		return fnameinput;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblLastName.setBounds(536, 77, 105, 32);
		}
		return lblLastName;
	}
	private JTextField getLnameinput() {
		if (lnameinput == null) {
			lnameinput = new JTextField();
			lnameinput.setColumns(10);
			lnameinput.setBounds(658, 77, 346, 32);
		}
		return lnameinput;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCountry.setBounds(32, 134, 88, 32);
		}
		return lblCountry;
	}
	private JComboBox getCmbcountry() {
		if (cmbcountry == null) {
			cmbcountry = new JComboBox();
			cmbcountry.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbcountry.setModel(new DefaultComboBoxModel(new String[] {"--- Select ---", "NEPAL", "INIDA", "PAKISTAN", "SRILANKA", "BHUTAN", "AFGANISTAN"}));
			cmbcountry.setBounds(149, 136, 123, 30);
		}
		return cmbcountry;
	}
	private JComboBox getCmbstate() {
		if (cmbstate == null) {
			cmbstate = new JComboBox();
			cmbstate.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbstate.setModel(new DefaultComboBoxModel(new String[] {"-- Select --", "1", "2", "3", "4", "5", "6", "7"}));
			cmbstate.setBounds(369, 136, 123, 30);
		}
		return cmbstate;
	}
	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCity.setBounds(536, 134, 59, 32);
		}
		return lblCity;
	}
	private JTextField getCityinput() {
		if (cityinput == null) {
			cityinput = new JTextField();
			cityinput.setColumns(10);
			cityinput.setBounds(658, 134, 346, 32);
		}
		return cityinput;
	}
	private JTextField getPhoneinput() {
		if (phoneinput == null) {
			phoneinput = new JTextField();
			phoneinput.setColumns(10);
			phoneinput.setBounds(658, 198, 346, 32);
		}
		return phoneinput;
	}
	private JLabel getLblAge() {
		if (lblAge == null) {
			lblAge = new JLabel("Age");
			lblAge.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAge.setBounds(848, 255, 47, 32);
		}
		return lblAge;
	}
	private JTextField getAgeinput() {
		if (ageinput == null) {
			ageinput = new JTextField();
			ageinput.setColumns(10);
			ageinput.setBounds(905, 255, 99, 32);
		}
		return ageinput;
	}
	private JRadioButton getBtnc() {
		if (btnc == null) {
			btnc = new JRadioButton("Contract");
			buttonGroup_1.add(btnc);
			btnc.setFont(new Font("Arial Black", Font.BOLD, 13));
			btnc.setBackground(Color.WHITE);
			btnc.setBounds(866, 310, 138, 32);
		}
		return btnc;
	}
	private JRadioButton getBtnp() {
		if (btnp == null) {
			btnp = new JRadioButton("Permanent");
			buttonGroup_1.add(btnp);
			btnp.setFont(new Font("Arial Black", Font.BOLD, 13));
			btnp.setBackground(Color.WHITE);
			btnp.setBounds(660, 310, 162, 32);
		}
		return btnp;
	}
	private JLabel getLblServiceType() {
		if (lblServiceType == null) {
			lblServiceType = new JLabel("Service Type");
			lblServiceType.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblServiceType.setBounds(536, 309, 128, 32);
		}
		return lblServiceType;
	}
	private JLabel getLblDateOfBirth() {
		if (lblDateOfBirth == null) {
			lblDateOfBirth = new JLabel("Date of Birth");
			lblDateOfBirth.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblDateOfBirth.setBounds(536, 255, 123, 32);
		}
		return lblDateOfBirth;
	}
	private JLabel getLblPhoneNo() {
		if (lblPhoneNo == null) {
			lblPhoneNo = new JLabel("Phone No");
			lblPhoneNo.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPhoneNo.setBounds(536, 193, 99, 32);
		}
		return lblPhoneNo;
	}
	private JLabel getLblPost() {
		if (lblPost == null) {
			lblPost = new JLabel("Post");
			lblPost.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPost.setBounds(539, 368, 65, 32);
		}
		return lblPost;
	}
	private JComboBox getCmbpost() {
		if (cmbpost == null) {
			cmbpost = new JComboBox();
			cmbpost.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbpost.setModel(new DefaultComboBoxModel(new String[] {"---------- Select Post ----------", "Senior Developer", "Product Manager", "Junior Developer", "Interns"}));
			cmbpost.setBounds(658, 370, 344, 30);
		}
		return cmbpost;
	}
	private JTextField getSalaryinput() {
		if (salaryinput == null) {
			salaryinput = new JTextField();
			salaryinput.setColumns(10);
			salaryinput.setBounds(658, 422, 99, 32);
		}
		return salaryinput;
	}
	private JLabel getLblSalary() {
		if (lblSalary == null) {
			lblSalary = new JLabel("Salary");
			lblSalary.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblSalary.setBounds(536, 422, 112, 32);
		}
		return lblSalary;
	}
	private JComboBox getCmbdepart() {
		if (cmbdepart == null) {
			cmbdepart = new JComboBox();
			cmbdepart.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbdepart.setModel(new DefaultComboBoxModel(new String[] {"-------- Select Department --------", "Marketing", "Web desingning", "Seo Marketer", "Tester"}));
			cmbdepart.setBounds(146, 370, 346, 30);
		}
		return cmbdepart;
	}
	private JTextField getCompanyinput() {
		if (companyinput == null) {
			companyinput = new JTextField();
			companyinput.setColumns(10);
			companyinput.setBounds(146, 313, 346, 32);
		}
		return companyinput;
	}
	private JRadioButton getOtherbtn() {
		if (otherbtn == null) {
			otherbtn = new JRadioButton("Other");
			buttonGroup.add(otherbtn);
			otherbtn.setFont(new Font("Arial Black", Font.BOLD, 14));
			otherbtn.setBackground(Color.WHITE);
			otherbtn.setBounds(387, 255, 105, 32);
		}
		return otherbtn;
	}
	private JRadioButton getFemalebtn() {
		if (femalebtn == null) {
			femalebtn = new JRadioButton("Female");
			buttonGroup.add(femalebtn);
			femalebtn.setFont(new Font("Arial Black", Font.BOLD, 14));
			femalebtn.setBackground(Color.WHITE);
			femalebtn.setBounds(251, 256, 105, 32);
		}
		return femalebtn;
	}
	private JRadioButton getMalebtn() {
		if (malebtn == null) {
			malebtn = new JRadioButton("Male");
			buttonGroup.add(malebtn);
			malebtn.setFont(new Font("Arial Black", Font.BOLD, 14));
			malebtn.setBackground(Color.WHITE);
			malebtn.setBounds(146, 257, 76, 30);
		}
		return malebtn;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblGender.setBounds(32, 255, 88, 32);
		}
		return lblGender;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(32, 198, 112, 32);
		}
		return lblEmail;
	}
	private JTextField getEmailinput() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setColumns(10);
			emailinput.setBounds(146, 197, 346, 32);
		}
		return emailinput;
	}
	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblState.setBounds(299, 134, 65, 32);
		}
		return lblState;
	}
	private JLabel getLblCompany() {
		if (lblCompany == null) {
			lblCompany = new JLabel("Company");
			lblCompany.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCompany.setBounds(32, 309, 112, 32);
		}
		return lblCompany;
	}
	private JLabel getLblDepartment() {
		if (lblDepartment == null) {
			lblDepartment = new JLabel("Department");
			lblDepartment.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblDepartment.setBounds(32, 368, 112, 32);
		}
		return lblDepartment;
	}
	private JButton getBtnUpdateEmployee_2() {
		if (btnUpdateEmployee_2 == null) {
			btnUpdateEmployee_2 = new JButton("Update Employee");
			btnUpdateEmployee_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Employee emp = new Employee();
					
					emp.setId(eid);
					emp.setFname(fnameinput.getText());
					emp.setLname(lnameinput.getText());
					emp.setCountry(cmbcountry.getSelectedItem().toString());
					emp.setState(cmbstate.getSelectedItem().toString());
					emp.setCity(cityinput.getText());
					emp.setEmail(emailinput.getText());
					emp.setPhone(phoneinput.getText());
					emp.setCompany(companyinput.getText());
					emp.setDepartment(cmbdepart.getSelectedItem().toString());
					emp.setPost(cmbpost.getSelectedItem().toString());
					emp.setQualification(cmbqfn.getSelectedItem().toString());
					emp.setSalary(Integer.parseInt(salaryinput.getText()));
					emp.setZip(zipinput.getText());
					emp.setAge(Integer.parseInt(ageinput.getText()));
					
					// date Coding 
					emp.setDob(new Date(dobinput.getDate().getTime()));
					emp.setJoinDate(new Date(jdateinput.getDate().getTime()));
					
					// Gender Button
					if(malebtn.isSelected()) {
						emp.setGender("Male");
					}else if(femalebtn.isSelected()) {
						emp.setGender("Female");
					}else {
						emp.setGender("Other");
					}
					
					// Service Type
					if(btnp.isSelected()) {
						emp.setService("Parmanent");
					}else {
						emp.setService("Contract");
					}
					
					
					// Set Employee object to employee Table
					Employee_Service es = new Employee_Service_Impl();
					boolean response = es.updateEmployee(emp);
					
					if(response) {
						JOptionPane.showMessageDialog(null,"Update Success");
						new Emp_Form().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null,"Failed");
					}
					
				}
			});
			btnUpdateEmployee_2.setForeground(Color.BLACK);
			btnUpdateEmployee_2.setBackground(Color.CYAN);
			btnUpdateEmployee_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnUpdateEmployee_2.setBounds(519, 500, 187, 40);
		}
		return btnUpdateEmployee_2;
	}
	private JButton getBtnClearForm() {
		if (btnClearForm == null) {
			btnClearForm = new JButton("Clear Form");
			btnClearForm.setForeground(Color.WHITE);
			btnClearForm.setBackground(Color.LIGHT_GRAY);
			btnClearForm.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnClearForm.setBounds(974, 500, 145, 40);
		}
		return btnClearForm;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(32, 474, 1143, 30);
		}
		return separator;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(32, 555, 1143, 30);
		}
		return separator_1;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Upload");
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1.setBounds(1026, 250, 150, 37);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Export Data");
			btnNewButton_1_1.setForeground(Color.WHITE);
			btnNewButton_1_1.setBackground(Color.GREEN);
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1.setBounds(1026, 363, 150, 37);
		}
		return btnNewButton_1_1;
	}
	private JButton getBtnNewButton_1_1_1() {
		if (btnNewButton_1_1_1 == null) {
			btnNewButton_1_1_1 = new JButton("Print Record");
			btnNewButton_1_1_1.setForeground(Color.WHITE);
			btnNewButton_1_1_1.setBackground(Color.MAGENTA);
			btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1.setBounds(1025, 417, 150, 37);
		}
		return btnNewButton_1_1_1;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setBounds(431, 48, 261, 18);
		}
		return separator_2;
	}
	private JTextField getTxtPhotos() {
		if (txtPhotos == null) {
			txtPhotos = new JTextField();
			txtPhotos.setHorizontalAlignment(SwingConstants.CENTER);
			txtPhotos.setFont(new Font("Arial Black", Font.BOLD, 16));
			txtPhotos.setText("Photos");
			txtPhotos.setBounds(1026, 77, 150, 153);
			txtPhotos.setColumns(10);
		}
		return txtPhotos;
	}
	private JDateChooser getDobinput() {
		if (dobinput == null) {
			dobinput = new JDateChooser();
			dobinput.getCalendarButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			dobinput.setBounds(658, 255, 164, 30);
		}
		return dobinput;
	}
	private JLabel getLblAge_1() {
		if (lblAge_1 == null) {
			lblAge_1 = new JLabel("Zip");
			lblAge_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAge_1.setBounds(340, 422, 41, 32);
		}
		return lblAge_1;
	}
	private JTextField getZipinput() {
		if (zipinput == null) {
			zipinput = new JTextField();
			zipinput.setColumns(10);
			zipinput.setBounds(393, 422, 99, 32);
		}
		return zipinput;
	}
	private JLabel getLblAge_1_1_1() {
		if (lblAge_1_1_1 == null) {
			lblAge_1_1_1 = new JLabel("Qualification");
			lblAge_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAge_1_1_1.setBounds(32, 419, 112, 32);
		}
		return lblAge_1_1_1;
	}
	private JComboBox getCmbqfn() {
		if (cmbqfn == null) {
			cmbqfn = new JComboBox();
			cmbqfn.setModel(new DefaultComboBoxModel(new String[] {"---- Select ----", "+2 Pass", "BTECH", "CSIT", "BCOM", "BIT", "MIT", "MTECH", "BSC", "MSC"}));
			cmbqfn.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbqfn.setBounds(146, 422, 164, 30);
		}
		return cmbqfn;
	}
	private JLabel getLblJoinDate_1() {
		if (lblJoinDate_1 == null) {
			lblJoinDate_1 = new JLabel("Join Date");
			lblJoinDate_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblJoinDate_1.setBounds(794, 422, 88, 32);
		}
		return lblJoinDate_1;
	}
	private JDateChooser getJdateinput() {
		if (jdateinput == null) {
			jdateinput = new JDateChooser();
			jdateinput.setBounds(892, 422, 112, 30);
		}
		return jdateinput;
	}
	
	private JButton getBtnUpdateEmployee_2_1() {
		if (btnUpdateEmployee_2_1 == null) {
			btnUpdateEmployee_2_1 = new JButton("Back");
			btnUpdateEmployee_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Emp_Form().setVisible(true);
					dispose();
				}
			});
			btnUpdateEmployee_2_1.setForeground(Color.BLACK);
			btnUpdateEmployee_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnUpdateEmployee_2_1.setBackground(Color.WHITE);
			btnUpdateEmployee_2_1.setBounds(146, 500, 187, 40);
		}
		return btnUpdateEmployee_2_1;
	}
	
	// Set Data for Edit
	
	public void SetDataForEdit(int id) {
		
		eid = id;
		
		Employee_Service es = new Employee_Service_Impl();
		Employee emp = es.getEmpById(id);
		
		fnameinput.setText(emp.getFname());
		lnameinput.setText(emp.getLname());
		cmbcountry.setSelectedItem(emp.getCountry());
		cmbstate.setSelectedItem(emp.getState());
		cityinput.setText(emp.getCity());
		emailinput.setText(emp.getEmail());
		ageinput.setText(String.valueOf(emp.getAge()));
		phoneinput.setText(emp.getPhone());
		companyinput.setText(emp.getCompany());
		cmbpost.setSelectedItem(emp.getPost());
		cmbdepart.setSelectedItem(emp.getDepartment());
		cmbqfn.setSelectedItem(emp.getQualification());
		zipinput.setText(emp.getZip());
		salaryinput.setText(String.valueOf(emp.getSalary()));
		
		
		// Update Radio Button Code
		if(emp.getGender().equalsIgnoreCase("Male")) {
			malebtn.setSelected(true);
		}else if(emp.getGender().equalsIgnoreCase("Female")) {
			femalebtn.setSelected(true);
		}else {
			otherbtn.setSelected(true);
		}
		
		if(emp.getService().equalsIgnoreCase("Parmanent")) {
			btnp.setSelected(true);
		}else {
			btnc.setSelected(true);
		}
		
		// Update Date Code
		
		dobinput.setDate(emp.getDob());
		jdateinput.setDate(emp.getJoinDate());
		
		
	}
	
	
}


