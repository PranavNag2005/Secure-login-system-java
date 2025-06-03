package conn.servlet;
import java.util.*;
import conn.servlet.User;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import conn.dao.UserDao;
import conn.dao.UserDaoImpl;


@WebServlet("/Viewservlet")
public class Viewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao	userDao=new UserDaoImpl();
    
    public Viewservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> users = userDao.viewusers();
		request.setAttribute("userList", users);
        RequestDispatcher dispatcher = request.getRequestDispatcher("viewUsers.jsp");
        dispatcher.forward(request, response);



	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
