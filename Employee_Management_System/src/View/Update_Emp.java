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
import javax.swing.Icon;
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
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Update_Emp extends JFrame {

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
	private JLabel lblNewLabel_1_2;
	private JDateChooser dobinput;
	private JTextField salaryinput;
	private JLabel photo;
	private JButton btnNewButton_1_1_1_2;
	private int eid;
	private JButton btnNewButton_1_1_1_2_1;
	private JButton btnNewButton_1_1_1_2_2;
	private String Image_name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Emp frame = new Update_Emp();
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
	public Update_Emp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 20, 592, 563);
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
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getPhoto());
		contentPane.add(getBtnNewButton_1_1_1_2());
		contentPane.add(getBtnNewButton_1_1_1_2_1());
		contentPane.add(getBtnNewButton_1_1_1_2_2());
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Employee ID");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel.setBounds(25, 81, 123, 29);
		}
		return lblNewLabel;
	}
	private JTextField getEmpidinput() {
		if (empidinput == null) {
			empidinput = new JTextField();
			empidinput.setBounds(152, 81, 198, 29);
			empidinput.setColumns(10);
		}
		return empidinput;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblName.setBounds(25, 130, 57, 29);
		}
		return lblName;
	}
	private JTextField getEmpnameinput() {
		if (empnameinput == null) {
			empnameinput = new JTextField();
			empnameinput.setColumns(10);
			empnameinput.setBounds(152, 130, 198, 29);
		}
		return empnameinput;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Number");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(25, 182, 94, 29);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getEmpnumberinput() {
		if (empnumberinput == null) {
			empnumberinput = new JTextField();
			empnumberinput.setColumns(10);
			empnumberinput.setBounds(152, 182, 198, 29);
		}
		return empnumberinput;
	}
	private JRadioButton getBtnmale() {
		if (btnmale == null) {
			btnmale = new JRadioButton("Male");
			buttonGroup.add(btnmale);
			btnmale.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnmale.setBounds(152, 293, 74, 21);
		}
		return btnmale;
	}
	private JRadioButton getBtnfemale() {
		if (btnfemale == null) {
			btnfemale = new JRadioButton("Female");
			buttonGroup.add(btnfemale);
			btnfemale.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnfemale.setBounds(245, 294, 103, 21);
		}
		return btnfemale;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Gender");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(25, 286, 82, 29);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Department");
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_2.setBounds(25, 339, 123, 29);
		}
		return lblNewLabel_1_1_2;
	}
	private JTextField getEmpageinput() {
		if (empageinput == null) {
			empageinput = new JTextField();
			empageinput.setColumns(10);
			empageinput.setBounds(152, 233, 198, 29);
		}
		return empageinput;
	}
	private JLabel getLblName_1_1() {
		if (lblAge == null) {
			lblAge = new JLabel("Age");
			lblAge.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAge.setBounds(25, 233, 57, 29);
		}
		return lblAge;
	}
	private JLabel getLblNewLabel_1_1_3() {
		if (lblNewLabel_1_1_3 == null) {
			lblNewLabel_1_1_3 = new JLabel("Shift");
			lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_3.setBounds(25, 386, 94, 29);
		}
		return lblNewLabel_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_4() {
		if (lblNewLabel_1_1_4 == null) {
			lblNewLabel_1_1_4 = new JLabel("Salary");
			lblNewLabel_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_4.setBounds(25, 431, 65, 29);
		}
		return lblNewLabel_1_1_4;
	}
	private JLabel getLblNewLabel_1_1_3_1() {
		if (lblNewLabel_1_1_3_1 == null) {
			lblNewLabel_1_1_3_1 = new JLabel("Date of Birth");
			lblNewLabel_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_3_1.setBounds(25, 470, 123, 29);
		}
		return lblNewLabel_1_1_3_1;
	}
	private JComboBox getCmbshift() {
		if (cmbshift == null) {
			cmbshift = new JComboBox();
			cmbshift.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbshift.setModel(new DefaultComboBoxModel(new String[] {" ---- Select ----", "Morning", "Day", "Evening", "Night"}));
			cmbshift.setBounds(152, 386, 198, 28);
		}
		return cmbshift;
	}
	private JComboBox getCmbdepartment() {
		if (cmbdepartment == null) {
			cmbdepartment = new JComboBox();
			cmbdepartment.setModel(new DefaultComboBoxModel(new String[] {" ----  Select  ----", "Computer", "Civil", "Electrical", "Mechanical"}));
			cmbdepartment.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbdepartment.setBounds(152, 339, 198, 28);
		}
		return cmbdepartment;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 67, 355, 446);
			panel.setLayout(null);
			panel.add(getDobinput());
			panel.add(getSalaryinput());
		}
		return panel;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Employee Update");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1_2.setBounds(80, 31, 209, 29);
		}
		return lblNewLabel_1_2;
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
	private JLabel getPhoto() {
		if (photo == null) {
			photo = new JLabel("");
			photo.setBorder(new LineBorder(new Color(0, 0, 0)));
			photo.setBounds(401, 42, 162, 169);
		}
		return photo;
	}
	private JButton getBtnNewButton_1_1_1_2() {
		if (btnNewButton_1_1_1_2 == null) {
			btnNewButton_1_1_1_2 = new JButton("Upload");
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
			btnNewButton_1_1_1_2.setBounds(411, 225, 140, 37);
		}
		return btnNewButton_1_1_1_2;
	}
	
	private JButton getBtnNewButton_1_1_1_2_1() {
		if (btnNewButton_1_1_1_2_1 == null) {
			btnNewButton_1_1_1_2_1 = new JButton("Update");
			btnNewButton_1_1_1_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Employee emp = new Employee();
					
					emp.setEmpid(eid);
					emp.setEmpid(Integer.parseInt(empidinput.getText()));
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
						
					// Set Image in Label 
					emp.setImage(Image_name);
					
					Emp_Service es = new Emp_Service_empl();
					boolean res = es.UpdEmp(emp);
					
					if(res) {
						JOptionPane.showMessageDialog(null,"Data Sucessfully Update");
						new Dashboard().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Update Data");
					}
					
				}
			});
			btnNewButton_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1_2_1.setBounds(411, 346, 140, 37);
		}
		return btnNewButton_1_1_1_2_1;
	}
	private JButton getBtnNewButton_1_1_1_2_2() {
		if (btnNewButton_1_1_1_2_2 == null) {
			btnNewButton_1_1_1_2_2 = new JButton("Back");
			btnNewButton_1_1_1_2_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Dashboard().setVisible(true);
					dispose();
				}
			});
			btnNewButton_1_1_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1_1_2_2.setBounds(411, 462, 140, 37);
		}
		return btnNewButton_1_1_1_2_2;
	}
	
//	-----------------------------------------------------------------------------
	
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
		
		/// Gender Code
		if(emp.getGender().equalsIgnoreCase("Male")) {
			btnmale.setSelected(true);
		}else {
			btnfemale.setSelected(true);
		}
		
		// Combo box Code Set
		cmbdepartment.setSelectedItem(emp.getDepartment());
		cmbshift.setSelectedItem(emp.getShift());
		
		// Image Code in Label Box
		photo.setText(emp.getImage());
			
		
	}
	
}
