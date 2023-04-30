package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Student;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField fullnameinput;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField cityinput;
	private JLabel lblNewLabel_1_1_1;
	private JTextField emailinput;
	private JLabel lblNewLabel_1_1_1_1;
	private JButton btnNewButton;
	private JPasswordField passwordinputs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getFullnameinput());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getCityinput());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getEmailinput());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getPasswordinputs());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sing Up");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel.setBounds(221, 35, 112, 22);
		}
		return lblNewLabel;
	}
	private JTextField getFullnameinput() {
		if (fullnameinput == null) {
			fullnameinput = new JTextField();
			fullnameinput.setBounds(141, 100, 127, 28);
			fullnameinput.setColumns(10);
		}
		return fullnameinput;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Full Name");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(35, 99, 96, 22);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("City");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(301, 99, 96, 22);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getCityinput() {
		if (cityinput == null) {
			cityinput = new JTextField();
			cityinput.setColumns(10);
			cityinput.setBounds(407, 100, 127, 28);
		}
		return cityinput;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Email");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(35, 151, 96, 22);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getEmailinput() {
		if (emailinput == null) {
			emailinput = new JTextField();
			emailinput.setColumns(10);
			emailinput.setBounds(141, 152, 127, 28);
		}
		return emailinput;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("password");
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(301, 151, 96, 22);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Register");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// Create Hibernate Object
					SessionFactory sf = new Configuration().configure().buildSessionFactory();	
					Session session = sf.openSession();
					session.beginTransaction();
					
					Student st = new Student();
					
					st.setId(1);
					st.setName(fullnameinput.getText());
					st.setCity(cityinput.getText());
					st.setGmail(emailinput.getText());
					st.setPass(passwordinputs.getText());
					
					session.save(st);
					session.getTransaction().commit();
					session.close();
				}
			});
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 19));
			btnNewButton.setBounds(229, 239, 127, 35);
		}
		return btnNewButton;
	}
	private JPasswordField getPasswordinputs() {
		if (passwordinputs == null) {
			passwordinputs = new JPasswordField();
			passwordinputs.setBounds(407, 151, 127, 28);
		}
		return passwordinputs;
	}
}
