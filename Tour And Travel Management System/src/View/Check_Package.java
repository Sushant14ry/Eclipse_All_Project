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
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

public class Check_Package extends JFrame {

	private JPanel contentPane;
	private JButton btnX;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1_2;
	private JPanel panel_3;
	private JLabel lblNewLabel_1_2_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_1_2;
	private JLabel lblNewLabel_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_1_1_1_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1_2_2;
	private JLabel lblNewLabel_1_2_1_1;
	private JPanel panel_3_1;
	private JLabel lblNewLabel_2_1;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblSilverPackage;
	private JLabel lblNewLabel_1_1_1_1_1_2_1;
	private JLabel lblPackage;
	private JSeparator separator_1_1;
	private JLabel lblNewLabel_1_3_1;
	private JLabel lblNewLabel_1_1_2_1;
	private JLabel lblNewLabel_1_1_1_2_1;
	private JLabel lblNewLabel_1_1_1_1_2_1;
	private JLabel lblNewLabel_1_1_1_1_1_2_2;
	private JLabel lblNewLabel_1_1_1_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1_2_1_1;
	private JButton btnNewButton_1_1;
	private JLabel lblNewLabel_1_2_2_1;
	private JLabel lblNewLabel_1_2_1_1_1;
	private JPanel panel_3_1_1;
	private JLabel lblNewLabel_2_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check_Package frame = new Check_Package();
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
	public Check_Package() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 919, 574);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnX());
		contentPane.add(getTabbedPane());
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
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(10, 39, 899, 525);
			tabbedPane.addTab("Package 1", null, getPanel(), null);
			tabbedPane.addTab("Package 2", null, getPanel_1(), null);
			tabbedPane.addTab("Package 3", null, getPanel_2(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 222, 173));
			panel.setForeground(new Color(255, 140, 0));
			panel.setFont(new Font("Tahoma", Font.BOLD, 16));
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLabel_1());
			panel.add(getLblNewLabel_1_1());
			panel.add(getLblNewLabel_1_1_1());
			panel.add(getLblNewLabel_1_1_1_1());
			panel.add(getLblNewLabel_1_1_1_1_1());
			panel.add(getLblNewLabel_1_1_1_1_1_1());
			panel.add(getBtnNewButton());
			panel.add(getLblNewLabel_1_2());
			panel.add(getPanel_3());
			panel.add(getLblNewLabel_1_2_1());
			panel.add(getSeparator());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 250, 205));
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1_3());
			panel_1.add(getLblNewLabel_1_1_2());
			panel_1.add(getLblNewLabel_1_1_1_2());
			panel_1.add(getLblNewLabel_1_1_1_1_2());
			panel_1.add(getLblNewLabel_1_1_1_1_1_2());
			panel_1.add(getLblNewLabel_1_1_1_1_1_1_1());
			panel_1.add(getBtnNewButton_1());
			panel_1.add(getLblNewLabel_1_2_2());
			panel_1.add(getLblNewLabel_1_2_1_1());
			panel_1.add(getPanel_3_1());
			panel_1.add(getSeparator_1());
			panel_1.add(getLblSilverPackage());
			panel_1.add(getLblNewLabel_1_1_1_1_1_2_1());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(new Color(152, 251, 152));
			panel_2.setLayout(null);
			panel_2.add(getLblPackage());
			panel_2.add(getSeparator_1_1());
			panel_2.add(getLblNewLabel_1_3_1());
			panel_2.add(getLblNewLabel_1_1_2_1());
			panel_2.add(getLblNewLabel_1_1_1_2_1());
			panel_2.add(getLblNewLabel_1_1_1_1_2_1());
			panel_2.add(getLblNewLabel_1_1_1_1_1_2_2());
			panel_2.add(getLblNewLabel_1_1_1_1_1_1_1_1());
			panel_2.add(getLblNewLabel_1_1_1_1_1_2_1_1());
			panel_2.add(getBtnNewButton_1_1());
			panel_2.add(getLblNewLabel_1_2_2_1());
			panel_2.add(getLblNewLabel_1_2_1_1_1());
			panel_2.add(getPanel_3_1_1());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("GOLD PACKAGE");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblNewLabel.setBounds(154, 10, 247, 50);
		}
		return lblNewLabel;
	}
	private JLabel getLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("6 Days 7 Night");
			lblNewLabel_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(50, 78, 247, 32);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Airport Assistance at Airport");
			lblNewLabel_1_1.setForeground(new Color(0, 0, 255));
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(50, 120, 300, 32);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Half Day City Tour");
			lblNewLabel_1_1_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(50, 162, 247, 32);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Welcome drinks on Arrival");
			lblNewLabel_1_1_1_1.setForeground(new Color(0, 0, 255));
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(50, 204, 260, 32);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Full Day 3 Island Cruise");
			lblNewLabel_1_1_1_1_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1.setBounds(50, 246, 247, 32);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1 = new JLabel("Language Converter Guide");
			lblNewLabel_1_1_1_1_1_1.setForeground(new Color(0, 0, 255));
			lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_1.setBounds(50, 288, 247, 32);
		}
		return lblNewLabel_1_1_1_1_1_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Book Now");
			btnNewButton.setForeground(new Color(0, 0, 255));
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(50, 385, 150, 32);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Summer Special");
			lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_2.setBounds(50, 442, 247, 32);
		}
		return lblNewLabel_1_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3.setBounds(436, 78, 412, 312);
			panel_3.setLayout(null);
			panel_3.add(getLblNewLabel_2());
		}
		return panel_3;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("Rs. 12000 /-  Only");
			lblNewLabel_1_2_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_2_1.setBounds(598, 442, 247, 32);
		}
		return lblNewLabel_1_2_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setBounds(10, 10, 392, 292);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("4 Days 3 Night");
			lblNewLabel_1_3.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_3.setBounds(31, 78, 247, 32);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Toll Free and Entrance Free Tickets");
			lblNewLabel_1_1_2.setForeground(Color.BLUE);
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_2.setBounds(31, 120, 338, 32);
		}
		return lblNewLabel_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("Meet and Great at Airport");
			lblNewLabel_1_1_1_2.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_2.setBounds(31, 162, 247, 32);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_1_2() {
		if (lblNewLabel_1_1_1_1_2 == null) {
			lblNewLabel_1_1_1_1_2 = new JLabel("Welcome drinks on Arrival");
			lblNewLabel_1_1_1_1_2.setForeground(Color.BLUE);
			lblNewLabel_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_2.setBounds(31, 204, 260, 32);
		}
		return lblNewLabel_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_2() {
		if (lblNewLabel_1_1_1_1_1_2 == null) {
			lblNewLabel_1_1_1_1_1_2 = new JLabel("Night Safari");
			lblNewLabel_1_1_1_1_1_2.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_2.setBounds(31, 246, 247, 32);
		}
		return lblNewLabel_1_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Full Day 3 Island Cruise");
			lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.BLUE);
			lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_1_1.setBounds(31, 288, 247, 32);
		}
		return lblNewLabel_1_1_1_1_1_1_1;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Book Now");
			btnNewButton_1.setForeground(Color.BLUE);
			btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1.setBounds(31, 400, 150, 32);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_1_2_2() {
		if (lblNewLabel_1_2_2 == null) {
			lblNewLabel_1_2_2 = new JLabel("Summer Special");
			lblNewLabel_1_2_2.setForeground(Color.BLACK);
			lblNewLabel_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_2_2.setBounds(31, 450, 247, 32);
		}
		return lblNewLabel_1_2_2;
	}
	private JLabel getLblNewLabel_1_2_1_1() {
		if (lblNewLabel_1_2_1_1 == null) {
			lblNewLabel_1_2_1_1 = new JLabel("Rs. 25000 /-  Only");
			lblNewLabel_1_2_1_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_2_1_1.setBounds(579, 442, 247, 32);
		}
		return lblNewLabel_1_2_1_1;
	}
	private JPanel getPanel_3_1() {
		if (panel_3_1 == null) {
			panel_3_1 = new JPanel();
			panel_3_1.setLayout(null);
			panel_3_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3_1.setBounds(417, 78, 412, 312);
			panel_3_1.add(getLblNewLabel_2_1());
		}
		return panel_3_1;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("New label");
			lblNewLabel_2_1.setBounds(10, 10, 392, 292);
		}
		return lblNewLabel_2_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(132, 58, 265, 21);
		}
		return separator;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(134, 58, 283, 21);
		}
		return separator_1;
	}
	private JLabel getLblSilverPackage() {
		if (lblSilverPackage == null) {
			lblSilverPackage = new JLabel("SILVER PACKAGE");
			lblSilverPackage.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblSilverPackage.setBounds(156, 10, 247, 50);
		}
		return lblSilverPackage;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_1_1_2_1 = new JLabel("Cruise with Dinner");
			lblNewLabel_1_1_1_1_1_2_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_1_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_2_1.setBounds(31, 328, 247, 32);
		}
		return lblNewLabel_1_1_1_1_1_2_1;
	}
	private JLabel getLblPackage() {
		if (lblPackage == null) {
			lblPackage = new JLabel("BRONZE PACKAGE");
			lblPackage.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblPackage.setBounds(170, 10, 274, 50);
		}
		return lblPackage;
	}
	private JSeparator getSeparator_1_1() {
		if (separator_1_1 == null) {
			separator_1_1 = new JSeparator();
			separator_1_1.setBounds(152, 58, 292, 21);
		}
		return separator_1_1;
	}
	private JLabel getLblNewLabel_1_3_1() {
		if (lblNewLabel_1_3_1 == null) {
			lblNewLabel_1_3_1 = new JLabel("6 Days 5 Night");
			lblNewLabel_1_3_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_3_1.setBounds(49, 78, 247, 32);
		}
		return lblNewLabel_1_3_1;
	}
	private JLabel getLblNewLabel_1_1_2_1() {
		if (lblNewLabel_1_1_2_1 == null) {
			lblNewLabel_1_1_2_1 = new JLabel("Return Airfare");
			lblNewLabel_1_1_2_1.setForeground(Color.BLUE);
			lblNewLabel_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_2_1.setBounds(49, 120, 338, 32);
		}
		return lblNewLabel_1_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_2_1 = new JLabel("Free Clubbing, Horse Riding....");
			lblNewLabel_1_1_1_2_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_2_1.setBounds(49, 162, 247, 32);
		}
		return lblNewLabel_1_1_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_1_2_1 = new JLabel("Welcome drinks on Arrival");
			lblNewLabel_1_1_1_1_2_1.setForeground(Color.BLUE);
			lblNewLabel_1_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_2_1.setBounds(49, 204, 260, 32);
		}
		return lblNewLabel_1_1_1_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_2_2() {
		if (lblNewLabel_1_1_1_1_1_2_2 == null) {
			lblNewLabel_1_1_1_1_1_2_2 = new JLabel("Daily Buffet");
			lblNewLabel_1_1_1_1_1_2_2.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_1_1_1_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_2_2.setBounds(49, 246, 247, 32);
		}
		return lblNewLabel_1_1_1_1_1_2_2;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Stay in 5 Star Hotel");
			lblNewLabel_1_1_1_1_1_1_1_1.setForeground(Color.BLUE);
			lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_1_1_1.setBounds(49, 288, 247, 32);
		}
		return lblNewLabel_1_1_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_2_1_1() {
		if (lblNewLabel_1_1_1_1_1_2_1_1 == null) {
			lblNewLabel_1_1_1_1_1_2_1_1 = new JLabel("BBQ Dinner");
			lblNewLabel_1_1_1_1_1_2_1_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_1_1_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_2_1_1.setBounds(49, 328, 247, 32);
		}
		return lblNewLabel_1_1_1_1_1_2_1_1;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Book Now");
			btnNewButton_1_1.setForeground(Color.BLUE);
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton_1_1.setBounds(49, 400, 150, 32);
		}
		return btnNewButton_1_1;
	}
	private JLabel getLblNewLabel_1_2_2_1() {
		if (lblNewLabel_1_2_2_1 == null) {
			lblNewLabel_1_2_2_1 = new JLabel("Summer Special");
			lblNewLabel_1_2_2_1.setForeground(Color.BLACK);
			lblNewLabel_1_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_2_2_1.setBounds(49, 450, 247, 32);
		}
		return lblNewLabel_1_2_2_1;
	}
	private JLabel getLblNewLabel_1_2_1_1_1() {
		if (lblNewLabel_1_2_1_1_1 == null) {
			lblNewLabel_1_2_1_1_1 = new JLabel("Rs. 32000 /-  Only");
			lblNewLabel_1_2_1_1_1.setForeground(new Color(255, 140, 0));
			lblNewLabel_1_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_2_1_1_1.setBounds(597, 442, 247, 32);
		}
		return lblNewLabel_1_2_1_1_1;
	}
	private JPanel getPanel_3_1_1() {
		if (panel_3_1_1 == null) {
			panel_3_1_1 = new JPanel();
			panel_3_1_1.setLayout(null);
			panel_3_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3_1_1.setBounds(435, 78, 412, 312);
			panel_3_1_1.add(getLblNewLabel_2_1_1());
		}
		return panel_3_1_1;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("New label");
			lblNewLabel_2_1_1.setBounds(10, 10, 392, 292);
		}
		return lblNewLabel_2_1_1;
	}
}
