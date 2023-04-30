package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Progress extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JProgressBar progressBar;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;

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
		setForeground(Color.WHITE);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 615, 380);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255), 4, true), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getProgressBar());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Travel And Tour Tourism Application");
			lblNewLabel.setForeground(new Color(51, 153, 255));
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblNewLabel.setBounds(56, 32, 518, 58);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(43, 96, 544, 50);
		}
		return separator;
	}
	private JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setStringPainted(true);
			progressBar.setBounds(79, 154, 475, 43);
		}
		return progressBar;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Please Wait....");
			lblNewLabel_1.setForeground(new Color(255, 165, 0));
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel_1.setBounds(246, 208, 129, 24);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Welcome DSP....");
			lblNewLabel_1_1.setForeground(new Color(255, 165, 0));
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(24, 339, 164, 24);
		}
		return lblNewLabel_1_1;
	}
}
