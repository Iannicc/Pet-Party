

package it.unibo.tw.web.servlets;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.unibo.tw.web.beans.UserBean;

/**
 * Servlet implementation class LoginServlet
*/

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String success = null;
	private String notgood = null;
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.success = config.getInitParameter("loginSuccess");
		this.notgood = config.getInitParameter("loginInsuccess");	}
	
public void doPost(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {
	


try
{	 
     UserBean user = new UserBean();
     user.setUserName(request.getParameter("username"));
     user.setPassword(request.getParameter("password"));

     //user = UserDAO.login(user);
	   		    
     //if (user.isValid())
	if (user.getUsername().contentEquals("gio") && user.getPassword().contentEquals("robiola"))
     {
	        
          HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",user); 
          response.sendRedirect(request.getContextPath() + "/userLogged.jsp");
     }
	        
     else 
         response.sendRedirect(request.getContextPath() + "/invalidLogin.jsp");
} 
		
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
       }
	}
