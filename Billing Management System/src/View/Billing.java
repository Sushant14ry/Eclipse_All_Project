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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Billing extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblAnswer;
	private JTextField textField;
	private JLabel lblBuyerDetails;
	private JLabel lblContactNo;
	private JTextField textField_1;
	private JLabel lblAnswer_2;
	private JTextField textField_2;
	private JLabel lblAnswer_3;
	private JTextField textField_3;
	private JSeparator separator_1;
	private JLabel lblProductDetails;
	private JLabel lblProductId;
	private JTextField textField_4;
	private JLabel lblProductName;
	private JTextField textField_5;
	private JLabel lblAnswer_2_1;
	private JTextField textField_6;
	private JLabel lblAnswer_3_1;
	private JTextField textField_7;
	private JLabel lblAnswer_2_1_1;
	private JTextField textField_8;
	private JSeparator separator_1_1;
	private JButton btnAdd;
	private JScrollPane scrollPane;
	private JLabel lblAnswer_2_2;
	private JTextField textField_9;
	private JLabel lblCalculationDetails;
	private JTextField textField_10;
	private JLabel lblAnswer_2_2_1;
	private JTextField textField_11;
	private JLabel lblAnswer_2_2_1_1;
	private JButton btnSave;
	private JButton btnReset;
	private JButton btnClear;
	private JSeparator separator_2;
	private JTable table;
	private JLabel lblAnswer_2_3;
	private JLabel lblAnswer_2_3_1;
	private JLabel lblAnswer_2_3_1_1;
	private JLabel lblAnswer_2_3_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 170, 1300, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblAnswer());
		contentPane.add(getTextField());
		contentPane.add(getLblBuyerDetails());
		contentPane.add(getLblContactNo());
		contentPane.add(getTextField_1());
		contentPane.add(getLblAnswer_2());
		contentPane.add(getTextField_2());
		contentPane.add(getLblAnswer_3());
		contentPane.add(getTextField_3());
		contentPane.add(getSeparator_1());
		contentPane.add(getLblProductDetails());
		contentPane.add(getLblProductId());
		contentPane.add(getTextField_4());
		contentPane.add(getLblProductName());
		contentPane.add(getTextField_5());
		contentPane.add(getLblAnswer_2_1());
		contentPane.add(getTextField_6());
		contentPane.add(getLblAnswer_3_1());
		contentPane.add(getTextField_7());
		contentPane.add(getLblAnswer_2_1_1());
		contentPane.add(getTextField_8());
		contentPane.add(getSeparator_1_1());
		contentPane.add(getBtnAdd());
		contentPane.add(getScrollPane());
		contentPane.add(getLblAnswer_2_2());
		contentPane.add(getTextField_9());
		contentPane.add(getLblCalculationDetails());
		contentPane.add(getTextField_10());
		contentPane.add(getLblAnswer_2_2_1());
		contentPane.add(getTextField_11());
		contentPane.add(getLblAnswer_2_2_1_1());
		contentPane.add(getBtnSave());
		contentPane.add(getBtnReset());
		contentPane.add(getBtnClear());
		contentPane.add(getSeparator_2());
		contentPane.add(getLblAnswer_2_3());
		contentPane.add(getLblAnswer_2_3_1());
		contentPane.add(getLblAnswer_2_3_1_1());
		contentPane.add(getLblAnswer_2_3_2());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Billing");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(32, 10, 140, 60);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(0, 80, 1300, 14);
		}
		return separator;
	}
	private JLabel getLblAnswer() {
		if (lblAnswer == null) {
			lblAnswer = new JLabel("Name");
			lblAnswer.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer.setBounds(25, 136, 76, 28);
		}
		return lblAnswer;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(98, 137, 200, 28);
		}
		return textField;
	}
	private JLabel getLblBuyerDetails() {
		if (lblBuyerDetails == null) {
			lblBuyerDetails = new JLabel("Buyer Details :- ");
			lblBuyerDetails.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblBuyerDetails.setBounds(25, 84, 197, 42);
		}
		return lblBuyerDetails;
	}
	private JLabel getLblContactNo() {
		if (lblContactNo == null) {
			lblContactNo = new JLabel("Contact No.");
			lblContactNo.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblContactNo.setBounds(340, 135, 125, 28);
		}
		return lblContactNo;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(460, 136, 176, 28);
		}
		return textField_1;
	}
	private JLabel getLblAnswer_2() {
		if (lblAnswer_2 == null) {
			lblAnswer_2 = new JLabel("Email");
			lblAnswer_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_2.setBounds(685, 136, 76, 28);
		}
		return lblAnswer_2;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(760, 137, 200, 28);
		}
		return textField_2;
	}
	private JLabel getLblAnswer_3() {
		if (lblAnswer_3 == null) {
			lblAnswer_3 = new JLabel("Address");
			lblAnswer_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_3.setBounds(1000, 136, 86, 28);
		}
		return lblAnswer_3;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(1090, 137, 184, 28);
		}
		return textField_3;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(0, 189, 1300, 14);
		}
		return separator_1;
	}
	private JLabel getLblProductDetails() {
		if (lblProductDetails == null) {
			lblProductDetails = new JLabel("Product Details :- ");
			lblProductDetails.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblProductDetails.setBounds(25, 205, 204, 42);
		}
		return lblProductDetails;
	}
	private JLabel getLblProductId() {
		if (lblProductId == null) {
			lblProductId = new JLabel("Product ID ");
			lblProductId.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblProductId.setBounds(25, 259, 117, 28);
		}
		return lblProductId;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(140, 260, 82, 28);
		}
		return textField_4;
	}
	private JLabel getLblProductName() {
		if (lblProductName == null) {
			lblProductName = new JLabel("Product Name");
			lblProductName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblProductName.setBounds(260, 258, 146, 28);
		}
		return lblProductName;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(410, 259, 164, 28);
		}
		return textField_5;
	}
	private JLabel getLblAnswer_2_1() {
		if (lblAnswer_2_1 == null) {
			lblAnswer_2_1 = new JLabel("Rate");
			lblAnswer_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_2_1.setBounds(602, 258, 76, 28);
		}
		return lblAnswer_2_1;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(664, 259, 101, 28);
		}
		return textField_6;
	}
	private JLabel getLblAnswer_3_1() {
		if (lblAnswer_3_1 == null) {
			lblAnswer_3_1 = new JLabel("Description");
			lblAnswer_3_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_3_1.setBounds(1000, 259, 124, 28);
		}
		return lblAnswer_3_1;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(1130, 260, 144, 28);
		}
		return textField_7;
	}
	private JLabel getLblAnswer_2_1_1() {
		if (lblAnswer_2_1_1 == null) {
			lblAnswer_2_1_1 = new JLabel("Quantity");
			lblAnswer_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_2_1_1.setBounds(792, 258, 101, 28);
		}
		return lblAnswer_2_1_1;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(895, 259, 76, 28);
		}
		return textField_8;
	}
	private JSeparator getSeparator_1_1() {
		if (separator_1_1 == null) {
			separator_1_1 = new JSeparator();
			separator_1_1.setBounds(0, 344, 1300, 14);
		}
		return separator_1_1;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("ADD");
			btnAdd.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnAdd.setBounds(1194, 300, 80, 32);
		}
		return btnAdd;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(25, 356, 671, 234);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JLabel getLblAnswer_2_2() {
		if (lblAnswer_2_2 == null) {
			lblAnswer_2_2 = new JLabel("Total");
			lblAnswer_2_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_2_2.setBounds(727, 422, 76, 28);
		}
		return lblAnswer_2_2;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(891, 423, 248, 28);
		}
		return textField_9;
	}
	private JLabel getLblCalculationDetails() {
		if (lblCalculationDetails == null) {
			lblCalculationDetails = new JLabel("Calculation Details :- ");
			lblCalculationDetails.setFont(new Font("Arial Black", Font.BOLD, 18));
			lblCalculationDetails.setBounds(727, 358, 244, 34);
		}
		return lblCalculationDetails;
	}
	private JTextField getTextField_10() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(891, 474, 248, 28);
		}
		return textField_10;
	}
	private JLabel getLblAnswer_2_2_1() {
		if (lblAnswer_2_2_1 == null) {
			lblAnswer_2_2_1 = new JLabel("Paid Amount");
			lblAnswer_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_2_2_1.setBounds(727, 473, 136, 28);
		}
		return lblAnswer_2_2_1;
	}
	private JTextField getTextField_11() {
		if (textField_11 == null) {
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(891, 525, 248, 28);
		}
		return textField_11;
	}
	private JLabel getLblAnswer_2_2_1_1() {
		if (lblAnswer_2_2_1_1 == null) {
			lblAnswer_2_2_1_1 = new JLabel("Return Amount");
			lblAnswer_2_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer_2_2_1_1.setBounds(727, 524, 155, 28);
		}
		return lblAnswer_2_2_1_1;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSave.setBounds(1170, 423, 101, 28);
		}
		return btnSave;
	}
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("Reset");
			btnReset.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnReset.setBounds(1170, 474, 101, 28);
		}
		return btnReset;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnClear.setBounds(1170, 525, 101, 28);
		}
		return btnClear;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setBounds(727, 396, 237, 16);
		}
		return separator_2;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Description", "Rate", "Quantity", "Total Amount"
				}
			));
		}
		return table;
	}
	private JLabel getLblAnswer_2_3() {
		if (lblAnswer_2_3 == null) {
			lblAnswer_2_3 = new JLabel("Date  :-");
			lblAnswer_2_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAnswer_2_3.setBounds(1066, 9, 68, 28);
		}
		return lblAnswer_2_3;
	}
	private JLabel getLblAnswer_2_3_1() {
		if (lblAnswer_2_3_1 == null) {
			lblAnswer_2_3_1 = new JLabel("Time  :- ");
			lblAnswer_2_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAnswer_2_3_1.setBounds(1066, 42, 76, 28);
		}
		return lblAnswer_2_3_1;
	}
	private JLabel getLblAnswer_2_3_1_1() {
		if (lblAnswer_2_3_1_1 == null) {
			lblAnswer_2_3_1_1 = new JLabel("12 : 12 AM");
			lblAnswer_2_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAnswer_2_3_1_1.setBounds(1136, 42, 125, 28);
		}
		return lblAnswer_2_3_1_1;
	}
	private JLabel getLblAnswer_2_3_2() {
		if (lblAnswer_2_3_2 == null) {
			lblAnswer_2_3_2 = new JLabel("01/18/2022");
			lblAnswer_2_3_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAnswer_2_3_2.setBounds(1136, 9, 125, 28);
		}
		return lblAnswer_2_3_2;
	}
}
