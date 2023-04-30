package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Book;
import Service.Book_Service;
import Service.Book_Service_empl;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class All_New_Books extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_4_1_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField s_book;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All_New_Books frame = new All_New_Books();
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
	public All_New_Books() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel_4_1_2());
		contentPane.add(getScrollPane());
		contentPane.add(getS_book());
		
		// Show All New Books
		Show_All_Book();
	}
	private JLabel getLblNewLabel_4_1_2() {
		if (lblNewLabel_4_1_2 == null) {
			lblNewLabel_4_1_2 = new JLabel("All New Book Information");
			lblNewLabel_4_1_2.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblNewLabel_4_1_2.setBounds(280, 12, 383, 32);
		}
		return lblNewLabel_4_1_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 63, 917, 372);
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
					"Book ID", "Book Name", "Edition", "Publisher", "Book Price", "Book Pages", "Book Writter"
				}
			));
		}
		return table;
	}
	private JTextField getS_book() {
		if (s_book == null) {
			s_book = new JTextField();
			s_book.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyPressed(KeyEvent e) {
					String search_book = s_book.getText().trim();
					Book_Service bs = new Book_Service_empl();
					List<Book> b_list = bs.SearchBook(search_book);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Book b : b_list) {
						tmodel.addRow(new Object[] {b.getBid(),b.getBookname(),b.getBookedition(),b.getBookpublisher(),b.getBookprice(),b.getBookpage(),b.getBookwriter()});
					}
					
				}
			});
			s_book.setBounds(734, 24, 205, 32);
			s_book.setColumns(10);
		}
		return s_book;
	}
	
	
//	-------------------- Show All Books in Table --------------------------
	
	public void Show_All_Book() {
		Book_Service bs = new Book_Service_empl();
		List<Book> b_list = bs.GetAllBook();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Book b : b_list) {
			tmodel.addRow(new Object[] {b.getBid(),b.getBookname(),b.getBookedition(),b.getBookpublisher(),b.getBookprice(),b.getBookpage(),b.getBookwriter()});
		}
	}
}
