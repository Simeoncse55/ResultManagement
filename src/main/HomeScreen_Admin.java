package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class HomeScreen_Admin {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JLabel std_count;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen_Admin window = new HomeScreen_Admin();
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
	public HomeScreen_Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	
	
	
	public void Homedetails() throws SQLException {
		try {
			 String url = "jdbc:mysql://db4free.net:3306/result_ms";
			   String username = "rootuseronline";
			   String password = "rootuser123";
			String query = " SELECT count(*) from rms";
			Connection con = DriverManager.getConnection(url,username,password);
	         Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery(query);
	        rs.next();
	        std_count.setText(String.valueOf(rs.getInt(1)));
	        
	       
	        
	  
			
			}catch(SQLException ee) 
			{
				ee.printStackTrace();
				}
			
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Home_Panel_Admin = new JPanel();
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 128, 0));
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME TO RESULT SYSTEM ADMIN PANEL ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1186, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
					.addGap(7))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 39, Short.MAX_VALUE)
				.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);
		
		JPanel SidePanel_Admin = new JPanel();
		SidePanel_Admin.setBorder(new LineBorder(new Color(0, 0, 0)));
		SidePanel_Admin.setBackground(new Color(250, 235, 215));
		
		JButton btnNewButton_3_1 = new JButton("Log Out");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LoginScreen_Result login = new LoginScreen_Result();
				login.frame.setVisible(true);
			}
		});
		btnNewButton_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_3_1.setBackground(new Color(255, 128, 0));
		
		JButton btn_AllStudents = new JButton("Add Staff");
		btn_AllStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				
			}
		});
		btn_AllStudents.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AllStudents.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AllStudents.setBackground(Color.WHITE);
		
		JButton btn_AddStudents = new JButton("Delete Staff");
		btn_AddStudents.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AddStudents.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AddStudents.setBackground(Color.WHITE);
		
		JButton btnUpdateStaffInfo = new JButton("Update Staff info");
		btnUpdateStaffInfo.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnUpdateStaffInfo.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnUpdateStaffInfo.setBackground(Color.WHITE);
		
		JButton btnGetReport = new JButton("Get Report");
		btnGetReport.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnGetReport.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnGetReport.setBackground(Color.WHITE);
		
		JButton btnPublishResult = new JButton("Publish Result");
		btnPublishResult.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnPublishResult.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnPublishResult.setBackground(Color.WHITE);
		GroupLayout gl_SidePanel_Admin = new GroupLayout(SidePanel_Admin);
		gl_SidePanel_Admin.setHorizontalGroup(
			gl_SidePanel_Admin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_Admin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_SidePanel_Admin.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_AllStudents, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_AddStudents, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdateStaffInfo, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGetReport, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPublishResult, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_SidePanel_Admin.setVerticalGroup(
			gl_SidePanel_Admin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_Admin.createSequentialGroup()
					.addGap(37)
					.addComponent(btn_AllStudents, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btn_AddStudents, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUpdateStaffInfo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnGetReport, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPublishResult, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
					.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		SidePanel_Admin.setLayout(gl_SidePanel_Admin);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel Home = new JPanel();
		layeredPane.add(Home, "name_558242031144000");
		
		JLabel lblNewLabel = new JLabel("PPG GROUP OF INSTITUTION'S , COIMBATORE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 25));
		
		JLabel lblExaminationCell = new JLabel("OFFICE OF THE CONTROLLER OF THE EXAMINATION");
		lblExaminationCell.setHorizontalAlignment(SwingConstants.CENTER);
		lblExaminationCell.setForeground(Color.BLACK);
		lblExaminationCell.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblExaminationMonitoringSystem = new JLabel("EXAMINATION MONITORING SYSTEM");
		lblExaminationMonitoringSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblExaminationMonitoringSystem.setForeground(Color.BLACK);
		lblExaminationMonitoringSystem.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL STUDENTS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		lblNewLabel_1.setBounds(0, 10, 157, 30);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("IN SYSTEM");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(0, 38, 157, 30);
		panel_1_1.add(lblNewLabel_1_1);
		
		std_count = new JLabel("65");
		std_count.setHorizontalAlignment(SwingConstants.CENTER);
		std_count.setFont(new Font("Arial Black", Font.BOLD, 40));
		std_count.setBounds(0, 66, 157, 63);
		panel_1_1.add(std_count);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_1_2 = new JLabel("TOTAL COURSES");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(0, 10, 157, 30);
		panel_1_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("IN SYSTEM");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(0, 38, 157, 30);
		panel_1_1_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("06");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_1_1_1_1.setBounds(0, 66, 157, 63);
		panel_1_1_1.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(null);
		panel_1_1_2.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_1_3 = new JLabel("REGISTERED STAFFS");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(0, 10, 157, 30);
		panel_1_1_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("IN SYSTEM");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_1_1_3.setBounds(0, 38, 157, 30);
		panel_1_1_2.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("13");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_1_1_1_2.setBounds(0, 66, 157, 63);
		panel_1_1_2.add(lblNewLabel_1_1_1_2);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setBorder(null);
		panel_1_1_2_1.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_1_3_1 = new JLabel("REGISTERED INSTITUTION");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		lblNewLabel_1_3_1.setBounds(0, 10, 157, 30);
		panel_1_1_2_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("IN SYSTEM");
		lblNewLabel_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_1_1_3_1.setBounds(0, 38, 157, 30);
		panel_1_1_2_1.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("05");
		lblNewLabel_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_1_1_1_2_1.setBounds(0, 66, 157, 63);
		panel_1_1_2_1.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("ADMIN NAME");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_1_4_1 = new JLabel("ADMIN ID");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_1_4_2 = new JLabel("COLLEGE NAME");
		lblNewLabel_1_4_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_1_4_3 = new JLabel("ACCOUNT STATUS");
		lblNewLabel_1_4_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("ADMIN EMAIL");
		lblNewLabel_1_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("ADMIN CODE");
		lblNewLabel_1_4_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(new Color(250, 235, 215));
		
		JButton btnNewButton = new JButton("DELETE ACCOUNT");
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton.setBackground(Color.WHITE);
		
		JButton btnManageAccount = new JButton("MANAGE ACCOUNT");
		btnManageAccount.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnManageAccount.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnManageAccount.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_1_2 = new JPanel();
		GroupLayout gl_Home = new GroupLayout(Home);
		gl_Home.setHorizontalGroup(
			gl_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home.createSequentialGroup()
					.addGap(8)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
					.addGap(20)
					.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Home.createSequentialGroup()
							.addGap(102)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Home.createSequentialGroup()
							.addGap(102)
							.addComponent(lblExaminationCell, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Home.createSequentialGroup()
							.addGap(102)
							.addComponent(lblExaminationMonitoringSystem, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Home.createSequentialGroup()
							.addGap(50)
							.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(panel_1_1_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(panel_1_1_2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(panel_1_1_2_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Home.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addGap(124)
							.addComponent(lblNewLabel_1_4_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addGap(124)
							.addComponent(lblNewLabel_1_4_2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Home.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Home.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_1_4_3, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addGap(124)
							.addComponent(lblNewLabel_1_4_1_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addGap(124)
							.addComponent(lblNewLabel_1_4_2_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Home.createSequentialGroup()
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Home.createSequentialGroup()
							.addGap(291)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(btnManageAccount, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(panel_1_2, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
					.addGap(14))
		);
		gl_Home.setVerticalGroup(
			gl_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 604, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Home.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblExaminationCell)
							.addGap(6)
							.addComponent(lblExaminationMonitoringSystem)
							.addGap(38)
							.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1_1_2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1_1_2_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
							.addGap(54)
							.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_4_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_4_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_4_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_4_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_4_2_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(2)
							.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(25)
							.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnManageAccount, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panel_1_2, GroupLayout.PREFERRED_SIZE, 604, GroupLayout.PREFERRED_SIZE)))
		);
		Home.setLayout(gl_Home);
		GroupLayout gl_Home_Panel_Admin = new GroupLayout(Home_Panel_Admin);
		gl_Home_Panel_Admin.setHorizontalGroup(
			gl_Home_Panel_Admin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home_Panel_Admin.createSequentialGroup()
					.addComponent(SidePanel_Admin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1186, Short.MAX_VALUE)
		);
		gl_Home_Panel_Admin.setVerticalGroup(
			gl_Home_Panel_Admin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home_Panel_Admin.createSequentialGroup()
					.addGap(38)
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
				.addGroup(Alignment.TRAILING, gl_Home_Panel_Admin.createSequentialGroup()
					.addGap(39)
					.addComponent(SidePanel_Admin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Home_Panel_Admin.setLayout(gl_Home_Panel_Admin);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(Home_Panel_Admin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(Home_Panel_Admin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
