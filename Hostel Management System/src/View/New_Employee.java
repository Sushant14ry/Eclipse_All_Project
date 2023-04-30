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
import javax.swing.JComboBox;

public class New_Employee extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2_2;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2_2_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_2_2_1_1;
	private JTextField textField_3;
	private JLabel lblNewLabel_2_2_1_2;
	private JTextField textField_4;
	private JLabel lblNewLabel_2_2_1_3;
	private JTextField textField_5;
	private JLabel lblNewLabel_2_2_1_4;
	private JTextField textField_6;
	private JLabel lblNewLabel_2_2_1_5;
	private JTextField textField_8;
	private JLabel lblNewLabel_2_2_1_7;
	private JLabel lblNewLabel_2_2_1_8;
	private JComboBox comboBox;
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
					New_Employee frame = new New_Employee();
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
	public New_Employee() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 190, 622, 556);
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
			panel_2.setBounds(0, 0, 622, 556);
			panel_2.add(getLblNewLabel_1());
			panel_2.add(getLblNewLabel_2_2());
			panel_2.add(getTextField());
			panel_2.add(getTextField_1());
			panel_2.add(getLblNewLabel_2_2_1());
			panel_2.add(getTextField_2());
			panel_2.add(getLblNewLabel_2_2_1_1());
			panel_2.add(getTextField_3());
			panel_2.add(getLblNewLabel_2_2_1_2());
			panel_2.add(getTextField_4());
			panel_2.add(getLblNewLabel_2_2_1_3());
			panel_2.add(getTextField_5());
			panel_2.add(getLblNewLabel_2_2_1_4());
			panel_2.add(getTextField_6());
			panel_2.add(getLblNewLabel_2_2_1_5());
			panel_2.add(getTextField_8());
			panel_2.add(getLblNewLabel_2_2_1_7());
			panel_2.add(getLblNewLabel_2_2_1_8());
			panel_2.add(getComboBox());
			panel_2.add(getBtnNewButton());
			panel_2.add(getBtnClear());
			panel_2.add(getSeparator());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Add New Employee");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1.setBounds(228, 10, 238, 38);
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
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(243, 84, 356, 24);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(243, 131, 356, 24);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_2_2_1() {
		if (lblNewLabel_2_2_1 == null) {
			lblNewLabel_2_2_1 = new JLabel("Full Name");
			lblNewLabel_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1.setBounds(33, 131, 154, 22);
		}
		return lblNewLabel_2_2_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(243, 178, 356, 24);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel_2_2_1_1() {
		if (lblNewLabel_2_2_1_1 == null) {
			lblNewLabel_2_2_1_1 = new JLabel("Father Name");
			lblNewLabel_2_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_1.setBounds(33, 178, 154, 22);
		}
		return lblNewLabel_2_2_1_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(243, 223, 356, 24);
		}
		return textField_3;
	}
	private JLabel getLblNewLabel_2_2_1_2() {
		if (lblNewLabel_2_2_1_2 == null) {
			lblNewLabel_2_2_1_2 = new JLabel("Mother Name");
			lblNewLabel_2_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_2.setBounds(33, 223, 154, 22);
		}
		return lblNewLabel_2_2_1_2;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(243, 267, 356, 24);
		}
		return textField_4;
	}
	private JLabel getLblNewLabel_2_2_1_3() {
		if (lblNewLabel_2_2_1_3 == null) {
			lblNewLabel_2_2_1_3 = new JLabel("Email ID");
			lblNewLabel_2_2_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_3.setBounds(33, 267, 154, 22);
		}
		return lblNewLabel_2_2_1_3;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(243, 307, 356, 24);
		}
		return textField_5;
	}
	private JLabel getLblNewLabel_2_2_1_4() {
		if (lblNewLabel_2_2_1_4 == null) {
			lblNewLabel_2_2_1_4 = new JLabel("Permanent Address");
			lblNewLabel_2_2_1_4.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_4.setBounds(33, 307, 200, 22);
		}
		return lblNewLabel_2_2_1_4;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(243, 350, 356, 24);
		}
		return textField_6;
	}
	private JLabel getLblNewLabel_2_2_1_5() {
		if (lblNewLabel_2_2_1_5 == null) {
			lblNewLabel_2_2_1_5 = new JLabel("Temporary Address");
			lblNewLabel_2_2_1_5.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_5.setBounds(33, 350, 200, 22);
		}
		return lblNewLabel_2_2_1_5;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(243, 390, 356, 24);
		}
		return textField_8;
	}
	private JLabel getLblNewLabel_2_2_1_7() {
		if (lblNewLabel_2_2_1_7 == null) {
			lblNewLabel_2_2_1_7 = new JLabel("Citizen Number");
			lblNewLabel_2_2_1_7.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_7.setBounds(33, 390, 154, 22);
		}
		return lblNewLabel_2_2_1_7;
	}
	private JLabel getLblNewLabel_2_2_1_8() {
		if (lblNewLabel_2_2_1_8 == null) {
			lblNewLabel_2_2_1_8 = new JLabel("Designation");
			lblNewLabel_2_2_1_8.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_2_2_1_8.setBounds(33, 432, 154, 22);
		}
		return lblNewLabel_2_2_1_8;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(243, 432, 356, 24);
		}
		return comboBox;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Save");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(242, 485, 114, 38);
		}
		return btnNewButton;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnClear.setBounds(485, 485, 114, 38);
		}
		return btnClear;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(197, 50, 278, 22);
		}
		return separator;
	}
}
