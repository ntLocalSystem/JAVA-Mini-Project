package Login_P;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Color;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import sign_up.signup_page;
import java.sql.*;
import java.awt.CardLayout;
import main_page.main_p;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import main_page.main_p;

public class Login_Page {

	private JFrame loginframe;
	private JFrame frameloginsystem;
	private JTextField usernametf;
	private JPasswordField passwordtf;
	int posX=0,posY=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
					window.loginframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginframe = new JFrame();
		loginframe.setUndecorated(true);
		ImageIcon ic = new ImageIcon(Login_Page.class.getResource("/images/VIR INSURANCE.jpg"));
		loginframe.setIconImage(ic.getImage());
		loginframe.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				
				mouseevent(evt);
			}
		});
		loginframe.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				frameevent(e);
			}
		});
		loginframe.setTitle("Vir Insurance Login");
		loginframe.setBounds(200, 200, 722, 444);
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginframe.getContentPane().setLayout(null);
		
		
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		JPanel invalidpanel = new JPanel();
		invalidpanel.setBounds(376, 249, 327, 41);
		loginframe.getContentPane().add(invalidpanel);
		invalidpanel.setLayout(new CardLayout(0, 0));
		
		
		
		
		
		JPanel invalidsubpanel = new JPanel();
		invalidpanel.add(invalidsubpanel, "name_24017028179676");
		invalidsubpanel.setLayout(null);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Invalid Username or Password.");
		lblNewLabel_5.setForeground(new Color(241,57,83));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(0, 0, 327, 41);
		invalidsubpanel.add(lblNewLabel_5);
		
		JPanel redundantpanel = new JPanel();
		invalidpanel.add(redundantpanel, "name_27347377850323");
		
		
		
		invalidpanel.removeAll();
		
		JLabel lblNewLabel = new JLabel("Login ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(503, 13, 132, 31);
		loginframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(389, 81, 84, 16);
		loginframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(389, 139, 84, 16);
		loginframe.getContentPane().add(lblNewLabel_2);
		
		usernametf = new JTextField();
		usernametf.setBounds(503, 78, 201, 22);
		loginframe.getContentPane().add(usernametf);
		usernametf.setColumns(10);
		
		passwordtf = new JPasswordField();
		passwordtf.setBounds(503, 136, 201, 22);
		loginframe.getContentPane().add(passwordtf);
		

		
		
		loginframe.revalidate();
		
		JButton loginbtn = new JButton("Login");
		loginbtn.setForeground(Color.WHITE);
		loginbtn.setBackground(new Color(241,57,83));
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				
				Connection con ;
				PreparedStatement stmt;
				try {
				
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
					
					stmt = con.prepareStatement("select username , password from user where username = ? and password = ?");
					stmt.setString(1, usernametf.getText());
					stmt.setString(2,String.valueOf(passwordtf.getPassword()));
					ResultSet rs = stmt.executeQuery();
					if(rs.next())
					{
						main_p mp = new main_p();
						String s=usernametf.getText();
						mp.username1=s;
						mp.main(null);
						
						loginframe.dispose();
						
					}
					else
					{
						invalidpanel.add(invalidsubpanel);
						loginframe.revalidate();
						
					}
			
				
				}
			
				catch(Exception except)
				{
					System.out.println(except);
				}
			
				
			}
		});
		loginbtn.setBounds(376, 202, 153, 36);
		loginframe.getContentPane().add(loginbtn);
		
		JButton resetbtn = new JButton("Reset");
		resetbtn.setForeground(Color.WHITE);
		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				usernametf.setText(null);
				passwordtf.setText(null);
			}
		});
		resetbtn.setBounds(549, 202, 153, 36);
		resetbtn.setBackground(new Color(241,57,83));
		loginframe.getContentPane().add(resetbtn);
		
		JButton exitbtn = new JButton("Exit");
		exitbtn.setForeground(Color.WHITE);
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameloginsystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frameloginsystem, "Confirm if you want to exit","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		exitbtn.setBounds(551, 384, 153, 34);
		exitbtn.setBackground(new Color(241,57,83));
		loginframe.getContentPane().add(exitbtn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(49, 182, 1, 2);
		loginframe.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(69, 167, 1, 2);
		loginframe.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.DARK_GRAY);
		separator_2.setBounds(366, 182, 338, 2);
		loginframe.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.DARK_GRAY);
		separator_3.setBounds(366, 57, 338, 8);
		loginframe.getContentPane().add(separator_3);
		
		JButton signbtn = new JButton("Sign Up");
		signbtn.setForeground(Color.WHITE);
		signbtn.setBackground(new Color(241,57,83));
		signbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signup_page.main(null);
				loginframe.dispose();
				
				
			}
		});
		signbtn.setBounds(378, 383, 153, 36);
		loginframe.getContentPane().add(signbtn);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.DARK_GRAY);
		separator_4.setBounds(366, 309, 338, 2);
		loginframe.getContentPane().add(separator_4);
		
		JLabel lblNewLabel_3 = new JLabel("Don't have an account? SignUp!");
		lblNewLabel_3.setForeground(new Color(241,57,83));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(378, 327, 257, 22);
		loginframe.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(Color.DARK_GRAY);
		separator_5.setBounds(366, 362, 338, 2);
		loginframe.getContentPane().add(separator_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 354, 444);
		loginframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Login_Page.class.getResource("/images/VIR_INSURANCE_354x444.jpg")));
		lblNewLabel_4.setBounds(0, 0, 354, 444);
		panel.add(lblNewLabel_4);
		
		JButton button = new JButton("--");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				loginframe.revalidate();
				loginframe.setState(JFrame.ICONIFIED);
				
				
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 19));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(607, 0, 54, 22);
		loginframe.getContentPane().add(button);
		
		JButton button_1 = new JButton("X");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginframe = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(loginframe, "Confirm if you want to exit","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					loginframe.revalidate();
					System.exit(0);
				}
				
			}
		});
		
		loginbtn.setCursor(cur);
		signbtn.setCursor(cur);
		resetbtn.setCursor(cur);
		exitbtn.setCursor(cur);
		button_1.setCursor(cur);
		button.setCursor(cur);
		
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(672, 0, 54, 21);
		loginframe.getContentPane().add(button_1);
		
	}
	
	public void frameevent(MouseEvent e)
	{
		loginframe.revalidate();
		posX=e.getX();
	    posY=e.getY();
	    loginframe.revalidate();
	}
	public void mouseevent(MouseEvent evt)
	{
		loginframe.revalidate();
		loginframe.setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
		
	}
	
}
