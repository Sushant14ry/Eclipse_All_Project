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
import javax.swing.JProgressBar;

public class Progress_bar extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JProgressBar banking_progressBar;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Progress_bar frame = new Progress_bar();
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
	public Progress_bar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 486, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_1());
		contentPane.add(getLblNewLabel_2_2());
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<=100; i++) {
					banking_progressBar.setValue(i);
					try {
						Thread.sleep(12);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				new Home_Page().setVisible(true);
				dispose();
			}
		});
		t.start();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
			lblNewLabel.setBounds(115, 36, 177, 72);
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setForeground(Color.GREEN);
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 0), 6, true), "Banking Page", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			panel.setBounds(35, 33, 393, 485);
			panel.setLayout(null);
			panel.add(getBanking_progressBar());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel());
		}
		return panel;
	}
	private JProgressBar getBanking_progressBar() {
		if (banking_progressBar == null) {
			banking_progressBar = new JProgressBar();
			banking_progressBar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			banking_progressBar.setStringPainted(true);
			banking_progressBar.setBounds(47, 164, 287, 35);
		}
		return banking_progressBar;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Redirecting....");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel_1.setBounds(135, 209, 136, 21);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("This Software is Verisign as a Secure and Trusted site");
			lblNewLabel_2.setForeground(Color.RED);
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_2.setBounds(45, 528, 376, 29);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("All information sent or Recieved");
			lblNewLabel_2_1.setForeground(Color.RED);
			lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_2_1.setBounds(115, 555, 239, 29);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("in Encrypted using 256 - bit Encryption");
			lblNewLabel_2_2.setForeground(Color.RED);
			lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_2_2.setBounds(93, 580, 280, 29);
		}
		return lblNewLabel_2_2;
	}
}
