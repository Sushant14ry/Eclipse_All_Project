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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manage_Room extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JLabel lblNewLabel_2_1;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnNewButton_2;
	private JSeparator separator;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_2_1_1;
	private JCheckBox chckbxNewCheckBox_1;
	private JButton btnNewButton_2_1;
	private JButton btnNewButton_2_1_1;
	private JButton btnNewButton_2_1_1_1;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton_2_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Room frame = new Manage_Room();
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
	public Manage_Room() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(660, 190, 720, 516);
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
			panel_2.setBounds(0, 0, 720, 516);
			panel_2.add(getLblNewLabel_1_3());
			panel_2.add(getLblNewLabel_2_3());
			panel_2.add(getTextField_2());
			panel_2.add(getLblNewLabel_2_1_2());
			panel_2.add(getChckbxNewCheckBox_2());
			panel_2.add(getBtnNewButton_2_2());
			panel_2.add(getSeparator_2());
			panel_2.add(getLblNewLabel_1_1_1());
			panel_2.add(getLblNewLabel_2_2_1());
			panel_2.add(getTextField_1_1());
			panel_2.add(getLblNewLabel_2_1_1_1());
			panel_2.add(getChckbxNewCheckBox_1_1());
			panel_2.add(getBtnNewButton_2_1_2());
			panel_2.add(getBtnNewButton_2_1_1_2());
			panel_2.add(getBtnNewButton_2_1_1_1_1());
			panel_2.add(getSeparator_1_1());
			panel_2.add(getLblNewLabel_1_2_1());
			panel_2.add(getScrollPane_1());
			panel_2.add(getBtnNewButton_2_2_1());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Add New Room");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1.setBounds(24, 16, 192, 38);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2_3() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Room Number");
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2.setBounds(26, 64, 121, 21);
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField_2() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(145, 62, 60, 24);
		}
		return textField;
	}
	private JLabel getLblNewLabel_2_1_2() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Activate or Deactivate");
			lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1.setBounds(260, 64, 192, 21);
		}
		return lblNewLabel_2_1;
	}
	private JCheckBox getChckbxNewCheckBox_2() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Yes");
			chckbxNewCheckBox.setFont(new Font("Arial Black", Font.BOLD, 14));
			chckbxNewCheckBox.setBackground(Color.PINK);
			chckbxNewCheckBox.setBounds(473, 64, 65, 21);
		}
		return chckbxNewCheckBox;
	}
	private JButton getBtnNewButton_2_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Save");
			btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_2.setBounds(596, 60, 85, 26);
		}
		return btnNewButton_2;
	}
	private JSeparator getSeparator_2() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(10, 102, 699, 21);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Update & Delete Room");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1_1.setBounds(24, 116, 266, 38);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_2_2_1() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("Room Number");
			lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2.setBounds(26, 166, 121, 21);
		}
		return lblNewLabel_2_2;
	}
	private JTextField getTextField_1_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(145, 164, 60, 24);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("Activate or Deactivate");
			lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1.setBounds(367, 166, 192, 21);
		}
		return lblNewLabel_2_1_1;
	}
	private JCheckBox getChckbxNewCheckBox_1_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("Yes");
			chckbxNewCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			chckbxNewCheckBox_1.setBackground(Color.PINK);
			chckbxNewCheckBox_1.setBounds(580, 166, 65, 21);
		}
		return chckbxNewCheckBox_1;
	}
	private JButton getBtnNewButton_2_1_2() {
		if (btnNewButton_2_1 == null) {
			btnNewButton_2_1 = new JButton("Search");
			btnNewButton_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_2_1.setBounds(215, 164, 105, 26);
		}
		return btnNewButton_2_1;
	}
	private JButton getBtnNewButton_2_1_1_2() {
		if (btnNewButton_2_1_1 == null) {
			btnNewButton_2_1_1 = new JButton("Delete");
			btnNewButton_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_2_1_1.setBounds(616, 203, 93, 26);
		}
		return btnNewButton_2_1_1;
	}
	private JButton getBtnNewButton_2_1_1_1_1() {
		if (btnNewButton_2_1_1_1 == null) {
			btnNewButton_2_1_1_1 = new JButton("Update");
			btnNewButton_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton_2_1_1_1.setBounds(496, 203, 105, 26);
		}
		return btnNewButton_2_1_1_1;
	}
	private JSeparator getSeparator_1_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(10, 246, 699, 21);
		}
		return separator_1;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("All Rooms");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1_2.setBounds(320, 262, 126, 38);
		}
		return lblNewLabel_1_2;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(95, 300, 535, 194);
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
					"Room Number", "Status", "Room Status"
				}
			));
		}
		return table;
	}
	private JButton getBtnNewButton_2_2_1() {
		if (btnNewButton_2_2 == null) {
			btnNewButton_2_2 = new JButton("X");
			btnNewButton_2_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			btnNewButton_2_2.setForeground(Color.RED);
			btnNewButton_2_2.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_2_2.setBounds(664, 6, 49, 26);
		}
		return btnNewButton_2_2;
	}
}
