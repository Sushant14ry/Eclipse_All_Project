package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JProgressBar;

public class Progress extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblLibraryManagementSystem;
	private JProgressBar progressBar;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Progress frame = new Progress();
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
	public Progress() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 160, 500, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 127, 80), 4), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 127, 80)));
			panel.setBounds(24, 32, 439, 464);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblLibraryManagementSystem());
			panel.add(getProgressBar());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_2());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Smart Libray  Version 1.2");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(67, 414, 317, 23);
		}
		return lblNewLabel;
	}
	private JLabel getLblLibraryManagementSystem() {
		if (lblLibraryManagementSystem == null) {
			lblLibraryManagementSystem = new JLabel("Library Management System");
			lblLibraryManagementSystem.setFont(new Font("Arial Black", Font.BOLD, 22));
			lblLibraryManagementSystem.setBounds(36, 36, 377, 23);
		}
		return lblLibraryManagementSystem;
	}
	private JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setValue(4);
			progressBar.setStringPainted(true);
			progressBar.setBounds(74, 112, 300, 29);
		}
		return progressBar;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			lblNewLabel_1.setBounds(114, 190, 226, 201);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Please Wait....");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_2.setBounds(180, 150, 104, 13);
		}
		return lblNewLabel_2;
	}
}
