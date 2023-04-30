package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class About_US extends JFrame {

	private JPanel contentPane;
	private JPanel panel_8;
	private JPanel panel_1_1;
	private JLabel lblName;
	private JLabel lblSushantChaudhary;
	private JLabel lblCsushantgmailcom;
	private JLabel lblEmail_1;
	private JLabel lblPhone_1;
	private JLabel lblSushantChaudhary_1;
	private JLabel lblSushantChaudhary_1_1;
	private JLabel lblAdress;
	private JLabel lblKalankiKathmandu;
	private JLabel lblWebsite;
	private JLabel lblSushantChaudhary_1_2;
	private JPanel panel_9;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1_1;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_3_1_1_1;
	private JLabel lblNewLabel_3_1_2;
	private JLabel lblNewLabel_3_1_1_1_1;
	private JPanel panel_10;
	private JLabel lblNewLabel_4;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_US frame = new About_US();
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
	public About_US() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(356, 140, 860, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}

	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
			panel_8.setBounds(32, 32, 759, 426);
			panel_8.setLayout(null);
			panel_8.add(getPanel_1_1());
			panel_8.add(getPanel_9());
			panel_8.add(getPanel_10());
		}
		return panel_8;
	}
	private JPanel getPanel_1_1() {
		if (panel_1_1 == null) {
			panel_1_1 = new JPanel();
			panel_1_1.setLayout(null);
			panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1_1.setBounds(399, 16, 339, 201);
			panel_1_1.add(getLblName());
			panel_1_1.add(getLblSushantChaudhary());
			panel_1_1.add(getLblCsushantgmailcom());
			panel_1_1.add(getLblEmail_1());
			panel_1_1.add(getLblPhone_1());
			panel_1_1.add(getLblSushantChaudhary_1());
			panel_1_1.add(getLblSushantChaudhary_1_1());
			panel_1_1.add(getLblAdress());
			panel_1_1.add(getLblKalankiKathmandu());
			panel_1_1.add(getLblWebsite());
			panel_1_1.add(getLblSushantChaudhary_1_2());
		}
		return panel_1_1;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name   :- ");
			lblName.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblName.setBounds(15, 10, 86, 23);
		}
		return lblName;
	}
	private JLabel getLblSushantChaudhary() {
		if (lblSushantChaudhary == null) {
			lblSushantChaudhary = new JLabel("Sushant Chaudhary");
			lblSushantChaudhary.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary.setBounds(108, 10, 192, 23);
		}
		return lblSushantChaudhary;
	}
	private JLabel getLblCsushantgmailcom() {
		if (lblCsushantgmailcom == null) {
			lblCsushantgmailcom = new JLabel("csushant224@gmail.com");
			lblCsushantgmailcom.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblCsushantgmailcom.setBounds(108, 43, 205, 23);
		}
		return lblCsushantgmailcom;
	}
	private JLabel getLblEmail_1() {
		if (lblEmail_1 == null) {
			lblEmail_1 = new JLabel("Email   :- ");
			lblEmail_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblEmail_1.setBounds(15, 43, 86, 23);
		}
		return lblEmail_1;
	}
	private JLabel getLblPhone_1() {
		if (lblPhone_1 == null) {
			lblPhone_1 = new JLabel("Phone   :- ");
			lblPhone_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblPhone_1.setBounds(15, 76, 86, 23);
		}
		return lblPhone_1;
	}
	private JLabel getLblSushantChaudhary_1() {
		if (lblSushantChaudhary_1 == null) {
			lblSushantChaudhary_1 = new JLabel("9821224203");
			lblSushantChaudhary_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1.setBounds(110, 76, 132, 23);
		}
		return lblSushantChaudhary_1;
	}
	private JLabel getLblSushantChaudhary_1_1() {
		if (lblSushantChaudhary_1_1 == null) {
			lblSushantChaudhary_1_1 = new JLabel("9616680432");
			lblSushantChaudhary_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1_1.setBounds(110, 108, 132, 23);
		}
		return lblSushantChaudhary_1_1;
	}
	private JLabel getLblAdress() {
		if (lblAdress == null) {
			lblAdress = new JLabel("Adress :- ");
			lblAdress.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAdress.setBounds(15, 139, 86, 23);
		}
		return lblAdress;
	}
	private JLabel getLblKalankiKathmandu() {
		if (lblKalankiKathmandu == null) {
			lblKalankiKathmandu = new JLabel("Kalanki , Kathmandu");
			lblKalankiKathmandu.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblKalankiKathmandu.setBounds(108, 139, 192, 23);
		}
		return lblKalankiKathmandu;
	}
	private JLabel getLblWebsite() {
		if (lblWebsite == null) {
			lblWebsite = new JLabel("Website :- ");
			lblWebsite.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblWebsite.setBounds(15, 167, 86, 23);
		}
		return lblWebsite;
	}
	private JLabel getLblSushantChaudhary_1_2() {
		if (lblSushantChaudhary_1_2 == null) {
			lblSushantChaudhary_1_2 = new JLabel("www.dsp.com.np");
			lblSushantChaudhary_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1_2.setBounds(108, 167, 174, 23);
		}
		return lblSushantChaudhary_1_2;
	}
	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.setLayout(null);
			panel_9.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Social Media", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_9.setBounds(399, 227, 339, 185);
			panel_9.add(getLblNewLabel_3());
			panel_9.add(getLblNewLabel_3_1_1());
			panel_9.add(getLblNewLabel_3_1());
			panel_9.add(getLblNewLabel_3_1_1_1());
			panel_9.add(getLblNewLabel_3_1_2());
			panel_9.add(getLblNewLabel_3_1_1_1_1());
		}
		return panel_9;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Follow Me");
			lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_3.setBounds(36, 22, 84, 23);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_3_1_1() {
		if (lblNewLabel_3_1_1 == null) {
			lblNewLabel_3_1_1 = new JLabel("- www.facebook.com/dsp.1234");
			lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_3_1_1.setBounds(46, 46, 248, 23);
		}
		return lblNewLabel_3_1_1;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("Instagram");
			lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_3_1.setBounds(36, 78, 84, 23);
		}
		return lblNewLabel_3_1;
	}
	private JLabel getLblNewLabel_3_1_1_1() {
		if (lblNewLabel_3_1_1_1 == null) {
			lblNewLabel_3_1_1_1 = new JLabel("- www.instagram.com/dsp.1234");
			lblNewLabel_3_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_3_1_1_1.setBounds(46, 102, 248, 23);
		}
		return lblNewLabel_3_1_1_1;
	}
	private JLabel getLblNewLabel_3_1_2() {
		if (lblNewLabel_3_1_2 == null) {
			lblNewLabel_3_1_2 = new JLabel("Email");
			lblNewLabel_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_3_1_2.setBounds(36, 132, 84, 23);
		}
		return lblNewLabel_3_1_2;
	}
	private JLabel getLblNewLabel_3_1_1_1_1() {
		if (lblNewLabel_3_1_1_1_1 == null) {
			lblNewLabel_3_1_1_1_1 = new JLabel("- csushant224@gmail.com");
			lblNewLabel_3_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_3_1_1_1_1.setBounds(46, 152, 248, 23);
		}
		return lblNewLabel_3_1_1_1_1;
	}
	private JPanel getPanel_10() {
		if (panel_10 == null) {
			panel_10 = new JPanel();
			panel_10.setLayout(null);
			panel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_10.setBounds(10, 16, 373, 393);
			panel_10.add(getLblNewLabel_4());
		}
		return panel_10;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setBounds(5, 5, 363, 383);
			lblNewLabel_4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\sc1.jpg").getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), DO_NOTHING_ON_CLOSE)));
		}
		return lblNewLabel_4;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 191, 255), 4), "About US", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 10, 822, 483);
			panel.setLayout(null);
			panel.add(getPanel_8());
		}
		return panel;
	}
}
