package main;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.protocol.Resultset;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;



public class HomeScreen_staff {
	
	

	public JFrame frame;
	JLayeredPane Sub_Home;
	JPanel All_StudentsPanel;
	JPanel Add_StudentsPanel;
	JPanel Update_StudentsPanel;
	JPanel Delete_StudentsPanel;
	JPanel ManageAccount_panel;
	JLayeredPane MainPanel;
	JPanel Internal_Result;
	JButton btn_AddStudents;
	JButton btn_AllStudents;
	JButton btnUpdateStudent;
	JButton btnDeleteStudent;
	JPanel Internals_1;
	JPanel Internals_2;
	JPanel Internals_3;
	JLayeredPane Sub_Internal_panel; 
	public JTable table;
	public JTextField stu_name;
	public JTextField branch;
	public JTextField regno;
	public JTextField course;
	public JTextField depart;
	public JTextField year;
	public JTextField mobnum;
	public JTextField city;
	public JTextField gender;
	public JTextField relg;
	public JTextField dob;
	public JTextField state;
	public JTextField fathernm;
	public JTextField mothernm;
	public JTextField fathermob;
	public JTextField mothermob;
	public JTextField foccp;
	public JTextField moccp;
	public JTextField upstu;
	public JTextField upreg;
	public JTextField updptr;
	public JTextField upbranch;
	public JTextField upcourse;
	public JTextField upyear;
	public JTextField upmob;
	public JTextField upgender;
	public JTextField updob;
	public JTextField upcity;
	public JTextField upreligion;
	public JTextField upstate;
	public JTextField upfathernm;
	public JTextField upfatmob;
	public JTextField upfoccp;
	public JTextField upmothernm;
	public JTextField upmotmob;
	public JTextField upmoccp;
	public JTextField enreg;
	public JTextField enterstunm;
	public JTextField enterstureg;
	public JTextField r_reg;
	public JTextField r_stunm;
	public JTextField r_branch;
	public JTextField r_degree;
	public JTextField r_year;
	public JTextField subc1;
	public JTextField mrk1;
	public JTextField subc2;
	public JTextField mrk2;
	public JTextField subc3;
	public JTextField mrk3;
	public JTextField subc4;
	public JTextField mrk4;
	public JTextField subc5;
	public JTextField mrk5;
	public JTextField subc6;
	public JTextField mrk6;
	public JTextField r2_reg;
	public JTextField r2_stu;
	public JTextField r2_branch;
	public JTextField r2_deg;
	public JTextField r2_year;
	public JTextField r2_subc1;
	public JTextField r2_subc2;
	public JTextField r2_subc3;
	public JTextField r2_mrk1;
	public JTextField r2_mrk2;
	public JTextField r2_mrk3;
	public JTextField r2_subc4;
	public JTextField r2_subc5;
	public JTextField r2_subc6;
	public JTextField r2_mrk4;
	public JTextField r2_mrk5;
	public JTextField r2_mrk6;
	public JTextField r3_reg;
	public JTextField r3_stu;
	public JTextField r3_branch;
	public JTextField r3_deg;
	public JTextField r3_year;
	public JTextField r3_subc1;
	public JTextField r3_subc2;
	public JTextField r3_subc3;
	public JTextField r3_mrk1;
	public JTextField r3_mrk2;
	public JTextField r3_mrk3;
	public JTextField r3_subc4;
	public JTextField r3_subc5;
	public JTextField r3_subc6;
	public JTextField r3_mrk4;
	public JTextField r3_mrk5;
	public JTextField r3_mrk6;
	
	
	
			
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen_staff window = new HomeScreen_staff();
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
	
public void switchPanels(JPanel panel) {
		
	Sub_Home.removeAll();
    Sub_Home.add(panel);
    Sub_Home.repaint();
    Sub_Home.revalidate();
	}

public void switchInternalResultPanels(JPanel panel) {
	
	Sub_Internal_panel.removeAll();
	Sub_Internal_panel.add(panel);
	Sub_Internal_panel.repaint();
	Sub_Internal_panel.revalidate();
	}

public void switchMainPanels(JPanel panel2) {
	
	MainPanel.removeAll();
    MainPanel.add(panel2);
    MainPanel.repaint();
    MainPanel.revalidate();
	}

	public HomeScreen_staff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Header_panel = new JPanel();
		Header_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Header_panel.setBackground(new Color(255, 128, 0));
		
		MainPanel = new JLayeredPane();
		MainPanel.setLayout(new CardLayout(0, 0));
		
		JPanel home = new JPanel();
		home.setBackground(new Color(240, 240, 240));
		MainPanel.add(home, "name_16538477246999");
		
		JPanel SidePanel_Home = new JPanel();
		SidePanel_Home.setBorder(new LineBorder(new Color(0, 0, 0)));
		SidePanel_Home.setBackground(new Color(250, 235, 215));
		
		 Sub_Home = new JLayeredPane();
		
		 btn_AllStudents = new JButton("All Students");
		btn_AllStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(All_StudentsPanel);
			 
				
				btn_AddStudents.setBackground(new Color(255,255,255));
				btnUpdateStudent.setBackground(new Color(255,255,255));
				btn_AllStudents.setBackground(new Color(255,128,0));
				btnDeleteStudent.setBackground(new Color(255,255,255));
				/*  String url = "jdbc:mysql://localhost:3306/result_ms";
				   String username = "root";
				   String password = "SIM@ss55simeon"; */
				

				String url = "jdbc:mysql://db4free.net:3306/result_ms";
				String userName = "rootuseronline";
				String passWord = "rootuser123";
				
				 try {
				 String query = "select *from rms";
		    	 Connection con = DriverManager.getConnection(url,userName,passWord);
		    	
		    	  
				
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.setRowCount(0);
		         String name , regno , dept , branch , course , year;
		     	 Statement st = con.createStatement();
		         ResultSet rs = st.executeQuery(query);
		         
		         while  (rs.next()) {
		        	 name = rs.getString(1);
		        	 regno = rs.getString(2);
		        	 dept = rs.getString(3);
		        	 branch = rs.getString(4);
		        	 course = rs.getString(5);
		        	 year = rs.getString(6);
		        	 String [] row = {name , regno , dept , branch , course , year};
		        	 model.addRow(row);
		        		
				
				
			}}catch(SQLException e1) {e1.printStackTrace();}}
		});
		btn_AllStudents.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AllStudents.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AllStudents.setBackground(new Color(255, 128, 0));
		
		JButton btnNewButton_3_1 = new JButton("Log Out");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginScreen_Result login = new LoginScreen_Result();
				login.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_3_1.setBackground(new Color(255, 128, 0));
		
		JButton btnNewButton_3_2 = new JButton("Manage Account");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(ManageAccount_panel);
			}
		});
		btnNewButton_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_3_2.setBackground(new Color(255, 128, 0));
		
	    btn_AddStudents = new JButton("Add Students");
		btn_AddStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Add_StudentsPanel);
				btn_AddStudents.setBackground(new Color(255,128,0));
				btnUpdateStudent.setBackground(new Color(255,255,255));
				btn_AllStudents.setBackground(new Color(255,255,255));
				btnDeleteStudent.setBackground(new Color(255,255,255));
				
				
			}
		});
		btn_AddStudents.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AddStudents.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AddStudents.setBackground(Color.WHITE);
		
		btnUpdateStudent = new JButton("Update Student info");
		btnUpdateStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Update_StudentsPanel);
				btn_AddStudents.setBackground(new Color(255,255,255));
				btnUpdateStudent.setBackground(new Color(255,128,0));
				btn_AllStudents.setBackground(new Color(255,255,255));
				btnDeleteStudent.setBackground(new Color(255,255,255));
			}
		});
		btnUpdateStudent.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnUpdateStudent.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnUpdateStudent.setBackground(Color.WHITE);
		
		btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Delete_StudentsPanel);
				btn_AddStudents.setBackground(new Color(255,255,255));
				btnUpdateStudent.setBackground(new Color(255,255,255));
				btn_AllStudents.setBackground(new Color(255,255,255));
				btnDeleteStudent.setBackground(new Color(255,128,0));
				
			}
		});
		btnDeleteStudent.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnDeleteStudent.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnDeleteStudent.setBackground(Color.WHITE);
		GroupLayout gl_SidePanel_Home = new GroupLayout(SidePanel_Home);
		gl_SidePanel_Home.setHorizontalGroup(
			gl_SidePanel_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_Home.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_SidePanel_Home.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_AllStudents, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_2, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_AddStudents, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdateStudent, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDeleteStudent, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_SidePanel_Home.setVerticalGroup(
			gl_SidePanel_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_Home.createSequentialGroup()
					.addGap(37)
					.addComponent(btn_AllStudents, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btn_AddStudents, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUpdateStudent, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDeleteStudent, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
					.addComponent(btnNewButton_3_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		SidePanel_Home.setLayout(gl_SidePanel_Home);
		Sub_Home.setLayout(new CardLayout(0, 0));
		
		All_StudentsPanel = new JPanel();
		All_StudentsPanel.setBackground(new Color(240, 240, 240));
		Sub_Home.add(All_StudentsPanel, "name_20796148948200");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		
		table = new JTable();
		table.setBackground(new Color(250, 235, 215));
		table.setSelectionBackground(new Color(255, 128, 0));
		table.getTableHeader().setBackground(new Color(255 ,128,0));		
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setRowHeight(25);
		table.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "REGISTER NO", "DEPARTMENT", "BRANCH", "COURSE", "YEAR"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setResizable(false);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTERED COLLEGE STUDENTS DETAILS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		GroupLayout gl_All_StudentsPanel = new GroupLayout(All_StudentsPanel);
		gl_All_StudentsPanel.setHorizontalGroup(
			gl_All_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
				.addGroup(gl_All_StudentsPanel.createSequentialGroup()
					.addGap(8)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
					.addGap(8))
		);
		gl_All_StudentsPanel.setVerticalGroup(
			gl_All_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_All_StudentsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
		);
		All_StudentsPanel.setLayout(gl_All_StudentsPanel);
		
		Add_StudentsPanel = new JPanel();
		Add_StudentsPanel.setBackground(new Color(240, 240, 240));
		Sub_Home.add(Add_StudentsPanel, "name_20802092910600");
		
		JLabel lblNewLabel_2 = new JLabel("Student Name ");
		lblNewLabel_2.setBounds(53, 72, 108, 25);
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		stu_name = new JTextField();
		stu_name.setBounds(53, 95, 234, 25);
		stu_name.setHorizontalAlignment(SwingConstants.CENTER);
		stu_name.setBackground(new Color(250, 235, 215));
		stu_name.setBorder(null);
		stu_name.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		stu_name.setColumns(10);
	
		
		JLabel lblNewLabel_2_1 = new JLabel("Branch");
		lblNewLabel_2_1.setBounds(53, 130, 108, 25);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		branch = new JTextField();
		branch.setBounds(53, 153, 234, 25);
		branch.setHorizontalAlignment(SwingConstants.CENTER);
		branch.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		branch.setColumns(10);
		branch.setBorder(null);
		branch.setBackground(new Color(250, 235, 215));
		
		
		JLabel lblNewLabel_2_2 = new JLabel("Register Number");
		lblNewLabel_2_2.setBounds(358, 72, 117, 25);
		lblNewLabel_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		regno = new JTextField();
		regno.setBounds(358, 95, 234, 25);
		regno.setHorizontalAlignment(SwingConstants.CENTER);
		regno.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		regno.setColumns(10);
		regno.setBorder(null);
		regno.setBackground(new Color(250, 235, 215));
	
		
		JLabel lblNewLabel_2_3 = new JLabel("Course");
		lblNewLabel_2_3.setBounds(358, 130, 108, 25);
		lblNewLabel_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		course = new JTextField();
		course.setBounds(358, 153, 234, 25);
		course.setHorizontalAlignment(SwingConstants.CENTER);
		course.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		course.setColumns(10);
		course.setBorder(null);
		course.setBackground(new Color(250, 235, 215));
	
		
		JLabel lblNewLabel_2_4 = new JLabel("Department");
		lblNewLabel_2_4.setBounds(658, 72, 108, 25);
		lblNewLabel_2_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		depart = new JTextField();
		depart.setBounds(658, 95, 234, 25);
		depart.setHorizontalAlignment(SwingConstants.CENTER);
		depart.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		depart.setColumns(10);
		depart.setBorder(null);
		depart.setBackground(new Color(250, 235, 215));
		
		
		JLabel lblNewLabel_2_5 = new JLabel("Year");
		lblNewLabel_2_5.setBounds(658, 130, 108, 25);
		lblNewLabel_2_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		year = new JTextField();
		year.setBounds(658, 153, 234, 25);
		year.setHorizontalAlignment(SwingConstants.CENTER);
		year.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		year.setColumns(10);
		year.setBorder(null);
		year.setBackground(new Color(250, 235, 215));

		JLabel lblNewLabel_2_6 = new JLabel("STUDENT DETAILS");
		lblNewLabel_2_6.setBounds(53, 10, 208, 40);
		lblNewLabel_2_6.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_6_1 = new JLabel("PERSONAL DETAILS");
		lblNewLabel_2_6_1.setBounds(53, 188, 208, 40);
		lblNewLabel_2_6_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_7 = new JLabel("Mobile Number");
		lblNewLabel_2_7.setBounds(53, 250, 108, 25);
		lblNewLabel_2_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		mobnum = new JTextField();
		mobnum.setBounds(53, 273, 234, 25);
		mobnum.setHorizontalAlignment(SwingConstants.CENTER);
		mobnum.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mobnum.setColumns(10);
		mobnum.setBorder(null);
		mobnum.setBackground(new Color(250, 235, 215));
	
		
		JLabel lblNewLabel_2_1_1 = new JLabel("City");
		lblNewLabel_2_1_1.setBounds(53, 308, 108, 25);
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		city = new JTextField();
		city.setBounds(53, 331, 234, 25);
		city.setHorizontalAlignment(SwingConstants.CENTER);
		city.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		city.setColumns(10);
		city.setBorder(null);
		city.setBackground(new Color(250, 235, 215));

		
		JLabel lblNewLabel_2_2_1 = new JLabel("Gender");
		lblNewLabel_2_2_1.setBounds(358, 250, 117, 25);
		lblNewLabel_2_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		gender = new JTextField();
		gender.setBounds(358, 273, 234, 25);
		gender.setHorizontalAlignment(SwingConstants.CENTER);
		gender.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		gender.setColumns(10);
		gender.setBorder(null);
		gender.setBackground(new Color(250, 235, 215));

		
		JLabel lblNewLabel_2_3_1 = new JLabel("Religion ");
		lblNewLabel_2_3_1.setBounds(358, 308, 108, 25);
		lblNewLabel_2_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		relg = new JTextField();
		relg.setBounds(358, 331, 234, 25);
		relg.setHorizontalAlignment(SwingConstants.CENTER);
		relg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		relg.setColumns(10);
		relg.setBorder(null);
		relg.setBackground(new Color(250, 235, 215));

		
		JLabel lblNewLabel_2_4_1 = new JLabel("Date Of Birth");
		lblNewLabel_2_4_1.setBounds(658, 250, 108, 25);
		lblNewLabel_2_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		dob = new JTextField();
		dob.setBounds(658, 273, 234, 25);
		dob.setHorizontalAlignment(SwingConstants.CENTER);
		dob.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		dob.setColumns(10);
		dob.setBorder(null);
		dob.setBackground(new Color(250, 235, 215));

		
		JLabel lblNewLabel_2_5_1 = new JLabel("State");
		lblNewLabel_2_5_1.setBounds(658, 308, 108, 25);
		lblNewLabel_2_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		state = new JTextField();
		state.setBounds(658, 331, 234, 25);
		state.setHorizontalAlignment(SwingConstants.CENTER);
		state.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		state.setColumns(10);
		state.setBorder(null);
		state.setBackground(new Color(250, 235, 215));
	
		
		JLabel lblNewLabel_2_6_2 = new JLabel("PARENTS DETAILS");
		lblNewLabel_2_6_2.setBounds(53, 366, 208, 40);
		lblNewLabel_2_6_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_8 = new JLabel("Father Name ");
		lblNewLabel_2_8.setBounds(53, 428, 108, 25);
		lblNewLabel_2_8.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		fathernm = new JTextField();
		fathernm.setBounds(53, 451, 234, 25);
		fathernm.setHorizontalAlignment(SwingConstants.CENTER);
		fathernm.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		fathernm.setColumns(10);
		fathernm.setBorder(null);
		fathernm.setBackground(new Color(250, 235, 215));
	
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Mother Name");
		lblNewLabel_2_1_2.setBounds(53, 486, 108, 25);
		lblNewLabel_2_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		mothernm = new JTextField();
		mothernm.setBounds(53, 509, 234, 25);
		mothernm.setHorizontalAlignment(SwingConstants.CENTER);
		mothernm.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mothernm.setColumns(10);
		mothernm.setBorder(null);
		mothernm.setBackground(new Color(250, 235, 215));
	
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Mobile Number ( Father )");
		lblNewLabel_2_2_2.setBounds(358, 428, 178, 25);
		lblNewLabel_2_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		fathermob = new JTextField();
		fathermob.setBounds(358, 451, 234, 25);
		fathermob.setHorizontalAlignment(SwingConstants.CENTER);
		fathermob.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		fathermob.setColumns(10);
		fathermob.setBorder(null);
		fathermob.setBackground(new Color(250, 235, 215));
	
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Mobile Number ( Mother )");
		lblNewLabel_2_3_2.setBounds(358, 486, 234, 25);
		lblNewLabel_2_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		mothermob = new JTextField();
		mothermob.setBounds(358, 509, 234, 25);
		mothermob.setHorizontalAlignment(SwingConstants.CENTER);
		mothermob.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mothermob.setColumns(10);
		mothermob.setBorder(null);
		mothermob.setBackground(new Color(250, 235, 215));
	
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Occupation ( Father )");
		lblNewLabel_2_4_2.setBounds(658, 428, 234, 25);
		lblNewLabel_2_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		foccp = new JTextField();
		foccp.setBounds(658, 451, 234, 25);
		foccp.setHorizontalAlignment(SwingConstants.CENTER);
		foccp.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		foccp.setColumns(10);
		foccp.setBorder(null);
		foccp.setBackground(new Color(250, 235, 215));
	
		
		JLabel lblNewLabel_2_5_2 = new JLabel("Occupation ( Mother )");
		lblNewLabel_2_5_2.setBounds(658, 486, 184, 25);
		lblNewLabel_2_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		moccp = new JTextField();
		moccp.setBounds(658, 509, 234, 25);
		moccp.setHorizontalAlignment(SwingConstants.CENTER);
		moccp.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		moccp.setColumns(10);
		moccp.setBorder(null);
		moccp.setBackground(new Color(250, 235, 215));
	
		
		JButton addstu = new JButton("ADD STUDENT");
		addstu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				//database connection add student

				String url = "jdbc:mysql://db4free.net:3306/result_ms";
				String userName = "rootuseronline";
				String passWord = "rootuser123";
				
				try {
					String query ="insert into rms value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					Connection con = DriverManager.getConnection(url,userName,passWord);
					
					

					 String nm = stu_name.getText();
					 String rgnm = regno.getText();
					 String dptr = depart.getText();
					String brnch = branch.getText();
					 String cour = course.getText();
					 String yr = year.getText();
					 String phone = mobnum.getText();
					 String fnam = fathernm.getText();
					 String mnam = mothernm.getText();
					 String fmb = fathermob.getText();
					String mmb = mothermob.getText();
					 String faoccp = foccp.getText();
					 String mooccp= moccp.getText();
				 String gn  = gender.getText();
				 String dateob  = dob.getText();
				 String cty  = city.getText();
				 String relig = relg.getText();
					 String stat  = state.getText();
					
					
					PreparedStatement st = con.prepareStatement(query);
					st.setString(1,nm);
					st.setString(2,rgnm);
					st.setString(3,dptr);
					st.setString(4,brnch);
					st.setString(5,cour);
					st.setString(6,yr);
					st.setString(7,phone);
					st.setString(8,fnam);
					st.setString(9,mnam);
					st.setString(10,fmb);
					st.setString(11,mmb);
					st.setString(12,faoccp);
					st.setString(13,mooccp);
					st.setString(14,gn);
					st.setString(15,dateob);
					st.setString(16,cty);
					st.setString(17,relig);
					st.setString(18,stat);
					
					 st.executeUpdate();
	
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		addstu.setBounds(658, 552, 234, 40);
		addstu.setBackground(new Color(255, 128, 0));
		addstu.setBorder(new LineBorder(new Color(0, 0, 0)));
		addstu.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		
		JButton clr = new JButton("CLEAR ALL");
		clr.setBounds(358, 552, 234, 40);
		clr.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		clr.setBorder(new LineBorder(new Color(0, 0, 0)));
		clr.setBackground(new Color(255, 128, 0));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(54, 48, 178, 2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(53, 226, 194, 2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(53, 404, 194, 2);
		Add_StudentsPanel.setLayout(null);
		Add_StudentsPanel.add(separator);
		Add_StudentsPanel.add(lblNewLabel_2_6);
		Add_StudentsPanel.add(lblNewLabel_2);
		Add_StudentsPanel.add(stu_name);
		Add_StudentsPanel.add(branch);
		Add_StudentsPanel.add(lblNewLabel_2_1);
		Add_StudentsPanel.add(separator_1);
		Add_StudentsPanel.add(lblNewLabel_2_6_1);
		Add_StudentsPanel.add(mobnum);
		Add_StudentsPanel.add(lblNewLabel_2_7);
		Add_StudentsPanel.add(lblNewLabel_2_1_1);
		Add_StudentsPanel.add(city);
		Add_StudentsPanel.add(lblNewLabel_2_6_2);
		Add_StudentsPanel.add(separator_1_1);
		Add_StudentsPanel.add(fathernm);
		Add_StudentsPanel.add(lblNewLabel_2_8);
		Add_StudentsPanel.add(lblNewLabel_2_1_2);
		Add_StudentsPanel.add(mothernm);
		Add_StudentsPanel.add(lblNewLabel_2_2);
		Add_StudentsPanel.add(regno);
		Add_StudentsPanel.add(course);
		Add_StudentsPanel.add(lblNewLabel_2_3);
		Add_StudentsPanel.add(gender);
		Add_StudentsPanel.add(lblNewLabel_2_2_1);
		Add_StudentsPanel.add(lblNewLabel_2_3_1);
		Add_StudentsPanel.add(relg);
		Add_StudentsPanel.add(fathermob);
		Add_StudentsPanel.add(lblNewLabel_2_2_2);
		Add_StudentsPanel.add(lblNewLabel_2_3_2);
		Add_StudentsPanel.add(mothermob);
		Add_StudentsPanel.add(lblNewLabel_2_4);
		Add_StudentsPanel.add(depart);
		Add_StudentsPanel.add(year);
		Add_StudentsPanel.add(lblNewLabel_2_5);
		Add_StudentsPanel.add(lblNewLabel_2_4_1);
		Add_StudentsPanel.add(dob);
		Add_StudentsPanel.add(lblNewLabel_2_5_1);
		Add_StudentsPanel.add(state);
		Add_StudentsPanel.add(foccp);
		Add_StudentsPanel.add(lblNewLabel_2_4_2);
		Add_StudentsPanel.add(moccp);
		Add_StudentsPanel.add(lblNewLabel_2_5_2);
		Add_StudentsPanel.add(clr);
		Add_StudentsPanel.add(addstu);
		
		Delete_StudentsPanel = new JPanel();
		Delete_StudentsPanel.setBackground(new Color(240, 240, 240));
		Sub_Home.add(Delete_StudentsPanel, "name_20806599606300");
		
		JLabel lblNewLabel_2_9_1_1 = new JLabel("ENTER STUDENT NAME");
		lblNewLabel_2_9_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		enterstunm = new JTextField();
		enterstunm.setHorizontalAlignment(SwingConstants.CENTER);
		enterstunm.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		enterstunm.setColumns(10);
		enterstunm.setBorder(null);
		enterstunm.setBackground(new Color(250, 235, 215));
		enterstunm.getText();
		
		JSeparator separator_2_1_1 = new JSeparator();
		
		JLabel lblNewLabel_2_9_1_1_1 = new JLabel("ENTER STUDENT REGISTER NUMBER");
		lblNewLabel_2_9_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		enterstureg = new JTextField();
		enterstureg.setHorizontalAlignment(SwingConstants.CENTER);
		enterstureg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		enterstureg.setColumns(10);
		enterstureg.setBorder(null);
		enterstureg.setBackground(new Color(250, 235, 215));
		enterstureg.getText();
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  // java database connection
		
				
					 
			
						
				
			}
		});
		delete.setBorder(new LineBorder(new Color(0, 0, 0)));
		delete.setBackground(new Color(255, 0, 0));
		delete.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		GroupLayout gl_Delete_StudentsPanel = new GroupLayout(Delete_StudentsPanel);
		gl_Delete_StudentsPanel.setHorizontalGroup(
			gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_9_1_1_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(enterstureg, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(delete, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, 839, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_9_1_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(enterstunm, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))))
		);
		gl_Delete_StudentsPanel.setVerticalGroup(
			gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_9_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(enterstunm, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_2_9_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(delete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(enterstureg, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))))
					.addGap(23)
					.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(499, Short.MAX_VALUE))
		);
		Delete_StudentsPanel.setLayout(gl_Delete_StudentsPanel);
		
		Update_StudentsPanel = new JPanel();
		Update_StudentsPanel.setBackground(new Color(240, 240, 240));
		Sub_Home.add(Update_StudentsPanel, "name_20809825031100");
		
		JLabel lblNewLabel_2_6_3 = new JLabel("STUDENT DETAILS");
		lblNewLabel_2_6_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_9 = new JLabel("Student Name ");
		lblNewLabel_2_9.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upstu = new JTextField();
		upstu.setHorizontalAlignment(SwingConstants.CENTER);
		upstu.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upstu.setColumns(10);
		upstu.setBorder(null);
		upstu.setBackground(new Color(250, 235, 215));
		upstu.getText();
		
		upreg = new JTextField();
		upreg.setHorizontalAlignment(SwingConstants.CENTER);
		upreg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upreg.setColumns(10);
		upreg.setBorder(null);
		upreg.setBackground(new Color(250, 235, 215));
		upreg.getText();
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Register Number");
		lblNewLabel_2_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		updptr = new JTextField();
		updptr.setHorizontalAlignment(SwingConstants.CENTER);
		updptr.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		updptr.setColumns(10);
		updptr.setBorder(null);
		updptr.setBackground(new Color(250, 235, 215));
		updptr.getText();
		
		JLabel lblNewLabel_2_4_3 = new JLabel("Department");
		lblNewLabel_2_4_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upbranch = new JTextField();
		upbranch.setHorizontalAlignment(SwingConstants.CENTER);
		upbranch.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upbranch.setColumns(10);
		upbranch.setBorder(null);
		upbranch.setBackground(new Color(250, 235, 215));
		upbranch.getText();
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Branch");
		lblNewLabel_2_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Course");
		lblNewLabel_2_3_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upcourse = new JTextField();
		upcourse.setHorizontalAlignment(SwingConstants.CENTER);
		upcourse.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upcourse.setColumns(10);
		upcourse.setBorder(null);
		upcourse.setBackground(new Color(250, 235, 215));
		upcourse.getText();
		
		JLabel lblNewLabel_2_5_3 = new JLabel("Year");
		lblNewLabel_2_5_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upyear = new JTextField();
		upyear.setHorizontalAlignment(SwingConstants.CENTER);
		upyear.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upyear.setColumns(10);
		upyear.setBorder(null);
		upyear.setBackground(new Color(250, 235, 215));
		upyear.getText();
		
		JLabel lblNewLabel_2_6_1_1 = new JLabel("PERSONAL DETAILS");
		lblNewLabel_2_6_1_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_7_1 = new JLabel("Mobile Number");
		lblNewLabel_2_7_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upmob = new JTextField();
		upmob.setHorizontalAlignment(SwingConstants.CENTER);
		upmob.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upmob.setColumns(10);
		upmob.setBorder(null);
		upmob.setBackground(new Color(250, 235, 215));
		upmob.getText();
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Gender");
		lblNewLabel_2_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upgender = new JTextField();
		upgender.setHorizontalAlignment(SwingConstants.CENTER);
		upgender.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upgender.setColumns(10);
		upgender.setBorder(null);
		upgender.setBackground(new Color(250, 235, 215));
		upgender.getText();
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("Date Of Birth");
		lblNewLabel_2_4_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		updob = new JTextField();
		updob.setHorizontalAlignment(SwingConstants.CENTER);
		updob.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		updob.setColumns(10);
		updob.setBorder(null);
		updob.setBackground(new Color(250, 235, 215));
		updob.getText();
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("City");
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upcity = new JTextField();
		upcity.setHorizontalAlignment(SwingConstants.CENTER);
		upcity.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upcity.setColumns(10);
		upcity.setBorder(null);
		upcity.setBackground(new Color(250, 235, 215));
		upcity.getText();
		
		upreligion = new JTextField();
		upreligion.setHorizontalAlignment(SwingConstants.CENTER);
		upreligion.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upreligion.setColumns(10);
		upreligion.setBorder(null);
		upreligion.setBackground(new Color(250, 235, 215));
		upreligion.getText();
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Religion ");
		lblNewLabel_2_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_5_1_1 = new JLabel("State");
		lblNewLabel_2_5_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upstate = new JTextField();
		upstate.setHorizontalAlignment(SwingConstants.CENTER);
		upstate.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upstate.setColumns(10);
		upstate.setBorder(null);
		upstate.setBackground(new Color(250, 235, 215));
		upstate.getText();
		
		JLabel lblNewLabel_2_6_2_1 = new JLabel("PARENTS DETAILS");
		lblNewLabel_2_6_2_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		upfathernm = new JTextField();
		upfathernm.setHorizontalAlignment(SwingConstants.CENTER);
		upfathernm.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upfathernm.setColumns(10);
		upfathernm.setBorder(null);
		upfathernm.setBackground(new Color(250, 235, 215));
		upfathernm.getText();
		
		JLabel lblNewLabel_2_8_1 = new JLabel("Father Name ");
		lblNewLabel_2_8_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upfatmob = new JTextField();
		upfatmob.setHorizontalAlignment(SwingConstants.CENTER);
		upfatmob.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upfatmob.setColumns(10);
		upfatmob.setBorder(null);
		upfatmob.setBackground(new Color(250, 235, 215));
		upfatmob.getText();
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Mobile Number ( Father )");
		lblNewLabel_2_2_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_4_2_1 = new JLabel("Occupation ( Father )");
		lblNewLabel_2_4_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upfoccp = new JTextField();
		upfoccp.setHorizontalAlignment(SwingConstants.CENTER);
		upfoccp.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upfoccp.setColumns(10);
		upfoccp.setBorder(null);
		upfoccp.setBackground(new Color(250, 235, 215));
		upfoccp.getText();
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Mother Name");
		lblNewLabel_2_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upmothernm = new JTextField();
		upmothernm.setHorizontalAlignment(SwingConstants.CENTER);
		upmothernm.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upmothernm.setColumns(10);
		upmothernm.setBorder(null);
		upmothernm.setBackground(new Color(250, 235, 215));
		upmothernm.getText();
		
		upmotmob = new JTextField();
		upmotmob.setHorizontalAlignment(SwingConstants.CENTER);
		upmotmob.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upmotmob.setColumns(10);
		upmotmob.setBorder(null);
		upmotmob.setBackground(new Color(250, 235, 215));
		upmotmob.getText();
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Mobile Number ( Mother )");
		lblNewLabel_2_3_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		upmoccp = new JTextField();
		upmoccp.setHorizontalAlignment(SwingConstants.CENTER);
		upmoccp.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		upmoccp.setColumns(10);
		upmoccp.setBorder(null);
		upmoccp.setBackground(new Color(250, 235, 215));
		upmoccp.getText();
		
		JLabel lblNewLabel_2_5_2_1 = new JLabel("Occupation ( Mother )");
		lblNewLabel_2_5_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JSeparator separator_2 = new JSeparator();
		
		JSeparator separator_1_2 = new JSeparator();
		
		JSeparator separator_1_1_1 = new JSeparator();
		
		JSeparator separator_2_1 = new JSeparator();
		
		JLabel lblNewLabel_2_9_1 = new JLabel("ENTER STUDENT REGISTER NUMBER");
		lblNewLabel_2_9_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		enreg = new JTextField();
		enreg.setHorizontalAlignment(SwingConstants.CENTER);
		enreg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		enreg.setColumns(10);
		enreg.setBorder(null);
		enreg.setBackground(new Color(250, 235, 215));
		enreg.getText();
		
		JButton btnNewButton_1 = new JButton("GET DETAILS");
		btnNewButton_1.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				
				// set the detils in to text fields by database
				
				// db connection
				  
				 try {
			/*	String url ="jdbc:mysql://localhost:3306/result_ms";
				String userName="root";
				String password="SIM@ss55simeon";  */
					 

						String url = "jdbc:mysql://db4free.net:3306/result_ms";
						String userName = "rootuseronline";
						String passWord = "rootuser123";
						
				
				// query 
				String query="select *from rms where regno='"+enreg.getText()+"'";
				Connection con = DriverManager.getConnection(url,userName,passWord);
                Statement st = con.createStatement();
                ResultSet rs =st.executeQuery(query);
                rs.next();
              
                
                /*
                rs.getString(1);
                rs.getString(2);
                rs.getString(3);
                rs.getString(4);
				
                rs.getString(5);
                rs.getString(6);
				
                rs.getString(7);
                rs.getString(8);
				
                rs.getString(9);
                rs.getString(10);
				
                rs.getString(11);
                rs.getString(12);
				
                rs.getString(13);
                rs.getString(14);
				
                rs.getString(15);
                rs.getString(16);
				
                rs.getString(17);
                rs.getString(18);
                */
				
                upstu.setText(rs.getString(1));
                upreg.setText(rs.getString(2));
                updptr.setText(rs.getString(3));
                upbranch.setText(rs.getString(4));
                upcourse.setText(rs.getString(5));
                upyear.setText(rs.getString(6));
                upmob.setText(rs.getString(7));
                upgender.setText(rs.getString(14));
                updob.setText(rs.getString(15));
                upcity.setText(rs.getString(16));
                upreligion.setText(rs.getString(17));
                upstate.setText(rs.getString(18));
                upfathernm.setText(rs.getString(8));
                upfatmob.setText(rs.getString(10));
                upfoccp.setText(rs.getString(12));
                upmothernm.setText(rs.getString(9));
                upmotmob.setText(rs.getString(11));
                upmoccp.setText(rs.getString(13));
           
				
				 }catch(SQLException e3){
					 e3.printStackTrace();				 }
				
				  
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		
		JButton btnNewButton_1_1 = new JButton("CLEAR ALL");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  upstu.setText("");
	                upreg.setText("");
	                updptr.setText("");
	                upbranch.setText("");
	                upcourse.setText("");
	                upyear.setText("");
	                upmob.setText("");
	                upgender.setText("");
	                updob.setText("");
	                upcity.setText("");
	                upreligion.setText("");
	                upstate.setText("");
	                upfathernm.setText("");
	                upfatmob.setText("");
	                upfoccp.setText("");
	                upmothernm.setText("");
	                upmotmob.setText("");
	                upmoccp.setText("");
				
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(255, 128, 0));
		
		JButton btnNewButton_1_2 = new JButton("UPDATE");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//update connections
				
			try {	
				
			
				String url = "jdbc:mysql://db4free.net:3306/result_ms";
				String userName = "rootuseronline";
				String passWord = "rootuser123";
				
				String query = "update rms set name = ? , regno=? , department=?, branch =?,course =?, year=?, phone =?, father_name=?, mother_name=?, father_number =?, mother_number=?, father_occupation =?, mother_occupation =?, gender=?, dob=?, city=? , religion=? , state=? where regno= ? ;";                   
				
				
			Connection con = DriverManager.getConnection(url,userName,passWord);
			PreparedStatement pst = con.prepareStatement(query);
			//pst.executeUpdate();
			pst.setString(1, upstu.getText());
			pst.setString(2, upreg.getText());
			pst.setString(3, updptr.getText());
			pst.setString(4, upbranch.getText());
			pst.setString(5, upcourse.getText()); 
			pst.setString(6, upyear.getText());
			pst.setString(7, upmob.getText());
			pst.setString(8, upfathernm.getText());
			pst.setString(9, upmothernm.getText());
			pst.setString(10, upfatmob.getText());
			pst.setString(11, upmotmob.getText());
			pst.setString(12, upfoccp.getText());
			pst.setString(13, upmoccp.getText());
			pst.setString(14, upgender.getText());
			pst.setString(15, updob.getText());
			pst.setString(16, upcity.getText());
			pst.setString(17, upreligion.getText());
			pst.setString(18, upstate.getText());
			pst.setString(19, enreg.getText());
			
			
			pst.executeUpdate();
			
		  //  pst.setString(2, upreg.getText());
			
		
			}
			
			catch(SQLException ss){
				if(ss.getMessage().equals("Illegal operation on empty result set.")) 
				{
					JOptionPane.showMessageDialog(frame, "REGISTER NUMBER FIELD CANNOT BE NULL !!");
				}
			}
			}
			
		});
		btnNewButton_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(new Color(255, 128, 0));
		GroupLayout gl_Update_StudentsPanel = new GroupLayout(Update_StudentsPanel);
		gl_Update_StudentsPanel.setHorizontalGroup(
			gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_9_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(enreg, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_6_3, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_2_1, GroupLayout.PREFERRED_SIZE, 839, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(upstu, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_9, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_2_3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addComponent(upreg, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_4_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(updptr, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(upbranch, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_3_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(upcourse, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(upyear, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_5_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator_1_2, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_6_1_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_7_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(upmob, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_2_1_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addComponent(upgender, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_4_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(updob, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(upcity, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_3_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(upreligion, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(upstate, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_5_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator_1_1_1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_6_2_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_8_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(upfathernm, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(upfatmob, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_2_2_1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_4_2_1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(upfoccp, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_1_2_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(upmothernm, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_3_2_1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(upmotmob, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_5_2_1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(upmoccp, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))))
		);
		gl_Update_StudentsPanel.setVerticalGroup(
			gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel_2_9_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(enreg, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_6_3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(38)
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_2_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upstu, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_2_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upreg, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_4_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(updptr, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upbranch, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_3_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upcourse, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upyear, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_5_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(38)
							.addComponent(separator_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_6_1_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_7_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upmob, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_2_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upgender, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_4_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(updob, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upcity, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_3_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upreligion, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upstate, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_5_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(38)
							.addComponent(separator_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_6_2_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_8_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upfathernm, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upfatmob, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_2_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_4_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upfoccp, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upmothernm, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_3_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upmotmob, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_5_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(upmoccp, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
		);
		Update_StudentsPanel.setLayout(gl_Update_StudentsPanel);
		
		ManageAccount_panel = new JPanel();
		ManageAccount_panel.setBackground(new Color(128, 128, 64));
		Sub_Home.add(ManageAccount_panel, "name_20923324735300");
		GroupLayout gl_home = new GroupLayout(home);
		gl_home.setHorizontalGroup(
			gl_home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_home.createSequentialGroup()
					.addComponent(SidePanel_Home, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(Sub_Home, GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE))
		);
		gl_home.setVerticalGroup(
			gl_home.createParallelGroup(Alignment.LEADING)
				.addComponent(SidePanel_Home, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(Sub_Home, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
		);
		home.setLayout(gl_home);
		
		Internal_Result = new JPanel();
		Internal_Result.setBackground(new Color(240, 240, 240));
		MainPanel.add(Internal_Result, "name_16548860353100");
		
		JPanel SidePanel_InternalAssessment = new JPanel();
		SidePanel_InternalAssessment.setBorder(new LineBorder(new Color(0, 0, 0)));
		SidePanel_InternalAssessment.setBackground(new Color(250, 235, 215));
		
		JButton btn_AllStudents_1 = new JButton("Internals 1");
		btn_AllStudents_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchInternalResultPanels(Internals_1);
			}
		});
		btn_AllStudents_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AllStudents_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AllStudents_1.setBackground(new Color(255, 255, 255));
		
		JButton btn_AddStudents_1 = new JButton("Internals 2");
		btn_AddStudents_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchInternalResultPanels(Internals_2);
			}
		});
		btn_AddStudents_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AddStudents_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AddStudents_1.setBackground(Color.WHITE);
		
		JButton btnInternals = new JButton("Internals 3");
		btnInternals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchInternalResultPanels(Internals_3);
			}
		});
		btnInternals.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnInternals.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnInternals.setBackground(Color.WHITE);
		GroupLayout gl_SidePanel_InternalAssessment = new GroupLayout(SidePanel_InternalAssessment);
		gl_SidePanel_InternalAssessment.setHorizontalGroup(
			gl_SidePanel_InternalAssessment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_InternalAssessment.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_SidePanel_InternalAssessment.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_AllStudents_1, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_AddStudents_1, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInternals, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_SidePanel_InternalAssessment.setVerticalGroup(
			gl_SidePanel_InternalAssessment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_InternalAssessment.createSequentialGroup()
					.addGap(37)
					.addComponent(btn_AllStudents_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btn_AddStudents_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnInternals, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(425, Short.MAX_VALUE))
		);
		SidePanel_InternalAssessment.setLayout(gl_SidePanel_InternalAssessment);
		
		Sub_Internal_panel = new JLayeredPane();
		Sub_Internal_panel.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		Sub_Internal_panel.setLayout(new CardLayout(0, 0));
		
		Internals_1 = new JPanel();
		Sub_Internal_panel.add(Internals_1, "name_121809972014400");
		
		JLabel lblNewLabel_2_10 = new JLabel("Student Register Number");
		lblNewLabel_2_10.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r_reg = new JTextField();
		r_reg.setHorizontalAlignment(SwingConstants.CENTER);
		r_reg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r_reg.setColumns(10);
		r_reg.setBorder(null);
		r_reg.setBackground(new Color(250, 235, 215));
		r_reg.getText();
		
		JLabel lblNewLabel_2_10_1 = new JLabel("Student Name");
		lblNewLabel_2_10_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r_stunm = new JTextField();
		r_stunm.setHorizontalAlignment(SwingConstants.CENTER);
		r_stunm.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r_stunm.setColumns(10);
		r_stunm.setBorder(null);
		r_stunm.setBackground(new Color(250, 235, 215));
		r_stunm.getText();
		
		JLabel lblNewLabel_2_10_1_1 = new JLabel("Branch");
		lblNewLabel_2_10_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r_branch = new JTextField();
		r_branch.setHorizontalAlignment(SwingConstants.CENTER);
		r_branch.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r_branch.setColumns(10);
		r_branch.setBorder(null);
		r_branch.setBackground(new Color(250, 235, 215));
		r_branch.getText();
		
		JLabel lblNewLabel_2_10_1_2 = new JLabel("Course");
		lblNewLabel_2_10_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r_degree = new JTextField();
		r_degree.setHorizontalAlignment(SwingConstants.CENTER);
		r_degree.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r_degree.setColumns(10);
		r_degree.setBorder(null);
		r_degree.setBackground(new Color(250, 235, 215));
		r_degree.getText();
		
		r_year = new JTextField();
		r_year.setHorizontalAlignment(SwingConstants.CENTER);
		r_year.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r_year.setColumns(10);
		r_year.setBorder(null);
		r_year.setBackground(new Color(250, 235, 215));
		r_year.getText();
		
		JSeparator separator_3 = new JSeparator();
		
		JButton btnNewButton_3 = new JButton("Get Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String url = "jdbc:mysql://localhost:3306/result_ms";
				String userName = "root";
				String passWord = "SIM@ss55simeon";
				
				// query 
				String query="select *from rms where regno='"+r_reg.getText()+"'";
				Connection con;
				try {
					con = DriverManager.getConnection(url,userName,passWord);
					
					
					 Statement st = con.createStatement();
		                ResultSet rs =st.executeQuery(query);
		                rs.next();
		                r_stunm.setText(rs.getString(1));
		                r_degree.setText(rs.getString(5));
		                r_branch.setText(rs.getString(4));
		                r_year.setText(rs.getString(6));
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
               
              
			}
		});
		btnNewButton_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		JSeparator separator_3_1 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_4 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		subc1 = new JTextField();
		subc1.setHorizontalAlignment(SwingConstants.CENTER);
		subc1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		subc1.setColumns(10);
		subc1.setBorder(null);
		subc1.setBackground(new Color(250, 235, 215));
		subc1.getText();
		
		JLabel lblNewLabel_2_10_1_4_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		mrk1 = new JTextField();
		mrk1.setHorizontalAlignment(SwingConstants.CENTER);
		mrk1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mrk1.setColumns(10);
		mrk1.setBorder(null);
		mrk1.setBackground(new Color(250, 235, 215));
		mrk1.getText();
		
		JLabel lblNewLabel_2_10_1_4_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		subc2 = new JTextField();
		subc2.setHorizontalAlignment(SwingConstants.CENTER);
		subc2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		subc2.setColumns(10);
		subc2.setBorder(null);
		subc2.setBackground(new Color(250, 235, 215));
		subc2.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		mrk2 = new JTextField();
		mrk2.setHorizontalAlignment(SwingConstants.CENTER);
		mrk2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mrk2.setColumns(10);
		mrk2.setBorder(null);
		mrk2.setBackground(new Color(250, 235, 215));
		mrk2.getText();
		
		JLabel lblNewLabel_2_10_1_4_3 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		subc3 = new JTextField();
		subc3.setHorizontalAlignment(SwingConstants.CENTER);
		subc3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		subc3.setColumns(10);
		subc3.setBorder(null);
		subc3.setBackground(new Color(250, 235, 215));
		subc3.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		mrk3 = new JTextField();
		mrk3.setHorizontalAlignment(SwingConstants.CENTER);
		mrk3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mrk3.setColumns(10);
		mrk3.setBorder(null);
		mrk3.setBackground(new Color(250, 235, 215));
		mrk3.getText();
		
		JLabel lblNewLabel_2_10_1_4_4 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		subc4 = new JTextField();
		subc4.setHorizontalAlignment(SwingConstants.CENTER);
		subc4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		subc4.setColumns(10);
		subc4.setBorder(null);
		subc4.setBackground(new Color(250, 235, 215));
		subc4.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_3 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		mrk4 = new JTextField();
		mrk4.setHorizontalAlignment(SwingConstants.CENTER);
		mrk4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mrk4.setColumns(10);
		mrk4.setBorder(null);
		mrk4.setBackground(new Color(250, 235, 215));
		mrk4.getText();
		
		JLabel lblNewLabel_2_10_1_4_5 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		subc5 = new JTextField();
		subc5.setHorizontalAlignment(SwingConstants.CENTER);
		subc5.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		subc5.setColumns(10);
		subc5.setBorder(null);
		subc5.setBackground(new Color(250, 235, 215));
		subc5.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_4 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		mrk5 = new JTextField();
		mrk5.setHorizontalAlignment(SwingConstants.CENTER);
		mrk5.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mrk5.setColumns(10);
		mrk5.setBorder(null);
		mrk5.setBackground(new Color(250, 235, 215));
		mrk5.getText();
		
		JLabel lblNewLabel_2_10_1_4_6 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		subc6 = new JTextField();
		subc6.setHorizontalAlignment(SwingConstants.CENTER);
		subc6.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		subc6.setColumns(10);
		subc6.setBorder(null);
		subc6.setBackground(new Color(250, 235, 215));
		subc6.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_5 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		mrk6 = new JTextField();
		mrk6.setHorizontalAlignment(SwingConstants.CENTER);
		mrk6.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mrk6.setColumns(10);
		mrk6.setBorder(null);
		mrk6.setBackground(new Color(250, 235, 215));
		mrk6.getText();
		
		JLabel lblNewLabel_2_10_1_4_7 = new JLabel("SUBJECT AND MARK DETAILS");
		lblNewLabel_2_10_1_4_7.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_7.setBackground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("SEM 1");
		tglbtnNewToggleButton.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_3_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_1.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_4.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_4.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_1.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_2_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_1.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JButton btnNewButton_4 = new JButton("UPLOAD RESULT");
		btnNewButton_4.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JPanel ResultPreview_Panel = new JPanel();
		ResultPreview_Panel.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_2_10_1_2_1 = new JLabel("Year");
		lblNewLabel_2_10_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("INTERNAL ASSESSMENT 1");
		lblNewLabel_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_3.setBackground(new Color(255, 128, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		GroupLayout gl_Internals_1 = new GroupLayout(Internals_1);
		gl_Internals_1.setHorizontalGroup(
			gl_Internals_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_1.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(r_reg, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(lblNewLabel_2_10, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
									.addGap(38)))
							.addGap(13)
							.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
							.addGap(48)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
							.addGap(15))
						.addComponent(separator_3, GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r_stunm, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(r_degree, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2_10_1_2, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
							.addGap(357))
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r_branch, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_1, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
								.addComponent(r_year, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
							.addGap(357))
						.addComponent(separator_3_1, GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2_10_1_4_7, GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(subc1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(lblNewLabel_2_10_1_4, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
									.addGap(1))
								.addComponent(subc2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(subc3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(mrk1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(mrk2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(mrk3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(subc4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(subc5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(subc6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_2_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(mrk4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(mrk5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(mrk6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_3, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(tglbtnNewToggleButton_3_1, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
									.addGap(1)))
							.addGap(28)
							.addComponent(ResultPreview_Panel, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
						.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE))
					.addGap(42))
		);
		gl_Internals_1.setVerticalGroup(
			gl_Internals_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGap(138)
							.addComponent(lblNewLabel_2_10_1_2_1, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
							.addGap(429))
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(r_reg, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
									.addGap(1))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(lblNewLabel_2_10, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
									.addGap(24))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addGroup(gl_Internals_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
							.addGap(23)
							.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(r_stunm, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(r_degree, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(r_branch, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(r_year, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
							.addGap(20)
							.addComponent(separator_3_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_2_10_1_4_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(17)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_Internals_1.createSequentialGroup()
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(subc1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(subc2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(subc3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(22)
											.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(tglbtnNewToggleButton_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Internals_1.createSequentialGroup()
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(mrk1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(mrk2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(mrk3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(22)
											.addComponent(tglbtnNewToggleButton_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(tglbtnNewToggleButton_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Internals_1.createSequentialGroup()
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(subc4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(subc5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(subc6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(22)
											.addComponent(tglbtnNewToggleButton_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(tglbtnNewToggleButton_2_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Internals_1.createSequentialGroup()
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(mrk4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(mrk5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(mrk6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(22)
											.addComponent(tglbtnNewToggleButton_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(tglbtnNewToggleButton_3_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
									.addGap(14))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(ResultPreview_Panel, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(19))))
		);
		ResultPreview_Panel.setLayout(null);
		
		JLabel lblNewLabel_2_10_1_4_4_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1.setBounds(38, 46, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1.setBounds(165, 46, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_1.setBounds(165, 81, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_2.setBounds(38, 81, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_2.setBounds(165, 116, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_3 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_3.setBounds(38, 116, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_3);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_3 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_3.setBounds(165, 151, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1_3);
		
		JLabel lblNewLabel_2_10_1_4_4_1_4 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_4.setBounds(38, 151, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_4);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_4 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_4.setBounds(165, 188, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1_4);
		
		JLabel lblNewLabel_2_10_1_4_4_1_5 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_5.setBounds(38, 188, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_5);
		
		JLabel lblNewLabel_2_10_1_4_4_1_6 = new JLabel("RESULT PREVIEW");
		lblNewLabel_2_10_1_4_4_1_6.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_4_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_6.setBounds(8, 10, 311, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_6);
		Internals_1.setLayout(gl_Internals_1);
		
		Internals_2 = new JPanel();
		Sub_Internal_panel.add(Internals_2, "name_121816744831900");
		
		JLabel lblNewLabel_2_10_2 = new JLabel("Student Register Number");
		lblNewLabel_2_10_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_reg = new JTextField();
		r2_reg.setHorizontalAlignment(SwingConstants.CENTER);
		r2_reg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_reg.setColumns(10);
		r2_reg.setBorder(null);
		r2_reg.setBackground(new Color(250, 235, 215));
		r2_reg.getText();
		
		JButton btnNewButton_3_3 = new JButton("Get Details");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				

				String url = "jdbc:mysql://localhost:3306/result_ms";
				String userName = "root";
				String passWord = "SIM@ss55simeon";
				
				// query 
				String query="select *from rms where regno='"+r2_reg.getText()+"'";
				Connection con;
				try {
					con = DriverManager.getConnection(url,userName,passWord);
					
					
					 Statement st = con.createStatement();
		                ResultSet rs =st.executeQuery(query);
		                rs.next();
		                r2_stu.setText(rs.getString(1));
		                r2_deg.setText(rs.getString(5));
		                r2_branch.setText(rs.getString(4));
		                r2_year.setText(rs.getString(6));
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_3_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		btnNewButton_3_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_3_3.setBackground(Color.WHITE);
		
		JSeparator separator_3_2 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_3 = new JLabel("Student Name");
		lblNewLabel_2_10_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_stu = new JTextField();
		r2_stu.setHorizontalAlignment(SwingConstants.CENTER);
		r2_stu.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_stu.setColumns(10);
		r2_stu.setBorder(null);
		r2_stu.setBackground(new Color(250, 235, 215));
		r2_stu.getText();
		
		JLabel lblNewLabel_2_10_1_1_1 = new JLabel("Branch");
		lblNewLabel_2_10_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_branch = new JTextField();
		r2_branch.setHorizontalAlignment(SwingConstants.CENTER);
		r2_branch.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_branch.setColumns(10);
		r2_branch.setBorder(null);
		r2_branch.setBackground(new Color(250, 235, 215));
		r2_branch.getText();
		
		JLabel lblNewLabel_2_10_1_2_2 = new JLabel("Course");
		lblNewLabel_2_10_1_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_deg = new JTextField();
		r2_deg.setHorizontalAlignment(SwingConstants.CENTER);
		r2_deg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_deg.setColumns(10);
		r2_deg.setBorder(null);
		r2_deg.setBackground(new Color(250, 235, 215));
		r2_deg.getText();
		
		JLabel lblNewLabel_2_10_1_2_1_1 = new JLabel("Year");
		lblNewLabel_2_10_1_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_year = new JTextField();
		r2_year.setHorizontalAlignment(SwingConstants.CENTER);
		r2_year.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_year.setColumns(10);
		r2_year.setBorder(null);
		r2_year.setBackground(new Color(250, 235, 215));
		r2_year.getText();
		
		JLabel lblNewLabel_2_10_1_4_7_1 = new JLabel("SUBJECT AND MARK DETAILS");
		lblNewLabel_2_10_1_4_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_7_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_7_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblNewLabel_2_10_1_4_7_1.setBackground(new Color(255, 128, 0));
		
		JSeparator separator_3_1_1 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_4_8 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_8.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_subc1 = new JTextField();
		r2_subc1.setHorizontalAlignment(SwingConstants.CENTER);
		r2_subc1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_subc1.setColumns(10);
		r2_subc1.setBorder(null);
		r2_subc1.setBackground(new Color(250, 235, 215));
		r2_subc1.getText();
		
		JLabel lblNewLabel_2_10_1_4_2_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_subc2 = new JTextField();
		r2_subc2.setHorizontalAlignment(SwingConstants.CENTER);
		r2_subc2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_subc2.setColumns(10);
		r2_subc2.setBorder(null);
		r2_subc2.setBackground(new Color(250, 235, 215));
		r2_subc2.getText();
		
		JLabel lblNewLabel_2_10_1_4_3_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_subc3 = new JTextField();
		r2_subc3.setHorizontalAlignment(SwingConstants.CENTER);
		r2_subc3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_subc3.setColumns(10);
		r2_subc3.setBorder(null);
		r2_subc3.setBackground(new Color(250, 235, 215));
		r2_subc3.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_6 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_mrk1 = new JTextField();
		r2_mrk1.setHorizontalAlignment(SwingConstants.CENTER);
		r2_mrk1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_mrk1.setColumns(10);
		r2_mrk1.setBorder(null);
		r2_mrk1.setBackground(new Color(250, 235, 215));
		r2_mrk1.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_mrk2 = new JTextField();
		r2_mrk2.setHorizontalAlignment(SwingConstants.CENTER);
		r2_mrk2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_mrk2.setColumns(10);
		r2_mrk2.setBorder(null);
		r2_mrk2.setBackground(new Color(250, 235, 215));
		r2_mrk2.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_2_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_mrk3 = new JTextField();
		r2_mrk3.setHorizontalAlignment(SwingConstants.CENTER);
		r2_mrk3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_mrk3.setColumns(10);
		r2_mrk3.setBorder(null);
		r2_mrk3.setBackground(new Color(250, 235, 215));
		r2_mrk3.getText();
		
		JLabel lblNewLabel_2_10_1_4_4_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_subc4 = new JTextField();
		r2_subc4.setHorizontalAlignment(SwingConstants.CENTER);
		r2_subc4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_subc4.setColumns(10);
		r2_subc4.setBorder(null);
		r2_subc4.setBackground(new Color(250, 235, 215));
		r2_subc4.getText();
		
		JLabel lblNewLabel_2_10_1_4_5_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_subc5 = new JTextField();
		r2_subc5.setHorizontalAlignment(SwingConstants.CENTER);
		r2_subc5.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_subc5.setColumns(10);
		r2_subc5.setBorder(null);
		r2_subc5.setBackground(new Color(250, 235, 215));
		r2_subc5.getText();
		
		r2_subc6 = new JTextField();
		r2_subc6.setHorizontalAlignment(SwingConstants.CENTER);
		r2_subc6.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_subc6.setColumns(10);
		r2_subc6.setBorder(null);
		r2_subc6.setBackground(new Color(250, 235, 215));
		r2_subc6.getText();
		
		JLabel lblNewLabel_2_10_1_4_6_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_6_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_10_1_4_1_3_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_mrk4 = new JTextField();
		r2_mrk4.setHorizontalAlignment(SwingConstants.CENTER);
		r2_mrk4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_mrk4.setColumns(10);
		r2_mrk4.setBorder(null);
		r2_mrk4.setBackground(new Color(250, 235, 215));
		r2_mrk4.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_4_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_mrk5 = new JTextField();
		r2_mrk5.setHorizontalAlignment(SwingConstants.CENTER);
		r2_mrk5.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_mrk5.setColumns(10);
		r2_mrk5.setBorder(null);
		r2_mrk5.setBackground(new Color(250, 235, 215));
		r2_mrk5.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_5_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r2_mrk6 = new JTextField();
		r2_mrk6.setHorizontalAlignment(SwingConstants.CENTER);
		r2_mrk6.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r2_mrk6.setColumns(10);
		r2_mrk6.setBorder(null);
		r2_mrk6.setBackground(new Color(250, 235, 215));
		r2_mrk6.getText();
		
		JPanel ResultPreview_Panel_1 = new JPanel();
		ResultPreview_Panel_1.setLayout(null);
		ResultPreview_Panel_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_10_1_4_4_1_7 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_7.setBounds(38, 46, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_7);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_5 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_5.setBounds(165, 46, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_5);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_1_1.setBounds(165, 81, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_1_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_2_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_2_1.setBounds(38, 81, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_2_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_2_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_2_1.setBounds(165, 116, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_2_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_3_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_3_1.setBounds(38, 116, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_3_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_3_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_3_1.setBounds(165, 151, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_3_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_4_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_4_1.setBounds(38, 151, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_4_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_4_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_4_1.setBounds(165, 188, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_4_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_5_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_5_1.setBounds(38, 188, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_5_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_6_1 = new JLabel("RESULT PREVIEW");
		lblNewLabel_2_10_1_4_4_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_6_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_4_1_6_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_6_1.setBounds(8, 10, 311, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_6_1);
		
		JButton btnNewButton_4_1 = new JButton("UPLOAD RESULT");
		btnNewButton_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_4_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_4_1.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_3_1_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_1_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_3_1_1.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_3_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_3_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_2_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_2_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_2_1_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_1_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_2_1_1.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_1_1_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_1_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_1_1_1.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_1_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_1_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_5.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_5.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_4_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_4_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_4_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3_1 = new JLabel("INTERNAL ASSESSMENT 2");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_3_1.setBackground(new Color(255, 128, 0));
		GroupLayout gl_Internals_2 = new GroupLayout(Internals_2);
		gl_Internals_2.setHorizontalGroup(
			gl_Internals_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_2.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_2, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_reg, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addComponent(btnNewButton_3_3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_3_2, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_3, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_stu, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_2, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_deg, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_branch, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_1_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_year, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator_3_1_1, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_10_1_4_7_1, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_8, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_subc1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_subc2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_2_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_subc3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_3_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_4_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(r2_mrk1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_mrk2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_mrk3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_2_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_1_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(r2_subc4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_4_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_5_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_subc5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_subc6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_6_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_2_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_2_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(r2_mrk4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_3_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_4_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_mrk5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_5_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r2_mrk6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_3_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_3_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addComponent(ResultPreview_Panel_1, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)))
		);
		gl_Internals_2.setVerticalGroup(
			gl_Internals_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_2.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_10_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(23)
							.addComponent(r2_reg, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_3_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addGap(23)
					.addComponent(separator_3_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_10_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(23)
							.addComponent(r2_stu, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_10_1_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(23)
							.addComponent(r2_deg, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_branch, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addComponent(lblNewLabel_2_10_1_2_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(r2_year, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(20)
					.addComponent(separator_3_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_2_10_1_4_7_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_subc1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_subc2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_subc3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_3_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_4_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_mrk1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_mrk2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_mrk3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_1_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_subc4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_4_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_5_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_subc5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_subc6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_6_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_2_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_2_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_mrk4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_3_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_4_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_mrk5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_5_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(r2_mrk6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_3_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_3_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(ResultPreview_Panel_1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
		);
		Internals_2.setLayout(gl_Internals_2);
		
		Internals_3 = new JPanel();
		Sub_Internal_panel.add(Internals_3, "name_121864627905500");
		
		JLabel lblNewLabel_2_10_3 = new JLabel("Student Register Number");
		lblNewLabel_2_10_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_reg = new JTextField();
		r3_reg.setHorizontalAlignment(SwingConstants.CENTER);
		r3_reg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_reg.setColumns(10);
		r3_reg.setBorder(null);
		r3_reg.setBackground(new Color(250, 235, 215));
		r3_reg.getText();
		
		JButton btnNewButton_3_4 = new JButton("Get Details");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				String url = "jdbc:mysql://localhost:3306/result_ms";
				String userName = "root";
				String passWord = "SIM@ss55simeon";
				
				// query 
				String query="select *from rms where regno='"+r3_reg.getText()+"'";
				Connection con;
				try {
					con = DriverManager.getConnection(url,userName,passWord);
					
					
					 Statement st = con.createStatement();
		                ResultSet rs =st.executeQuery(query);
		                rs.next();
		                r3_stu.setText(rs.getString(1));
		                r3_deg.setText(rs.getString(5));
		                r3_branch.setText(rs.getString(4));
		                r3_year.setText(rs.getString(6));
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
               
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_3_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		btnNewButton_3_4.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_3_4.setBackground(Color.WHITE);
		
		JSeparator separator_3_3 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_5 = new JLabel("Student Name");
		lblNewLabel_2_10_1_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_stu = new JTextField();
		r3_stu.setHorizontalAlignment(SwingConstants.CENTER);
		r3_stu.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_stu.setColumns(10);
		r3_stu.setBorder(null);
		r3_stu.setBackground(new Color(250, 235, 215));
		r3_stu.getText();
		
		JLabel lblNewLabel_2_10_1_1_2 = new JLabel("Branch");
		lblNewLabel_2_10_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_branch = new JTextField();
		r3_branch.setHorizontalAlignment(SwingConstants.CENTER);
		r3_branch.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_branch.setColumns(10);
		r3_branch.setBorder(null);
		r3_branch.setBackground(new Color(250, 235, 215));
		r3_branch.getText();
		
		JLabel lblNewLabel_2_10_1_2_3 = new JLabel("Course");
		lblNewLabel_2_10_1_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_deg = new JTextField();
		r3_deg.setHorizontalAlignment(SwingConstants.CENTER);
		r3_deg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_deg.setColumns(10);
		r3_deg.setBorder(null);
		r3_deg.setBackground(new Color(250, 235, 215));
		r3_deg.getText();
		
		JLabel lblNewLabel_2_10_1_2_1_2 = new JLabel("Year");
		lblNewLabel_2_10_1_2_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_year = new JTextField();
		r3_year.setHorizontalAlignment(SwingConstants.CENTER);
		r3_year.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_year.setColumns(10);
		r3_year.setBorder(null);
		r3_year.setBackground(new Color(250, 235, 215));
		r3_year.getText();
		
		JLabel lblNewLabel_2_10_1_4_7_2 = new JLabel("SUBJECT AND MARK DETAILS");
		lblNewLabel_2_10_1_4_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_7_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_7_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblNewLabel_2_10_1_4_7_2.setBackground(new Color(255, 128, 0));
		
		JSeparator separator_3_1_2 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_4_9 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_9.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_subc1 = new JTextField();
		r3_subc1.setHorizontalAlignment(SwingConstants.CENTER);
		r3_subc1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_subc1.setColumns(10);
		r3_subc1.setBorder(null);
		r3_subc1.setBackground(new Color(250, 235, 215));
		r3_subc1.getText();
		
		JLabel lblNewLabel_2_10_1_4_2_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_subc2 = new JTextField();
		r3_subc2.setHorizontalAlignment(SwingConstants.CENTER);
		r3_subc2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_subc2.setColumns(10);
		r3_subc2.setBorder(null);
		r3_subc2.setBackground(new Color(250, 235, 215));
		r3_subc2.getText();
		
		JLabel lblNewLabel_2_10_1_4_3_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_subc3 = new JTextField();
		r3_subc3.setHorizontalAlignment(SwingConstants.CENTER);
		r3_subc3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_subc3.setColumns(10);
		r3_subc3.setBorder(null);
		r3_subc3.setBackground(new Color(250, 235, 215));
		r3_subc3.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_7 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_mrk1 = new JTextField();
		r3_mrk1.setHorizontalAlignment(SwingConstants.CENTER);
		r3_mrk1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_mrk1.setColumns(10);
		r3_mrk1.setBorder(null);
		r3_mrk1.setBackground(new Color(250, 235, 215));
		r3_mrk1.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_1_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_mrk2 = new JTextField();
		r3_mrk2.setHorizontalAlignment(SwingConstants.CENTER);
		r3_mrk2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_mrk2.setColumns(10);
		r3_mrk2.setBorder(null);
		r3_mrk2.setBackground(new Color(250, 235, 215));
		r3_mrk2.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_2_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_mrk3 = new JTextField();
		r3_mrk3.setHorizontalAlignment(SwingConstants.CENTER);
		r3_mrk3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_mrk3.setColumns(10);
		r3_mrk3.setBorder(null);
		r3_mrk3.setBackground(new Color(250, 235, 215));
		r3_mrk3.getText();
		
		JLabel lblNewLabel_2_10_1_4_4_3 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_subc4 = new JTextField();
		r3_subc4.setHorizontalAlignment(SwingConstants.CENTER);
		r3_subc4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_subc4.setColumns(10);
		r3_subc4.setBorder(null);
		r3_subc4.setBackground(new Color(250, 235, 215));
		r3_subc4.getText();
		
		JLabel lblNewLabel_2_10_1_4_5_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_subc5 = new JTextField();
		r3_subc5.setHorizontalAlignment(SwingConstants.CENTER);
		r3_subc5.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_subc5.setColumns(10);
		r3_subc5.setBorder(null);
		r3_subc5.setBackground(new Color(250, 235, 215));
		r3_subc5.getText();
		
		r3_subc6 = new JTextField();
		r3_subc6.setHorizontalAlignment(SwingConstants.CENTER);
		r3_subc6.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_subc6.setColumns(10);
		r3_subc6.setBorder(null);
		r3_subc6.setBackground(new Color(250, 235, 215));
		r3_subc6.getText();
		
		JLabel lblNewLabel_2_10_1_4_6_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_6_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_10_1_4_1_3_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_mrk4 = new JTextField();
		r3_mrk4.setHorizontalAlignment(SwingConstants.CENTER);
		r3_mrk4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_mrk4.setColumns(10);
		r3_mrk4.setBorder(null);
		r3_mrk4.setBackground(new Color(250, 235, 215));
		r3_mrk4.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_4_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_mrk5 = new JTextField();
		r3_mrk5.setHorizontalAlignment(SwingConstants.CENTER);
		r3_mrk5.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_mrk5.setColumns(10);
		r3_mrk5.setBorder(null);
		r3_mrk5.setBackground(new Color(250, 235, 215));
		r3_mrk5.getText();
		
		JLabel lblNewLabel_2_10_1_4_1_5_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		r3_mrk6 = new JTextField();
		r3_mrk6.setHorizontalAlignment(SwingConstants.CENTER);
		r3_mrk6.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		r3_mrk6.setColumns(10);
		r3_mrk6.setBorder(null);
		r3_mrk6.setBackground(new Color(250, 235, 215));
		r3_mrk6.getText();
		
		JPanel ResultPreview_Panel_2 = new JPanel();
		ResultPreview_Panel_2.setLayout(null);
		ResultPreview_Panel_2.setBackground(Color.WHITE);
		 
		JLabel lblNewLabel_2_10_1_4_4_1_8 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_8.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_8.setBounds(38, 46, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_8);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_6 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_6.setBounds(165, 46, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_6);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_1_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_1_2.setBounds(165, 81, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_1_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_2_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_2_2.setBounds(38, 81, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_2_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_2_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_2_2.setBounds(165, 116, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_2_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_3_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_3_2.setBounds(38, 116, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_3_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_3_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_3_2.setBounds(165, 151, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_3_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_4_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_4_2.setBounds(38, 151, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_4_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_4_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_4_2.setBounds(165, 188, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_4_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_5_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_5_2.setBounds(38, 188, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_5_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_6_2 = new JLabel("RESULT PREVIEW");
		lblNewLabel_2_10_1_4_4_1_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_6_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_4_1_6_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_6_2.setBounds(8, 10, 311, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_6_2);
		
		JButton btnNewButton_4_2 = new JButton("UPLOAD RESULT");
		btnNewButton_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_4_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_4_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_3_1_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_1_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_3_1_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_3_3 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_3_3.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_2_3 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_2_3.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_2_1_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_1_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_2_1_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_1_1_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_1_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_1_1_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_1_3 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_1_3.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_6.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_6.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_4_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_4_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_4_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3_2 = new JLabel("INTERNAL ASSESSMENT 3");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_3_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_3_2.setBackground(new Color(255, 128, 0));
		GroupLayout gl_Internals_3 = new GroupLayout(Internals_3);
		gl_Internals_3.setHorizontalGroup(
			gl_Internals_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_3.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(r3_reg, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_3, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addComponent(btnNewButton_3_4, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(51)
							.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_3_3, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_5, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_stu, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_3, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_deg, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1_2, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_branch, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_1_2, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_year, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator_3_1_2, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_10_1_4_7_2, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_9, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_subc1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_subc2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_2_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_subc3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_3_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_4_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(r3_mrk1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_7, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_mrk2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_mrk3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_2_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_1_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_1_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_4_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_subc4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_subc5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_5_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_subc6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_6_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_2_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_2_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_3_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_mrk4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_mrk5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_4_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(r3_mrk6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_5_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_3_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_3_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addComponent(ResultPreview_Panel_2, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_4_2, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)))
		);
		gl_Internals_3.setVerticalGroup(
			gl_Internals_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_3.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(23)
							.addComponent(r3_reg, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_10_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_3_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addGap(23)
					.addComponent(separator_3_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_10_1_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(23)
							.addComponent(r3_stu, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_10_1_2_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(23)
							.addComponent(r3_deg, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_branch, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addComponent(lblNewLabel_2_10_1_2_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(r3_year, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(20)
					.addComponent(separator_3_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_2_10_1_4_7_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_subc1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_subc2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_subc3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_3_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_4_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_mrk1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_mrk2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_mrk3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_1_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_1_1_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_4_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_subc4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_subc5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_5_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_subc6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_6_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_2_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_2_1_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_3_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_mrk4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_mrk5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_4_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(r3_mrk6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_5_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_3_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_3_1_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(ResultPreview_Panel_2, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(btnNewButton_4_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
		);
		Internals_3.setLayout(gl_Internals_3);
		GroupLayout gl_Internal_Result = new GroupLayout(Internal_Result);
		gl_Internal_Result.setHorizontalGroup(
			gl_Internal_Result.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internal_Result.createSequentialGroup()
					.addGroup(gl_Internal_Result.createParallelGroup(Alignment.LEADING)
						.addComponent(SidePanel_InternalAssessment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internal_Result.createSequentialGroup()
							.addGap(237)
							.addComponent(Sub_Internal_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_Internal_Result.setVerticalGroup(
			gl_Internal_Result.createParallelGroup(Alignment.LEADING)
				.addComponent(SidePanel_InternalAssessment, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_Internal_Result.createSequentialGroup()
					.addComponent(Sub_Internal_panel, GroupLayout.PREFERRED_SIZE, 602, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Internal_Result.setLayout(gl_Internal_Result);
		
		JPanel Semester_Result = new JPanel();
		Semester_Result.setBackground(new Color(255, 128, 128));
		MainPanel.add(Semester_Result, "name_16552693044299");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(Header_panel, GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
					.addGap(1))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(MainPanel, GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
					.addGap(1))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(Header_panel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(MainPanel, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
		);
		Header_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome , PPG COLLAGE RESULT MANAGEMENT SYSTEM ");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel.setBounds(8, 0, 459, 35);
		Header_panel.add(lblNewLabel);
		frame.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuBar.setBackground(new Color(250, 235, 215));
		menuBar.setBorderPainted(false);
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		mnNewMenu.setMargin(new Insets(5, 5, 5, 5));
		mnNewMenu.setForeground(new Color(0, 0, 0));
		mnNewMenu.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Go Home");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchMainPanels(home);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Internal Assessment ");
		mnNewMenu_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		mnNewMenu_1.setBackground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Add Internal Results");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchMainPanels(Internal_Result);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Get Reports");
		mntmNewMenuItem_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Semester Exam");
		mnNewMenu_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		mnNewMenu_2.setBackground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Add Semester Result");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchMainPanels(Semester_Result);
				
			}
		});
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Get Report");
		mntmNewMenuItem_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		mntmNewMenuItem_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_3 = new JMenu("Others");
		mnNewMenu_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Manage Account");
		mntmNewMenuItem.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mnNewMenu_3.add(mntmNewMenuItem);
	}
}
