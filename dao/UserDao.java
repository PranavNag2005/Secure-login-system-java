package conn.dao;
import java.util.*;

import conn.servlet.User;
public interface UserDao {

	boolean isvaliduser(String username, String password);
boolean createuser(String name,String email,String password);
boolean isvaliduser(String username);
boolean updatepassword(String username,String password);
public List<User> viewusers();
}
