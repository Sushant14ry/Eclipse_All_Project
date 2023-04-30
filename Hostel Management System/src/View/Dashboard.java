package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_1_1;
	private JButton btnNewButton_1_1_1_1;
	private JButton btnNewButton_1_1_1_1_1;
	private JButton btnNewButton_1_1_1_1_1_2;
	private JButton btnNewButton_1_1_1_1_1_1;
	private JButton btnNewButton_1_1_1_1_1_3;
	private JButton btnNewButton_1_1_1_1_1_3_1;
	private JButton btnNewStudent;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JButton btnNewButton_1_1_1_1_1_1_1;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 1285, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblNewLabel());
		contentPane.add(getPanel_1());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 80, 320, 638);
			panel.setLayout(null);
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_1_1());
			panel.add(getBtnNewButton_1_1_1());
			panel.add(getBtnNewButton_1_1_1_1());
			panel.add(getBtnNewButton_1_1_1_1_1());
			panel.add(getBtnNewButton_1_1_1_1_1_2());
			panel.add(getBtnNewButton_1_1_1_1_1_1());
			panel.add(getBtnNewButton_1_1_1_1_1_3());
			panel.add(getBtnNewButton_1_1_1_1_1_3_1());
			panel.add(getBtnNewStudent());
			panel.add(getBtnNewButton_1_1_1_1_1_1_1());
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Manage Room");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Manage_Room().setVisible(true);
					
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBounds(16, 23, 284, 32);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Student Fees");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Student_fee().setVisible(true);
				}
			});
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1.setBounds(16, 173, 284, 32);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("All Student Leaving");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Leaving_All_Students().setVisible(true);
				}
			});
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1.setBounds(16, 223, 284, 32);
		}
		return btnNewButton_1_1;
	}
	private JButton getBtnNewButton_1_1_1() {
		if (btnNewButton_1_1_1 == null) {
			btnNewButton_1_1_1 = new JButton("Leave Students");
			btnNewButton_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Leaved_Student().setVisible(true);
				}
			});
			btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1.setBounds(16, 273, 284, 32);
		}
		return btnNewButton_1_1_1;
	}
	private JButton getBtnNewButton_1_1_1_1() {
		if (btnNewButton_1_1_1_1 == null) {
			btnNewButton_1_1_1_1 = new JButton("New Employee");
			btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new New_Employee().setVisible(true);
				}
			});
			btnNewButton_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1_1.setBounds(16, 323, 284, 32);
		}
		return btnNewButton_1_1_1_1;
	}
	private JButton getBtnNewButton_1_1_1_1_1() {
		if (btnNewButton_1_1_1_1_1 == null) {
			btnNewButton_1_1_1_1_1 = new JButton("Employee Payment");
			btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Employee_Payment().setVisible(true);
				}
			});
			btnNewButton_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1_1_1.setBounds(16, 423, 284, 32);
		}
		return btnNewButton_1_1_1_1_1;
	}
	private JButton getBtnNewButton_1_1_1_1_1_2() {
		if (btnNewButton_1_1_1_1_1_2 == null) {
			btnNewButton_1_1_1_1_1_2 = new JButton("Leave Employee");
			btnNewButton_1_1_1_1_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Leaved_Employees().setVisible(true);
				}
			});
			btnNewButton_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1_1_1_2.setBounds(16, 523, 284, 32);
		}
		return btnNewButton_1_1_1_1_1_2;
	}
	private JButton getBtnNewButton_1_1_1_1_1_1() {
		if (btnNewButton_1_1_1_1_1_1 == null) {
			btnNewButton_1_1_1_1_1_1 = new JButton("All Employee Working");
			btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnNewButton_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1_1_1_1.setBounds(16, 473, 284, 32);
		}
		return btnNewButton_1_1_1_1_1_1;
	}
	private JButton getBtnNewButton_1_1_1_1_1_3() {
		if (btnNewButton_1_1_1_1_1_3 == null) {
			btnNewButton_1_1_1_1_1_3 = new JButton("Update & Delete Employee");
			btnNewButton_1_1_1_1_1_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Upd_Del_Employee().setVisible(true);
				}
			});
			btnNewButton_1_1_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1_1_1_3.setBounds(16, 373, 284, 32);
		}
		return btnNewButton_1_1_1_1_1_3;
	}
	private JButton getBtnNewButton_1_1_1_1_1_3_1() {
		if (btnNewButton_1_1_1_1_1_3_1 == null) {
			btnNewButton_1_1_1_1_1_3_1 = new JButton("Update & Delete Students");
			btnNewButton_1_1_1_1_1_3_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Upd_Del_Student().setVisible(true);
				}
			});
			btnNewButton_1_1_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1_1_1_3_1.setBounds(16, 123, 284, 32);
		}
		return btnNewButton_1_1_1_1_1_3_1;
	}
	private JButton getBtnNewStudent() {
		if (btnNewStudent == null) {
			btnNewStudent = new JButton("New Student");
			btnNewStudent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new New_Student().setVisible(true);
				}
			});
			btnNewStudent.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewStudent.setBounds(16, 73, 284, 32);
		}
		return btnNewStudent;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Hostel Management System");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(10, 16, 528, 47);
		}
		return lblNewLabel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(341, 80, 901, 638);
			panel_1.setLayout(null);
		}
		return panel_1;
	}
	private JButton getBtnNewButton_1_1_1_1_1_1_1() {
		if (btnNewButton_1_1_1_1_1_1_1 == null) {
			btnNewButton_1_1_1_1_1_1_1 = new JButton("Logout");
			btnNewButton_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_1_1_1_1_1_1_1.setBounds(16, 580, 284, 32);
		}
		return btnNewButton_1_1_1_1_1_1_1;
	}
}
