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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Service.Room_Service;
import Service.Room_Service_empl;
import model.Room;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Manage_Room extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JPanel cmbnoofbed;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField roomnuminput;
	private JLabel lblRoomNumber;
	private JLabel lblRoomType;
	private JLabel lblBed;
	private JTextField roompriceinput;
	private JLabel lblRoomPrice;
	private JButton btnAddRoom;
	private JComboBox cmbroomtype;
	private JComboBox no_of_bed;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Room frame = new Manage_Room();
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
	public Manage_Room() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(94, 130, 1375, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		
		// Display Assign Room in Table
		Display_Assign_Room();
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(51, 204, 153));
			panel.setBounds(0, 0, 1374, 632);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getPanel_1());
			panel.add(getCmbnoofbed());
			panel.add(getBtnNewButton());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("MANAGE ROOM");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(40, 16, 201, 54);
		}
		return lblNewLabel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(40, 71, 650, 540);
			panel_1.setLayout(null);
			panel_1.add(getScrollPane());
		}
		return panel_1;
	}
	private JPanel getCmbnoofbed() {
		if (cmbnoofbed == null) {
			cmbnoofbed = new JPanel();
			cmbnoofbed.setBounds(800, 71, 512, 540);
			cmbnoofbed.setLayout(null);
			cmbnoofbed.add(getRoomnuminput());
			cmbnoofbed.add(getLblRoomNumber());
			cmbnoofbed.add(getLblRoomType());
			cmbnoofbed.add(getLblBed());
			cmbnoofbed.add(getRoompriceinput());
			cmbnoofbed.add(getLblRoomPrice());
			cmbnoofbed.add(getBtnAddRoom());
			cmbnoofbed.add(getCmbroomtype());
			cmbnoofbed.add(getNo_of_bed());
		}
		return cmbnoofbed;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 10, 630, 520);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Room Number", "Room Type", "Bed", "Price", "Status"
				}
			));
		}
		return table;
	}
	private JTextField getRoomnuminput() {
		if (roomnuminput == null) {
			roomnuminput = new JTextField();
			roomnuminput.setBounds(73, 74, 367, 26);
			roomnuminput.setColumns(10);
		}
		return roomnuminput;
	}
	private JLabel getLblRoomNumber() {
		if (lblRoomNumber == null) {
			lblRoomNumber = new JLabel("Room Number");
			lblRoomNumber.setBounds(74, 30, 144, 35);
			lblRoomNumber.setForeground(Color.BLACK);
			lblRoomNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
		}
		return lblRoomNumber;
	}
	private JLabel getLblRoomType() {
		if (lblRoomType == null) {
			lblRoomType = new JLabel("Room Type");
			lblRoomType.setForeground(Color.BLACK);
			lblRoomType.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomType.setBounds(74, 127, 144, 35);
		}
		return lblRoomType;
	}
	private JLabel getLblBed() {
		if (lblBed == null) {
			lblBed = new JLabel("No. Bed");
			lblBed.setForeground(Color.BLACK);
			lblBed.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblBed.setBounds(74, 235, 104, 35);
		}
		return lblBed;
	}
	private JTextField getRoompriceinput() {
		if (roompriceinput == null) {
			roompriceinput = new JTextField();
			roompriceinput.setColumns(10);
			roompriceinput.setBounds(73, 382, 367, 26);
		}
		return roompriceinput;
	}
	private JLabel getLblRoomPrice() {
		if (lblRoomPrice == null) {
			lblRoomPrice = new JLabel("Room Price");
			lblRoomPrice.setForeground(Color.BLACK);
			lblRoomPrice.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomPrice.setBounds(74, 338, 144, 35);
		}
		return lblRoomPrice;
	}
	private JButton getBtnAddRoom() {
		if (btnAddRoom == null) {
			btnAddRoom = new JButton("Add Room");
			btnAddRoom.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					Room rm = new Room();
					
					rm.setRoom_no(roomnuminput.getText());
					rm.setRoom_type(cmbroomtype.getSelectedItem().toString());
					rm.setNo_of_bed(no_of_bed.getSelectedItem().toString());
					rm.setRoom_price(Integer.parseInt(roomnuminput.getText()));
					
					Room_Service rs = new Room_Service_empl();
					boolean res = rs.AddRoom(rm);
					
					if(res) {
						JOptionPane.showMessageDialog(null,"Room Assign Successfull");
						Display_Assign_Room();
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Assign Room");
					}
					
				}
			});
			btnAddRoom.setForeground(Color.WHITE);
			btnAddRoom.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnAddRoom.setBackground(new Color(220, 20, 60));
			btnAddRoom.setBounds(73, 442, 155, 32);
		}
		return btnAddRoom;
	}
	private JComboBox getCmbroomtype() {
		if (cmbroomtype == null) {
			cmbroomtype = new JComboBox();
			cmbroomtype.setFont(new Font("Arial Black", Font.BOLD, 16));
			cmbroomtype.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select Type of Room ---- ]", "AC", "Non AC", "VIP"}));
			cmbroomtype.setBounds(73, 170, 367, 26);
		}
		return cmbroomtype;
	}
	private JComboBox getNo_of_bed() {
		if (no_of_bed == null) {
			no_of_bed = new JComboBox();
			no_of_bed.setFont(new Font("Arial Black", Font.BOLD, 16));
			no_of_bed.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select No of Bed ---- ]", "1", "2", "3", "4"}));
			no_of_bed.setBounds(73, 280, 367, 26);
		}
		return no_of_bed;
	}
	
	//  Display Assign and Manage Room
	
	private void Display_Assign_Room() {
		
		Room_Service rs = new Room_Service_empl();
		List<Room> r_list = rs.getAllRoom();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Room r : r_list) {
			tmodel.addRow(new Object[] {r.getRoom_no(),r.getRoom_type(),r.getNo_of_bed(),r.getRoom_price()});
		}
		
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("X");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit This Application","select",JOptionPane.YES_NO_OPTION);
					if(a == 0) {
						System.exit(a);
					}
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnNewButton.setBackground(Color.RED);
			btnNewButton.setBounds(1314, 10, 50, 40);
		}
		return btnNewButton;
	}
}
