package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.Window.Type;

public class Statics_info extends JFrame {

	private JPanel contentPane;
	private JLabel Statics;
	private JLabel lblNewLabel_4_1;
	private JPanel panel;
	private JLabel Statics_1;
	private JLabel Statics_1_1;
	private JLabel Statics_2;
	private JLabel lblNewLabel_4_1_1;
	private JLabel lblNewLabel_4_1_1_2;
	private JLabel lblNewLabel_4_1_1_2_1;
	private JLabel lblNewLabel_4_1_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statics_info frame = new Statics_info();
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
	public Statics_info() {
		setResizable(false);
		setRootPaneCheckingEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblNewLabel_4_1_2());
	}
	private JLabel getStatics() {
		if (Statics == null) {
			Statics = new JLabel("");
			Statics.setBounds(72, 40, 207, 183);
			Statics.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		}
		return Statics;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("All New Books");
			lblNewLabel_4_1.setBounds(120, 227, 124, 18);
			lblNewLabel_4_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		}
		return lblNewLabel_4_1;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(60, 60, 636, 505);
			panel.setLayout(null);
			panel.add(getLblNewLabel_4_1());
			panel.add(getStatics());
			panel.add(getStatics_1());
			panel.add(getStatics_1_1());
			panel.add(getStatics_2());
			panel.add(getLblNewLabel_4_1_1());
			panel.add(getLblNewLabel_4_1_1_2());
			panel.add(getLblNewLabel_4_1_1_2_1());
		}
		return panel;
	}
	private JLabel getStatics_1() {
		if (Statics_1 == null) {
			Statics_1 = new JLabel("");
			Statics_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			Statics_1.setBounds(351, 40, 207, 183);
		}
		return Statics_1;
	}
	private JLabel getStatics_1_1() {
		if (Statics_1_1 == null) {
			Statics_1_1 = new JLabel("");
			Statics_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			Statics_1_1.setBounds(351, 268, 207, 183);
		}
		return Statics_1_1;
	}
	private JLabel getStatics_2() {
		if (Statics_2 == null) {
			Statics_2 = new JLabel("");
			Statics_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			Statics_2.setBounds(72, 268, 207, 183);
		}
		return Statics_2;
	}
	private JLabel getLblNewLabel_4_1_1() {
		if (lblNewLabel_4_1_1 == null) {
			lblNewLabel_4_1_1 = new JLabel("All New Students");
			lblNewLabel_4_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_4_1_1.setBounds(384, 231, 124, 18);
		}
		return lblNewLabel_4_1_1;
	}
	private JLabel getLblNewLabel_4_1_1_2() {
		if (lblNewLabel_4_1_1_2 == null) {
			lblNewLabel_4_1_1_2 = new JLabel("All Issues Books");
			lblNewLabel_4_1_1_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_4_1_1_2.setBounds(96, 459, 124, 18);
		}
		return lblNewLabel_4_1_1_2;
	}
	private JLabel getLblNewLabel_4_1_1_2_1() {
		if (lblNewLabel_4_1_1_2_1 == null) {
			lblNewLabel_4_1_1_2_1 = new JLabel("All Return Books");
			lblNewLabel_4_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_4_1_1_2_1.setBounds(399, 461, 124, 18);
		}
		return lblNewLabel_4_1_1_2_1;
	}
	private JLabel getLblNewLabel_4_1_2() {
		if (lblNewLabel_4_1_2 == null) {
			lblNewLabel_4_1_2 = new JLabel("All Statics Information");
			lblNewLabel_4_1_2.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblNewLabel_4_1_2.setBounds(232, 12, 338, 32);
		}
		return lblNewLabel_4_1_2;
	}
}
