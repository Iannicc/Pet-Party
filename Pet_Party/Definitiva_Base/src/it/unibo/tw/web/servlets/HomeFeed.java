
package it.unibo.tw.web.servlets;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeFeed extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        // Inoltra alla pagina JSP per visualizzare i post
        // Assumi che la pagina JSP sia chiamata "home.jsp"
        try {
            request.getRequestDispatcher("HomeProva.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
