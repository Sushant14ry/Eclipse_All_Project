package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Arf;
import Service.Arf_Service;
import Service.Arf_Service_empl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Report extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JTextField rfname;
	private JLabel lblNewLabel_1_1;
	private JSeparator separator_1;
	private JScrollPane scrollPane;
	private JEditorPane rquery;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1_2;
	private JTextField remail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 150, 497, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getRfname());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getSeparator_1());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getRemail());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Report");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(216, 10, 89, 29);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(166, 48, 171, 15);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Full Name :- ");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1.setBounds(43, 68, 107, 29);
		}
		return lblNewLabel_1;
	}
	private JTextField getRfname() {
		if (rfname == null) {
			rfname = new JTextField();
			rfname.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			rfname.setBounds(160, 68, 276, 29);
			rfname.setColumns(10);
		}
		return rfname;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Write Your Query");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(195, 152, 164, 29);
		}
		return lblNewLabel_1_1;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(171, 187, 206, 23);
		}
		return separator_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(24, 196, 441, 106);
			scrollPane.setViewportView(getRquery());
		}
		return scrollPane;
	}
	private JEditorPane getRquery() {
		if (rquery == null) {
			rquery = new JEditorPane();
			rquery.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		}
		return rquery;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Submit");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(rfname.getText().isBlank()) {
						JOptionPane.showInternalMessageDialog(null,"Please Enter Your Full Name");
					}
					if(remail.getText().isBlank()) {
						JOptionPane.showInternalMessageDialog(null,"Please Enter Your Email ID");
					}
					if(rquery.getText().isBlank()) {
						JOptionPane.showInternalMessageDialog(null,"Please Fill Your Query");
					}
					
					Arf ar = new Arf();
					
					ar.setRfname(rfname.getText());
					ar.setRemail(remail.getText());
					ar.setRquery(rquery.getText());
					
					Arf_Service as = new Arf_Service_empl();
					boolean result = as.Report(ar);
					
					if(result) {
						JOptionPane.showMessageDialog(null,"Report Send Sucessfull");
						dispose();
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Send Report");
					}
					
				}
			});
			btnNewButton.setForeground(Color.BLACK);
			btnNewButton.setBackground(Color.MAGENTA);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 24));
			btnNewButton.setBounds(166, 312, 150, 45);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Email ID :- ");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(43, 107, 107, 29);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getRemail() {
		if (remail == null) {
			remail = new JTextField();
			remail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			remail.setColumns(10);
			remail.setBounds(160, 107, 276, 29);
		}
		return remail;
	}
}
