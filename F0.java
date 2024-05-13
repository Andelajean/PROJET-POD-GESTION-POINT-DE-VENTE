package gestion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class F0 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F0 frame = new F0();
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
	public F0() {
		getContentPane().setBackground(new Color(238, 238, 238));
		setBackground(new Color(192, 192, 192));
		setFont(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1344, 816);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setBounds(10, 11, 1263, 678);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(388, 182, 108, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1.setBounds(388, 287, 89, 30);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(627, 184, 454, 39);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get text from UserName
				//get text from password
			
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(959, 400, 122, 49);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(627, 278, 454, 39);
		panel.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(578, 53, 181, 39);
		panel.add(lblNewLabel_2);
	}
}
