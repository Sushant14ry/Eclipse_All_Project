package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

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
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class New_Student extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2_2;
	private JTextField smobile;
	private JTextField sfullname;
	private JLabel lblNewLabel_2_2_1;
	private JTextField sfathername;
	private JLabel lblNewLabel_2_2_1_1;
	private JTextField smothername;
	private JLabel lblNewLabel_2_2_1_2;
	private JTextField semail;
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
	private JComboBox cmbroomno;
	private JButton btnNewButton;
	private JButton btnClear;
	private JSeparator separator;

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
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 190, 622, 576);
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
			panel_2.setBounds(0, 0, 622, 580);
			panel_2.add(getLblNewLabel_1());
			panel_2.add(getLblNewLabel_2_2());
			panel_2.add(getSmobile());
			panel_2.add(getSfullname());
			panel_2.add(getLblNewLabel_2_2_1());
			panel_2.add(getSfathername());
			panel_2.add(getLblNewLabel_2_2_1_1());
			panel_2.add(getSmothername());
			panel_2.add(getLblNewLabel_2_2_1_2());
			panel_2.add(getSemail());
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
			panel_2.add(getCmbroomno());
			panel_2.add(getBtnNewButton());
			panel_2.add(getBtnClear());
			panel_2.add(getSeparator());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Add New Student");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1.setBounds(224, 10, 210, 38);
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
	private JTextField getSmobile() {
		if (smobile == null) {
			smobile = new JTextField();
			smobile.setBounds(243, 84, 356, 24);
			smobile.setColumns(10);
		}
		return smobile;
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
	private JTextField getSemail() {
		if (semail == null) {
			semail = new JTextField();
			semail.setColumns(10);
			semail.setBounds(243, 267, 356, 24);
		}
		return semail;
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
	private JComboBox getCmbroomno() {
		if (cmbroomno == null) {
			cmbroomno = new JComboBox();
			cmbroomno.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbroomno.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Room No --- ]", "102", "104"}));
			cmbroomno.setBounds(243, 470, 356, 24);
		}
		return cmbroomno;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Save");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Student st = new Student();
					
					st.setMobile(smobile.getText());
					st.setFullname(sfullname.getText());
					st.setFathername(sfathername.getText());
					st.setMothername(smothername.getText());
					st.setEmailid(semail.getText());
					st.setPaddress(spaddress.getText());
					st.setTaddress(staddress.getText());
					st.setColzname(sclzname.getText());
					st.setCtzno(sctznno.getText());
//					st.setRoomno();
					
					Student_Service ss = new Student_Service_empl();
					boolean res = ss.AddStudent(st);
					
					if(res) {
						JOptionPane.showMessageDialog(null, "New Student Added  Success");
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Add Student");
					}
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(242, 519, 114, 38);
		}
		return btnNewButton;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnClear.setBounds(485, 519, 114, 38);
		}
		return btnClear;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(179, 52, 278, 22);
		}
		return separator;
	}
}
