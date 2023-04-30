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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel new_book;
	private JLabel Statics;
	private JLabel new_student;
	private JLabel Return_book;
	private JLabel lblNewLabel_2_1;
	private JLabel Issue_book;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_4_1;
	private JLabel lblNewLabel_4_2;
	private JLabel lblNewLabel_4_3;
	private JLabel lblNewLabel_4_3_1;
	private JLabel lblNewLabel_4_3_2;
	private JLabel lblNewLabel_4_4;
	private JLabel lblNewLabel_4_4_1;
	private JLabel lblNewLabel_4_4_2;
	private JPanel panel_2;
	private JLabel lblNewLabel_1_2;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(340, 60, 900, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getLblNewLabel_4_4());
		contentPane.add(getLblNewLabel_4_4_1());
		contentPane.add(getLblNewLabel_4_4_2());
		contentPane.add(getPanel_2());
		contentPane.add(getLblNewLabel_1_2());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Operation", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(16, 174, 847, 250);
			panel.setLayout(null);
			panel.add(getNew_book());
			panel.add(getStatics());
			panel.add(getNew_student());
			panel.add(getLblNewLabel_4());
			panel.add(getLblNewLabel_4_1());
			panel.add(getLblNewLabel_4_2());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Action", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(16, 450, 847, 250);
			panel_1.add(getReturn_book());
			panel_1.add(getLblNewLabel_2_1());
			panel_1.add(getIssue_book());
			panel_1.add(getLblNewLabel_4_3());
			panel_1.add(getLblNewLabel_4_3_1());
			panel_1.add(getLblNewLabel_4_3_2());
		}
		return panel_1;
	}
	private JLabel getNew_book() {
		if (new_book == null) {
			new_book = new JLabel("");
			new_book.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Book().setVisible(true);
				}
			});
			new_book.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			new_book.setBounds(32, 24, 207, 183);
		}
		return new_book;
	}
	private JLabel getStatics() {
		if (Statics == null) {
			Statics = new JLabel("");
			Statics.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
				}
			});
			Statics.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			Statics.setBounds(354, 24, 207, 183);
		}
		return Statics;
	}
	private JLabel getNew_student() {
		if (new_student == null) {
			new_student = new JLabel("");
			new_student.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Student().setVisible(true);
				}
			});
			new_student.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			new_student.setBounds(612, 24, 207, 183);
		}
		return new_student;
	}
	private JLabel getReturn_book() {
		if (Return_book == null) {
			Return_book = new JLabel("");
			Return_book.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Return_Book().setVisible(true);
				}
			});
			Return_book.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			Return_book.setBounds(354, 24, 207, 183);
		}
		return Return_book;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("");
			lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new About_US().setVisible(true);
				}
			});
			lblNewLabel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			lblNewLabel_2_1.setBounds(612, 24, 207, 183);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getIssue_book() {
		if (Issue_book == null) {
			Issue_book = new JLabel("");
			Issue_book.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Issue_Book().setVisible(true);
				}
			});
			Issue_book.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			Issue_book.setBounds(32, 24, 207, 183);
		}
		return Issue_book;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("New Book");
			lblNewLabel_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Book().setVisible(true);
				}
			});
			lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_4.setBounds(82, 211, 86, 18);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("Statics");
			lblNewLabel_4_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_4_1.setBounds(416, 211, 86, 18);
		}
		return lblNewLabel_4_1;
	}
	private JLabel getLblNewLabel_4_2() {
		if (lblNewLabel_4_2 == null) {
			lblNewLabel_4_2 = new JLabel("New Student");
			lblNewLabel_4_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Student().setVisible(true);
				}
			});
			lblNewLabel_4_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_4_2.setBounds(671, 211, 107, 18);
		}
		return lblNewLabel_4_2;
	}
	private JLabel getLblNewLabel_4_3() {
		if (lblNewLabel_4_3 == null) {
			lblNewLabel_4_3 = new JLabel("Issue Book");
			lblNewLabel_4_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Issue_Book().setVisible(true);
				}
			});
			lblNewLabel_4_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_4_3.setBounds(82, 212, 86, 18);
		}
		return lblNewLabel_4_3;
	}
	private JLabel getLblNewLabel_4_3_1() {
		if (lblNewLabel_4_3_1 == null) {
			lblNewLabel_4_3_1 = new JLabel("Return Book");
			lblNewLabel_4_3_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Return_Book().setVisible(true);
				}
			});
			lblNewLabel_4_3_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_4_3_1.setBounds(414, 212, 104, 18);
		}
		return lblNewLabel_4_3_1;
	}
	private JLabel getLblNewLabel_4_3_2() {
		if (lblNewLabel_4_3_2 == null) {
			lblNewLabel_4_3_2 = new JLabel("About");
			lblNewLabel_4_3_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new About_US().setVisible(true);
				}
			});
			lblNewLabel_4_3_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_4_3_2.setBounds(684, 212, 67, 18);
		}
		return lblNewLabel_4_3_2;
	}
	private JLabel getLblNewLabel_4_4() {
		if (lblNewLabel_4_4 == null) {
			lblNewLabel_4_4 = new JLabel("Welcome");
			lblNewLabel_4_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_4_4.setBounds(694, 63, 104, 18);
		}
		return lblNewLabel_4_4;
	}
	private JLabel getLblNewLabel_4_4_1() {
		if (lblNewLabel_4_4_1 == null) {
			lblNewLabel_4_4_1 = new JLabel("To");
			lblNewLabel_4_4_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_4_4_1.setBounds(724, 91, 46, 18);
		}
		return lblNewLabel_4_4_1;
	}
	private JLabel getLblNewLabel_4_4_2() {
		if (lblNewLabel_4_4_2 == null) {
			lblNewLabel_4_4_2 = new JLabel("Library Management System");
			lblNewLabel_4_4_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_4_4_2.setBounds(588, 117, 275, 18);
		}
		return lblNewLabel_4_4_2;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_2.setBounds(0, 4, 863, 39);
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("");
			lblNewLabel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			lblNewLabel_1_2.setBounds(16, 56, 224, 94);
		}
		return lblNewLabel_1_2;
	}
}
