package com.yedam.prj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginResult
 */
@WebServlet("/LoginResult")
public class LoginResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String message = null;
		
		if(id.equals("hong") && pwd.equals("1234")) {
			message = "님 환영";
		}else {
			message = "그런 사람 없습니다.";
		}
		
		request.setAttribute("msg", message);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/member/loginResult.jsp");
		dispatcher.forward(request, response);
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
