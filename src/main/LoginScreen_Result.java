package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.ComponentOrientation;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.Rectangle;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginScreen_Result {

	public JFrame frame;
	private JTextField Staff_uname;
	private JPasswordField Staff_password;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	
	//demo staff details for testing
	String name = "Vengadesh";
	String password = "12345";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen_Result window = new LoginScreen_Result();
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
	public LoginScreen_Result() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Result Management System - PPG GROUP OF INSTITUTIONS");
		frame.setMaximizedBounds(new Rectangle(0, 0, 605, 41));
		frame.setType(Type.UTILITY);
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel = new JLabel("PPG GROUP OF INSTITUTION'S , COIMBATORE");
		lblNewLabel.setBounds(218, 78, 605, 41);
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 25));
		
		JLabel lblExaminationCell = new JLabel("OFFICE OF THE CONTROLLER OF THE EXAMINATION");
		lblExaminationCell.setBounds(218, 125, 605, 27);
		lblExaminationCell.setForeground(new Color(0, 0, 0));
		lblExaminationCell.setHorizontalAlignment(SwingConstants.CENTER);
		lblExaminationCell.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblExaminationMonitoringSystem = new JLabel("EXAMINATION MONITORING SYSTEM");
		lblExaminationMonitoringSystem.setBounds(218, 158, 605, 27);
		lblExaminationMonitoringSystem.setForeground(new Color(0, 0, 0));
		lblExaminationMonitoringSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblExaminationMonitoringSystem.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 998, 35);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ONLINE EXAMINATION RESULT MANAGEMENT SYSTEM");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 0, 998, 35);
		panel.add(lblNewLabel_2);
		frame.getContentPane().add(lblExaminationMonitoringSystem);
		frame.getContentPane().add(lblExaminationCell);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(LoginScreen_Result.class.getResource("/images/new_logo-removebg-preview.png")));
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setBounds(78, 78, 130, 122);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setIcon(new ImageIcon(LoginScreen_Result.class.getResource("/images/grp-removebg-preview.png")));
		lblNewLabel_1_1.setBounds(814, 78, 109, 107);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		Staff_uname = new JTextField();
		Staff_uname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					Staff_password.requestFocus();
				}
			}
		});
		Staff_uname.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		Staff_uname.setHorizontalAlignment(SwingConstants.CENTER);
		Staff_uname.setBackground(new Color(255, 217, 179));
		Staff_uname.setBorder(null);
		Staff_uname.setBounds(78, 332, 362, 35);
		frame.getContentPane().add(Staff_uname);
		Staff_uname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("USERNAME ");
		lblNewLabel_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		lblNewLabel_3.setBounds(78, 300, 145, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PASSWORD");
		lblNewLabel_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(78, 377, 145, 27);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JButton btnNewButton_1 = new JButton("LOG IN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name.equals(Staff_uname.getText()) && password.equals(Staff_password.getText())) {
					HomeScreen_staff staff = new HomeScreen_staff();
					staff.frame.setVisible(true);
					
					
					 String url = "jdbc:mysql://localhost:3306/result_ms";
					   String username = "root";
					   String password = "SIM@ss55simeon";
					 try {
					 String query = "select * from rms";
			    	 Connection con = DriverManager.getConnection(url,username,password);
			         Statement st = con.createStatement();
			         ResultSet rs = st.executeQuery(query);
			         
					
					 DefaultTableModel model = (DefaultTableModel) staff.table.getModel();
			         String name , regno , dept , branch , course , year;
			         
			         while  (rs.next()) {
			        	 name = rs.getString(1);
			        	 regno = rs.getString(2);
			        	 dept = rs.getString(3);
			        	 branch = rs.getString(4);
			        	 course = rs.getString(5);
			        	 year = rs.getString(6);
			        	 String [] row = {name , regno , dept , branch , course , year};
			        	 model.addRow(row);
					
					
				}}catch(SQLException e1) {e1.printStackTrace();}
					
					frame.dispose();
					
				}else {
					Staff_uname.setText("");
					Staff_password.setText("");
					
				}
				
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_1.setBounds(78, 473, 362, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		Staff_password = new JPasswordField();
		Staff_password.setHorizontalAlignment(SwingConstants.CENTER);
		Staff_password.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		Staff_password.setBackground(new Color(255, 217, 179));
		Staff_password.setBorder(null);
		Staff_password.setBounds(78, 406, 362, 35);
		frame.getContentPane().add(Staff_password);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(78, 249, 362, 41);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("STAFF LOGIN");
		lblNewLabel_4.setForeground(new Color(255, 128, 0));
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 0, 362, 41);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Note* : New staff user need Approval from management for Login into the system ");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		lblNewLabel_5.setBounds(8, 535, 982, 22);
		frame.getContentPane().add(lblNewLabel_5);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(561, 249, 362, 41);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("ADMIN LOGIN");
		lblNewLabel_4_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(0, 0, 362, 41);
		panel_1_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("ADMIN ID");
		lblNewLabel_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		lblNewLabel_3_2.setBounds(561, 300, 145, 27);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(255, 217, 179));
		textField_1.setBounds(561, 332, 362, 35);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("PASSWORD");
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		lblNewLabel_3_1_1.setBounds(561, 377, 145, 27);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		passwordField_1.setBorder(null);
		passwordField_1.setBackground(new Color(255, 217, 179));
		passwordField_1.setBounds(561, 406, 362, 35);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton_1_1 = new JButton("LOG IN");
		btnNewButton_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1_1.setBounds(561, 473, 362, 35);
		frame.getContentPane().add(btnNewButton_1_1);
		frame.setBounds(100, 100, 1012, 604);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
