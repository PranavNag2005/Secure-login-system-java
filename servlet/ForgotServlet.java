package conn.servlet;
import conn.dao.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class ForgotServlet
 */
@WebServlet("/ForgotServlet")
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao	userDao=new UserDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(userDao.isvaliduser(username)) {
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
			if(userDao.updatepassword(username,password)) {
				System.out.println("inside the userdao is valideat");
				response.sendRedirect("login.jsp");
			};
			
		}
		
		else {
			response.sendRedirect("login.jsp?error=1");
		}
	}

	}


