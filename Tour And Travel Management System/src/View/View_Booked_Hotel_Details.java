package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_Booked_Hotel_Details extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewCustomerForm;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1_1_1;
	private JTextField textField_3;
	private JLabel lblNewLabel_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_2;
	private JTextField textField_5;
	private JLabel lblNewLabel_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_4;
	private JTextField textField_7;
	private JLabel lblNewLabel_1_1_1_5;
	private JTextField textField_8;
	private JSeparator separator;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JButton btnX;
	private JLabel lblNewLabel_1_1_1_5_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_1_1_5_1_1;
	private JTextField textField_9;
	private JButton btnBook;
	private JComboBox comboBox_1_1;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Booked_Hotel_Details frame = new View_Booked_Hotel_Details();
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
	public View_Booked_Hotel_Details() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(440, 140, 1000, 652);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.GREEN, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblNewCustomerForm());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTextField_2());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getTextField_3());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_2());
		contentPane.add(getTextField_5());
		contentPane.add(getLblNewLabel_1_1_1_3());
		contentPane.add(getLblNewLabel_1_1_1_4());
		contentPane.add(getTextField_7());
		contentPane.add(getLblNewLabel_1_1_1_5());
		contentPane.add(getTextField_8());
		contentPane.add(getSeparator());
		contentPane.add(getPanel());
		contentPane.add(getBtnX());
		contentPane.add(getLblNewLabel_1_1_1_5_1());
		contentPane.add(getTextField_1());
		contentPane.add(getLblNewLabel_1_1_1_5_1_1());
		contentPane.add(getTextField_9());
		contentPane.add(getBtnBook());
		contentPane.add(getComboBox_1_1());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_6());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel.setBounds(50, 103, 116, 24);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEnabled(false);
			textField.setBounds(207, 104, 269, 24);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewCustomerForm() {
		if (lblNewCustomerForm == null) {
			lblNewCustomerForm = new JLabel("VIEW BOOKED HOTEL DETAILS");
			lblNewCustomerForm.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblNewCustomerForm.setBounds(240, 32, 449, 32);
		}
		return lblNewCustomerForm;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Hotel Name");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(50, 148, 116, 24);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("No. of Passenger");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblNewLabel_1_1.setBounds(50, 193, 154, 24);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setEnabled(false);
			textField_2.setColumns(10);
			textField_2.setBounds(207, 194, 269, 24);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("No. of Days");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(50, 237, 116, 24);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setEnabled(false);
			textField_3.setColumns(10);
			textField_3.setBounds(207, 238, 269, 24);
		}
		return textField_3;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("AC / Non AC");
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(50, 283, 116, 24);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("Country");
			lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_2.setBounds(50, 329, 116, 24);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setEnabled(false);
			textField_5.setColumns(10);
			textField_5.setBounds(207, 330, 269, 24);
		}
		return textField_5;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("Food Included");
			lblNewLabel_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3.setBounds(50, 373, 140, 24);
		}
		return lblNewLabel_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4() {
		if (lblNewLabel_1_1_1_4 == null) {
			lblNewLabel_1_1_1_4 = new JLabel("ID");
			lblNewLabel_1_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_4.setBounds(50, 415, 116, 24);
		}
		return lblNewLabel_1_1_1_4;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setEnabled(false);
			textField_7.setColumns(10);
			textField_7.setBounds(207, 416, 269, 24);
		}
		return textField_7;
	}
	private JLabel getLblNewLabel_1_1_1_5() {
		if (lblNewLabel_1_1_1_5 == null) {
			lblNewLabel_1_1_1_5 = new JLabel("ID Number");
			lblNewLabel_1_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_5.setBounds(50, 455, 116, 24);
		}
		return lblNewLabel_1_1_1_5;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setEnabled(false);
			textField_8.setColumns(10);
			textField_8.setBounds(207, 456, 269, 24);
		}
		return textField_8;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(280, 76, 359, 24);
		}
		return separator;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(508, 102, 463, 456);
			panel.setLayout(null);
			panel.add(getLblNewLabel_2());
		}
		return panel;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Photos");
			lblNewLabel_2.setBounds(10, 10, 443, 436);
		}
		return lblNewLabel_2;
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
			btnX.setBackground(Color.RED);
			btnX.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnX.setBounds(921, 16, 50, 38);
		}
		return btnX;
	}
	private JLabel getLblNewLabel_1_1_1_5_1() {
		if (lblNewLabel_1_1_1_5_1 == null) {
			lblNewLabel_1_1_1_5_1 = new JLabel("Mobile No.");
			lblNewLabel_1_1_1_5_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_5_1.setBounds(50, 494, 116, 24);
		}
		return lblNewLabel_1_1_1_5_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEnabled(false);
			textField_1.setColumns(10);
			textField_1.setBounds(207, 495, 269, 24);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1_1_1_5_1_1() {
		if (lblNewLabel_1_1_1_5_1_1 == null) {
			lblNewLabel_1_1_1_5_1_1 = new JLabel("Total Price");
			lblNewLabel_1_1_1_5_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_5_1_1.setBounds(50, 534, 116, 24);
		}
		return lblNewLabel_1_1_1_5_1_1;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setEnabled(false);
			textField_9.setColumns(10);
			textField_9.setBounds(207, 535, 269, 24);
		}
		return textField_9;
	}
	private JButton getBtnBook() {
		if (btnBook == null) {
			btnBook = new JButton("Back");
			btnBook.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnBook.setBounds(240, 591, 100, 38);
		}
		return btnBook;
	}
	private JComboBox getComboBox_1_1() {
		if (comboBox_1_1 == null) {
			comboBox_1_1 = new JComboBox();
			comboBox_1_1.setEnabled(false);
			comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
			comboBox_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			comboBox_1_1.setBounds(207, 374, 269, 24);
		}
		return comboBox_1_1;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setEnabled(false);
			textField_4.setColumns(10);
			textField_4.setBounds(207, 149, 269, 24);
		}
		return textField_4;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setEnabled(false);
			textField_6.setColumns(10);
			textField_6.setBounds(207, 284, 269, 24);
		}
		return textField_6;
	}
}
