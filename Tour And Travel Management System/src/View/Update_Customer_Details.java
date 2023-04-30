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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Update_Customer_Details extends JFrame {

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
	private JTextField textField_6;
	private JLabel lblNewLabel_1_1_1_4;
	private JTextField textField_7;
	private JLabel lblNewLabel_1_1_1_5;
	private JTextField textField_8;
	private JSeparator separator;
	private JButton btnNewButton;
	private JButton btnBack;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox;
	private JButton btnX;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnFemale;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Customer_Details frame = new Update_Customer_Details();
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
	public Update_Customer_Details() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 919, 574);
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
		contentPane.add(getTextField_6());
		contentPane.add(getLblNewLabel_1_1_1_4());
		contentPane.add(getTextField_7());
		contentPane.add(getLblNewLabel_1_1_1_5());
		contentPane.add(getTextField_8());
		contentPane.add(getSeparator());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnBack());
		contentPane.add(getPanel());
		contentPane.add(getComboBox());
		contentPane.add(getBtnX());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRdbtnFemale());
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
			textField.setBounds(180, 104, 296, 24);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewCustomerForm() {
		if (lblNewCustomerForm == null) {
			lblNewCustomerForm = new JLabel("UPDATE CUSTOMER DETAILS");
			lblNewCustomerForm.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblNewCustomerForm.setBounds(246, 40, 420, 32);
		}
		return lblNewCustomerForm;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("ID ");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(50, 148, 116, 24);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("ID Number");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(50, 193, 116, 24);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(180, 194, 296, 24);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Full Name");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(50, 237, 116, 24);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(180, 238, 296, 24);
		}
		return textField_3;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Gender");
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
			textField_5.setColumns(10);
			textField_5.setBounds(180, 330, 296, 24);
		}
		return textField_5;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("Address");
			lblNewLabel_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3.setBounds(50, 373, 116, 24);
		}
		return lblNewLabel_1_1_1_3;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(180, 374, 296, 24);
		}
		return textField_6;
	}
	private JLabel getLblNewLabel_1_1_1_4() {
		if (lblNewLabel_1_1_1_4 == null) {
			lblNewLabel_1_1_1_4 = new JLabel("Mobile No.");
			lblNewLabel_1_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_4.setBounds(50, 415, 116, 24);
		}
		return lblNewLabel_1_1_1_4;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(180, 416, 296, 24);
		}
		return textField_7;
	}
	private JLabel getLblNewLabel_1_1_1_5() {
		if (lblNewLabel_1_1_1_5 == null) {
			lblNewLabel_1_1_1_5 = new JLabel("Email ID");
			lblNewLabel_1_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_5.setBounds(50, 455, 116, 24);
		}
		return lblNewLabel_1_1_1_5;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(180, 456, 296, 24);
		}
		return textField_8;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(274, 80, 359, 24);
		}
		return separator;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(180, 503, 100, 38);
		}
		return btnNewButton;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnBack.setBounds(376, 503, 100, 38);
		}
		return btnBack;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(508, 102, 376, 377);
			panel.setLayout(null);
			panel.add(getLblNewLabel_2());
		}
		return panel;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Photos");
			lblNewLabel_2.setBounds(10, 10, 356, 357);
		}
		return lblNewLabel_2;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setFont(new Font("Arial Black", Font.BOLD, 16));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"[ --- Choose Your ID ---- ]", "Citizenship", "Password", "Voter ID", "Driving License"}));
			comboBox.setBounds(180, 149, 296, 24);
		}
		return comboBox;
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
			btnX.setBounds(854, 10, 50, 38);
		}
		return btnX;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Male");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 15));
			rdbtnNewRadioButton.setBounds(180, 284, 82, 21);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 15));
			rdbtnFemale.setBounds(327, 284, 107, 21);
		}
		return rdbtnFemale;
	}
}
