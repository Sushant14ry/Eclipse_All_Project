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

public class view_emp_data extends JFrame {

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
	private JTextField textField_3;
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
	private JDateChooser jdateinput;
	private JLabel lblJoinDate_1;
	private JTextField salaryinput;
	private JLabel lblSalary;
	private JTextField zipinput;
	private JLabel lblAge_1;
	private JComboBox cmbqfn;
	private JLabel lblAge_1_1_1;
	private JButton btnClearForm;
	private JSeparator separator_1;
	private JSeparator separator;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblAge;
	private int eid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_emp_data frame = new view_emp_data();
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
	public view_emp_data() {
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
		contentPane.add(getTextField_3());
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
		contentPane.add(getJdateinput());
		contentPane.add(getLblJoinDate_1());
		contentPane.add(getSalaryinput());
		contentPane.add(getLblSalary());
		contentPane.add(getZipinput());
		contentPane.add(getLblAge_1());
		contentPane.add(getCmbqfn());
		contentPane.add(getLblAge_1_1_1());
		contentPane.add(getBtnClearForm());
		contentPane.add(getSeparator_1());
		contentPane.add(getSeparator());
		contentPane.add(getLblAge());
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("View Employees Data");
			lblNewLabel.setForeground(Color.GREEN);
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 22));
			lblNewLabel.setBounds(417, 10, 278, 46);
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
			fninput.setEnabled(false);
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
			lninput.setEnabled(false);
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
			cmbcountry.setEnabled(false);
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
			cmbstate.setEnabled(false);
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
			cityinput.setEnabled(false);
			cityinput.setColumns(10);
			cityinput.setBounds(654, 123, 346, 32);
		}
		return cityinput;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setText("Photos");
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			textField_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			textField_3.setColumns(10);
			textField_3.setBounds(1022, 66, 150, 153);
		}
		return textField_3;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Upload");
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1.setBounds(1022, 239, 150, 37);
		}
		return btnNewButton_1;
	}
	private JTextField getAgeinput() {
		if (ageinput == null) {
			ageinput = new JTextField();
			ageinput.setEnabled(false);
			ageinput.setColumns(10);
			ageinput.setBounds(901, 244, 99, 32);
		}
		return ageinput;
	}
	private JDateChooser getDobinput() {
		if (dobinput == null) {
			dobinput = new JDateChooser();
			dobinput.setEnabled(false);
			dobinput.setBounds(654, 244, 164, 30);
		}
		return dobinput;
	}
	private JTextField getPhoneinput() {
		if (phoneinput == null) {
			phoneinput = new JTextField();
			phoneinput.setEnabled(false);
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
			otherbtn.setEnabled(false);
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
			femalebtn.setEnabled(false);
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
			malebtn.setEnabled(false);
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
			emailinput.setEnabled(false);
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
			cominput.setEnabled(false);
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
			btnp.setEnabled(false);
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
			btnc.setEnabled(false);
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
			cmbdepart.setEnabled(false);
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
			cmbpost.setEnabled(false);
			cmbpost.setModel(new DefaultComboBoxModel(new String[] {"---- Select ----", "Senior", "junior", "intern", "manager"}));
			cmbpost.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbpost.setBounds(654, 347, 344, 30);
		}
		return cmbpost;
	}
	private JDateChooser getJdateinput() {
		if (jdateinput == null) {
			jdateinput = new JDateChooser();
			jdateinput.setEnabled(false);
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
			salaryinput.setEnabled(false);
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
			zipinput.setEnabled(false);
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
			cmbqfn.setEnabled(false);
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
	private JButton getBtnClearForm() {
		if (btnClearForm == null) {
			btnClearForm = new JButton("Back");
			btnClearForm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new employ_form().setVisible(true);
					dispose();
				}
			});
			btnClearForm.setForeground(Color.WHITE);
			btnClearForm.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnClearForm.setBackground(Color.LIGHT_GRAY);
			btnClearForm.setBounds(492, 472, 176, 40);
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
	private JLabel getLblAge() {
		if (lblAge == null) {
			lblAge = new JLabel("Age");
			lblAge.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAge.setBounds(852, 244, 41, 32);
		}
		return lblAge;
	}
	
	// Update Employee Data
	
	public void SetDataForEdit(int id) {
		
		eid = id;
		emp_service es = new emp_service_empl();
		emp em = es.getEmpById(id);
		
		fninput.setText(em.getFname());
		lninput.setText(em.getLname());
		emailinput.setText(em.getEmail());
		ageinput.setText(String.valueOf(em.getAge()));
		salaryinput.setText(String.valueOf(em.getSalary()));
		dobinput.setDate(em.getDob());
		jdateinput.setDate(em.getJoinDate());
		cityinput.setText(em.getCity());
		phoneinput.setText(em.getPhone());
		zipinput.setText(em.getZip());
		cominput.setText(em.getCompany());
		
		
		if(em.getGender().equalsIgnoreCase("male")) {
			malebtn.setSelected(true);
		}else if(em.getGender().equalsIgnoreCase("female")) {
			femalebtn.setSelected(true);
		}else {
			otherbtn.setSelected(true);
		}
		
		if(em.getService().equalsIgnoreCase("Parmanent")) {
			btnp.setSelected(true);
		}else if(em.getService().equalsIgnoreCase("Contract")) {
			btnc.setSelected(true);
		}
		
		// Combo Box Code
		cmbcountry.setSelectedItem(em.getCountry());
		cmbstate.setSelectedItem(em.getState());
		cmbqfn.setSelectedItem(em.getQualification());
		cmbdepart.setSelectedItem(em.getDepartment());
		cmbpost.setSelectedItem(em.getPost());	
	}
	
}
