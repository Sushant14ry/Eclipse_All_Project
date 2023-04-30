package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Contact;
import com.service.Contact_Service;
import com.service.Contact_Service_empl;

/**
 * Servlet implementation class MessageServlet
 */
@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fn = request.getParameter("fname");
		String em = request.getParameter("email");
		String sb = request.getParameter("sub");
		String ms = request.getParameter("msg");
		
		Contact c = new Contact();
		
		c.setFname(fn);
		c.setEmail(em);
		c.setSubject(sb);
		c.setMessage(ms);
		
		Contact_Service cs = new Contact_Service_empl();
		cs.AddContact(c);
		
		
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
