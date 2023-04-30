package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class New_Buyer extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JSeparator separator_1;
	private JButton btnNewButton;
	private JButton btnReset;
	private JButton btnNewButton_1_1;
	private JTextField textField;
	private JLabel lblAnswer;
	private JTextField textField_1;
	private JLabel lblAnswer_1_1_1;
	private JTextField textField_2;
	private JLabel lblAnswer_1_1_1_1;
	private JTextField textField_3;
	private JLabel lblAnswer_1_1_1_2;
	private JLabel lblAnswer_1_1_1_3;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Buyer frame = new New_Buyer();
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
	public New_Buyer() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(440, 200, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getSeparator_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnReset());
		contentPane.add(getBtnNewButton_1_1());
		contentPane.add(getTextField());
		contentPane.add(getLblAnswer());
		contentPane.add(getTextField_1());
		contentPane.add(getLblAnswer_1_1_1());
		contentPane.add(getTextField_2());
		contentPane.add(getLblAnswer_1_1_1_1());
		contentPane.add(getTextField_3());
		contentPane.add(getLblAnswer_1_1_1_2());
		contentPane.add(getLblAnswer_1_1_1_3());
		contentPane.add(getComboBox());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New Buyer");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(319, 10, 246, 60);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(0, 80, 800, 32);
		}
		return separator;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(0, 410, 800, 32);
		}
		return separator_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Save");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 24));
			btnNewButton.setBounds(73, 444, 133, 40);
		}
		return btnNewButton;
	}
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("Reset");
			btnReset.setFont(new Font("Arial Black", Font.BOLD, 24));
			btnReset.setBounds(336, 444, 133, 40);
		}
		return btnReset;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Close");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 24));
			btnNewButton_1_1.setBounds(609, 444, 133, 40);
		}
		return btnNewButton_1_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(347, 120, 332, 28);
		}
		return textField;
	}
	private JLabel getLblAnswer() {
		if (lblAnswer == null) {
			lblAnswer = new JLabel("Full Name");
			lblAnswer.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer.setBounds(180, 119, 96, 28);
		}
		return lblAnswer;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(347, 174, 332, 28);
		}
		return textField_1;
	}
	private JLabel getLblAnswer_1_1_1() {
		if (lblAnswer_1_1_1 == null) {
			lblAnswer_1_1_1 = new JLabel("Contact No.");
			lblAnswer_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_1_1_1.setBounds(180, 173, 133, 28);
		}
		return lblAnswer_1_1_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(347, 228, 332, 28);
		}
		return textField_2;
	}
	private JLabel getLblAnswer_1_1_1_1() {
		if (lblAnswer_1_1_1_1 == null) {
			lblAnswer_1_1_1_1 = new JLabel("Email ID");
			lblAnswer_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_1_1_1_1.setBounds(180, 227, 96, 28);
		}
		return lblAnswer_1_1_1_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(347, 282, 332, 28);
		}
		return textField_3;
	}
	private JLabel getLblAnswer_1_1_1_2() {
		if (lblAnswer_1_1_1_2 == null) {
			lblAnswer_1_1_1_2 = new JLabel("Address");
			lblAnswer_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_1_1_1_2.setBounds(180, 281, 96, 28);
		}
		return lblAnswer_1_1_1_2;
	}
	private JLabel getLblAnswer_1_1_1_3() {
		if (lblAnswer_1_1_1_3 == null) {
			lblAnswer_1_1_1_3 = new JLabel("Gender");
			lblAnswer_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_1_1_1_3.setBounds(180, 335, 96, 28);
		}
		return lblAnswer_1_1_1_3;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setFont(new Font("Arial Black", Font.BOLD, 16));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
			comboBox.setBounds(347, 336, 332, 29);
		}
		return comboBox;
	}
}
