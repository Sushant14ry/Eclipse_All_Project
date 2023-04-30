package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class New_Account extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField textField_3;
	private JLabel lblNewLabel_1_1_1_2;
	private JTextField textField_4;
	private JLabel lblNewLabel_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_3_1;
	private JDateChooser dateChooser;
	private JComboBox comboBox;
	private JTextField textField_5;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_2_1;
	private JTextField textField_6;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_1_1_1_3_1_1;
	private JLabel lblNewLabel_1_2_1_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnFemale;
	private JLabel lblNewLabel_1_2_1_2;
	private JTextField textField_7;
	private JLabel lblNewLabel_1_2_1_2_1;
	private JTextField textField_8;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField_9;
	private JLabel lblNewLabel_1_1_1_2_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Account frame = new New_Account();
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
	public New_Account() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getPanel());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(347, 10, 177, 72);
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 6), "New Account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(52, 92, 724, 457);
			panel.setLayout(null);
			panel.add(getLblNewLabel_1());
			panel.add(getTextField());
			panel.add(getTextField_1());
			panel.add(getLblNewLabel_1_1());
			panel.add(getTextField_2());
			panel.add(getLblNewLabel_1_1_1());
			panel.add(getLblNewLabel_1_1_1_1());
			panel.add(getTextField_3());
			panel.add(getLblNewLabel_1_1_1_2());
			panel.add(getTextField_4());
			panel.add(getLblNewLabel_1_1_1_3());
			panel.add(getLblNewLabel_1_1_1_3_1());
			panel.add(getDateChooser());
			panel.add(getComboBox());
			panel.add(getTextField_5());
			panel.add(getLblNewLabel_1_2());
			panel.add(getLblNewLabel_1_2_1());
			panel.add(getTextField_6());
			panel.add(getComboBox_1());
			panel.add(getLblNewLabel_1_1_1_3_1_1());
			panel.add(getLblNewLabel_1_2_1_1());
			panel.add(getRdbtnNewRadioButton());
			panel.add(getRdbtnFemale());
			panel.add(getLblNewLabel_1_2_1_2());
			panel.add(getTextField_7());
			panel.add(getLblNewLabel_1_2_1_2_1());
			panel.add(getTextField_8());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_2());
			panel.add(getTextField_9());
			panel.add(getLblNewLabel_1_1_1_2_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Account No.");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1.setBounds(26, 36, 116, 27);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(152, 36, 184, 27);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(500, 36, 184, 27);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Full Name");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(384, 36, 101, 27);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(500, 84, 184, 27);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1.setBounds(384, 84, 101, 27);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Address");
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_1.setBounds(384, 131, 101, 27);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(500, 131, 184, 27);
		}
		return textField_3;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("Caste");
			lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_2.setBounds(384, 175, 101, 27);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(500, 175, 184, 27);
		}
		return textField_4;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("Date of Birth");
			lblNewLabel_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3.setBounds(384, 220, 116, 27);
		}
		return lblNewLabel_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_3_1() {
		if (lblNewLabel_1_1_1_3_1 == null) {
			lblNewLabel_1_1_1_3_1 = new JLabel("Nationality");
			lblNewLabel_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1.setBounds(384, 268, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(500, 220, 184, 27);
		}
		return dateChooser;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(500, 267, 184, 27);
		}
		return comboBox;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(152, 84, 184, 27);
		}
		return textField_5;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("MICR No.");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(26, 84, 116, 27);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("Pin No.");
			lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(26, 131, 116, 27);
		}
		return lblNewLabel_1_2_1;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(152, 131, 184, 27);
		}
		return textField_6;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(152, 177, 184, 27);
		}
		return comboBox_1;
	}
	private JLabel getLblNewLabel_1_1_1_3_1_1() {
		if (lblNewLabel_1_1_1_3_1_1 == null) {
			lblNewLabel_1_1_1_3_1_1 = new JLabel("Account Type");
			lblNewLabel_1_1_1_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1_1.setBounds(26, 178, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1_1;
	}
	private JLabel getLblNewLabel_1_2_1_1() {
		if (lblNewLabel_1_2_1_1 == null) {
			lblNewLabel_1_2_1_1 = new JLabel("Gender");
			lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_1.setBounds(26, 220, 78, 27);
		}
		return lblNewLabel_1_2_1_1;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Male");
			rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 14));
			rdbtnNewRadioButton.setBounds(152, 225, 72, 21);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 14));
			rdbtnFemale.setBounds(251, 225, 85, 21);
		}
		return rdbtnFemale;
	}
	private JLabel getLblNewLabel_1_2_1_2() {
		if (lblNewLabel_1_2_1_2 == null) {
			lblNewLabel_1_2_1_2 = new JLabel("Sec Question");
			lblNewLabel_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_2.setBounds(26, 268, 116, 27);
		}
		return lblNewLabel_1_2_1_2;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(152, 268, 184, 27);
		}
		return textField_7;
	}
	private JLabel getLblNewLabel_1_2_1_2_1() {
		if (lblNewLabel_1_2_1_2_1 == null) {
			lblNewLabel_1_2_1_2_1 = new JLabel("Sec Answer");
			lblNewLabel_1_2_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_2_1.setBounds(26, 310, 116, 27);
		}
		return lblNewLabel_1_2_1_2_1;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(152, 310, 184, 27);
		}
		return textField_8;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBounds(152, 390, 116, 35);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Create");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_1.setBounds(363, 390, 116, 35);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Clear");
			btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_2.setBounds(568, 390, 116, 35);
		}
		return btnNewButton_2;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(500, 310, 184, 27);
		}
		return textField_9;
	}
	private JLabel getLblNewLabel_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_2_1 = new JLabel("Amount");
			lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_2_1.setBounds(384, 310, 101, 27);
		}
		return lblNewLabel_1_1_1_2_1;
	}
}
