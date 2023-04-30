package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyEvent;
import java.awt.Component;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import java.awt.event.KeyAdapter;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_2_1;
	private JPanel panel_2_2;
	private JPanel panel_2_3;
	private JPanel panel_2_4;
	private JPanel panel_2_5;
	private JPanel panel_2_6;
	private JPanel panel_2_8;
	private JPanel panel_2_9;
	private JPanel exit;
	private JLabel upd_product;
	private JLabel prod_details;
	private JLabel del_Prod;
	private JLabel lblNewLabel_1_2;
	private JLabel new_product;
	private JLabel del_buyer;
	private JLabel lblNewLabel_1_7;
	private JLabel update_buyer;
	private JLabel new_buyer;
	private JLabel lblNewLabel_1_10;
	private JLabel lblNewLabel_1_3;
	private JLabel logout;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_1_1;
	private JLabel lblNewLabel_2_1_1_1;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JLabel lblNewLabel_2_1_1_1_1_1;
	private JLabel lblNewLabel_2_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_1_3;
	private JLabel lblNewLabel_2_1_1_1_1_4;
	private JLabel lblNewLabel_2_1_1_1_1_4_1;
	private JLabel lblNewLabel_2_1_1_1_1_4_2;
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
		setBounds(0,0, 1560, 824);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getPanel_2());
		contentPane.add(getPanel_2_1());
		contentPane.add(getPanel_2_2());
		contentPane.add(getPanel_2_3());
		contentPane.add(getPanel_2_4());
		contentPane.add(getPanel_2_5());
		contentPane.add(getPanel_2_6());
		contentPane.add(getPanel_2_8());
		contentPane.add(getPanel_2_9());
		contentPane.add(getExit());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_1());
		contentPane.add(getLblNewLabel_2_1_1());
		contentPane.add(getLblNewLabel_2_1_1_1());
		contentPane.add(getLblNewLabel_2_1_1_1_1());
		contentPane.add(getLblNewLabel_2_1_1_1_1_1());
		contentPane.add(getLblNewLabel_2_1_1_1_1_2());
		contentPane.add(getLblNewLabel_2_1_1_1_1_3());
		contentPane.add(getLblNewLabel_2_1_1_1_1_4());
		contentPane.add(getLblNewLabel_2_1_1_1_1_4_1());
		contentPane.add(getLblNewLabel_2_1_1_1_1_4_2());
		contentPane.add(getSeparator());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(20, 20, 100, 80);
			panel.setLayout(null);
			panel.add(getLblNewLabel_1_10());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Buyer().setVisible(true);
				}
			});
			panel_1.setBounds(150, 20, 100, 80);
			panel_1.setLayout(null);
			panel_1.add(getNew_buyer());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					new Update_Buyer().setVisible(true);
				}
			});
			panel_2.setBounds(280, 20, 100, 80);
			panel_2.setLayout(null);
			panel_2.add(getUpdate_buyer());
		}
		return panel_2;
	}
	private JPanel getPanel_2_1() {
		if (panel_2_1 == null) {
			panel_2_1 = new JPanel();
			panel_2_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Buyer_Details().setVisible(true);
				}
			});
			panel_2_1.setBounds(410, 20, 100, 80);
			panel_2_1.setLayout(null);
			panel_2_1.add(getLblNewLabel_1_7());
		}
		return panel_2_1;
	}
	private JPanel getPanel_2_2() {
		if (panel_2_2 == null) {
			panel_2_2 = new JPanel();
			panel_2_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Delete_Buyer().setVisible(true);
				}
			});
			panel_2_2.setBounds(540, 20, 100, 80);
			panel_2_2.setLayout(null);
			panel_2_2.add(getDel_buyer());
		}
		return panel_2_2;
	}
	private JPanel getPanel_2_3() {
		if (panel_2_3 == null) {
			panel_2_3 = new JPanel();
			panel_2_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Product().setVisible(true);
				}
			});
			panel_2_3.setBounds(670, 20, 100, 80);
			panel_2_3.setLayout(null);
			panel_2_3.add(getNew_product());
		}
		return panel_2_3;
	}
	private JPanel getPanel_2_4() {
		if (panel_2_4 == null) {
			panel_2_4 = new JPanel();
			panel_2_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Update_Product().setVisible(true);
				}
			});
			panel_2_4.setBounds(800, 20, 100, 80);
			panel_2_4.setLayout(null);
			panel_2_4.add(getUpd_product());
		}
		return panel_2_4;
	}
	private JPanel getPanel_2_5() {
		if (panel_2_5 == null) {
			panel_2_5 = new JPanel();
			panel_2_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Product_Details().setVisible(true);
				}
			});
			panel_2_5.setBounds(930, 20, 100, 80);
			panel_2_5.setLayout(null);
			panel_2_5.add(getProd_details());
		}
		return panel_2_5;
	}
	private JPanel getPanel_2_6() {
		if (panel_2_6 == null) {
			panel_2_6 = new JPanel();
			panel_2_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Delete_Product().setVisible(true);
				}
			});
			panel_2_6.setBounds(1060, 20, 100, 80);
			panel_2_6.setLayout(null);
			panel_2_6.add(getDel_Prod());
		}
		return panel_2_6;
	}
	private JPanel getPanel_2_8() {
		if (panel_2_8 == null) {
			panel_2_8 = new JPanel();
			panel_2_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Billing().setVisible(true);
				}
			});
			panel_2_8.setBounds(1190, 20, 100, 80);
			panel_2_8.setLayout(null);
			panel_2_8.add(getLblNewLabel_1_2());
		}
		return panel_2_8;
	}
	private JPanel getPanel_2_9() {
		if (panel_2_9 == null) {
			panel_2_9 = new JPanel();
			panel_2_9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			panel_2_9.setBounds(1320, 20, 100, 80);
			panel_2_9.setLayout(null);
			panel_2_9.add(getLogout());
		}
		return panel_2_9;
	}
	private JPanel getExit() {
		if (exit == null) {
			exit = new JPanel();
			exit.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.exit(0);
				}
			});
			exit.setBackground(Color.RED);
			exit.setBounds(1450, 20, 70, 80);
			exit.setLayout(null);
			exit.add(getLblNewLabel_1_3());
		}
		return exit;
	}
	private JLabel getUpd_product() {
		if (upd_product == null) {
			upd_product = new JLabel("New label");
			upd_product.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Update_Product().setVisible(true);
				}
			});
			upd_product.setBounds(0, 0, 100, 80);
		}
		return upd_product;
	}
	private JLabel getProd_details() {
		if (prod_details == null) {
			prod_details = new JLabel("New label");
			prod_details.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Product_Details().setVisible(true);
				}
			});
			prod_details.setBounds(0, 0, 100, 80);
		}
		return prod_details;
	}
	private JLabel getDel_Prod() {
		if (del_Prod == null) {
			del_Prod = new JLabel("New label");
			del_Prod.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Delete_Product().setVisible(true);
				}
			});
			del_Prod.setBounds(0, 0, 100, 80);
		}
		return del_Prod;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("New label");
			lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Billing().setVisible(true);
				}
			});
			lblNewLabel_1_2.setBounds(0, 0, 100, 80);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getNew_product() {
		if (new_product == null) {
			new_product = new JLabel("New label");
			new_product.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Product().setVisible(true);
				}
			});
			new_product.setBounds(0, 0, 100, 80);
		}
		return new_product;
	}
	private JLabel getDel_buyer() {
		if (del_buyer == null) {
			del_buyer = new JLabel("New label");
			del_buyer.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Delete_Buyer().setVisible(true);
				}
			});
			del_buyer.setBounds(0, 0, 100, 80);
		}
		return del_buyer;
	}
	private JLabel getLblNewLabel_1_7() {
		if (lblNewLabel_1_7 == null) {
			lblNewLabel_1_7 = new JLabel("New label");
			lblNewLabel_1_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Buyer_Details().setVisible(true);
				}
			});
			lblNewLabel_1_7.setBounds(0, 0, 100, 80);
		}
		return lblNewLabel_1_7;
	}
	private JLabel getUpdate_buyer() {
		if (update_buyer == null) {
			update_buyer = new JLabel("New label");
			update_buyer.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Update_Buyer().setVisible(true);
				}
			});
			update_buyer.setBounds(0, 0, 100, 80);
		}
		return update_buyer;
	}
	private JLabel getNew_buyer() {
		if (new_buyer == null) {
			new_buyer = new JLabel("New label");
			new_buyer.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Buyer().setVisible(true);
				}
			});
			new_buyer.setBounds(0, 0, 100, 80);
		}
		return new_buyer;
	}
	private JLabel getLblNewLabel_1_10() {
		if (lblNewLabel_1_10 == null) {
			lblNewLabel_1_10 = new JLabel("New label");
			lblNewLabel_1_10.setBounds(0, 0, 100, 80);
		}
		return lblNewLabel_1_10;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel(" X");
			lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.exit(0);
				}
			});
			lblNewLabel_1_3.setForeground(Color.WHITE);
			lblNewLabel_1_3.setBackground(Color.RED);
			lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 40));
			lblNewLabel_1_3.setDisplayedMnemonic(KeyEvent.VK_ENTER);
			lblNewLabel_1_3.setAlignmentY(0.0f);
			lblNewLabel_1_3.setAlignmentX(0.5f);
			lblNewLabel_1_3.setBounds(0, 0, 70, 80);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLogout() {
		if (logout == null) {
			logout = new JLabel("New label");
			logout.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			logout.setBounds(0, 0, 100, 80);
		}
		return logout;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New Buyer");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Buyer().setVisible(true);
				}
			});
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2.setBounds(160, 110, 88, 21);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Update Buyer");
			lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Update_Buyer().setVisible(true);
				}
			});
			lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1.setBounds(284, 110, 100, 21);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("Buyer Details");
			lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Buyer_Details().setVisible(true);
				}
			});
			lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1_1.setBounds(415, 110, 100, 21);
		}
		return lblNewLabel_2_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1_1 == null) {
			lblNewLabel_2_1_1_1 = new JLabel("Delete Buyer");
			lblNewLabel_2_1_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Delete_Buyer().setVisible(true);
				}
			});
			lblNewLabel_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1_1_1.setBounds(545, 110, 100, 21);
		}
		return lblNewLabel_2_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1 = new JLabel("New Product");
			lblNewLabel_2_1_1_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new New_Product().setVisible(true);
				}
			});
			lblNewLabel_2_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1_1_1_1.setBounds(675, 110, 100, 21);
		}
		return lblNewLabel_2_1_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1_1 = new JLabel("Update Product");
			lblNewLabel_2_1_1_1_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Update_Product().setVisible(true);
				}
			});
			lblNewLabel_2_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1_1_1_1_1.setBounds(797, 110, 117, 21);
		}
		return lblNewLabel_2_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_2() {
		if (lblNewLabel_2_1_1_1_1_2 == null) {
			lblNewLabel_2_1_1_1_1_2 = new JLabel("Product Details");
			lblNewLabel_2_1_1_1_1_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Product_Details().setVisible(true);
				}
			});
			lblNewLabel_2_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1_1_1_1_2.setBounds(929, 110, 117, 21);
		}
		return lblNewLabel_2_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_3() {
		if (lblNewLabel_2_1_1_1_1_3 == null) {
			lblNewLabel_2_1_1_1_1_3 = new JLabel("Delete Product");
			lblNewLabel_2_1_1_1_1_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Delete_Product().setVisible(true);
				}
			});
			lblNewLabel_2_1_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1_1_1_1_3.setBounds(1059, 110, 117, 21);
		}
		return lblNewLabel_2_1_1_1_1_3;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_4() {
		if (lblNewLabel_2_1_1_1_1_4 == null) {
			lblNewLabel_2_1_1_1_1_4 = new JLabel("Billing");
			lblNewLabel_2_1_1_1_1_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Billing().setVisible(true);
				}
			});
			lblNewLabel_2_1_1_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1_1_1_1_4.setBounds(1220, 110, 70, 21);
		}
		return lblNewLabel_2_1_1_1_1_4;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_4_1() {
		if (lblNewLabel_2_1_1_1_1_4_1 == null) {
			lblNewLabel_2_1_1_1_1_4_1 = new JLabel("Logout");
			lblNewLabel_2_1_1_1_1_4_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Login().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_2_1_1_1_1_4_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1_1_1_1_4_1.setBounds(1350, 110, 60, 21);
		}
		return lblNewLabel_2_1_1_1_1_4_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_4_2() {
		if (lblNewLabel_2_1_1_1_1_4_2 == null) {
			lblNewLabel_2_1_1_1_1_4_2 = new JLabel("Close");
			lblNewLabel_2_1_1_1_1_4_2.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_2_1_1_1_1_4_2.setBounds(1470, 110, 50, 21);
		}
		return lblNewLabel_2_1_1_1_1_4_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(0, 150, 1560, 48);
		}
		return separator;
	}
}
