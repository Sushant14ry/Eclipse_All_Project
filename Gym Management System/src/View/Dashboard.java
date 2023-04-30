package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblUpdateDelete;
	private JLabel lblListOfMember;
	private JLabel lblPayment;
	private JLabel lblExit;
	private JLabel lblLogout;
	private JLabel lblWelcome;
	private JLabel lblGymManagementSystem;
	private JLabel lblTo;
	private JPanel panel_1;
	private JLabel lblSushant;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1560, 824);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel_3());
		contentPane.add(getLblWelcome());
		contentPane.add(getLblGymManagementSystem());
		contentPane.add(getLblTo());
		contentPane.add(getPanel_1());
	}
	private JPanel getPanel_3() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(0, 0, 1560, 111);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1_1());
			panel.add(getLblListOfMember());
			panel.add(getLblPayment());
			panel.add(getLblExit());
			panel.add(getLblLogout());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New Member");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Member().setVisible(true);
				}
			});
			lblNewLabel.setBounds(20, 24, 197, 73);
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblUpdateDelete == null) {
			lblUpdateDelete = new JLabel("Update & Delete Member");
			lblUpdateDelete.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Update_Delete_Member().setVisible(true);
				}
			});
			lblUpdateDelete.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblUpdateDelete.setBounds(261, 24, 360, 73);
		}
		return lblUpdateDelete;
	}
	private JLabel getLblListOfMember() {
		if (lblListOfMember == null) {
			lblListOfMember = new JLabel("List of Member");
			lblListOfMember.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new List_Member().setVisible(true);
				}
			});
			lblListOfMember.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblListOfMember.setBounds(670, 24, 228, 73);
		}
		return lblListOfMember;
	}
	private JLabel getLblPayment() {
		if (lblPayment == null) {
			lblPayment = new JLabel("Payment");
			lblPayment.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Payment().setVisible(true);
				}
			});
			lblPayment.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblPayment.setBounds(947, 24, 147, 73);
		}
		return lblPayment;
	}
	private JLabel getLblExit() {
		if (lblExit == null) {
			lblExit = new JLabel("Exit");
			lblExit.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit This Application","select",JOptionPane.YES_NO_OPTION);
					if(a == 0) {
						System.exit(a);
					}
				}
			});
			lblExit.setForeground(Color.RED);
			lblExit.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblExit.setBounds(1460, 24, 80, 73);
		}
		return lblExit;
	}
	private JLabel getLblLogout() {
		if (lblLogout == null) {
			lblLogout = new JLabel("Logout");
			lblLogout.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			lblLogout.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblLogout.setBounds(1299, 24, 120, 73);
		}
		return lblLogout;
	}
	private JLabel getLblWelcome() {
		if (lblWelcome == null) {
			lblWelcome = new JLabel("WELCOME");
			lblWelcome.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblWelcome.setBounds(782, 235, 164, 73);
		}
		return lblWelcome;
	}
	private JLabel getLblGymManagementSystem() {
		if (lblGymManagementSystem == null) {
			lblGymManagementSystem = new JLabel("GYM MANAGEMENT SYSTEM");
			lblGymManagementSystem.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblGymManagementSystem.setBounds(670, 340, 431, 73);
		}
		return lblGymManagementSystem;
	}
	private JLabel getLblTo() {
		if (lblTo == null) {
			lblTo = new JLabel("TO");
			lblTo.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblTo.setBounds(832, 287, 54, 73);
		}
		return lblTo;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(594, 206, 540, 319);
			panel_1.setLayout(null);
			panel_1.add(getLblSushant());
			panel_1.add(getSeparator());
		}
		return panel_1;
	}
	private JLabel getLblSushant() {
		if (lblSushant == null) {
			lblSushant = new JLabel("SUSHANT CHAUDHARY");
			lblSushant.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblSushant.setBounds(120, 222, 349, 73);
		}
		return lblSushant;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(81, 209, 388, 11);
		}
		return separator;
	}
}
