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

public class FeedBack extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JTextField femail;
	private JLabel lblNewLabel_1_1;
	private JSeparator separator_1;
	private JScrollPane scrollPane;
	private JEditorPane fquery;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedBack frame = new FeedBack();
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
	public FeedBack() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 150, 497, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getFemail());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getSeparator_1());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Feed Back");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(171, 12, 128, 29);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(150, 50, 171, 15);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Email ID :- ");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(24, 76, 107, 29);
		}
		return lblNewLabel_1;
	}
	private JTextField getFemail() {
		if (femail == null) {
			femail = new JTextField();
			femail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			femail.setBounds(131, 72, 330, 37);
			femail.setColumns(10);
		}
		return femail;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Write Your Query");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(184, 140, 164, 29);
		}
		return lblNewLabel_1_1;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(160, 175, 206, 23);
		}
		return separator_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 190, 441, 106);
			scrollPane.setViewportView(getFquery());
		}
		return scrollPane;
	}
	private JEditorPane getFquery() {
		if (fquery == null) {
			fquery = new JEditorPane();
			fquery.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		}
		return fquery;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Submit");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Arf af = new Arf();
					
					af.setFemail(femail.getText());
					af.setFquery(fquery.getText());
					
					Arf_Service as = new Arf_Service_empl();
					boolean feed = as.Feedback(af);
					
					if(feed) {
						JOptionPane.showMessageDialog(null,"Feed Back Send Sucessfull");
						dispose();
					}else {
						JOptionPane.showMessageDialog(null,"Failed to Send Feed Back");
					}
					
				}
			});
			btnNewButton.setForeground(Color.BLACK);
			btnNewButton.setBackground(Color.MAGENTA);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 24));
			btnNewButton.setBounds(171, 316, 150, 45);
		}
		return btnNewButton;
	}
}
