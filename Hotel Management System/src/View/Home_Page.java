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
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home_Page extends JFrame {
	private JPanel contentPane;
	private JButton btnExit;
	private JButton btnLogout;
	private JButton btnManageRoom;
	private JButton btnCustomerCheck;
	private JButton btnCustomerCheckOut;
	private JButton btnCustomerDetailBill;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Page frame = new Home_Page();
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
	public Home_Page() {
		setBackground(Color.WHITE);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 30, 1460, 774);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnExit());
		contentPane.add(getBtnLogout());
		contentPane.add(getBtnManageRoom());
		contentPane.add(getBtnCustomerCheck());
		contentPane.add(getBtnCustomerCheckOut());
		contentPane.add(getBtnCustomerDetailBill());
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit This Application","select",JOptionPane.YES_NO_OPTION);
					if(a == 0) {
						System.exit(a);
					}
				}
			});
			btnExit.setForeground(Color.WHITE);
			btnExit.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnExit.setBackground(Color.RED);
			btnExit.setBounds(1336, 32, 82, 50);
		}
		return btnExit;
	}
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton("Logout");
			btnLogout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index().setVisible(true);
					dispose();
				}
			});
			btnLogout.setForeground(Color.WHITE);
			btnLogout.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnLogout.setBackground(Color.ORANGE);
			btnLogout.setBounds(1204, 32, 106, 50);
		}
		return btnLogout;
	}
	private JButton getBtnManageRoom() {
		if (btnManageRoom == null) {
			btnManageRoom = new JButton("MANAGE ROOM");
			btnManageRoom.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Manage_Room().setVisible(true);
				}
			});
			btnManageRoom.setForeground(Color.WHITE);
			btnManageRoom.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnManageRoom.setBackground(Color.ORANGE);
			btnManageRoom.setBounds(44, 32, 205, 50);
		}
		return btnManageRoom;
	}
	private JButton getBtnCustomerCheck() {
		if (btnCustomerCheck == null) {
			btnCustomerCheck = new JButton("CUSTOMER CHECK IN");
			btnCustomerCheck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Customer_check_in().setVisible(true);
				}
			});
			btnCustomerCheck.setForeground(Color.WHITE);
			btnCustomerCheck.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnCustomerCheck.setBackground(Color.ORANGE);
			btnCustomerCheck.setBounds(268, 32, 268, 50);
		}
		return btnCustomerCheck;
	}
	private JButton getBtnCustomerCheckOut() {
		if (btnCustomerCheckOut == null) {
			btnCustomerCheckOut = new JButton("CUSTOMER CHECK OUT");
			btnCustomerCheckOut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Customer_check_out().setVisible(true);
				}
			});
			btnCustomerCheckOut.setForeground(Color.WHITE);
			btnCustomerCheckOut.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnCustomerCheckOut.setBackground(Color.ORANGE);
			btnCustomerCheckOut.setBounds(556, 32, 290, 50);
		}
		return btnCustomerCheckOut;
	}
	private JButton getBtnCustomerDetailBill() {
		if (btnCustomerDetailBill == null) {
			btnCustomerDetailBill = new JButton("CUSTOMER DETAILS BILL");
			btnCustomerDetailBill.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Customer_details_bill().setVisible(true);
				}
			});
			btnCustomerDetailBill.setForeground(Color.WHITE);
			btnCustomerDetailBill.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnCustomerDetailBill.setBackground(Color.ORANGE);
			btnCustomerDetailBill.setBounds(868, 32, 310, 50);
		}
		return btnCustomerDetailBill;
	}
}
