package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Candidate;

public class Dao {
	
List<Candidate> allcandidate = null;
	
	String url ="jdbc:mysql://localhost:3306/advjava193";
	String uname = "root";
	String pwd = "root";
	
	Connection connection =null;
	 Statement st = null;
	 String sql = "Select * from advjava193.candidate";
//	 String sqlinsert ="INSERT INTO advjava193.candidate Values(101,'test','test','test','test','test','test',55) ";
	 String sqlinsert2 = "INSERT INTO advjava193.candidate values(?,?,?,?,?,?,?)";
	 ResultSet rs = null;
	public List<Candidate> getAllcandidates(){
		
		System.out.println("We Are in Dao Layer");
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println(1);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				 connection = DriverManager.getConnection(url, uname, pwd);
				System.out.println(2);
				st = connection.createStatement();
				System.out.println(3);
			   rs = st.executeQuery(sql);
			   System.out.println(4);
			   
			   allcandidate = new ArrayList<Candidate>();
			   while(rs.next()) {
				   int id = rs.getInt("cid");
				   String cname = rs.getString("name");
				   String pname = rs.getString("partyname");
				   String stname = rs.getString("state");
				   String aname = rs.getString("assembly");
				   String gen = rs.getString("gender");
				   int age = rs.getInt("age");
				   
//				   System.out.println(id + cname + pname);
				   Candidate obj = new Candidate(id,cname,pname,stname,aname,gen,age);
				   allcandidate.add(obj);
				   
			   }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return  allcandidate;
		
	}
	
	public List<Candidate> insertCandidates() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 connection = DriverManager.getConnection(url, uname, pwd);
			System.out.println(2);
			st = connection.createStatement();
			System.out.println(3);
			
			int id = 1005;
			String cname = "Shiv";
			String pname = "Independent";
			String stname = "MH";
			String aname = "Pune";
			String gen = "Male";
			int age = 35;
			
			 allcandidate = new ArrayList<Candidate>();
			PreparedStatement pst = connection.prepareStatement(sqlinsert2);
			pst.setInt(1, id);
			pst.setString(2, cname);
			pst.setString(3, pname);
			pst.setString(4, stname);
			pst.setString(5, aname);
			pst.setString(6, gen);
			pst.setInt(7, age);
			
			int ps = pst.executeUpdate();
			if(ps>0){
				System.out.println("Data Inserted Succesfully");
			}else {
				System.out.println("Something Went Wrong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allcandidate;
	}
	
	public void updateCandidates() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 connection = DriverManager.getConnection(url, uname, pwd);
			System.out.println(2);
			st = connection.createStatement();
			
			int ack = st.executeUpdate("update candidate set assembly = 'Mumbai' where cid = 1005");
			if(ack > 0) {
				System.out.println("Update Succesfully");
			}else {
				System.out.println("Something gone wrong");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteCandidates() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 connection = DriverManager.getConnection(url, uname, pwd);
			System.out.println(2);
			st = connection.createStatement();
			
			PreparedStatement pstt = connection.prepareStatement("delete from candidate where cid = (?) ");
			pstt.setInt(1, 1005);
			System.out.println("Record Deleted Succesfully");
			
			pstt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
