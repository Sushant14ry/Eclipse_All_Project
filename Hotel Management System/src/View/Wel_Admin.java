package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Wel_Admin extends JFrame {
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnClear;
	private JSeparator separator;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnExit;
	private JButton btnLogout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wel_Admin frame = new Wel_Admin();
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
	public Wel_Admin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 40, 1402, 774);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextField());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnClear());
		contentPane.add(getSeparator());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnExit());
		contentPane.add(getBtnLogout());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("WELCOME   ADMIN  !");
			lblNewLabel.setFont(new Font("Elephant", Font.BOLD, 36));
			lblNewLabel.setBounds(36, 26, 491, 110);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Search by Name or Email");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel_1.setBounds(300, 130, 307, 34);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(598, 130, 277, 32);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Search");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBounds(885, 130, 111, 32);
		}
		return btnNewButton;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.setForeground(Color.WHITE);
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnClear.setBackground(new Color(220, 20, 60));
			btnClear.setBounds(1235, 132, 103, 32);
		}
		return btnClear;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(0, 191, 1402, 49);
		}
		return separator;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(63, 219, 1275, 517);
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
					"Name", "Email", "Security Question", "Address", "Status"
				}
			));
		}
		return table;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.setForeground(Color.WHITE);
			btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnExit.setBackground(Color.RED);
			btnExit.setBounds(1289, 10, 103, 49);
		}
		return btnExit;
	}
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton("Logout");
			btnLogout.setForeground(Color.WHITE);
			btnLogout.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnLogout.setBackground(Color.ORANGE);
			btnLogout.setBounds(1136, 10, 126, 49);
		}
		return btnLogout;
	}
}
