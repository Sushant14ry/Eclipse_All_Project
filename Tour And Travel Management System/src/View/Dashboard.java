package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	private JPanel panel_2_1;
	private JLabel lblNewLabel_1_1;
	private JPanel panel_2_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JPanel panel_2_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JPanel panel_2_1_1_2;
	private JLabel lblNewLabel_1_1_1_2;
	private JPanel panel_2_1_1_3;
	private JLabel lblNewLabel_1_1_1_3;
	private JPanel panel_2_1_1_3_1;
	private JLabel lblNewLabel_1_1_1_3_1;
	private JPanel panel_2_1_1_3_2;
	private JLabel lblNewLabel_1_1_1_3_2;
	private JPanel panel_2_1_1_3_3;
	private JLabel lblNewLabel_1_1_1_3_3;
	private JPanel panel_2_1_1_3_4;
	private JLabel lblNewLabel_1_1_1_3_4;
	private JPanel panel_2_1_1_3_5;
	private JLabel lblNewLabel_1_1_1_3_5;
	private JPanel panel_2_1_1_3_6;
	private JLabel lblNewLabel_1_1_1_3_6;
	private JPanel panel_2_1_1_3_7;
	private JLabel lblNewLabel_1_1_1_3_7;
	private JPanel panel_2_1_1_3_8;
	private JLabel lblNewLabel_1_1_1_3_8;
	private JPanel panel_2_1_1_3_9;
	private JLabel lblNewLabel_1_1_1_3_9;
	private JPanel panel_3;
	private JLabel lblTourAndTravel;

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
		setBounds(0,0, 1550, 824);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 0, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getPanel_3());
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("X");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBackground(Color.RED);
			btnNewButton.setBounds(1464, 16, 66, 40);
		}
		return btnNewButton;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setForeground(Color.WHITE);
			panel.setBackground(new Color(0, 0, 205));
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(0, 0, 1550, 70);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Dashboard");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBackground(new Color(0, 0, 205));
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblNewLabel.setBounds(32, 14, 177, 40);
		}
		return lblNewLabel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setForeground(Color.WHITE);
			panel_1.setBackground(new Color(0, 0, 205));
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_1.setBounds(0, 70, 341, 756);
			panel_1.setLayout(null);
			panel_1.add(getPanel_2());
			panel_1.add(getPanel_2_1());
			panel_1.add(getPanel_2_1_1());
			panel_1.add(getPanel_2_1_1_1());
			panel_1.add(getPanel_2_1_1_2());
			panel_1.add(getPanel_2_1_1_3());
			panel_1.add(getPanel_2_1_1_3_1());
			panel_1.add(getPanel_2_1_1_3_2());
			panel_1.add(getPanel_2_1_1_3_3());
			panel_1.add(getPanel_2_1_1_3_4());
			panel_1.add(getPanel_2_1_1_3_5());
			panel_1.add(getPanel_2_1_1_3_6());
			panel_1.add(getPanel_2_1_1_3_7());
			panel_1.add(getPanel_2_1_1_3_8());
			panel_1.add(getPanel_2_1_1_3_9());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Add Personal Details");
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Customer_Form().setVisible(true);
				}
			});
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBackground(new Color(0, 0, 205));
			lblNewLabel_1.setBounds(57, 0, 222, 46);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		}
		return lblNewLabel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Customer_Form().setVisible(true);
				}
			});
			panel_2.setForeground(Color.WHITE);
			panel_2.setBackground(new Color(0, 0, 205));
			panel_2.setBorder(new LineBorder(Color.WHITE));
			panel_2.setBounds(0, 0, 340, 46);
			panel_2.setLayout(null);
			panel_2.add(getLblNewLabel_1());
		}
		return panel_2;
	}
	private JPanel getPanel_2_1() {
		if (panel_2_1 == null) {
			panel_2_1 = new JPanel();
			panel_2_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Update_Customer_Details().setVisible(true);
				}
			});
			panel_2_1.setForeground(Color.WHITE);
			panel_2_1.setBackground(new Color(0, 0, 205));
			panel_2_1.setLayout(null);
			panel_2_1.setBorder(new LineBorder(Color.WHITE));
			panel_2_1.setBounds(0, 46, 340, 46);
			panel_2_1.add(getLblNewLabel_1_1());
		}
		return panel_2_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Update Personal Details");
			lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Update_Customer_Details().setVisible(true);
				}
			});
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1;
	}
	private JPanel getPanel_2_1_1() {
		if (panel_2_1_1 == null) {
			panel_2_1_1 = new JPanel();
			panel_2_1_1.setForeground(Color.WHITE);
			panel_2_1_1.setBackground(new Color(0, 0, 205));
			panel_2_1_1.setLayout(null);
			panel_2_1_1.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1.setBounds(0, 92, 340, 46);
			panel_2_1_1.add(getLblNewLabel_1_1_1());
		}
		return panel_2_1_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("View Details");
			lblNewLabel_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1;
	}
	private JPanel getPanel_2_1_1_1() {
		if (panel_2_1_1_1 == null) {
			panel_2_1_1_1 = new JPanel();
			panel_2_1_1_1.setForeground(Color.WHITE);
			panel_2_1_1_1.setBackground(new Color(0, 0, 205));
			panel_2_1_1_1.setLayout(null);
			panel_2_1_1_1.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_1.setBounds(0, 138, 340, 46);
			panel_2_1_1_1.add(getLblNewLabel_1_1_1_1());
		}
		return panel_2_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Delete Personal Details");
			lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_1.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JPanel getPanel_2_1_1_2() {
		if (panel_2_1_1_2 == null) {
			panel_2_1_1_2 = new JPanel();
			panel_2_1_1_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Check_Package().setVisible(true);
				}
			});
			panel_2_1_1_2.setForeground(Color.WHITE);
			panel_2_1_1_2.setBackground(new Color(0, 0, 205));
			panel_2_1_1_2.setLayout(null);
			panel_2_1_1_2.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_2.setBounds(0, 184, 340, 46);
			panel_2_1_1_2.add(getLblNewLabel_1_1_1_2());
		}
		return panel_2_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("Check Package");
			lblNewLabel_1_1_1_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Check_Package().setVisible(true);
				}
			});
			lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_2.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_2.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JPanel getPanel_2_1_1_3() {
		if (panel_2_1_1_3 == null) {
			panel_2_1_1_3 = new JPanel();
			panel_2_1_1_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Book_Package().setVisible(true);
				}
			});
			panel_2_1_1_3.setForeground(Color.WHITE);
			panel_2_1_1_3.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3.setLayout(null);
			panel_2_1_1_3.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3.setBounds(0, 230, 340, 46);
			panel_2_1_1_3.add(getLblNewLabel_1_1_1_3());
		}
		return panel_2_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("Book Package");
			lblNewLabel_1_1_1_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Book_Package().setVisible(true);
				}
			});
			lblNewLabel_1_1_1_3.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3;
	}
	private JPanel getPanel_2_1_1_3_1() {
		if (panel_2_1_1_3_1 == null) {
			panel_2_1_1_3_1 = new JPanel();
			panel_2_1_1_3_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new View_Package().setVisible(true);
				}
			});
			panel_2_1_1_3_1.setForeground(Color.WHITE);
			panel_2_1_1_3_1.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3_1.setLayout(null);
			panel_2_1_1_3_1.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3_1.setBounds(0, 276, 340, 46);
			panel_2_1_1_3_1.add(getLblNewLabel_1_1_1_3_1());
		}
		return panel_2_1_1_3_1;
	}
	private JLabel getLblNewLabel_1_1_1_3_1() {
		if (lblNewLabel_1_1_1_3_1 == null) {
			lblNewLabel_1_1_1_3_1 = new JLabel("View Package");
			lblNewLabel_1_1_1_3_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new View_Package().setVisible(true);
				}
			});
			lblNewLabel_1_1_1_3_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3_1.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3_1.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3_1;
	}
	private JPanel getPanel_2_1_1_3_2() {
		if (panel_2_1_1_3_2 == null) {
			panel_2_1_1_3_2 = new JPanel();
			panel_2_1_1_3_2.setForeground(Color.WHITE);
			panel_2_1_1_3_2.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3_2.setLayout(null);
			panel_2_1_1_3_2.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3_2.setBounds(0, 322, 340, 46);
			panel_2_1_1_3_2.add(getLblNewLabel_1_1_1_3_2());
		}
		return panel_2_1_1_3_2;
	}
	private JLabel getLblNewLabel_1_1_1_3_2() {
		if (lblNewLabel_1_1_1_3_2 == null) {
			lblNewLabel_1_1_1_3_2 = new JLabel("View Hotel");
			lblNewLabel_1_1_1_3_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//					
				}
			});
			lblNewLabel_1_1_1_3_2.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3_2.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3_2.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3_2;
	}
	private JPanel getPanel_2_1_1_3_3() {
		if (panel_2_1_1_3_3 == null) {
			panel_2_1_1_3_3 = new JPanel();
			panel_2_1_1_3_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Book_Hotel().setVisible(true);
				}
			});
			panel_2_1_1_3_3.setForeground(Color.WHITE);
			panel_2_1_1_3_3.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3_3.setLayout(null);
			panel_2_1_1_3_3.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3_3.setBounds(0, 368, 340, 46);
			panel_2_1_1_3_3.add(getLblNewLabel_1_1_1_3_3());
		}
		return panel_2_1_1_3_3;
	}
	private JLabel getLblNewLabel_1_1_1_3_3() {
		if (lblNewLabel_1_1_1_3_3 == null) {
			lblNewLabel_1_1_1_3_3 = new JLabel("Book Hotel");
			lblNewLabel_1_1_1_3_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Book_Hotel().setVisible(true);
				}
			});
			lblNewLabel_1_1_1_3_3.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3_3.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3_3.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3_3;
	}
	private JPanel getPanel_2_1_1_3_4() {
		if (panel_2_1_1_3_4 == null) {
			panel_2_1_1_3_4 = new JPanel();
			panel_2_1_1_3_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new View_Booked_Hotel_Details().setVisible(true);
				}
			});
			panel_2_1_1_3_4.setForeground(Color.WHITE);
			panel_2_1_1_3_4.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3_4.setLayout(null);
			panel_2_1_1_3_4.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3_4.setBounds(0, 414, 340, 46);
			panel_2_1_1_3_4.add(getLblNewLabel_1_1_1_3_4());
		}
		return panel_2_1_1_3_4;
	}
	private JLabel getLblNewLabel_1_1_1_3_4() {
		if (lblNewLabel_1_1_1_3_4 == null) {
			lblNewLabel_1_1_1_3_4 = new JLabel("View Booked Hotels");
			lblNewLabel_1_1_1_3_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new View_Booked_Hotel_Details().setVisible(true);
				}
			});
			lblNewLabel_1_1_1_3_4.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3_4.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3_4.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3_4.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3_4;
	}
	private JPanel getPanel_2_1_1_3_5() {
		if (panel_2_1_1_3_5 == null) {
			panel_2_1_1_3_5 = new JPanel();
			panel_2_1_1_3_5.setForeground(Color.WHITE);
			panel_2_1_1_3_5.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3_5.setLayout(null);
			panel_2_1_1_3_5.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3_5.setBounds(0, 460, 340, 46);
			panel_2_1_1_3_5.add(getLblNewLabel_1_1_1_3_5());
		}
		return panel_2_1_1_3_5;
	}
	private JLabel getLblNewLabel_1_1_1_3_5() {
		if (lblNewLabel_1_1_1_3_5 == null) {
			lblNewLabel_1_1_1_3_5 = new JLabel("Destination");
			lblNewLabel_1_1_1_3_5.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3_5.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3_5.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3_5.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3_5;
	}
	private JPanel getPanel_2_1_1_3_6() {
		if (panel_2_1_1_3_6 == null) {
			panel_2_1_1_3_6 = new JPanel();
			panel_2_1_1_3_6.setForeground(Color.WHITE);
			panel_2_1_1_3_6.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3_6.setLayout(null);
			panel_2_1_1_3_6.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3_6.setBounds(0, 506, 340, 46);
			panel_2_1_1_3_6.add(getLblNewLabel_1_1_1_3_6());
		}
		return panel_2_1_1_3_6;
	}
	private JLabel getLblNewLabel_1_1_1_3_6() {
		if (lblNewLabel_1_1_1_3_6 == null) {
			lblNewLabel_1_1_1_3_6 = new JLabel("Payment");
			lblNewLabel_1_1_1_3_6.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3_6.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3_6.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3_6.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3_6;
	}
	private JPanel getPanel_2_1_1_3_7() {
		if (panel_2_1_1_3_7 == null) {
			panel_2_1_1_3_7 = new JPanel();
			panel_2_1_1_3_7.setForeground(Color.WHITE);
			panel_2_1_1_3_7.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3_7.setLayout(null);
			panel_2_1_1_3_7.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3_7.setBounds(0, 552, 340, 46);
			panel_2_1_1_3_7.add(getLblNewLabel_1_1_1_3_7());
		}
		return panel_2_1_1_3_7;
	}
	private JLabel getLblNewLabel_1_1_1_3_7() {
		if (lblNewLabel_1_1_1_3_7 == null) {
			lblNewLabel_1_1_1_3_7 = new JLabel("Calculator");
			lblNewLabel_1_1_1_3_7.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3_7.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3_7.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3_7.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3_7;
	}
	private JPanel getPanel_2_1_1_3_8() {
		if (panel_2_1_1_3_8 == null) {
			panel_2_1_1_3_8 = new JPanel();
			panel_2_1_1_3_8.setForeground(Color.WHITE);
			panel_2_1_1_3_8.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3_8.setLayout(null);
			panel_2_1_1_3_8.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3_8.setBounds(0, 598, 340, 46);
			panel_2_1_1_3_8.add(getLblNewLabel_1_1_1_3_8());
		}
		return panel_2_1_1_3_8;
	}
	private JLabel getLblNewLabel_1_1_1_3_8() {
		if (lblNewLabel_1_1_1_3_8 == null) {
			lblNewLabel_1_1_1_3_8 = new JLabel("Notepad");
			lblNewLabel_1_1_1_3_8.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3_8.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3_8.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3_8.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3_8;
	}
	private JPanel getPanel_2_1_1_3_9() {
		if (panel_2_1_1_3_9 == null) {
			panel_2_1_1_3_9 = new JPanel();
			panel_2_1_1_3_9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new About().setVisible(true);
				}
			});
			panel_2_1_1_3_9.setForeground(Color.WHITE);
			panel_2_1_1_3_9.setBackground(new Color(0, 0, 205));
			panel_2_1_1_3_9.setLayout(null);
			panel_2_1_1_3_9.setBorder(new LineBorder(Color.WHITE));
			panel_2_1_1_3_9.setBounds(0, 644, 340, 46);
			panel_2_1_1_3_9.add(getLblNewLabel_1_1_1_3_9());
		}
		return panel_2_1_1_3_9;
	}
	private JLabel getLblNewLabel_1_1_1_3_9() {
		if (lblNewLabel_1_1_1_3_9 == null) {
			lblNewLabel_1_1_1_3_9 = new JLabel("About");
			lblNewLabel_1_1_1_3_9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new About().setVisible(true);
				}
			});
			lblNewLabel_1_1_1_3_9.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_3_9.setBackground(new Color(0, 0, 205));
			lblNewLabel_1_1_1_3_9.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_3_9.setBounds(57, 0, 222, 46);
		}
		return lblNewLabel_1_1_1_3_9;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setForeground(Color.WHITE);
			panel_3.setBackground(Color.WHITE);
			panel_3.setBorder(new LineBorder(Color.WHITE, 2));
			panel_3.setBounds(340, 70, 1210, 754);
			panel_3.setLayout(null);
			panel_3.add(getLblTourAndTravel());
		}
		return panel_3;
	}
	private JLabel getLblTourAndTravel() {
		if (lblTourAndTravel == null) {
			lblTourAndTravel = new JLabel("Tour and Travel Management System");
			lblTourAndTravel.setForeground(Color.GREEN);
			lblTourAndTravel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblTourAndTravel.setBackground(new Color(0, 0, 205));
			lblTourAndTravel.setBounds(268, 64, 691, 46);
		}
		return lblTourAndTravel;
	}
}
