package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Model.Employee;
import Service.Emp_Service;
import Service.Emp_Service_empl;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ButtonGroup;

public class Attendence extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JPanel emp_panel;
	private JLabel namelabel;
	private JPanel op_panel;
	private JLabel lblNewLabel_1_1;
	private JButton btnP;
	private JButton btnA;
	private JPanel A_Emp_Pannel;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attendence frame = new Attendence();
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
	public Attendence() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getEmp_panel());
		contentPane.add(getOp_panel());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getA_Emp_Pannel());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Attendence");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(252, 24, 147, 39);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(198, 60, 230, 39);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Employee Name");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(85, 92, 160, 39);
		}
		return lblNewLabel_1;
	}
	private JPanel getEmp_panel() {
		if (emp_panel == null) {
			emp_panel = new JPanel();
			emp_panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			emp_panel.setBounds(23, 139, 301, 484);
			emp_panel.setLayout(null);
			emp_panel.add(getLabel_1());
		}
		return emp_panel;
	}
	private JLabel getLabel_1() {
		if (namelabel == null) {
			namelabel = new JLabel("Sushant Chaudhary");
			namelabel.setFont(new Font("Arial Black", Font.BOLD, 14));
			namelabel.setBounds(20, 10, 197, 21);
		}
		return namelabel;
	}
	private JPanel getOp_panel() {
		if (op_panel == null) {
			op_panel = new JPanel();
			op_panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			op_panel.setBounds(341, 139, 165, 484);
			op_panel.setLayout(null);
			op_panel.add(getBtnP());
			op_panel.add(getBtnA());
		}
		return op_panel;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Operation");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(364, 92, 104, 39);
		}
		return lblNewLabel_1_1;
	}
	private JButton getBtnP() {
		if (btnP == null) {
			btnP = new JButton("P");
			buttonGroup.add(btnP);
			btnP.setBackground(Color.GREEN);
			btnP.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnP.setBounds(10, 10, 59, 31);
		}
		return btnP;
	}
	private JButton getBtnA() {
		if (btnA == null) {
			btnA = new JButton("A");
			buttonGroup.add(btnA);
			btnA.setBackground(Color.RED);
			btnA.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnA.setBounds(96, 10, 59, 31);
		}
		return btnA;
	}
	private JPanel getA_Emp_Pannel() {
		if (A_Emp_Pannel == null) {
			A_Emp_Pannel = new JPanel();
			A_Emp_Pannel.setBounds(516, 139, 455, 484);
			A_Emp_Pannel.setLayout(null);
		}
		return A_Emp_Pannel;
	}
	
	// Diplay All Employee
	
	private void show_All_Employee() {
		Emp_Service es = new Emp_Service_empl();
		List<Employee> emp = es.AllEmployee();
		
//		DefaultTableModel tmodel = namelabel.getmo
		
	}
	
}
