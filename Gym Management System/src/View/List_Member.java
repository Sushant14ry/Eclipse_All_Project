package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Member;
import Service.Member_Service;
import Service.Member_Service_Empl;

import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class List_Member extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField textField;
	private JLabel lblSearch;
	private JButton btnSearch;
	private JButton btnX;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List_Member frame = new List_Member();
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
	public List_Member() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(260, 140, 1060, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getScrollPane());
		contentPane.add(getTextField());
		contentPane.add(getLblSearch());
		contentPane.add(getBtnSearch());
		contentPane.add(getBtnX());
		contentPane.add(getSeparator());
		
		// Show Member data in Tables
			Display_Table();
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("LIST OF MEMBERS");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel_1_2.setBounds(10, 10, 354, 64);
		}
		return lblNewLabel_1_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 92, 1040, 520);
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
					"Member ID", "Full Name", "Mobile Number", "Email ID", "Gender", "Father Name", "Mother Name", "Gym Time", "Citizen No.", "Age", "Amount"
				}
			));
		}
		return table;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String Search_data = textField.getText().trim();
					Member_Service ms = new Member_Service_Empl();
					
					List<Member> m_list = ms.SearchMember(Search_data);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Member m : m_list) {
						tmodel.addRow(new Object[] {m.getMid(),m.getFullname(),m.getMobileNumber(),m.getEmailid(),m.getGender(),m.getFathername(),m.getPassword(),m.getGymtime(),m.getCitizenNum(),m.getAge(),m.getAmountpay()});
					}
				}
			});
			textField.setColumns(10);
			textField.setBounds(675, 49, 160, 34);
		}
		return textField;
	}
	private JLabel getLblSearch() {
		if (lblSearch == null) {
			lblSearch = new JLabel("Search");
			lblSearch.setFont(new Font("Arial Black", Font.BOLD, 18));
			lblSearch.setBounds(582, 49, 104, 34);
		}
		return lblSearch;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Search_data = textField.getText().trim();
					Member_Service ms = new Member_Service_Empl();
					
					List<Member> m_list = ms.SearchMember(Search_data);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Member m : m_list) {
						tmodel.addRow(new Object[] {m.getMid(),m.getFullname(),m.getMobileNumber(),m.getEmailid(),m.getGender(),m.getFathername(),m.getPassword(),m.getGymtime(),m.getCitizenNum(),m.getAge(),m.getAmountpay()});
					}
				}
			});
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnSearch.setBounds(844, 49, 118, 34);
		}
		return btnSearch;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnX.setForeground(Color.WHITE);
			btnX.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnX.setBackground(Color.RED);
			btnX.setBounds(1000, 10, 50, 40);
		}
		return btnX;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(8, 67, 365, 12);
		}
		return separator;
	}
	
	// Display Member List in Table
	
	private void Display_Table() {
		
		Member_Service ms = new Member_Service_Empl();
		List<Member> m_list = ms.getAllMember();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Member m : m_list) {
			tmodel.addRow(new Object[] {m.getMid(),m.getFullname(),m.getMobileNumber(),m.getEmailid(),m.getGender(),m.getFathername(),m.getPassword(),m.getGymtime(),m.getCitizenNum(),m.getAge(),m.getAmountpay()});
		}
		
	}
	
}
