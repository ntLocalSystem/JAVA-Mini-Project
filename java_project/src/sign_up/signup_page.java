package sign_up;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.sql.*;
import Login_P.Login_Page;
import main_page.main_p;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class signup_page {

	private JFrame frmVirInsuranceSignup;
	private JTextField usernametf;
	private JTextField emailtf;
	private JTextField mobilenotf;
	private JTextField passwordtf;
	int posX=0,posY=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup_page window = new signup_page();
					window.frmVirInsuranceSignup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signup_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVirInsuranceSignup = new JFrame();
		frmVirInsuranceSignup.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				mouseevent(evt);
			}
		});
		frmVirInsuranceSignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				frameevent(e);
			}
		});
		frmVirInsuranceSignup.setTitle("Vir Insurance SignUp");
		ImageIcon ic = new ImageIcon(Login_Page.class.getResource("/images/VIR INSURANCE.jpg"));
		frmVirInsuranceSignup.setIconImage(ic.getImage());
		frmVirInsuranceSignup.setUndecorated(true);
		frmVirInsuranceSignup.getContentPane().setForeground(Color.WHITE);
		frmVirInsuranceSignup.setBounds(100, 100, 805, 595);
		frmVirInsuranceSignup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVirInsuranceSignup.getContentPane().setLayout(null);
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 406, 635);
		panel.setBackground(Color.DARK_GRAY);
		frmVirInsuranceSignup.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(-48, 43, 485, 628);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(signup_page.class.getResource("/images/VIR INSURANCE.jpg")));
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setCursor(cur);
		btnNewButton.setBounds(429, 510, 353, 41);
		btnNewButton.setBackground(new Color(241,57,83));
		btnNewButton.addActionListener
		(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con ;
				PreparedStatement stmt;
				try {
				
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
					
					
					
					stmt = con.prepareStatement("insert into user values(?,?,?,?)");
					stmt.setString(1, usernametf.getText());
					stmt.setString(2,passwordtf.getText());
					stmt.setInt(3, Integer.parseInt(mobilenotf.getText()));
					stmt.setString(4, emailtf.getText());
					stmt.executeUpdate();
					frmVirInsuranceSignup.dispose();
					Login_Page.main(null);
					
					
					
					
			
				
				}
			
				catch(Exception except)
				{
					System.out.println(except);
				}
			
				
			}
		});
		frmVirInsuranceSignup.getContentPane().add(btnNewButton);
		
		usernametf = new JTextField();
		usernametf.setBounds(429, 71, 343, 32);
		frmVirInsuranceSignup.getContentPane().add(usernametf);
		usernametf.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(421, 127, 364, 2);
		frmVirInsuranceSignup.getContentPane().add(separator);
		
		JLabel lblUsername = new JLabel("USERNAME  :");
		lblUsername.setForeground(new Color(241,57,83));
		lblUsername.setBounds(428, 38, 90, 32);
		frmVirInsuranceSignup.getContentPane().add(lblUsername);
		
		emailtf = new JTextField();
		emailtf.setBounds(428, 185, 343, 32);
		emailtf.setColumns(10);
		frmVirInsuranceSignup.getContentPane().add(emailtf);
		
		JLabel lblEmail = new JLabel("EMAIL  :");
		lblEmail.setForeground(new Color(241,57,83));
		lblEmail.setBounds(428, 155, 90, 32);
		frmVirInsuranceSignup.getContentPane().add(lblEmail);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.DARK_GRAY);
		separator_1.setBounds(421, 242, 364, 2);
		frmVirInsuranceSignup.getContentPane().add(separator_1);
		
		JLabel lblPhoneNo = new JLabel("PHONE NO  :");
		lblPhoneNo.setForeground(new Color(241,57,83));
		lblPhoneNo.setBounds(428, 268, 90, 32);
		frmVirInsuranceSignup.getContentPane().add(lblPhoneNo);
		
		mobilenotf = new JTextField();
		mobilenotf.setBounds(429, 301, 343, 32);
		mobilenotf.setColumns(10);
		frmVirInsuranceSignup.getContentPane().add(mobilenotf);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.DARK_GRAY);
		separator_2.setBounds(421, 358, 364, 2);
		frmVirInsuranceSignup.getContentPane().add(separator_2);
		
		JLabel lblPassword = new JLabel("PASSWORD  :");
		lblPassword.setForeground(new Color(241,57,83));
		lblPassword.setBounds(428, 374, 90, 32);
		frmVirInsuranceSignup.getContentPane().add(lblPassword);
		
		passwordtf = new JTextField();
		passwordtf.setBounds(429, 406, 343, 32);
		passwordtf.setColumns(10);
		frmVirInsuranceSignup.getContentPane().add(passwordtf);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.DARK_GRAY);
		separator_3.setBounds(421, 464, 364, 2);
		frmVirInsuranceSignup.getContentPane().add(separator_3);
		
		JButton button = new JButton("---");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				
				frmVirInsuranceSignup.setState(JFrame.ICONIFIED);
				frmVirInsuranceSignup.revalidate();
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 19));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(674, 0, 61, 29);
		frmVirInsuranceSignup.getContentPane().add(button);
		
		JButton button_1 = new JButton("X");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				frmVirInsuranceSignup = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmVirInsuranceSignup, "Confirm if you want to exit","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(747, 0, 61, 29);
		frmVirInsuranceSignup.getContentPane().add(button_1);
		
		JLabel label = new JLabel("(8 Digit Number)");
		label.setForeground(new Color(241, 57, 83));
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label.setBounds(429, 333, 224, 20);
		frmVirInsuranceSignup.getContentPane().add(label);
	}
	
	public void frameevent(MouseEvent e)
	{
		frmVirInsuranceSignup.revalidate();
		posX=e.getX();
	    posY=e.getY();
	    frmVirInsuranceSignup.revalidate();
	}
	public void mouseevent(MouseEvent evt)
	{
		frmVirInsuranceSignup.revalidate();
		frmVirInsuranceSignup.setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
		
	}
}
