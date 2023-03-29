package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class GetDetails {
	
	   String url = "jdbc:mysql://localhost:3306/resultsystem";
	   String username = "root";
	   String password = "root123";
	   
	  
     
     public void fetch() throws SQLException {
    	 String query = "select * from studentdetails";
    	 Connection con = DriverManager.getConnection(url,username,password);
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(query);
         
         HomeScreen_staff home = new HomeScreen_staff();
         home.table.setModel(new DefaultTableModel());
         DefaultTableModel model = (DefaultTableModel) home.table.getModel();
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
         }
         
         
         
         
    	 
     }
    

}
