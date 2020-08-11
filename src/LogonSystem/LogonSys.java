package LogonSystem;
/*
 * Author: John Patrick
 * Date: 8.11.20
 * This is a simple program for user to use login screen to access Traveling Ticket application
 * 
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

import Travelling_Ticket.Travelling;

public class LogonSys {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public LogonSys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Screen");
		frame.getContentPane().setLayout(null);

		JLabel lblLogonSystem = new JLabel("Logon System");
		lblLogonSystem.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLogonSystem.setBounds(245, 34, 185, 31);
		frame.getContentPane().add(lblLogonSystem);

		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsername.setBounds(88, 122, 142, 31);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(88, 191, 117, 20);
		frame.getContentPane().add(lblPassword);

		textField = new JTextField();
		textField.setBounds(206, 126, 224, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(206, 190, 224, 26);
		frame.getContentPane().add(passwordField);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String password = passwordField.getText();
				String username = textField.getText();

				if(password.contains("king") && username.contains("one")) {
					passwordField.setText(null);
					textField.setText(null);

					//call travelling app
					// launch travelling app main class within Logon system
					Travelling info = new Travelling();
					Travelling.main(null);

				}
				else
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);

			}
		});
		btnLogin.setBackground(UIManager.getColor("Button.background"));
		btnLogin.setForeground(UIManager.getColor("Button.foreground"));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnLogin.setBounds(99, 363, 193, 29);
		frame.getContentPane().add(btnLogin);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnReset.setBounds(307, 363, 159, 29);
		frame.getContentPane().add(btnReset);

		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Login System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnQuit.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnQuit.setBounds(492, 363, 142, 29);
		frame.getContentPane().add(btnQuit);

		JSeparator separator = new JSeparator();
		separator.setBounds(29, 323, 650, 2);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(33, 78, 646, 2);
		frame.getContentPane().add(separator_1);
		frame.setBounds(300, 300, 750, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogonSys window = new LogonSys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
