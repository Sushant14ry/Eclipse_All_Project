package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Model.Student;
import Service.Student_Service;
import Service.Student_Service_empl;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class New_Student extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField sidinput;
	private JLabel lblStudentId;
	private JLabel lblFullName;
	private JTextField fullnameinput;
	private JLabel lblFatherName;
	private JTextField fathernameinput;
	private JLabel lblYear;
	private JLabel lblBranch;
	private JLabel lblCourse;
	private JTextField branchinput;
	private JLabel lblFatherName_1_1;
	private JButton btnRegister;
	private JButton btnBack;
	private JComboBox cmbsemester;
	private JComboBox cmbyear;
	private JComboBox cmbcourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Student frame = new New_Student();
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
	public New_Student() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 140, 525, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(218, 165, 32), 2), "New Student", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(20, 20, 474, 466);
			panel.setLayout(null);
			panel.add(getSidinput());
			panel.add(getLblStudentId());
			panel.add(getLblFullName());
			panel.add(getFullnameinput());
			panel.add(getLblFatherName());
			panel.add(getFathernameinput());
			panel.add(getLblYear());
			panel.add(getLblBranch());
			panel.add(getLblCourse());
			panel.add(getBranchinput());
			panel.add(getLblFatherName_1_1());
			panel.add(getBtnRegister());
			panel.add(getBtnBack());
			panel.add(getCmbsemester());
			panel.add(getCmbyear());
			panel.add(getCmbcourse());
		}
		return panel;
	}
	private JTextField getSidinput() {
		if (sidinput == null) {
			sidinput = new JTextField();
			sidinput.setColumns(10);
			sidinput.setBounds(172, 42, 263, 29);
		}
		return sidinput;
	}
	private JLabel getLblStudentId() {
		if (lblStudentId == null) {
			lblStudentId = new JLabel("Student ID");
			lblStudentId.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblStudentId.setBounds(21, 44, 113, 23);
		}
		return lblStudentId;
	}
	private JLabel getLblFullName() {
		if (lblFullName == null) {
			lblFullName = new JLabel("Full Name");
			lblFullName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFullName.setBounds(21, 94, 113, 23);
		}
		return lblFullName;
	}
	private JTextField getFullnameinput() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setColumns(10);
			fullnameinput.setBounds(172, 92, 263, 29);
		}
		return fullnameinput;
	}
	private JLabel getLblFatherName() {
		if (lblFatherName == null) {
			lblFatherName = new JLabel("Father Name");
			lblFatherName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName.setBounds(21, 144, 141, 23);
		}
		return lblFatherName;
	}
	private JTextField getFathernameinput() {
		if (fathernameinput == null) {
			fathernameinput = new JTextField();
			fathernameinput.setColumns(10);
			fathernameinput.setBounds(172, 140, 263, 29);
		}
		return fathernameinput;
	}
	private JLabel getLblYear() {
		if (lblYear == null) {
			lblYear = new JLabel("Year");
			lblYear.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblYear.setBounds(21, 287, 91, 23);
		}
		return lblYear;
	}
	private JLabel getLblBranch() {
		if (lblBranch == null) {
			lblBranch = new JLabel("Branch");
			lblBranch.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblBranch.setBounds(21, 237, 91, 23);
		}
		return lblBranch;
	}
	private JLabel getLblCourse() {
		if (lblCourse == null) {
			lblCourse = new JLabel("Course");
			lblCourse.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCourse.setBounds(21, 187, 113, 23);
		}
		return lblCourse;
	}
	private JTextField getBranchinput() {
		if (branchinput == null) {
			branchinput = new JTextField();
			branchinput.setColumns(10);
			branchinput.setBounds(172, 235, 263, 29);
		}
		return branchinput;
	}
	private JLabel getLblFatherName_1_1() {
		if (lblFatherName_1_1 == null) {
			lblFatherName_1_1 = new JLabel("Semester");
			lblFatherName_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1_1.setBounds(21, 334, 113, 23);
		}
		return lblFatherName_1_1;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Student std = new Student();
					
					std.setSid(Integer.parseInt(sidinput.getText()));
					std.setFullname(fullnameinput.getText());
					std.setFathername(fathernameinput.getText());
					std.setCourse(cmbcourse.getSelectedItem().toString());
					std.setBranch(branchinput.getText());
					std.setYear(cmbyear.getSelectedItem().toString());
					std.setSemester(cmbsemester.getSelectedItem().toString());
					
					Student_Service ss = new Student_Service_empl();
					boolean res = ss.AddStudent(std);
					
					if(res) {
						JOptionPane.showConfirmDialog(null,"Student Added Successfull");
						setVisible(false);
						new New_Student().setVisible(true);
					}else {
						JOptionPane.showConfirmDialog(null,"Failed to Add Student");
					}
					
					
				}
			});
			btnRegister.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnRegister.setBounds(172, 390, 128, 35);
		}
		return btnRegister;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnBack.setBounds(344, 390, 91, 35);
		}
		return btnBack;
	}
	private JComboBox getCmbsemester() {
		if (cmbsemester == null) {
			cmbsemester = new JComboBox();
			cmbsemester.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select Semester--- ]", "1st Semester", "2nd Semester"}));
			cmbsemester.setFont(new Font("Arial Black", Font.PLAIN, 16));
			cmbsemester.setBounds(172, 330, 263, 29);
		}
		return cmbsemester;
	}
	private JComboBox getCmbyear() {
		if (cmbyear == null) {
			cmbyear = new JComboBox();
			cmbyear.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select Year--- ]", "1st Year", "2nd Year", "3rd Year", "4th Year"}));
			cmbyear.setFont(new Font("Arial Black", Font.PLAIN, 16));
			cmbyear.setBounds(172, 283, 263, 29);
		}
		return cmbyear;
	}
	private JComboBox getCmbcourse() {
		if (cmbcourse == null) {
			cmbcourse = new JComboBox();
			cmbcourse.setFont(new Font("Arial Black", Font.PLAIN, 16));
			cmbcourse.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select Course --- ]", "BCA", "CSIT", "BSC", "MBA", "BBA"}));
			cmbcourse.setBounds(172, 185, 263, 29);
		}
		return cmbcourse;
	}
}
