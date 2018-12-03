package com.rahul.demorest;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.sql.*;
public class AlienRepo {
	
	
	//this mock db using class replica of jdbc
	/*List<Alien> aliens;
	
	public AlienRepo() {
		aliens=new ArrayList<Alien>();
		Alien a1=new Alien();
		a1.setId(101);
		a1.setName("rahul");
		
		Alien a2=new Alien();
		a2.setId(102);
		a2.setName("pankaj");
		aliens.add(a1);
		aliens.add(a2);
	}
	
	
	public List<Alien> getAliens() {
	
		return aliens;
		
	}
	
	public Alien getAlien(int id) {
		Alien al=null;
		
		for(Alien a:aliens) {
			if(a.getId()==id) {
				
				return a;
			}
		}
		return new Alien();
		
	}


	public Alien create(Alien a) {
		return a;
		
		
	}


	public Alien saveOrUpdate(Alien a) {
		
		return a;
	}


	public void delete(Alien al) {
		System.out.println(al);
		
	}
*/
	
	//using jdbc connection DB
	Connection con=null;
	
	public AlienRepo() {
		String url="jdbc:mysql://localhost:3306/restapidemodb?createDatabaseIfNotExist=true";
		String user="root";
		String password="root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public List<Alien> getAliens() {
		 
		 List<Alien> aliens=new ArrayList<>();
		 Alien a=null;
		 String sql="select * from Alien";
		
		 try {
			Statement st=(Statement) con.createStatement();
		
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				  a=new Alien();
				a.setId(rs.getInt(1));
				a.setNama(rs.getString(2));
				aliens.add(a);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
		 return aliens;
	 }
	
	
	public Alien getAlien(int id) {
		 
		 Alien  alien=new Alien();
		 String sql="select * from Alien where id="+id;
		
		 try {
			/*Statement st=(Statement) con.createStatement();*/
			 PreparedStatement st=(PreparedStatement) con.prepareStatement(sql);
			
		
			ResultSet rs=st.executeQuery(sql);
			if(rs.next()) {
				
				alien.setId(rs.getInt(1));
				alien.setNama(rs.getString(2));
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
		 return alien;
	 }
	
	public void create(Alien a) {
		 String sql="insert into alien values (?,?)";
		 try {
			 PreparedStatement st=(PreparedStatement) con.prepareStatement(sql);
			 st.setInt(1, a.getId());
			 st.setString(2, a.getNama());
			
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveOrUpdate(Alien a) {
		// String sql="insert into alien values (?,?)";
		 String sql="update alien set nama=? where id=?";
		 try {
		
			 PreparedStatement st=(PreparedStatement) con.prepareStatement(sql);
			
			 st.setString(1, a.getNama());
			 st.setInt(2, a.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		String sql="delete  from alien where id in(?)";//id it is list or array
		try {
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1,id);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void deleteBySelectingID(List<Integer> id) {
			
			
			String sql="delete  from alien where id in(?)";//id it is list or array
			try {
				PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
				for(Integer i:id) {
				ps.setInt(1,i);
				ps.execute();
				}
				
				//ps.setObject(1, id);
				//ps.execute();
			}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
