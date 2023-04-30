package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Component;

public class About extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel photos;
	private JLabel lblNewLabel;
	private JLabel lblSushantChaudhary;
	private JLabel lblCsushantgmailcom;
	private JLabel lblEmail;
	private JLabel lblPhone;
	private JLabel lblSushantChaudhary_1;
	private JLabel lblSushantChaudhary_1_1;
	private JLabel lblAdress;
	private JLabel lblKalankiKathmandu;
	private JLabel lblWebsite;
	private JLabel lblSushantChaudhary_1_2;
	private JLabel lblNewLabel_1;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JPanel panel_2;
	private JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 150, 593, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getSeparator());
		contentPane.add(getPanel_2());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(39, 72, 190, 216);
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setLayout(null);
			panel.add(getPhotos());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(251, 72, 307, 216);
			panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setLayout(null);
			panel_1.add(getLabel_1());
			panel_1.add(getLblSushantChaudhary());
			panel_1.add(getLblCsushantgmailcom());
			panel_1.add(getLblEmail());
			panel_1.add(getLblPhone());
			panel_1.add(getLblSushantChaudhary_1());
			panel_1.add(getLblSushantChaudhary_1_1());
			panel_1.add(getLblAdress());
			panel_1.add(getLblKalankiKathmandu());
			panel_1.add(getLblWebsite());
			panel_1.add(getLblSushantChaudhary_1_2());
		}
		return panel_1;
	}
	private JLabel getPhotos() {
		if (photos == null) {
			photos = new JLabel("");
			photos.setIcon(new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\sc1.jpg"));
			photos.setBounds(0, 0, 190, 216);
		}
		return photos;
	}
	private JLabel getLabel_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Name :- ");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel.setBounds(15, 10, 86, 23);
		}
		return lblNewLabel;
	}
	private JLabel getLblSushantChaudhary() {
		if (lblSushantChaudhary == null) {
			lblSushantChaudhary = new JLabel("Sushant Chaudhary");
			lblSushantChaudhary.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary.setBounds(87, 10, 192, 23);
		}
		return lblSushantChaudhary;
	}
	private JLabel getLblCsushantgmailcom() {
		if (lblCsushantgmailcom == null) {
			lblCsushantgmailcom = new JLabel("csushant224@gmail.com");
			lblCsushantgmailcom.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblCsushantgmailcom.setBounds(87, 43, 205, 23);
		}
		return lblCsushantgmailcom;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email :- ");
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblEmail.setBounds(15, 43, 86, 23);
		}
		return lblEmail;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone :- ");
			lblPhone.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblPhone.setBounds(15, 76, 86, 23);
		}
		return lblPhone;
	}
	private JLabel getLblSushantChaudhary_1() {
		if (lblSushantChaudhary_1 == null) {
			lblSushantChaudhary_1 = new JLabel("9821224203");
			lblSushantChaudhary_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1.setBounds(89, 76, 132, 23);
		}
		return lblSushantChaudhary_1;
	}
	private JLabel getLblSushantChaudhary_1_1() {
		if (lblSushantChaudhary_1_1 == null) {
			lblSushantChaudhary_1_1 = new JLabel("9616680432");
			lblSushantChaudhary_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1_1.setBounds(89, 108, 132, 23);
		}
		return lblSushantChaudhary_1_1;
	}
	private JLabel getLblAdress() {
		if (lblAdress == null) {
			lblAdress = new JLabel("Adress :- ");
			lblAdress.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAdress.setBounds(15, 145, 86, 23);
		}
		return lblAdress;
	}
	private JLabel getLblKalankiKathmandu() {
		if (lblKalankiKathmandu == null) {
			lblKalankiKathmandu = new JLabel("Kalanki , Kathmandu");
			lblKalankiKathmandu.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblKalankiKathmandu.setBounds(105, 145, 192, 23);
		}
		return lblKalankiKathmandu;
	}
	private JLabel getLblWebsite() {
		if (lblWebsite == null) {
			lblWebsite = new JLabel("Website :- ");
			lblWebsite.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblWebsite.setBounds(15, 173, 86, 23);
		}
		return lblWebsite;
	}
	private JLabel getLblSushantChaudhary_1_2() {
		if (lblSushantChaudhary_1_2 == null) {
			lblSushantChaudhary_1_2 = new JLabel("www.dsp.com.np");
			lblSushantChaudhary_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1_2.setBounds(105, 173, 174, 23);
		}
		return lblSushantChaudhary_1_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("About Us");
			lblNewLabel_1.setBounds(221, 16, 118, 35);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		}
		return lblNewLabel_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(193, 54, 160, 17);
		}
		return separator;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(39, 300, 519, 169);
			panel_2.setLayout(null);
			panel_2.add(getTabbedPane());
		}
		return panel_2;
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(10, 10, 499, 149);
		}
		return tabbedPane;
	}
}
