package main_page;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import Login_P.Login_Page;
import net.proteanit.sql.DbUtils;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.sql.*;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;



public class main_p {
	
	public String username1="";
	private JFrame frame;
	private JFrame frameexit;
	private JTable table_1;
	private JTextField nametf;
	private JTextField worketf;
	private JTextField mobiletf;
	private JTextField emailtf;
	private JTable table;
	private JTable table_2;
	private JTable table_3;
	private JTextField aidtf;
	private JTable table_4;
	int genderval=0;
	int cgenderval=0;
	int posX=0,posY=0;
	int insuranceval=0;
	int insuranceval1=0;
	private JTextField cnametf;
	private JTextField cmobtf;
	private JTextField csalarytf;
	private JTextField caidtf;
	private JTable tinsurancetable;
	private JTable cinsurancetable;
	private JTable winsurancetable;
	private JTextField ccidtf;
	private JTable custdetailstb;
	private JTextField ustf;
	private JTextField user2tf;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_p window = new main_p();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main_p() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frameevent(e);
			}
		});
		
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				
				mouseevent(evt);
				
			}
		});
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 1650, 1000);
		ImageIcon ic = new ImageIcon(Login_Page.class.getResource("/images/VIR INSURANCE.jpg"));
		frame.setIconImage(ic.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		//frame.setResizable(false);
		
		/*
		String[] dayarr = new String[31];
		int i;

        for (i = 1; i < 32; i++) {
            dayarr[i - 1] = Integer.toString(i);
        }
        
        String monarr[] = new String[12];
        for (i = 1; i < 13; i++) {
            monarr[i - 1] = Integer.toString(i);
        }
        
        String yeararr[] = new String[100];
        int j,k;
        for (j= 1940, k = 0; j < 2018; j++, k++) {
            yeararr[k] = Integer.toString(j);

        }
		
		*/
		
		CardLayout cl5 = new CardLayout(0,0);
		
		
		CardLayout cl4 =  new CardLayout(0,0);
		
		String[] dayarr = new String[31];

        for (int i = 1; i < 32; i++) {
            dayarr[i - 1] = Integer.toString(i);
        }
        
        String monarr[] = new String[12];
        for (int i = 1; i < 13; i++) {
            monarr[i - 1] = Integer.toString(i);
        }
        
        String yeararr[] = new String[178];
        
        for (int j = 1940, k = 0; j < 2019; j++, k++) {
            yeararr[k] = Integer.toString(j);

        }
        
        ButtonGroup btngrp1 = new ButtonGroup();
		
		ImageIcon icon11 = new ImageIcon("/java_project/src/images/VIR INSURANCE_cropped.jpg");
        frame.setIconImage(icon11.getImage());
		
		
		ButtonGroup btngrp  = new ButtonGroup();
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1650, 188);
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(main_p.class.getResource("/images/VIR INSURANCE.jpg")));
		lblNewLabel.setBounds(0, 0, 518, 188);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("resiz");
		lblNewLabel_2.setIcon(new ImageIcon(main_p.class.getResource("/images/security_agent_add_2_190x142.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(501, 0, 178, 142);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add Agent");
		btnNewButton.setCursor(cur);
		btnNewButton.setBackground(new Color(241, 57, 83));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(501, 142, 178, 46);
		panel.add(btnNewButton);
		
		JLabel label_10 = new JLabel("resiz");
		label_10.setIcon(new ImageIcon(main_p.class.getResource("/images/Online_Agent_New_190x142.jpg")));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(701, 0, 178, 142);
		panel.add(label_10);
		
		JButton btnViewagent = new JButton("View Agents");
		btnViewagent.setCursor(cur);
		btnViewagent.setForeground(Color.WHITE);
		btnViewagent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnViewagent.setBackground(new Color(241, 57, 83));
		btnViewagent.setBounds(701, 142, 178, 46);
		panel.add(btnViewagent);
		
		JPanel grandfatherpanel = new JPanel();
		grandfatherpanel.setBounds(0, 189, 1632, 764);
		frame.getContentPane().add(grandfatherpanel);
		CardLayout cl = new CardLayout(0, 0);
		grandfatherpanel.setLayout(cl);
		
		JPanel viewagentpanel = new JPanel();
		grandfatherpanel.add(viewagentpanel, "name_19239332734906");
		viewagentpanel.setLayout(null);
		
		JLabel lblagentDetails = new JLabel("<html><u>Agent Details <u><html>");
		lblagentDetails.setBounds(490, 22, 652, 72);
		lblagentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblagentDetails.setForeground(new Color(241, 57, 83));
		lblagentDetails.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblagentDetails.setBackground(Color.WHITE);
		viewagentpanel.add(lblagentDetails);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 165, 1480, 556);
		viewagentpanel.add(scrollPane);
		
		table_4 = new JTable();
		table_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(241, 57, 83), null));
		table_4.setRowHeight(50);
		scrollPane.setViewportView(table_4);
		
		JButton tablerefreshbtn = new JButton("Load Agent Details");
		tablerefreshbtn.setCursor(cur);
		tablerefreshbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		tablerefreshbtn.setBackground(new Color(241, 57, 83));
		tablerefreshbtn.setForeground(Color.WHITE);
		tablerefreshbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event1) {
				try {
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
						
						String tablepopulate = "select a.*,e.ins_id,e.type from agent a left join insurance e on a.ins_id=e.ins_id";
						PreparedStatement stmt = con.prepareStatement(tablepopulate);
						ResultSet rs  = stmt.executeQuery();
						table_4.setModel(DbUtils.resultSetToTableModel(rs));
						viewagentpanel.revalidate();
						
				
					}
				
				catch(Exception except){
					
						System.out.println(except);
					
					}
				
				
				
				}
			
				
				
			}
		);
		tablerefreshbtn.setBounds(1287, 93, 277, 48);
		viewagentpanel.add(tablerefreshbtn);
		
		JPanel addagentpanel = new JPanel();
		addagentpanel.setForeground(new Color(241, 57, 83));
		grandfatherpanel.add(addagentpanel, "name_19239371696803");
		addagentpanel.setLayout(null);
		
		JLabel label = new JLabel("<html><u>Agent Details & Policies Sold<u><html>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(241, 57, 83));
		label.setFont(new Font("Tahoma", Font.BOLD, 45));
		label.setBackground(Color.WHITE);
		label.setBounds(488, 13, 664, 98);
		addagentpanel.add(label);
		
		JLabel label_1 = new JLabel("Name :");
		label_1.setForeground(new Color(241, 57, 83));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setBounds(41, 129, 194, 41);
		addagentpanel.add(label_1);
		
		nametf = new JTextField();
		nametf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nametf.setColumns(10);
		nametf.setBounds(41, 169, 319, 41);
		addagentpanel.add(nametf);
		
		JLabel label_2 = new JLabel("Gender :");
		label_2.setForeground(new Color(241, 57, 83));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_2.setBounds(41, 221, 194, 41);
		addagentpanel.add(label_2);
		
		JLabel label_3 = new JLabel("Date Of Birth :");
		label_3.setForeground(new Color(241, 57, 83));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_3.setBounds(41, 317, 194, 41);
		addagentpanel.add(label_3);
		
		JLabel label_4 = new JLabel("Address :");
		label_4.setForeground(new Color(241, 57, 83));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_4.setBounds(41, 421, 194, 41);
		addagentpanel.add(label_4);
		
		JRadioButton malerd = new JRadioButton("Male");
		malerd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent malerdevent) {
				malerdbtn();
				
				
			}
		});
		malerd.setForeground(Color.DARK_GRAY);
		malerd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		malerd.setBounds(41, 269, 142, 41);
		btngrp.add(malerd);
		addagentpanel.add(malerd);
		
		JRadioButton femalerd = new JRadioButton("Female");
		femalerd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent femaleevent) {
				femalerdbtn();
			}
		});
		femalerd.setForeground(Color.DARK_GRAY);
		femalerd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		femalerd.setBounds(206, 269, 142, 41);
		addagentpanel.add(femalerd);
		btngrp.add(femalerd);
		
		JComboBox datecb = new JComboBox(dayarr);
		datecb.setBounds(41, 369, 70, 41);
		addagentpanel.add(datecb);
		
		JComboBox monthcb = new JComboBox(monarr);
		monthcb.setBounds(137, 369, 70, 41);
		addagentpanel.add(monthcb);
		
		JComboBox yearcb = new JComboBox(yeararr);
		yearcb.setBounds(231, 369, 103, 41);
		addagentpanel.add(yearcb);
		
		JTextArea addressta = new JTextArea();
		addressta.setFont(new Font("Monospaced", Font.PLAIN, 17));
		addressta.setBounds(41, 464, 319, 165);
		addagentpanel.add(addressta);
		
		JLabel label_5 = new JLabel("Work Experience (Yrs) :");
		label_5.setForeground(new Color(241, 57, 83));
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_5.setBounds(41, 648, 295, 41);
		addagentpanel.add(label_5);
		
		worketf = new JTextField();
		worketf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		worketf.setColumns(10);
		worketf.setBounds(41, 688, 319, 41);
		addagentpanel.add(worketf);
		
		JLabel lblTelephone = new JLabel("Telephone :");
		lblTelephone.setForeground(new Color(241, 57, 83));
		lblTelephone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTelephone.setBounds(488, 252, 194, 41);
		addagentpanel.add(lblTelephone);
		
		mobiletf = new JTextField();
		mobiletf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		mobiletf.setColumns(10);
		mobiletf.setBounds(488, 291, 319, 41);
		addagentpanel.add(mobiletf);
		
		JLabel label_7 = new JLabel("Email :");
		label_7.setForeground(new Color(241, 57, 83));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_7.setBounds(488, 374, 194, 41);
		addagentpanel.add(label_7);
		
		emailtf = new JTextField();
		emailtf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		emailtf.setColumns(10);
		emailtf.setBounds(488, 412, 319, 41);
		addagentpanel.add(emailtf);
		
		JLabel label_8 = new JLabel("Policy Details");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(241, 57, 83));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 35));
		label_8.setBounds(1015, 99, 310, 53);
		addagentpanel.add(label_8);
		
		JPanel insurancespanel = new JPanel();
		insurancespanel.setLayout(null);
		insurancespanel.setForeground(Color.WHITE);
		insurancespanel.setBounds(890, 169, 231, 198);
		addagentpanel.add(insurancespanel);
		
		
	
		
		JButton button_1 = new JButton("Child Plan Insurance");
		button_1.setCursor(cur);
		
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBackground(new Color(241, 57, 83));
		button_1.setBounds(0, 79, 231, 42);
		insurancespanel.add(button_1);
		
		JButton button_2 = new JButton("Whole Life Insurance");
		button_2.setCursor(cur);
		
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.setBackground(new Color(241, 57, 83));
		button_2.setBounds(0, 156, 231, 42);
		insurancespanel.add(button_2);
		
		JButton btnTermLifeInsurance = new JButton("Term Life Insurance");
		btnTermLifeInsurance.setCursor(cur);
		
		btnTermLifeInsurance.setForeground(Color.WHITE);
		btnTermLifeInsurance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTermLifeInsurance.setBackground(new Color(241, 57, 83));
		btnTermLifeInsurance.setBounds(0, 0, 231, 42);
		insurancespanel.add(btnTermLifeInsurance);
		
		JPanel parentpanel = new JPanel();
		parentpanel.setBorder(new EtchedBorder(EtchedBorder.RAISED, (new Color(241,57,83)), null));
		parentpanel.setBounds(1150, 170, 434, 480);
		addagentpanel.add(parentpanel);
		CardLayout cl3 = new CardLayout(0,0);
		parentpanel.setLayout(cl3);
		
		JPanel lifelinsurancepanel = new JPanel();
		parentpanel.add(lifelinsurancepanel, "name_131091957135037");
		lifelinsurancepanel.setLayout(null);
		
		
		JLabel lblWholeLife = new JLabel("* Whole Life Insurance is selected.");
		lblWholeLife.setForeground(new Color(241, 57, 83));
		lblWholeLife.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWholeLife.setBackground(Color.WHITE);
		lblWholeLife.setBounds(0, 420, 430, 56);
		lifelinsurancepanel.add(lblWholeLife);
		
		
		
		JPanel childinsurancepanel = new JPanel();
		parentpanel.add(childinsurancepanel, "name_130839478752224");
		childinsurancepanel.setLayout(null);
		
		
		
		JPanel terminsurancepanel = new JPanel();
		parentpanel.add(terminsurancepanel, "name_130515214938554");
		terminsurancepanel.setLayout(null);
		
		JPanel redundantpanel2 = new JPanel();
		parentpanel.add(redundantpanel2, "name_63847240216221");
		
		cl3.show(parentpanel, "name_63847240216221");
		
		
		JComboBox datecb1 = new JComboBox(dayarr);
		datecb1.setBounds(488, 516, 70, 41);
		addagentpanel.add(datecb1);
		
		JComboBox monthcb1 = new JComboBox(monarr);
		monthcb1.setBounds(585, 516, 70, 41);
		addagentpanel.add(monthcb1);
		
		JComboBox yearcb1 = new JComboBox(yeararr);
		yearcb1.setBounds(680, 516, 103, 41);
		addagentpanel.add(yearcb1);
		
		JLabel label_9 = new JLabel("Date Of Joining :");
		label_9.setForeground(new Color(241, 57, 83));
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_9.setBounds(488, 464, 194, 41);
		addagentpanel.add(label_9);
		
		
		
		String column[]={"AGE","TERM","SUM ASSURESD","PREMIMUM"};  
		String data[][]={{"AGE","TERM","SUM ASSURESD","PREMIMUM"}, {"25 Years","40 Years","Rs . 1 Cr."," Rs . 10,500"},    
                {"35 Years","30 Years","Rs . 25 Lakhs","Rs . 8,800"}}; 
		
		String column1[]={"TERM","SUM ASSURED","PREMIUM"};  
		String data1[][]={{"TERM","SUM ASSURED","PREMIUM"}, {"20 Years","Rs.3 Lakhs","Rs.10,000"},    
                {"35 Years","Rs.4 Lakhs","Rs.18,000"}}; 
		
		String column2[]={"TERM","SUM ASSURED","PREMIUM"};  
		String data2[][]={{"TERM","SUM ASSURED","PREMIUM"}, {"20 Years","Rs.18 Lakhs","Rs.1 Lakh"},    
                {"35 Years","Rs.40 Lakhs","Rs.4 Lakhs"}};
		
		

		table_3 = new JTable();
		table_3.setRowHeight(210);
		table_3.setBounds(0, 0, 430, 420);
		lifelinsurancepanel.add(table_3);
		
		table = new JTable();
		table.setBounds(0, 0, 430, 420);
		table.setRowHeight(210);
		terminsurancepanel.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("* Term Life Insurance is selected.");
		lblNewLabel_1.setForeground(new Color(241, 57, 83));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 420, 430, 56);
		terminsurancepanel.add(lblNewLabel_1);
		
		table_2 = new JTable();
		table_2.setBounds(0, 0, 430, 420);
		table_2.setRowHeight(210);
		childinsurancepanel.add(table_2);
		
		JLabel lblChildPlan = new JLabel("* Child Plan Insurance is selected.");
		lblChildPlan.setForeground(new Color(241, 57, 83));
		lblChildPlan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChildPlan.setBackground(Color.WHITE);
		lblChildPlan.setBounds(0, 420, 430, 56);
		childinsurancepanel.add(lblChildPlan);
		
		
		
		JLabel lblAgentId = new JLabel("Agent ID :");
		lblAgentId.setForeground(new Color(241, 57, 83));
		lblAgentId.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAgentId.setBounds(488, 568, 194, 41);
		addagentpanel.add(lblAgentId);
		
		aidtf = new JTextField();
		aidtf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		aidtf.setColumns(10);
		aidtf.setBounds(488, 620, 319, 41);
		addagentpanel.add(aidtf);
		
		JButton submitbtn = new JButton("SUBMIT");
		submitbtn.setCursor(cur);
		
		submitbtn.setForeground(Color.WHITE);
		submitbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		submitbtn.setBackground(new Color(241, 57, 83));
		submitbtn.setBounds(532, 687, 231, 42);
		addagentpanel.add(submitbtn);
		
		CardLayout cl2 =  new CardLayout(0, 0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(890, 687, 461, 53);
		addagentpanel.add(panel_1);
		panel_1.setLayout(cl2);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, "name_11001346500172");
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("* Agent details have been submitted.");
		lblNewLabel_3.setForeground(new Color(241, 57, 83));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(0, 0, 451, 53);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, "name_11082648641670");
		
		cl2.show(panel_1, "name_11082648641670");
		
		JLabel warninglabel = new JLabel("(8 Digit Number)");
		warninglabel.setForeground(new Color(241, 57, 83));
		warninglabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		warninglabel.setBounds(488, 336, 224, 20);
		addagentpanel.add(warninglabel);
		ButtonGroup bg3 = new ButtonGroup();
		CardLayout cl9 = new CardLayout();
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.setBounds(890, 415, 231, 218);
		addagentpanel.add(buttonpanel);
		buttonpanel.setLayout(cl9);
		
		JPanel cibtnpanel = new JPanel();
		buttonpanel.add(cibtnpanel, "name_94240132484303");
		cibtnpanel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("4215");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c4215();
			}
		});
		bg3.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		rdbtnNewRadioButton.setForeground(new Color(241, 57, 83));
		rdbtnNewRadioButton.setBounds(65, 29, 147, 23);
		cibtnpanel.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("4210");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c4210();
			}
		});
		bg3.add(radioButton);
		radioButton.setForeground(new Color(241, 57, 83));
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		radioButton.setBounds(65, 129, 147, 23);
		cibtnpanel.add(radioButton);
		
		JPanel tibtnpanel = new JPanel();
		buttonpanel.add(tibtnpanel, "name_94280454630953");
		tibtnpanel.setLayout(null);
		
		JRadioButton radioButton_1 = new JRadioButton("3215");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t3215();
			}
		});
		radioButton_1.setForeground(new Color(241, 57, 83));
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		radioButton_1.setBounds(57, 46, 147, 23);
		tibtnpanel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3210");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t3210();
			}
		});
		bg3.add(radioButton_2);
		bg3.add(radioButton_1);
		radioButton_2.setForeground(new Color(241, 57, 83));
		radioButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		radioButton_2.setBounds(57, 140, 147, 23);
		tibtnpanel.add(radioButton_2);
		
		JPanel libtnpanel = new JPanel();
		buttonpanel.add(libtnpanel, "name_94295818881193");
		libtnpanel.setLayout(null);
		
		JRadioButton radioButton_3 = new JRadioButton("5215");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w5215();
			}
		});
		radioButton_3.setForeground(new Color(241, 57, 83));
		radioButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		radioButton_3.setBounds(65, 50, 147, 23);
		libtnpanel.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5210");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w5210();
			}
		});
		bg3.add(radioButton_3);
		bg3.add(radioButton_4);
		radioButton_4.setForeground(new Color(241, 57, 83));
		radioButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		radioButton_4.setBounds(65, 137, 147, 23);
		libtnpanel.add(radioButton_4);
		
		
		
		JPanel redbtnpanel = new JPanel();
		buttonpanel.add(redbtnpanel, "name_94645291133835");
		
		cl9.show(buttonpanel, "name_94645291133835");
		
		JLabel lblUsernameOfUser = new JLabel("Username Of User :");
		lblUsernameOfUser.setForeground(new Color(241, 57, 83));
		lblUsernameOfUser.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblUsernameOfUser.setBounds(488, 146, 256, 41);
		addagentpanel.add(lblUsernameOfUser);
		
		ustf = new JTextField();
		ustf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ustf.setColumns(10);
		ustf.setBounds(488, 186, 319, 41);
		addagentpanel.add(ustf);
		
		JPanel redundantpanel = new JPanel();
		grandfatherpanel.add(redundantpanel, "name_19239387057142");
		
		JPanel addcustomerpanel = new JPanel();
		addcustomerpanel.setForeground(Color.WHITE);
		grandfatherpanel.add(addcustomerpanel, "name_19239433071790");
		addcustomerpanel.setLayout(null);
		
		JLabel label_11 = new JLabel("Name :");
		label_11.setForeground(new Color(241, 57, 83));
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_11.setBounds(34, 206, 194, 41);
		addcustomerpanel.add(label_11);
		
		JLabel lblcustomerDetails = new JLabel("<html><u>Customer Details<u><html>");
		lblcustomerDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblcustomerDetails.setForeground(new Color(241, 57, 83));
		lblcustomerDetails.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblcustomerDetails.setBackground(Color.WHITE);
		lblcustomerDetails.setBounds(532, 0, 664, 98);
		addcustomerpanel.add(lblcustomerDetails);
		
		cnametf = new JTextField();
		cnametf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cnametf.setColumns(10);
		cnametf.setBounds(34, 249, 319, 41);
		addcustomerpanel.add(cnametf);
		
		JLabel label_12 = new JLabel("Gender :");
		label_12.setForeground(new Color(241, 57, 83));
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_12.setBounds(34, 314, 194, 41);
		addcustomerpanel.add(label_12);
		
		JRadioButton malerdbtn1 = new JRadioButton("Male");
		malerdbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent maleactionc) {
				malerdbtn1();
			}
		});
		malerdbtn1.setForeground(Color.DARK_GRAY);
		malerdbtn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		malerdbtn1.setBounds(34, 348, 142, 41);
		addcustomerpanel.add(malerdbtn1);
		
		JRadioButton femalerdbtn1 = new JRadioButton("Female");
		femalerdbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent femaleaction1) {
				
				femalerdbtn1();
			}
		});
		femalerdbtn1.setForeground(Color.DARK_GRAY);
		femalerdbtn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		femalerdbtn1.setBounds(195, 348, 142, 41);
		addcustomerpanel.add(femalerdbtn1);
		
		btngrp1.add(malerdbtn1);
		btngrp1.add(femalerdbtn1);
		
		JLabel label_13 = new JLabel("Date Of Birth :");
		label_13.setForeground(new Color(241, 57, 83));
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_13.setBounds(34, 390, 194, 41);
		addcustomerpanel.add(label_13);
		
		JComboBox cdatecb = new JComboBox(dayarr);
		cdatecb.setBounds(34, 444, 70, 41);
		addcustomerpanel.add(cdatecb);
		
		JComboBox cmonthcb = new JComboBox(monarr);
		cmonthcb.setBounds(131, 444, 70, 41);
		addcustomerpanel.add(cmonthcb);
		
		JComboBox cyearcb = new JComboBox(yeararr);
		cyearcb.setBounds(222, 444, 103, 41);
		addcustomerpanel.add(cyearcb);
		
		JLabel label_14 = new JLabel("Address :");
		label_14.setForeground(new Color(241, 57, 83));
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_14.setBounds(34, 498, 194, 41);
		addcustomerpanel.add(label_14);
		
		JTextArea caddressta = new JTextArea();
		caddressta.setFont(new Font("Monospaced", Font.PLAIN, 17));
		caddressta.setBounds(34, 537, 319, 165);
		addcustomerpanel.add(caddressta);
		
		JLabel label_15 = new JLabel("Telephone :");
		label_15.setForeground(new Color(241, 57, 83));
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_15.setBounds(438, 113, 194, 41);
		addcustomerpanel.add(label_15);
		
		cmobtf = new JTextField();
		cmobtf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cmobtf.setColumns(10);
		cmobtf.setBounds(438, 152, 319, 41);
		addcustomerpanel.add(cmobtf);
		
		JLabel lblSalary = new JLabel("Salary :");
		lblSalary.setForeground(new Color(241, 57, 83));
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSalary.setBounds(438, 206, 194, 41);
		addcustomerpanel.add(lblSalary);
		
		csalarytf = new JTextField();
		csalarytf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		csalarytf.setColumns(10);
		csalarytf.setBounds(438, 249, 319, 41);
		addcustomerpanel.add(csalarytf);
		
		JLabel lblEnterYourAgent = new JLabel("Enter Your Agent ID For Insurance:");
		lblEnterYourAgent.setForeground(new Color(241, 57, 83));
		lblEnterYourAgent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterYourAgent.setBounds(438, 441, 319, 41);
		addcustomerpanel.add(lblEnterYourAgent);
		
		caidtf = new JTextField();
		caidtf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		caidtf.setColumns(10);
		caidtf.setBounds(438, 501, 319, 41);
		addcustomerpanel.add(caidtf);
		
		JButton btnCheckInsurance = new JButton("Check Insurance");
		btnCheckInsurance.setCursor(cur);
		
		btnCheckInsurance.setForeground(Color.WHITE);
		btnCheckInsurance.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCheckInsurance.setBackground(new Color(241, 57, 83));
		btnCheckInsurance.setBounds(438, 595, 319, 55);
		addcustomerpanel.add(btnCheckInsurance);
		
		JPanel parentpanelc = new JPanel();
		parentpanelc.setBorder(new EtchedBorder(EtchedBorder.RAISED, (new Color(241,57,83)), null));
		parentpanelc.setBounds(897, 152, 689, 540);
		addcustomerpanel.add(parentpanelc);
		parentpanelc.setLayout(cl4);
		
		JPanel tinsurancepanel = new JPanel();
		parentpanelc.add(tinsurancepanel, "name_73735057972235");
		tinsurancepanel.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 685, 466);
		tinsurancepanel.add(scrollPane_3);
		
		tinsurancetable = new JTable();
		scrollPane_3.setViewportView(tinsurancetable);
		
		JLabel tinsurancelabel = new JLabel("* Term Insurance has been selected.");
		tinsurancelabel.setHorizontalAlignment(SwingConstants.CENTER);
		tinsurancelabel.setForeground(new Color(241,57,83));
		tinsurancelabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		tinsurancelabel.setBounds(0, 466, 685, 70);
		tinsurancepanel.add(tinsurancelabel);
		
		JPanel cinsurancepanel = new JPanel();
		parentpanelc.add(cinsurancepanel, "name_73791843709339");
		cinsurancepanel.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 685, 466);
		cinsurancepanel.add(scrollPane_2);
		
		cinsurancetable = new JTable();
		scrollPane_2.setViewportView(cinsurancetable);
		
		JLabel cinsurancelabel = new JLabel("* Child Plan Insurance has been selected.");
		cinsurancelabel.setHorizontalAlignment(SwingConstants.CENTER);
		cinsurancelabel.setForeground(new Color(241,57,83));
		cinsurancelabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		cinsurancelabel.setBounds(0, 466, 685, 70);
		cinsurancepanel.add(cinsurancelabel);
		
		JPanel winsurancepanel = new JPanel();
		parentpanelc.add(winsurancepanel, "name_73812949494419");
		winsurancepanel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 685, 466);
		winsurancepanel.add(scrollPane_1);
		
		winsurancetable = new JTable();
		scrollPane_1.setViewportView(winsurancetable);
		
		JLabel lblWholeLife_1 = new JLabel("* Whole Life Insurance has been selected.");
		lblWholeLife_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWholeLife_1.setForeground(new Color(241,57,83));
		lblWholeLife_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblWholeLife_1.setBounds(0, 466, 685, 70);
		winsurancepanel.add(lblWholeLife_1);
		
		JPanel credundantpanel = new JPanel();
		parentpanelc.add(credundantpanel, "name_73862456257256");
		
		
		
		
		
		cl4.show(parentpanelc,"name_73862456257256");
		
		JButton btnSubmitDetails = new JButton("Submit Details");
		btnSubmitDetails.setCursor(cur);
		
		btnSubmitDetails.setForeground(Color.WHITE);
		btnSubmitDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmitDetails.setBackground(new Color(241, 57, 83));
		btnSubmitDetails.setBounds(438, 670, 319, 55);
		addcustomerpanel.add(btnSubmitDetails);
		
		JLabel lblCustomerId = new JLabel("Customer ID :");
		lblCustomerId.setForeground(new Color(241, 57, 83));
		lblCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCustomerId.setBounds(34, 113, 194, 41);
		addcustomerpanel.add(lblCustomerId);
		
		ccidtf = new JTextField();
		ccidtf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ccidtf.setColumns(10);
		ccidtf.setBounds(34, 152, 319, 41);
		addcustomerpanel.add(ccidtf);
		
		JPanel messagedisplaypanel = new JPanel();
		messagedisplaypanel.setBounds(897, 706, 508, 31);
		addcustomerpanel.add(messagedisplaypanel);
		messagedisplaypanel.setLayout(cl5);
		
		JPanel messagedisplay = new JPanel();
		messagedisplaypanel.add(messagedisplay, "name_4659622588556");
		messagedisplay.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("* Details have been submitted.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setForeground(new Color(241, 57, 83));
		lblNewLabel_4.setBounds(0, 0, 508, 29);
		messagedisplay.add(lblNewLabel_4);
		
		JPanel messageredundantpanel = new JPanel();
		messagedisplaypanel.add(messageredundantpanel, "name_4667681966752");
		
		cl5.show(messagedisplaypanel, "name_4667681966752");
		
		user2tf = new JTextField();
		user2tf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		user2tf.setColumns(10);
		user2tf.setBounds(438, 368, 319, 41);
		addcustomerpanel.add(user2tf);
		
		JLabel user1tf = new JLabel("Username Of User :");
		user1tf.setForeground(new Color(241, 57, 83));
		user1tf.setFont(new Font("Tahoma", Font.PLAIN, 25));
		user1tf.setBounds(438, 314, 256, 41);
		addcustomerpanel.add(user1tf);
		
		
		
		
		
		
		cl.show(grandfatherpanel,"name_19239387057142");
		
		JPanel viewcustomerpanel = new JPanel();
		grandfatherpanel.add(viewcustomerpanel, "name_7105952272002");
		viewcustomerpanel.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(26, 150, 1575, 585);
		viewcustomerpanel.add(scrollPane_4);
		
		custdetailstb = new JTable();
		custdetailstb.setRowHeight(50);
		scrollPane_4.setViewportView(custdetailstb);
		custdetailstb.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(241, 57, 83), null));
		
		JLabel lblviewCustomerDetails = new JLabel("<html><u>View Customer Details<u><html>");
		lblviewCustomerDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblviewCustomerDetails.setForeground(new Color(241, 57, 83));
		lblviewCustomerDetails.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblviewCustomerDetails.setBackground(Color.WHITE);
		lblviewCustomerDetails.setBounds(481, 0, 664, 98);
		viewcustomerpanel.add(lblviewCustomerDetails);
		
		JButton btnLoadCustomerDetails = new JButton("Load Customer Details");
		btnLoadCustomerDetails.setCursor(cur);
		btnLoadCustomerDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent loadcustdetails) {
				
				
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
					
					String ctablepopulate = "select a.*,e.* from customer a left join buys e on a.cust_id=e.cust_id";
					PreparedStatement stmt = con.prepareStatement(ctablepopulate);
					ResultSet rs  = stmt.executeQuery();
					custdetailstb.setModel(DbUtils.resultSetToTableModel(rs));
					viewcustomerpanel.revalidate();
					frame.revalidate();
					
			
				}
			
			catch(Exception except){
				
					System.out.println(except);
				
				}
				
				
			}
		});
		btnLoadCustomerDetails.setForeground(Color.WHITE);
		btnLoadCustomerDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLoadCustomerDetails.setBackground(new Color(241, 57, 83));
		btnLoadCustomerDetails.setBounds(1271, 85, 277, 48);
		viewcustomerpanel.add(btnLoadCustomerDetails);
		
		JPanel contactuspanel = new JPanel();
		grandfatherpanel.add(contactuspanel, "name_38683474436453");
		contactuspanel.setLayout(null);
		
		JLabel lblcontactUss = new JLabel("<html><u>Contact Us<u><html>");
		lblcontactUss.setHorizontalAlignment(SwingConstants.CENTER);
		lblcontactUss.setForeground(new Color(241, 57, 83));
		lblcontactUss.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblcontactUss.setBackground(Color.WHITE);
		lblcontactUss.setBounds(497, 0, 664, 98);
		contactuspanel.add(lblcontactUss);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebpage("http://www.gmail.com");
				grandfatherpanel.revalidate();
				frame.revalidate();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(main_p.class.getResource("/images/2000px-New_Logo_Gmail.svg_99x87.png")));
		btnNewButton_2.setBounds(74, 119, 105, 87);
		contactuspanel.add(btnNewButton_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebpage("http://www.twitter.com");
				grandfatherpanel.revalidate();
				frame.revalidate();
			}
		});
		button_3.setBackground(Color.WHITE);
		button_3.setIcon(new ImageIcon(main_p.class.getResource("/images/dezeen_twitter-bird_99x87.gif")));
		button_3.setBounds(74, 255, 105, 87);
		contactuspanel.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebpage("http://www.facebook.com");
				grandfatherpanel.revalidate();
				frame.revalidate();
			}
		});
		button_4.setIcon(new ImageIcon(main_p.class.getResource("/images/flogo_rgb_hex-brc-site-250_99x87.png")));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(74, 386, 105, 87);
		contactuspanel.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebpage("http://www.shahandanchor.com/home/");
				grandfatherpanel.revalidate();
				frame.revalidate();
				
			}
		});
		button_5.setIcon(new ImageIcon(main_p.class.getResource("/images/Shah-And-Anchor-Kutchhi-Engineering-College_99x87.jpg")));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(74, 513, 105, 87);
		contactuspanel.add(button_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED,new Color(241, 57, 83), null));
		panel_6.setBounds(234, 119, 969, 439);
		contactuspanel.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebpage("https://www.google.com/maps/place/Shah+%26+Anchor+Kutchhi+Engineering+College/@19.048219,72.91165,14z/data=!4m5!3m4!1s0x0:0x9ebbdeaea9ec24ae!8m2!3d19.0482157!4d72.9116581?hl=en");
				grandfatherpanel.revalidate();
				frame.revalidate();
				
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(main_p.class.getResource("/images/Screenshot_2018-10-03 Contact Us - SAKEC-Shah Anchor Kutchhi Engineering College.png")));
		btnNewButton_3.setBounds(10, 55, 950, 328);
		panel_6.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("<html>Postal Address<br/>\r\n\r\nShah & Anchor Kutchhi Engineering College\r\n\r\nMahavir Education Trust\u2019s Chowk,<br/> Waman Tukaram Patil Marg,<br/> Next to Dukes Co.,<br/> Chembur, Mumbai \u2013 400 088.\r\n<br/>\r\n<br/><br/><br/>\r\nContact Details\r\n\r\n<br/>Contact-No: 022-25580854\r\n\r\n<br/>Fax-No:25568100\r\n\r\n<br/>Email-Id: info@sakec.ac.in </html>");
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setForeground(new Color(241, 57, 83));
		lblNewLabel_7.setBounds(1228, 119, 374, 439);
		contactuspanel.add(lblNewLabel_7);
		
		btnTermLifeInsurance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event1) {
				
				cl3.show(parentpanel, "name_130515214938554");
				cl9.show(buttonpanel, "name_94280454630953");
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
					
					String ctablepopulate = "select * from insurance where type='Term Insurance'";
					PreparedStatement stmt = con.prepareStatement(ctablepopulate);
					ResultSet rs  = stmt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					
			
				}
			
				catch(Exception except){
				
					System.out.println(except);
				
				}
				
				
				addagentpanel.revalidate();
				insurancespanel.revalidate();
				frame.revalidate();
				parentpanel.revalidate();
				insurance1();
				
			}
		});
		
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event3) {
				
				cl3.show(parentpanel, "name_131091957135037");
				cl9.show(buttonpanel, "name_94295818881193");
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
					
					String ctablepopulate = "select * from insurance where type='Whole Life Insurance'";
					PreparedStatement stmt = con.prepareStatement(ctablepopulate);
					ResultSet rs  = stmt.executeQuery();
					table_3.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					
			
				}
			
				catch(Exception except){
				
					System.out.println(except);
				
				}
				addagentpanel.revalidate();
				insurancespanel.revalidate();
				parentpanel.revalidate();
				frame.revalidate();
				insurance3();
				
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event2) {
				
				cl3.show(parentpanel, "name_130839478752224");
				cl9.show(buttonpanel, "name_94240132484303");
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
					
					String ctablepopulate = "select * from insurance where type='Child Plan Insurance'";
					PreparedStatement stmt = con.prepareStatement(ctablepopulate);
					ResultSet rs  = stmt.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					
			
				}
			
				catch(Exception except){
				
					System.out.println(except);
				
				}
				addagentpanel.revalidate();
				insurancespanel.revalidate();
				parentpanel.revalidate();
				frame.revalidate();
				insurance2();
			}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label_6 = new JLabel("resiz");
		label_6.setIcon(new ImageIcon(main_p.class.getResource("/images/Customer_Female_Add_190x142.jpg")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(900, 0, 178, 142);
		panel.add(label_6);
		
		JButton btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.setCursor(cur);
		btnAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent customeraddevent) {
				cl.show(grandfatherpanel,"name_19239433071790");
				grandfatherpanel.revalidate();
				frame.revalidate();
				
			}
		});
		btnAddCustomer.setForeground(Color.WHITE);
		btnAddCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddCustomer.setCursor(cur);
		btnAddCustomer.setBackground(new Color(241, 57, 83));
		btnAddCustomer.setBounds(900, 142, 178, 46);
		panel.add(btnAddCustomer);
		
		JButton btnViewCustomers = new JButton("View Customers");
		btnViewCustomers.setCursor(cur);
		btnViewCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e7) {
				
				cl.show(grandfatherpanel, "name_7105952272002");
				grandfatherpanel.revalidate();
				frame.revalidate();
				
			}
		});
		btnViewCustomers.setForeground(Color.WHITE);
		btnViewCustomers.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnViewCustomers.setBackground(new Color(241, 57, 83));
		btnViewCustomers.setBounds(1102, 142, 178, 46);
		panel.add(btnViewCustomers);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1102, 0, 178, 142);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(main_p.class.getResource("/images/User_info_man_male_profile_information_190x142.png")));
		lblNewLabel_5.setBounds(0, 0, 178, 142);
		panel_2.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setCursor(cur);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent exitevent) {
				
				frameexit = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frameexit, "Confirm if you want to exit","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(1582, 0, 68, 29);
		panel.add(btnNewButton_1);
		
		JButton button = new JButton("---");
		button.setCursor(cur);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent minimizeevent) {
				
				frame.setState(JFrame.ICONIFIED);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 19));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(1504, 0, 68, 29);
		panel.add(button);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(1304, 0, 178, 142);
		panel.add(panel_5);
		
		JLabel label_17 = new JLabel("New label");
		label_17.setIcon(new ImageIcon(main_p.class.getResource("/images/guy_190x142.png")));
		label_17.setBounds(0, 0, 178, 142);
		panel_5.add(label_17);
		
		JButton btnContactUs = new JButton("Contact Us");
		btnContactUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cl.show(grandfatherpanel,"name_38683474436453");
				grandfatherpanel.revalidate();
				frame.revalidate();
			}
		});
		btnContactUs.setForeground(Color.WHITE);
		btnContactUs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnContactUs.setBackground(new Color(241, 57, 83));
		btnContactUs.setBounds(1304, 142, 178, 46);
		panel.add(btnContactUs);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(grandfatherpanel, "name_19239371696803");
				grandfatherpanel.revalidate();
				frame.revalidate();
				
			}
		});
		
		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent submitevent) {
				if(genderval == 1)
				{
					try {
						Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
						
						
						String updatequery = "insert into agent values (?,?,?,?,?,?,?,?,?,?,?)";
						PreparedStatement stmt = conn1.prepareStatement(updatequery);
						
						stmt.setString(2, nametf.getText());
						stmt.setString(8, "Male");
						
						String dob;
						String s1 = (String) yearcb.getSelectedItem();
				        
				        String s2 = (String) monthcb.getSelectedItem();
				        
				        String s3 = (String) datecb.getSelectedItem();
				        
				        dob = s1+"-"+s2+"-"+s3;
				        stmt.setString(5, dob);
				        
				   
				        String address = addressta.getText();
				        stmt.setString(6, address);
				        try {
				        	int mob = Integer.parseInt(mobiletf.getText());
					        stmt.setInt(7, mob);
				        }
				        catch(Exception e)
				        {
				        	warninglabel.setText("Enter a telephone number");
				        }
				        
				        stmt.setString(3, emailtf.getText());
				        String doj;
				        String s4 = (String) yearcb1.getSelectedItem();
				        
				        String s5 = (String) monthcb1.getSelectedItem();
				        
				        String s6 = (String) datecb1.getSelectedItem();
				        
				        doj = s4+"-"+s5+"-"+s6;
				        stmt.setString(4, doj);
				        stmt.setInt(1, Integer.parseInt(aidtf.getText()));
				        stmt.setInt(9, Integer.parseInt(worketf.getText()));
				        stmt.setInt(10, insuranceval1);
				        stmt.setString(11, ustf.getText());
				        
				        /*
				        if(insuranceval==1)
				        {
				        	stmt.setString(12, "Term Insurance");
				        }
				        if(insuranceval==2)
				        {
				        	stmt.setString(12, "Child Plan Insurance");
				        }
				        if(insuranceval==3)
				        {
				        	stmt.setString(12, "Whole Life Insurance");
				        }
				        */
				        stmt.executeUpdate();
				        
				
						
					} catch (SQLException except1) {
						
						System.out.println(except1);
						
						
					}
				}
					
				if(genderval==2)
				{
					
					try {
Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
						
						
						String updatequery = "insert into agent values (?,?,?,?,?,?,?,?,?,?,?)";
						PreparedStatement stmt = conn1.prepareStatement(updatequery);
						
						stmt.setString(2, nametf.getText());
						stmt.setString(8, "Female");
						
						String dob;
						String s1 = (String) yearcb.getSelectedItem();
				        
				        String s2 = (String) monthcb.getSelectedItem();
				        
				        String s3 = (String) datecb.getSelectedItem();
				        
				        dob = s1+"-"+s2+"-"+s3;
				        stmt.setString(5, dob);
				        
				   
				        String address = addressta.getText();
				        stmt.setString(6, address);
				        try {
				        	int mob = Integer.parseInt(mobiletf.getText());
					        stmt.setInt(7, mob);
				        }
				        catch(Exception e)
				        {
				        	warninglabel.setText("Enter a telephone number");
				        }
				        
				        stmt.setString(3, emailtf.getText());
				        String doj;
				        String s4 = (String) yearcb1.getSelectedItem();
				        
				        String s5 = (String) monthcb1.getSelectedItem();
				        
				        String s6 = (String) datecb1.getSelectedItem();
				        
				        doj = s4+"-"+s5+"-"+s6;
				        stmt.setString(4, doj);
				        stmt.setInt(1, Integer.parseInt(aidtf.getText()));
				        stmt.setInt(9, Integer.parseInt(worketf.getText()));
				        stmt.setInt(10, insuranceval1);
				        stmt.setString(11, ustf.getText());
				        
				        /*
				        if(insuranceval==1)
				        {
				        	stmt.setString(12, "Term Insurance");
				        }
				        if(insuranceval==2)
				        {
				        	stmt.setString(12, "Child Plan Insurance");
				        }
				        if(insuranceval==3)
				        {
				        	stmt.setString(12, "Whole Life Insurance");
				        }
				        */
				        stmt.executeUpdate();
						
					} catch (SQLException except1) {
						
						System.out.println(except1);
						
						
					}
					
				}
				ustf.setText(null);
				nametf.setText(null);
				yearcb.setSelectedIndex(0);
				monthcb.setSelectedIndex(0);
				datecb.setSelectedIndex(0);
				yearcb1.setSelectedIndex(0);
				monthcb1.setSelectedIndex(0);
				datecb1.setSelectedIndex(0);
				addressta.setText(null);
				mobiletf.setText(null);
				emailtf.setText(null);
				worketf.setText(null);
				aidtf.setText(null);
				cl2.show(panel_1, "name_11001346500172");
				panel_1.revalidate();
				addagentpanel.revalidate();
				frame.revalidate();
				
			
				
			}
		});
		
		
		btnViewagent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent viewagentevent) {
				
				cl.show(grandfatherpanel, "name_19239332734906");
				grandfatherpanel.revalidate();
				frame.revalidate();
				
				
			}
		});
		
		
		btnCheckInsurance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent checkinevent) {
				
				
				
				String ans = caidtf.getText();
				int id = Integer.parseInt(ans);
				try {
					
					String insurancetype=null;
					Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
					PreparedStatement stmt = conn3.prepareStatement(" Select ins_id from agent where agent_id=? ");
					stmt.setInt(1, id);
					ResultSet rs = stmt.executeQuery();
					int ins_id=0;
					while(rs.next())
					{
						 ins_id = rs.getInt(1);
						
					}
					
					
					try {
						PreparedStatement stmt1 = conn3.prepareStatement(" Select * from insurance where ins_id=? ");
						stmt1.setInt(1, ins_id);
						ResultSet rs1 = stmt1.executeQuery();
						
						

						
						if(ins_id==3215 || ins_id==3210)
						{
							 cl4.show(parentpanelc, "name_73735057972235");
							 
							 tinsurancetable.setModel(DbUtils.resultSetToTableModel(rs1));
							 tinsurancetable.setRowHeight(225);
							 tinsurancepanel.revalidate();
							 
							 
							 
						}
						if(ins_id==4215 || ins_id==4210)
						{
							 cl4.show(parentpanelc, "name_73791843709339");
							 
							
							 cinsurancetable.setRowHeight(225);
							 cinsurancetable.setModel(DbUtils.resultSetToTableModel(rs1));
							 cinsurancepanel.revalidate();
							
						}
						if(ins_id==5215 || ins_id==5210)
						{
							 cl4.show(parentpanelc, "name_73812949494419");
							
							 winsurancetable.setRowHeight(225);
							 winsurancetable.setModel(DbUtils.resultSetToTableModel(rs1));
							 winsurancepanel.revalidate();
							
						}
						
					}
					catch(Exception e)
					{
						System.out.print(e);
					}
					
					
					
				}
				
				
				catch(Exception checkexception)
				{
					System.out.println(checkexception);
				}
				
				
				
			}
		});
		
		
		
		btnSubmitDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent submitaction) {
				
				if(cgenderval==1)
				{
					
					try {
						
						Connection conn5=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
						
						PreparedStatement stmt1 = conn5.prepareStatement(" Select ins_id from agent where agent_id=? ");
						stmt1.setInt(1, Integer.parseInt(caidtf.getText()));
						ResultSet rs = stmt1.executeQuery();
						String insurance="";
						int ins_id=0;
						while(rs.next())
						{
							ins_id = rs.getInt(1);
							
						}
						
						String updatequery = "insert into customer values (?,?,?,?,?,?,?,?)";
						PreparedStatement stmt = conn5.prepareStatement(updatequery);
						stmt.setInt(1, Integer.parseInt(ccidtf.getText()));
						stmt.setString(2, cnametf.getText());
						stmt.setString(7, "Male");
						
						String dob;
						String s1 = (String) cyearcb.getSelectedItem();
				        
				        String s2 = (String) cmonthcb.getSelectedItem();
				        
				        String s3 = (String) cdatecb.getSelectedItem();
				        
				        dob = s1+"-"+s2+"-"+s3;
				        stmt.setString(4, dob);
				        
				   
				        String address = caddressta.getText();
				        stmt.setString(3, address);
				        
				        int mob = Integer.parseInt(cmobtf.getText());
					    stmt.setInt(8, mob);
					    stmt.setFloat(6, Float.parseFloat(csalarytf.getText()));
				        
				        stmt.setString(5, user2tf.getText());
				        
				        
				        
				       
				        stmt.executeUpdate();
				        
				        PreparedStatement stmt3 = conn5.prepareStatement("insert into buys values(?,?)");
				        stmt3.setInt(1, Integer.parseInt(ccidtf.getText()));
				        stmt3.setInt(2, ins_id);
				        stmt3.executeUpdate();
				        
				        PreparedStatement stmt4 = conn5.prepareStatement("insert into acquires values(?,?)");
				        stmt4.setInt(1, Integer.parseInt(caidtf.getText()));
				        stmt4.setInt(2, Integer.parseInt(ccidtf.getText()));
						stmt4.executeUpdate();
						
					}
					
					catch(Exception c)
					{
					
						
						System.out.println(c);
						
						
					}
					
				
					
					
					
					
				}
				
				if(cgenderval==2)
				{
					

					try {
						
Connection conn5=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
						
						PreparedStatement stmt1 = conn5.prepareStatement(" Select ins_id from agent where agent_id=? ");
						stmt1.setInt(1, Integer.parseInt(caidtf.getText()));
						ResultSet rs = stmt1.executeQuery();
						String insurance="";
						int ins_id=0;
						while(rs.next())
						{
							ins_id = rs.getInt(1);
							
						}
						
						String updatequery = "insert into customer values (?,?,?,?,?,?,?,?)";
						PreparedStatement stmt = conn5.prepareStatement(updatequery);
						stmt.setInt(1, Integer.parseInt(ccidtf.getText()));
						stmt.setString(2, cnametf.getText());
						stmt.setString(7, "Female");
						
						String dob;
						String s1 = (String) cyearcb.getSelectedItem();
				        
				        String s2 = (String) cmonthcb.getSelectedItem();
				        
				        String s3 = (String) cdatecb.getSelectedItem();
				        
				        dob = s1+"-"+s2+"-"+s3;
				        stmt.setString(4, dob);
				        
				   
				        String address = caddressta.getText();
				        stmt.setString(3, address);
				        
				        int mob = Integer.parseInt(cmobtf.getText());
					    stmt.setInt(8, mob);
					    stmt.setFloat(6, Float.parseFloat(csalarytf.getText()));
				        
				        stmt.setString(5, user2tf.getText());
				        
				        
				        
				       
				        stmt.executeUpdate();
				        
				        PreparedStatement stmt3 = conn5.prepareStatement("insert into buys values(?,?)");
				        stmt3.setInt(1, Integer.parseInt(ccidtf.getText()));
				        stmt3.setInt(2, ins_id);
				        stmt3.executeUpdate();
				        
				        PreparedStatement stmt4 = conn5.prepareStatement("insert into acquires values(?,?)");
				        stmt4.setInt(1, Integer.parseInt(caidtf.getText()));
				        stmt4.setInt(2, Integer.parseInt(ccidtf.getText()));
						stmt4.executeUpdate();
						
					}
					
					catch(Exception c)
					{
					
						
						System.out.println(c);
						
						
					}
					
				}
				
				cnametf.setText(null);
				user2tf.setText(null);
				cyearcb.setSelectedIndex(0);
				cmonthcb.setSelectedIndex(0);
				cdatecb.setSelectedIndex(0);
				caddressta.setText(null);
				cmobtf.setText(null);
				ccidtf.setText(null);
				
				caidtf.setText(null);
				csalarytf.setText(null);
				cl5.show(messagedisplaypanel, "name_4659622588556");
				addcustomerpanel.revalidate();
				frame.revalidate();
				
				
				
				
				
				
			}
		});
		
		
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, lblNewLabel}));
		frame.revalidate();
		
		
		
		
	}
	
	// important method ends here
	// Auxiliary methods start here
	public void mouseevent(MouseEvent evt)
	{
		
		frame.setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
		
	}
	public void frameevent(MouseEvent e)
	{
		posX=e.getX();
	    posY=e.getY();
	}
	public void insurance1()
	{
		insuranceval=1;
	}
	public void insurance2()
	{
		insuranceval=2;
	}
	public void insurance3()
	{
		insuranceval=3;
	}
	public void malerdbtn()
	{
		genderval = 1;
	}
	public void malerdbtn1()
	{
		cgenderval = 1;
	}
	public void femalerdbtn()
	{
		genderval = 2;
	}
	public void femalerdbtn1()
	{
		cgenderval = 2;
	}
	public void c4210()
	{
		insuranceval1=4210;
	}
	public void c4215()
	{
		insuranceval1=4215;
	}
	public void w5210()
	{
		insuranceval1=5210;
	}
	public void w5215()
	{
		insuranceval1=5215;
	}
	public void t3210()
	{
		insuranceval1=3210;
	}
	public void t3215()
	{
		insuranceval1=3215;
	}
	public String usernamefunc()
	{
		return username1;
	}


	public static void openWebpage(String urlString) {
		try {
				Desktop.getDesktop().browse(new URL(urlString).toURI());
			} catch (Exception e) {
					e.printStackTrace();
			}
}
}
