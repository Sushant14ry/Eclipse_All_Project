package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import Model.Book;
import Model.Student;
import Service.Book_Service;
import Service.Book_Service_empl;
import Service.Issue_book;
import Service.Issue_book_empl;
import Service.Return_Book_Service;
import Service.Return_Service_Book_empl;
import Service.Student_Service;
import Service.Student_Service_empl;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Return_Books extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField bid;
	private JLabel lblStudentId;
	private JLabel lblFullName;
	private JTextField bookname;
	private JLabel lblFatherName;
	private JLabel lblYear;
	private JLabel lblBranch;
	private JLabel lblCourse;
	private JTextField bookprice;
	private JLabel lblFatherName_1_1;
	private JTextField bookpublisher;
	private JTextField bookpage;
	private JTextField bookwritter;
	private JButton btnSearch;
	private JPanel panel_1;
	private JTextField sidinput;
	private JLabel lblStudentId_1;
	private JLabel lblFullName_1;
	private JTextField fullnameinput;
	private JLabel lblFatherName_1;
	private JTextField fathernameinput;
	private JLabel lblYear_1;
	private JLabel lblBranch_1;
	private JLabel lblCourse_1;
	private JTextField cmbbranch;
	private JLabel lblFatherName_1_1_1;
	private JComboBox cmbsemester;
	private JComboBox cmbyear;
	private JComboBox cmbcourse;
	private JButton btnSearch_1;
	private JLabel lblFatherName_1_1_1_1;
	private JButton btnIssue;
	private JButton btnBack_1;
	private JDateChooser dateIssue;
	private JComboBox cmbedition;
	private int eid;
	private int eids;
	private JLabel lblBookIssue;
	private JSeparator separator;
	private JDateChooser returndate;
	private JLabel lblFatherName_1_1_1_1_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Return_Books frame = new Return_Books();
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
	public Return_Books() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 140, 1229, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getBtnIssue());
		contentPane.add(getBtnBack_1());
		contentPane.add(getLblBookIssue());
		contentPane.add(getSeparator());
		contentPane.add(getReturndate());
		contentPane.add(getLblFatherName_1_1_1_1_1());
		
		// Display Books in Search input Table
//			Diplay_Book();
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 191, 255), 2), "Book Detail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(25, 70, 574, 429);
			panel.add(getBid());
			panel.add(getLblStudentId());
			panel.add(getLblFullName());
			panel.add(getBookname());
			panel.add(getLblFatherName());
			panel.add(getLblYear());
			panel.add(getLblBranch());
			panel.add(getLblCourse());
			panel.add(getBookprice());
			panel.add(getLblFatherName_1_1());
			panel.add(getBookpublisher());
			panel.add(getBookpage());
			panel.add(getBookwritter());
			panel.add(getBtnSearch());
			panel.add(getCmbedition());
			panel.add(getLblFatherName_1_1_1_1());
			panel.add(getDateIssue());
		}
		return panel;
	}
	private JTextField getBid() {
		if (bid == null) {
			bid = new JTextField();
			bid.setColumns(10);
			bid.setBounds(172, 42, 263, 29);
		}
		return bid;
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
	private JTextField getBookname() {
		if (bookname == null) {
			bookname = new JTextField();
			bookname.setColumns(10);
			bookname.setBounds(172, 92, 263, 29);
		}
		return bookname;
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
	private JTextField getBookprice() {
		if (bookprice == null) {
			bookprice = new JTextField();
			bookprice.setColumns(10);
			bookprice.setBounds(172, 235, 263, 29);
		}
		return bookprice;
	}
	private JLabel getLblFatherName_1_1() {
		if (lblFatherName_1_1 == null) {
			lblFatherName_1_1 = new JLabel("Book Writter");
			lblFatherName_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1_1.setBounds(21, 334, 141, 23);
		}
		return lblFatherName_1_1;
	}
	private JTextField getBookpublisher() {
		if (bookpublisher == null) {
			bookpublisher = new JTextField();
			bookpublisher.setColumns(10);
			bookpublisher.setBounds(172, 185, 263, 29);
		}
		return bookpublisher;
	}
	private JTextField getBookpage() {
		if (bookpage == null) {
			bookpage = new JTextField();
			bookpage.setColumns(10);
			bookpage.setBounds(172, 283, 263, 29);
		}
		return bookpage;
	}
	private JTextField getBookwritter() {
		if (bookwritter == null) {
			bookwritter = new JTextField();
			bookwritter.setColumns(10);
			bookwritter.setBounds(172, 330, 263, 29);
		}
		return bookwritter;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bid.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Member ID");
						return;
					}
					
					int Searchbookid = Integer.parseInt(bid.getText().trim());
					
					Book bk = new Book();
					Book_Service bs = new Book_Service_empl();
					bs.getBookById(Searchbookid);
					Display_book(Searchbookid);
				}
			});
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSearch.setBounds(447, 42, 108, 29);
		}
		return btnSearch;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 191, 255), 2), "Student Detail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(619, 70, 570, 387);
			panel_1.add(getSidinput());
			panel_1.add(getLblStudentId_1());
			panel_1.add(getLblFullName_1());
			panel_1.add(getFullnameinput());
			panel_1.add(getLblFatherName_1());
			panel_1.add(getFathernameinput());
			panel_1.add(getLblYear_1());
			panel_1.add(getLblBranch_1());
			panel_1.add(getLblCourse_1());
			panel_1.add(getCmbbranch());
			panel_1.add(getLblFatherName_1_1_1());
			panel_1.add(getCmbsemester());
			panel_1.add(getCmbyear());
			panel_1.add(getCmbcourse());
			panel_1.add(getBtnSearch_1());
		}
		return panel_1;
	}
	private JTextField getSidinput() {
		if (sidinput == null) {
			sidinput = new JTextField();
			sidinput.setColumns(10);
			sidinput.setBounds(172, 42, 263, 29);
		}
		return sidinput;
	}
	private JLabel getLblStudentId_1() {
		if (lblStudentId_1 == null) {
			lblStudentId_1 = new JLabel("Student ID");
			lblStudentId_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblStudentId_1.setBounds(21, 44, 113, 23);
		}
		return lblStudentId_1;
	}
	private JLabel getLblFullName_1() {
		if (lblFullName_1 == null) {
			lblFullName_1 = new JLabel("Full Name");
			lblFullName_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFullName_1.setBounds(21, 94, 113, 23);
		}
		return lblFullName_1;
	}
	private JTextField getFullnameinput() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setColumns(10);
			fullnameinput.setBounds(172, 92, 263, 29);
		}
		return fullnameinput;
	}
	private JLabel getLblFatherName_1() {
		if (lblFatherName_1 == null) {
			lblFatherName_1 = new JLabel("Father Name");
			lblFatherName_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1.setBounds(21, 144, 141, 23);
		}
		return lblFatherName_1;
	}
	private JTextField getFathernameinput() {
		if (fathernameinput == null) {
			fathernameinput = new JTextField();
			fathernameinput.setColumns(10);
			fathernameinput.setBounds(172, 140, 263, 29);
		}
		return fathernameinput;
	}
	private JLabel getLblYear_1() {
		if (lblYear_1 == null) {
			lblYear_1 = new JLabel("Year");
			lblYear_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblYear_1.setBounds(21, 287, 91, 23);
		}
		return lblYear_1;
	}
	private JLabel getLblBranch_1() {
		if (lblBranch_1 == null) {
			lblBranch_1 = new JLabel("Branch");
			lblBranch_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblBranch_1.setBounds(21, 237, 91, 23);
		}
		return lblBranch_1;
	}
	private JLabel getLblCourse_1() {
		if (lblCourse_1 == null) {
			lblCourse_1 = new JLabel("Course");
			lblCourse_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCourse_1.setBounds(21, 187, 113, 23);
		}
		return lblCourse_1;
	}
	private JTextField getCmbbranch() {
		if (cmbbranch == null) {
			cmbbranch = new JTextField();
			cmbbranch.setColumns(10);
			cmbbranch.setBounds(172, 235, 263, 29);
		}
		return cmbbranch;
	}
	private JLabel getLblFatherName_1_1_1() {
		if (lblFatherName_1_1_1 == null) {
			lblFatherName_1_1_1 = new JLabel("Semester");
			lblFatherName_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1_1_1.setBounds(21, 334, 113, 23);
		}
		return lblFatherName_1_1_1;
	}
	private JComboBox getCmbsemester() {
		if (cmbsemester == null) {
			cmbsemester = new JComboBox();
			cmbsemester.setFont(new Font("Arial Black", Font.PLAIN, 16));
			cmbsemester.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Semester --- ]", "1st Semester", "2nd Semester"}));
			cmbsemester.setBounds(172, 330, 263, 29);
		}
		return cmbsemester;
	}
	private JComboBox getCmbyear() {
		if (cmbyear == null) {
			cmbyear = new JComboBox();
			cmbyear.setFont(new Font("Arial Black", Font.PLAIN, 16));
			cmbyear.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Year--- ]", "1st Year", "2nd Year", "3rd Year", "4th Year"}));
			cmbyear.setBounds(172, 283, 263, 29);
		}
		return cmbyear;
	}
	private JComboBox getCmbcourse() {
		if (cmbcourse == null) {
			cmbcourse = new JComboBox();
			cmbcourse.setFont(new Font("Arial Black", Font.PLAIN, 16));
			cmbcourse.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Course --- ]", "BCA", "MCA", "CSIT", "BIT"}));
			cmbcourse.setBounds(172, 185, 263, 29);
		}
		return cmbcourse;
	}
	private JButton getBtnSearch_1() {
		if (btnSearch_1 == null) {
			btnSearch_1 = new JButton("Search");
			btnSearch_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(sidinput.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please Enter Student ID");
						return;
					}
					
					int search_Student = Integer.parseInt(sidinput.getText().trim());
					Student_Service ss = new Student_Service_empl();
					ss.getStudentkById(search_Student);
					
					Display_Student(search_Student);
					
				}
			});
			btnSearch_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSearch_1.setBounds(445, 42, 108, 29);
		}
		return btnSearch_1;
	}
	private JLabel getLblFatherName_1_1_1_1() {
		if (lblFatherName_1_1_1_1 == null) {
			lblFatherName_1_1_1_1 = new JLabel("Date of Issue");
			lblFatherName_1_1_1_1.setBounds(21, 382, 141, 23);
			lblFatherName_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		}
		return lblFatherName_1_1_1_1;
	}
	private JButton getBtnIssue() {
		if (btnIssue == null) {
			btnIssue = new JButton("Return");
			btnIssue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// Add Book in Issue_Book
					Model.Return_book isbk = new Model.Return_book();
					
					isbk.setBid(Integer.parseInt(bid.getText()));
					isbk.setBookname(bookname.getText());
					isbk.setBookedition(cmbedition.getSelectedItem().toString());
					isbk.setBookpublisher(bookpublisher.getText());
					isbk.setBookprice(Integer.parseInt(bookprice.getText()));
					isbk.setBookpage(Integer.parseInt(bookpage.getText()));
					isbk.setBookwriter(bookwritter.getText());
					
					isbk.setSid(Integer.parseInt(sidinput.getText()));
					isbk.setFullname(fullnameinput.getText());
					isbk.setFathername(fathernameinput.getText());
					isbk.setCourse(cmbcourse.getSelectedItem().toString());
					isbk.setBranch(cmbbranch.getText());
					isbk.setYear(cmbyear.getSelectedItem().toString());
					isbk.setSemester(cmbsemester.getSelectedItem().toString());
					isbk.setIssue_date(new Date(dateIssue.getDate().getTime()));
					isbk.setReturn_date(new Date(returndate.getDate().getTime()));
					
					Return_Book_Service rbs = new Return_Service_Book_empl();
					boolean res = rbs.AddReturnBook(isbk);
									
					if(res) {
						JOptionPane.showMessageDialog(null, "Book Return Successfull");
						
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Return Book ");
					}
					
					
				}
			});
			btnIssue.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnIssue.setBounds(796, 528, 128, 35);
		}
		return btnIssue;
	}
	private JButton getBtnBack_1() {
		if (btnBack_1 == null) {
			btnBack_1 = new JButton("Back");
			btnBack_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnBack_1.setBounds(968, 528, 91, 35);
		}
		return btnBack_1;
	}
	private JDateChooser getDateIssue() {
		if (dateIssue == null) {
			dateIssue = new JDateChooser();
			dateIssue.setBounds(172, 378, 263, 29);
		}
		return dateIssue;
	}
	

	private JComboBox getCmbedition() {
		if (cmbedition == null) {
			cmbedition = new JComboBox();
			cmbedition.setModel(new DefaultComboBoxModel(new String[] {"[ --- Select Edition --- ]", "1st Edition", "2nd Edition", "3rd Edition", "4th Edition"}));
			cmbedition.setFont(new Font("Arial Black", Font.PLAIN, 16));
			cmbedition.setBounds(172, 140, 263, 29);
		}
		return cmbedition;
	}

	private JLabel getLblBookIssue() {
		if (lblBookIssue == null) {
			lblBookIssue = new JLabel("Book Return");
			lblBookIssue.setForeground(Color.BLUE);
			lblBookIssue.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblBookIssue.setBounds(532, 1, 175, 34);
		}
		return lblBookIssue;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(516, 43, 202, 17);
		}
		return separator;
	}
	private JDateChooser getReturndate() {
		if (returndate == null) {
			returndate = new JDateChooser();
			returndate.setBounds(795, 472, 263, 29);
		}
		return returndate;
	}
	private JLabel getLblFatherName_1_1_1_1_1() {
		if (lblFatherName_1_1_1_1_1 == null) {
			lblFatherName_1_1_1_1_1 = new JLabel("Return Date");
			lblFatherName_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1_1_1_1_1.setBounds(644, 476, 141, 23);
		}
		return lblFatherName_1_1_1_1_1;
	}
	
	
	// Fetch Data from New Book and Show in input box
	
	private void Display_book(int id) {
		
		eid = id;
		Book_Service bs = new Book_Service_empl();
		Book bk = bs.getBookById(id);
		
		bookname.setText(bk.getBookname());
		cmbedition.setSelectedItem(bk.getBookedition());
		bookpublisher.setText(bk.getBookpublisher());
		bookprice.setText(String.valueOf(bk.getBookprice()));
		bookpage.setText(String.valueOf(bk.getBookpage()));
		bookwritter.setText(bk.getBookwriter());
		
	}

	// Fetch Data from Student and Show in input box
	private void Display_Student(int sid) {
		
		eids = sid;
		Student_Service ss = new Student_Service_empl();
		Student std = ss.getStudentkById(sid);
		
		fullnameinput.setText(std.getFullname());
		fathernameinput.setText(std.getFathername());
		cmbcourse.setSelectedItem(std.getCourse());
		cmbbranch.setText(std.getBranch());
		cmbyear.setSelectedItem(std.getYear());
		cmbsemester.setSelectedItem(std.getSemester());
	}

}
