
package it.unibo.tw.web.servlets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.unibo.tw.web.beans.Animale;
import it.unibo.tw.web.beans.Commento;
import it.unibo.tw.web.beans.Like;
import it.unibo.tw.web.beans.Post;
import it.unibo.tw.web.beans.PostAnimale;

public class HomeFeed extends HttpServlet {
    private static final long serialVersionUID = 1L;


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
