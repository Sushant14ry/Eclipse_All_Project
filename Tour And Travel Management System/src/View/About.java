package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Window.Type;

public class About extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewCustomerForm;
	private JSeparator separator;
	private JButton btnBook;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextPane txtpnPackageViewImport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(560, 140, 543, 638);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setBackground(SystemColor.textHighlightText);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewCustomerForm());
		contentPane.add(getSeparator());
		contentPane.add(getBtnBook());
		contentPane.add(getPanel());
	}
	private JLabel getLblNewCustomerForm() {
		if (lblNewCustomerForm == null) {
			lblNewCustomerForm = new JLabel("Travel and Tourism Management System");
			lblNewCustomerForm.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewCustomerForm.setBounds(32, 8, 481, 32);
		}
		return lblNewCustomerForm;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(64, 50, 396, 24);
		}
		return separator;
	}
	private JButton getBtnBook() {
		if (btnBook == null) {
			btnBook = new JButton("Exit");
			btnBook.setBackground(Color.LIGHT_GRAY);
			btnBook.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnBook.setBounds(194, 540, 100, 38);
		}
		return btnBook;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(20, 72, 490, 456);
			panel.setLayout(null);
			panel.add(getScrollPane_1());
		}
		return panel;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 0, 490, 456);
			scrollPane.setViewportView(getTxtpnPackageViewImport());
		}
		return scrollPane;
	}
	private JTextPane getTxtpnPackageViewImport() {
		if (txtpnPackageViewImport == null) {
			txtpnPackageViewImport = new JTextPane();
			txtpnPackageViewImport.setEditable(false);
			txtpnPackageViewImport.setText("package View;\r\n\r\nimport java.awt.BorderLayout;\r\nimport java.awt.EventQueue;\r\n\r\nimport javax.swing.JFrame;\r\nimport javax.swing.JPanel;\r\nimport javax.swing.border.EmptyBorder;\r\nimport javax.swing.JLabel;\r\nimport java.awt.Font;\r\nimport java.awt.Color;\r\nimport javax.swing.border.LineBorder;\r\nimport javax.swing.JTextField;\r\nimport javax.swing.JSeparator;\r\nimport javax.swing.JButton;\r\nimport javax.swing.JComboBox;\r\nimport javax.swing.DefaultComboBoxModel;\r\nimport java.awt.event.ActionListener;\r\nimport java.awt.event.ActionEvent;\r\nimport java.awt.SystemColor;\r\nimport javax.swing.JScrollPane;\r\nimport javax.swing.JEditorPane;\r\n\r\npublic class About extends JFrame {\r\n\r\n\tprivate JPanel contentPane;\r\n\tprivate JLabel lblNewCustomerForm;\r\n\tprivate JSeparator separator;\r\n\tprivate JButton btnBook;\r\n\tprivate JScrollPane scrollPane;\r\n\tprivate JEditorPane editorPane;\r\n\r\n\t/**\r\n\t * Launch the application.\r\n\t */\r\n\tpublic static void main(String[] args) {\r\n\t\tEventQueue.invokeLater(new Runnable() {\r\n\t\t\tpublic void run() {\r\n\t\t\t\ttry {\r\n\t\t\t\t\tAbout frame = new About();\r\n\t\t\t\t\tframe.setVisible(true);\r\n\t\t\t\t} catch (Exception e) {\r\n\t\t\t\t\te.printStackTrace();\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t});\r\n\t}\r\n\r\n\t/**\r\n\t * Create the frame.\r\n\t */\r\n\tpublic About() {\r\n\t\tsetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\r\n\t\tsetBounds(100, 100, 543, 647);\r\n\t\tcontentPane = new JPanel();\r\n\t\tcontentPane.setVerifyInputWhenFocusTarget(false);\r\n\t\tcontentPane.setBackground(SystemColor.textHighlightText);\r\n\t\tcontentPane.setBorder(new LineBorder(Color.GREEN, 2));\r\n\t\tsetContentPane(contentPane);\r\n\t\tcontentPane.setLayout(null);\r\n\t\tcontentPane.add(getLblNewCustomerForm());\r\n\t\tcontentPane.add(getSeparator());\r\n\t\tcontentPane.add(getBtnBook());\r\n\t\tcontentPane.add(getScrollPane());\r\n\t}\r\n\tprivate JLabel getLblNewCustomerForm() {\r\n\t\tif (lblNewCustomerForm == null) {\r\n\t\t\tlblNewCustomerForm = new JLabel(\"Travel and Tourism Management System\");\r\n\t\t\tlblNewCustomerForm.setFont(new Font(\"Arial Black\", Font.BOLD, 20));\r\n\t\t\tlblNewCustomerForm.setBounds(32, 32, 481, 32);\r\n\t\t}\r\n\t\treturn lblNewCustomerForm;\r\n\t}\r\n\tprivate JSeparator getSeparator() {\r\n\t\tif (separator == null) {\r\n\t\t\tseparator = new JSeparator();\r\n\t\t\tseparator.setBounds(64, 74, 396, 24);\r\n\t\t}\r\n\t\treturn separator;\r\n\t}\r\n\tprivate JButton getBtnBook() {\r\n\t\tif (btnBook == null) {\r\n\t\t\tbtnBook = new JButton(\"Exit\");\r\n\t\t\tbtnBook.setBackground(Color.LIGHT_GRAY);\r\n\t\t\tbtnBook.setFont(new Font(\"Arial Black\", Font.BOLD, 20));\r\n\t\t\tbtnBook.setBounds(194, 540, 100, 38);\r\n\t\t}\r\n\t\treturn btnBook;\r\n\t}\r\n\tprivate JScrollPane getScrollPane() {\r\n\t\tif (scrollPane == null) {\r\n\t\t\tscrollPane = new JScrollPane();\r\n\t\t\tscrollPane.setBounds(20, 94, 484, 428);\r\n\t\t\tscrollPane.setViewportView(getEditorPane());\r\n\t\t}\r\n\t\treturn scrollPane;\r\n\t}\r\n\tprivate JEditorPane getEditorPane() {\r\n\t\tif (editorPane == null) {\r\n\t\t\teditorPane = new JEditorPane();\r\n\t\t}\r\n\t\treturn editorPane;\r\n\t}\r\n}\r\n");
		}
		return txtpnPackageViewImport;
	}
}
