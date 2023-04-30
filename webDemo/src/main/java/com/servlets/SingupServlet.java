package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.service.User_Service;
import com.service.User_Service_empl;

/**
 * Servlet implementation class SingupServlet
 */
@WebServlet("/SingupServlet")
public class SingupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("singup.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String number = request.getParameter("number");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String psw = request.getParameter("password");
		
//		request.setAttribute("fnames", fname);
//		request.setAttribute("lnames", lname);
//		request.setAttribute("numbers", number);
//		request.setAttribute("addresss", address);
//		request.setAttribute("emails", email);
//		request.setAttribute("psws", psw);
		
		// Store Form Data in Database
		User usr = new User();
		
		usr.setFname(fname);
		usr.setLname(lname);
		usr.setNumber(number);
		usr.setAddress(address);
		usr.setEmail(email);
		usr.setPassword(psw);
		
		User_Service us = new User_Service_empl();
		us.UserSingUp(usr);
		
//		request.getRequestDispatcher("home.jsp").forward(request, response);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
