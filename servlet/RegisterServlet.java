package conn.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import conn.dao.UserDao;
import conn.dao.UserDaoImpl;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	  private static UserDao	userDao=new UserDaoImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		if(userDao.createuser(username, email, password)) {
			response.sendRedirect("login.jsp?registration=success");
		}
		else{
			response.sendRedirect("register.jsp?error=1");
		};
	}

}
