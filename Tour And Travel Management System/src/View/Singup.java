package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Singup extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblLogin;
	private JSeparator separator;
	private JButton btnNewButton;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JButton btnSingup;
	private JTextField textField_1;
	private JLabel lblFullName;
	private JLabel lblSecurityQuestion;
	private JTextField textField_3;
	private JLabel lblAnswer;
	private JTextField textField_4;
	private JLabel lblPassword;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singup frame = new Singup();
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
	public Singup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(420, 160, 919, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setLayout(null);
			panel.setBounds(10, 10, 885, 465);
			panel.add(getPanel_1());
			panel.add(getPanel_2());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setLayout(null);
			panel_1.setBounds(12, 10, 437, 445);
			panel_1.add(getLblNewLabel());
			panel_1.add(getTextField());
			panel_1.add(getLblLogin());
			panel_1.add(getSeparator());
			panel_1.add(getBtnNewButton());
			panel_1.add(getBtnSingup());
			panel_1.add(getTextField_1());
			panel_1.add(getLblFullName());
			panel_1.add(getLblSecurityQuestion());
			panel_1.add(getTextField_3());
			panel_1.add(getLblAnswer());
			panel_1.add(getTextField_4());
			panel_1.add(getLblNewLabel_2_1());
			panel_1.add(getComboBox());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(45, 98, 127, 35);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(182, 99, 232, 33);
		}
		return textField;
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("SING - UP");
			lblLogin.setFont(new Font("Elephant", Font.BOLD, 24));
			lblLogin.setBounds(176, 24, 152, 35);
		}
		return lblLogin;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(150, 68, 188, 18);
		}
		return separator;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Create");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton.setBounds(80, 368, 101, 42);
		}
		return btnNewButton;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setLayout(null);
			panel_2.setBounds(480, 10, 390, 445);
			panel_2.add(getLblNewLabel_1());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Photos");
			lblNewLabel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			lblNewLabel_1.setBounds(10, 10, 370, 425);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnSingup() {
		if (btnSingup == null) {
			btnSingup = new JButton("Back");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			btnSingup.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnSingup.setBounds(260, 368, 101, 42);
		}
		return btnSingup;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(182, 151, 232, 33);
		}
		return textField_1;
	}
	private JLabel getLblFullName() {
		if (lblFullName == null) {
			lblFullName = new JLabel("Full Name");
			lblFullName.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblFullName.setBounds(45, 150, 127, 35);
		}
		return lblFullName;
	}
	private JLabel getLblSecurityQuestion() {
		if (lblSecurityQuestion == null) {
			lblSecurityQuestion = new JLabel("Question");
			lblSecurityQuestion.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblSecurityQuestion.setBounds(45, 198, 127, 35);
		}
		return lblSecurityQuestion;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(182, 251, 232, 33);
		}
		return textField_3;
	}
	private JLabel getLblAnswer() {
		if (lblAnswer == null) {
			lblAnswer = new JLabel("Answer");
			lblAnswer.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblAnswer.setBounds(45, 250, 127, 35);
		}
		return lblAnswer;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(182, 302, 232, 33);
		}
		return textField_4;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblPassword.setBounds(45, 301, 127, 35);
		}
		return lblPassword;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setFont(new Font("Arial Black", Font.BOLD, 16));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Your Nickname ?", "What is Your Favourite Flower"}));
			comboBox.setBounds(182, 199, 232, 33);
		}
		return comboBox;
	}
}
