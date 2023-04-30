
package com.servlets;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.User_Service;
import com.service.User_Service_empl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un = request.getParameter("email");
		String psw = request.getParameter("password");
		
		// Login from database data
		
		User_Service us = new User_Service_empl();
		
		if(us.UserLogin(un, psw)) {
			
			// Create Session
			HttpSession session = request.getSession();
			session.setAttribute("ActiveUser", un);
			session.setMaxInactiveInterval(10);
			
			request.setAttribute("user",un);
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "Username and Password Not Matched");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	}

}
