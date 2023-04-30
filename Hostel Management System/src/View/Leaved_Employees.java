package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.Window.Type;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Leaved_Employees extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JSeparator separator;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField textField;
	private JLabel lblNewLabel_2_2;
	private JButton btnSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Leaved_Employees frame = new Leaved_Employees();
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
	public Leaved_Employees() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 190, 854, 516);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel_2_1());
	}
	private JPanel getPanel_2_1() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBackground(Color.PINK);
			panel_2.setBounds(0, 0, 854, 516);
			panel_2.add(getLblNewLabel_1_3());
			panel_2.add(getSeparator_2());
			panel_2.add(getScrollPane_1());
			panel_2.add(getTextField());
			panel_2.add(getLblNewLabel_2_2());
			panel_2.add(getBtnSearch());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Leaved Employee");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1.setBounds(322, 16, 209, 38);
		}
		return lblNewLabel_1;
	}
	private JSeparator getSeparator_2() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(10, 64, 795, 21);
		}
		return separator;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 129, 810, 377);
			scrollPane.setViewportView(getTable_1());
		}
		return scrollPane;
	}
	private JTable getTable_1() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Full Name", "Mobile No", "Father Name", "Mother Name", "Email", "Parmanent Address", "Temporary Address","Citizen No", "Designation"
				}
			));
		}
		return table;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(260, 82, 226, 24);
		}
		return textField;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("Search");
			lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2.setBounds(165, 82, 81, 22);
		}
		return lblNewLabel_2_2;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch.setBounds(510, 80, 109, 28);
		}
		return btnSearch;
	}
}
