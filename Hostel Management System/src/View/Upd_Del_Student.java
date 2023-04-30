package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import model.Student;
import service.Student_Service;
import service.Student_Service_empl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Upd_Del_Student extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2_2;
	private JTextField smobileinput;
	private JTextField sfullname;
	private JLabel lblNewLabel_2_2_1;
	private JTextField sfathername;
	private JLabel lblNewLabel_2_2_1_1;
	private JTextField smothername;
	private JLabel lblNewLabel_2_2_1_2;
	private JTextField semailid;
	private JLabel lblNewLabel_2_2_1_3;
	private JTextField spaddress;
	private JLabel lblNewLabel_2_2_1_4;
	private JTextField staddress;
	private JLabel lblNewLabel_2_2_1_5;
	private JTextField sclzname;
	private JLabel lblNewLabel_2_2_1_6;
	private JTextField sctznno;
	private JLabel lblNewLabel_2_2_1_7;
	private JLabel lblNewLabel_2_2_1_8;
	private JButton btnNewButton;
	private JButton btnClear;
	private JComboBox cmbsroomno;
	private JSeparator separator;
	private JButton btnDelete;
	private JButton btnSearch;

	private String eid;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Upd_Del_Student frame = new Upd_Del_Student();
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
	public Upd_Del_Student() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 190, 622, 601);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel_2());
	}

	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBorder(null);
			panel_2.setBackground(Color.PINK);
			panel_2.setBounds(0, 0, 622, 601);
			panel_2.add(getLblNewLabel_1());
			panel_2.add(getLblNewLabel_2_2());
			panel_2.add(getSmobileinput());
			panel_2.add(getSfullname());
			panel_2.add(getLblNewLabel_2_2_1());
			panel_2.add(getSfathername());
			panel_2.add(getLblNewLabel_2_2_1_1());
			panel_2.add(getSmothername());
			panel_2.add(getLblNewLabel_2_2_1_2());
			panel_2.add(getSemailid());
			panel_2.add(getLblNewLabel_2_2_1_3());
			panel_2.add(getSpaddress());
			panel_2.add(getLblNewLabel_2_2_1_4());
			panel_2.add(getStaddress());
			panel_2.add(getLblNewLabel_2_2_1_5());
			panel_2.add(getSclzname());
			panel_2.add(getLblNewLabel_2_2_1_6());
			panel_2.add(getSctznno());
			panel_2.add(getLblNewLabel_2_2_1_7());
			panel_2.add(getLblNewLabel_2_2_1_8());
			panel_2.add(getBtnNewButton());
			panel_2.add(getBtnClear());
			panel_2.add(getCmbsroomno());
			panel_2.add(getSeparator());
			panel_2.add(getBtnDelete());
			panel_2.add(getBtnSearch());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Update & Delete Students");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1.setBounds(181, 10, 318, 38);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("Mobile Number");
			lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2.setBounds(33, 84, 154, 22);
		}
		return lblNewLabel_2_2;
	}
	private JTextField getSmobileinput() {
		if (smobileinput == null) {
			smobileinput = new JTextField();
			smobileinput.setBounds(243, 84, 226, 24);
			smobileinput.setColumns(10);
		}
		return smobileinput;
	}
	private JTextField getSfullname() {
		if (sfullname == null) {
			sfullname = new JTextField();
			sfullname.setColumns(10);
			sfullname.setBounds(243, 131, 356, 24);
		}
		return sfullname;
	}
	private JLabel getLblNewLabel_2_2_1() {
		if (lblNewLabel_2_2_1 == null) {
			lblNewLabel_2_2_1 = new JLabel("Full Name");
			lblNewLabel_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1.setBounds(33, 131, 154, 22);
		}
		return lblNewLabel_2_2_1;
	}
	private JTextField getSfathername() {
		if (sfathername == null) {
			sfathername = new JTextField();
			sfathername.setColumns(10);
			sfathername.setBounds(243, 178, 356, 24);
		}
		return sfathername;
	}
	private JLabel getLblNewLabel_2_2_1_1() {
		if (lblNewLabel_2_2_1_1 == null) {
			lblNewLabel_2_2_1_1 = new JLabel("Father Name");
			lblNewLabel_2_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_1.setBounds(33, 178, 154, 22);
		}
		return lblNewLabel_2_2_1_1;
	}
	private JTextField getSmothername() {
		if (smothername == null) {
			smothername = new JTextField();
			smothername.setColumns(10);
			smothername.setBounds(243, 223, 356, 24);
		}
		return smothername;
	}
	private JLabel getLblNewLabel_2_2_1_2() {
		if (lblNewLabel_2_2_1_2 == null) {
			lblNewLabel_2_2_1_2 = new JLabel("Mother Name");
			lblNewLabel_2_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_2.setBounds(33, 223, 154, 22);
		}
		return lblNewLabel_2_2_1_2;
	}
	private JTextField getSemailid() {
		if (semailid == null) {
			semailid = new JTextField();
			semailid.setColumns(10);
			semailid.setBounds(243, 267, 356, 24);
		}
		return semailid;
	}
	private JLabel getLblNewLabel_2_2_1_3() {
		if (lblNewLabel_2_2_1_3 == null) {
			lblNewLabel_2_2_1_3 = new JLabel("Email ID");
			lblNewLabel_2_2_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_3.setBounds(33, 267, 154, 22);
		}
		return lblNewLabel_2_2_1_3;
	}
	private JTextField getSpaddress() {
		if (spaddress == null) {
			spaddress = new JTextField();
			spaddress.setColumns(10);
			spaddress.setBounds(243, 307, 356, 24);
		}
		return spaddress;
	}
	private JLabel getLblNewLabel_2_2_1_4() {
		if (lblNewLabel_2_2_1_4 == null) {
			lblNewLabel_2_2_1_4 = new JLabel("Permanent Address");
			lblNewLabel_2_2_1_4.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_4.setBounds(33, 307, 200, 22);
		}
		return lblNewLabel_2_2_1_4;
	}
	private JTextField getStaddress() {
		if (staddress == null) {
			staddress = new JTextField();
			staddress.setColumns(10);
			staddress.setBounds(243, 350, 356, 24);
		}
		return staddress;
	}
	private JLabel getLblNewLabel_2_2_1_5() {
		if (lblNewLabel_2_2_1_5 == null) {
			lblNewLabel_2_2_1_5 = new JLabel("Temporary Address");
			lblNewLabel_2_2_1_5.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_5.setBounds(33, 350, 200, 22);
		}
		return lblNewLabel_2_2_1_5;
	}
	private JTextField getSclzname() {
		if (sclzname == null) {
			sclzname = new JTextField();
			sclzname.setColumns(10);
			sclzname.setBounds(243, 389, 356, 24);
		}
		return sclzname;
	}
	private JLabel getLblNewLabel_2_2_1_6() {
		if (lblNewLabel_2_2_1_6 == null) {
			lblNewLabel_2_2_1_6 = new JLabel("College Name");
			lblNewLabel_2_2_1_6.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_6.setBounds(33, 389, 154, 22);
		}
		return lblNewLabel_2_2_1_6;
	}
	private JTextField getSctznno() {
		if (sctznno == null) {
			sctznno = new JTextField();
			sctznno.setColumns(10);
			sctznno.setBounds(243, 428, 356, 24);
		}
		return sctznno;
	}
	private JLabel getLblNewLabel_2_2_1_7() {
		if (lblNewLabel_2_2_1_7 == null) {
			lblNewLabel_2_2_1_7 = new JLabel("Citizen Number");
			lblNewLabel_2_2_1_7.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_7.setBounds(33, 428, 154, 22);
		}
		return lblNewLabel_2_2_1_7;
	}
	private JLabel getLblNewLabel_2_2_1_8() {
		if (lblNewLabel_2_2_1_8 == null) {
			lblNewLabel_2_2_1_8 = new JLabel("Room Number");
			lblNewLabel_2_2_1_8.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_8.setBounds(33, 470, 154, 22);
		}
		return lblNewLabel_2_2_1_8;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Update");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Student st = new Student();
					
					st.setMobile(eid);
					st.setFullname(sfullname.getText());
					st.setFathername(sfathername.getText());
					st.setMothername(smothername.getText());
					st.setEmailid(semailid.getText());
					st.setPaddress(spaddress.getText());
					st.setTaddress(staddress.getText());
					st.setCtzno(sctznno.getText());
					st.setColzname(sclzname.getText());
					st.setRoomno(cmbsroomno.getSelectedItem().toString());
					
					Student_Service ss = new Student_Service_empl();
					boolean res = ss.UpdStudent(st);
					
					if(res) {
						JOptionPane.showMessageDialog(null, " Student Updated  Success");
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Update Student");
					}
					
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBounds(242, 529, 114, 38);
		}
		return btnNewButton;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnClear.setBounds(490, 529, 109, 38);
		}
		return btnClear;
	}
	private JComboBox getCmbsroomno() {
		if (cmbsroomno == null) {
			cmbsroomno = new JComboBox();
			cmbsroomno.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbsroomno.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Room No --- ]", "102", "104"}));
			cmbsroomno.setBounds(243, 470, 356, 24);
		}
		return cmbsroomno;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(150, 58, 347, 28);
		}
		return separator;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Student_Service ss = new Student_Service_empl();
					
					if(ss.DelStudent(eid)) {
						JOptionPane.showMessageDialog(null, "Deleted Success");
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Delete");
					}
				}
			});
			btnDelete.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnDelete.setBounds(366, 529, 102, 38);
		}
		return btnDelete;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String searchnum = smobileinput.getText().trim();
					Student_Service ss = new Student_Service_empl();
					ss.getStudentById(searchnum);
					
					// Display Search by number
					Display_Student(searchnum);
				}
			});
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch.setBounds(488, 82, 109, 28);
		}
		return btnSearch;
	}
	
	public void Display_Student(String sid) {
		eid=sid;
		Student_Service ss = new Student_Service_empl();
		Student st = ss.getStudentById(eid);

		sfullname.setText(st.getFullname());
		sfathername.setText(st.getFathername());
		smothername.setText(st.getMothername());
		semailid.setText(st.getEmailid());
		spaddress.setText(st.getPaddress());
		staddress.setText(st.getTaddress());
		sctznno.setText(st.getCtzno());
		sclzname.setText(st.getColzname());
		cmbsroomno.setSelectedItem(st.getRoomno());
		
	}
}
