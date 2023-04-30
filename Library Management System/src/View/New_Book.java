package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Model.Book;
import Service.Book_Service;
import Service.Book_Service_empl;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class New_Book extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField bidinput;
	private JLabel lblStudentId;
	private JLabel lblFullName;
	private JTextField bnameinput;
	private JLabel lblFatherName;
	private JLabel lblYear;
	private JLabel lblBranch;
	private JLabel lblCourse;
	private JTextField bookpriceinput;
	private JLabel lblFatherName_1_1;
	private JButton btnRegister;
	private JButton btnBack;
	private JComboBox cmbedition;
	private JTextField publisherinput;
	private JTextField bookpageinput;
	private JTextField bookwritterinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Book frame = new New_Book();
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
	public New_Book() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(520, 140, 525, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		
		// Generate Random Book Id
		BookID();
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(218, 165, 32), 2), "New Book", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(20, 20, 474, 466);
			panel.setLayout(null);
			panel.add(getBidinput());
			panel.add(getLblStudentId());
			panel.add(getLblFullName());
			panel.add(getBnameinput());
			panel.add(getLblFatherName());
			panel.add(getLblYear());
			panel.add(getLblBranch());
			panel.add(getLblCourse());
			panel.add(getBookpriceinput());
			panel.add(getLblFatherName_1_1());
			panel.add(getBtnRegister());
			panel.add(getBtnBack());
			panel.add(getCmbedition());
			panel.add(getTextField_2_1());
			panel.add(getBookpageinput());
			panel.add(getBookwritterinput());
		}
		return panel;
	}
	private JTextField getBidinput() {
		if (bidinput == null) {
			bidinput = new JTextField();
			bidinput.setEditable(false);
			bidinput.setEnabled(false);
			bidinput.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			bidinput.setColumns(10);
			bidinput.setBounds(172, 42, 263, 29);
		}
		return bidinput;
	}
	private JLabel getLblStudentId() {
		if (lblStudentId == null) {
			lblStudentId = new JLabel("Book ID");
			lblStudentId.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblStudentId.setBounds(21, 44, 113, 23);
		}
		return lblStudentId;
	}
	private JLabel getLblFullName() {
		if (lblFullName == null) {
			lblFullName = new JLabel("Book Name");
			lblFullName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFullName.setBounds(21, 94, 113, 23);
		}
		return lblFullName;
	}
	private JTextField getBnameinput() {
		if (bnameinput == null) {
			bnameinput = new JTextField();
			bnameinput.setColumns(10);
			bnameinput.setBounds(172, 92, 263, 29);
		}
		return bnameinput;
	}
	private JLabel getLblFatherName() {
		if (lblFatherName == null) {
			lblFatherName = new JLabel("Edition");
			lblFatherName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName.setBounds(21, 144, 103, 23);
		}
		return lblFatherName;
	}
	private JLabel getLblYear() {
		if (lblYear == null) {
			lblYear = new JLabel("Book Pages");
			lblYear.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblYear.setBounds(21, 287, 113, 23);
		}
		return lblYear;
	}
	private JLabel getLblBranch() {
		if (lblBranch == null) {
			lblBranch = new JLabel("Book Price");
			lblBranch.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblBranch.setBounds(21, 237, 113, 23);
		}
		return lblBranch;
	}
	private JLabel getLblCourse() {
		if (lblCourse == null) {
			lblCourse = new JLabel("Publisher");
			lblCourse.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCourse.setBounds(21, 187, 113, 23);
		}
		return lblCourse;
	}
	private JTextField getBookpriceinput() {
		if (bookpriceinput == null) {
			bookpriceinput = new JTextField();
			bookpriceinput.setColumns(10);
			bookpriceinput.setBounds(172, 235, 263, 29);
		}
		return bookpriceinput;
	}
	private JLabel getLblFatherName_1_1() {
		if (lblFatherName_1_1 == null) {
			lblFatherName_1_1 = new JLabel("Book Writter");
			lblFatherName_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1_1.setBounds(21, 334, 141, 23);
		}
		return lblFatherName_1_1;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Book bk = new Book();
					
					bk.setBid(Integer.parseInt(bidinput.getText()));
					bk.setBookname(bnameinput.getText());
					bk.setBookedition(cmbedition.getSelectedItem().toString());
					bk.setBookpublisher(publisherinput.getText());
					bk.setBookprice(Integer.parseInt(bookpriceinput.getText()));
					bk.setBookpage(Integer.parseInt(bookpageinput.getText()));
					bk.setBookwriter(bookwritterinput.getText());
					
					Book_Service bs = new Book_Service_empl();
					boolean res = bs.AddBook(bk);
					
					if(res) {
						JOptionPane.showMessageDialog(null, "Book Added Sucessfull");
						setVisible(false);
						new New_Book().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Add Book");
					}
					
				}
			});
			btnRegister.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnRegister.setBounds(172, 390, 128, 35);
		}
		return btnRegister;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnBack.setBounds(344, 390, 91, 35);
		}
		return btnBack;
	}
	private JComboBox getCmbedition() {
		if (cmbedition == null) {
			cmbedition = new JComboBox();
			cmbedition.setFont(new Font("Arial Black", Font.BOLD, 14));
			cmbedition.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Select Book Edition ---- ]", "1st Edition", "2nd Edition", "3rd Edition", "4th Edition"}));
			cmbedition.setBounds(172, 140, 263, 29);
		}
		return cmbedition;
	}
	private JTextField getTextField_2_1() {
		if (publisherinput == null) {
			publisherinput = new JTextField();
			publisherinput.setColumns(10);
			publisherinput.setBounds(172, 185, 263, 29);
		}
		return publisherinput;
	}
	private JTextField getBookpageinput() {
		if (bookpageinput == null) {
			bookpageinput = new JTextField();
			bookpageinput.setColumns(10);
			bookpageinput.setBounds(172, 283, 263, 29);
		}
		return bookpageinput;
	}
	private JTextField getBookwritterinput() {
		if (bookwritterinput == null) {
			bookwritterinput = new JTextField();
			bookwritterinput.setColumns(10);
			bookwritterinput.setBounds(172, 330, 263, 29);
		}
		return bookwritterinput;
	}
	
	
	/// Generate Book Id 
	public void BookID() {
		Random rn = new Random();
		
		bidinput.setText(""+rn.nextInt(100000+1));
	}
}
