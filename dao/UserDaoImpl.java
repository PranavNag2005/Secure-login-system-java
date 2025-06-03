package conn.dao;
import java.sql.*;
import java.util.*;
import conn.servlet.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean isvaliduser(String username, String password) {
		String query="Select * from users where name=? and password=?";
		try(Connection conn=Dbconn.getconnection()){
			PreparedStatement pt=conn.prepareStatement(query);
			pt.setString(1, username);
			pt.setString(2, password);
			ResultSet rs=pt.executeQuery();
			
			System.out.println("Query executed");
			return rs.next();
		}
		catch(SQLException E) {
			System.out.println(E.getMessage());
			E.printStackTrace();
		}
		return false;
	}
	public boolean createuser(String name,String email,String password) {
		String query="Insert into users(name,Email,password) values (?,?,?)";
		try(Connection conn=Dbconn.getconnection()){
			PreparedStatement pt=conn.prepareStatement(query);
			pt.setString(1, name);
			pt.setString(2, email);
			pt.setString(3, password);
			int rs=pt.executeUpdate();
			
			System.out.println("user created successfully");
			return true;
			
		}
		catch(SQLException E) {
			E.printStackTrace();
			
		}
		return false;
		
	}
public boolean isvaliduser(String username) {
	String query="Select * from users where name=?";
	try(Connection conn=Dbconn.getconnection()){
		PreparedStatement pt=conn.prepareStatement(query);
		pt.setString(1, username);
		
		ResultSet rs=pt.executeQuery();
		
		System.out.println("Query executed");
		return rs.next();
	}
	catch(SQLException E) {
		System.out.println(E.getMessage());
		E.printStackTrace();
	}
	return false;
}
public boolean updatepassword(String username,String password) {
	String query="update users set password=? where name=?";
	try(Connection conn=Dbconn.getconnection()){
		PreparedStatement pt=conn.prepareStatement(query);
		pt.setString(1, password);
		pt.setString(2, username);
		int rs=pt.executeUpdate();
		
		System.out.println("Query executed");
		return true;
	}
	catch(SQLException E) {
		System.out.println(E.getMessage());
		E.printStackTrace();
	}
	return false;
	
}
public List<User> viewusers() {
	List<User> userList = new ArrayList<>();

	String query="select * from users";
	try(Connection conn=Dbconn.getconnection()){
		Statement st=conn.createStatement();		
		ResultSet rs=st.executeQuery(query);
		
		System.out.println("Query executed");
		while(rs.next()) {
			User user=new User(rs.getInt(1), rs.getString(2), rs.getString(3));
			userList.add(user);
			
		}
		return userList;
	}
	catch(SQLException E) {
		System.out.println(E.getMessage());
		E.printStackTrace();
	}
	return userList;
}
}
