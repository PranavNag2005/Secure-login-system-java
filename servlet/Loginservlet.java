package conn.servlet;
import conn.dao.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import conn.dao.UserDaoImpl;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static UserDao	userDao=new UserDaoImpl();
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(userDao.isvaliduser(username,password)) {
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
			response.sendRedirect("welcome.jsp");
		}
		
		else {
			response.sendRedirect("login.jsp?error=1");
		}
	}

}
