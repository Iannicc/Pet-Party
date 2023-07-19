

package it.unibo.tw.web.servlets;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.unibo.tw.web.beans.Animale;
import it.unibo.tw.web.beans.PostAnimale;
import it.unibo.tw.web.beans.ProfiloUtente;
import it.unibo.tw.web.beans.Sesso;
import it.unibo.tw.web.beans.UtenteStandard;

/**
 * Servlet implementation class LoginServlet
*/

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		List<UtenteStandard> followers1 = new ArrayList<>();
		List<UtenteStandard> followed1 = new ArrayList<>();
		List<UtenteStandard> followers2 = new ArrayList<>();
		List<UtenteStandard> followed2 = new ArrayList<>();
		UtenteStandard utente1 = new UtenteStandard();
		UtenteStandard utente2 = new UtenteStandard();
		followed1.add(utente2);
		followers1.add(utente2);
		utente1.setUsername("davide");
		utente1.setPassword("provolo");
		utente2.setUsername("giacomo");
		utente2.setPassword("sampaoli");
		followed2.add(utente1);
		followers2.add(utente1);
		utente1.setFollowed(followed1);
		utente1.setFollowers(followers1);
		utente2.setFollowed(followed2);
		utente2.setFollowers(followers2);
		String pathCatImage= "C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\catDavide.jpeg"; 
		String pathDogImage= "C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\dogGiacomo.jpeg";  // Sostituisci con il percorso del tuo file immagine
		String catBase64 = convertImage(pathCatImage); 
		String dogBase64 = convertImage(pathDogImage);
		String pathDavide ="C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\davide.jpg"; 
		String pathGiacomo ="C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\giacomo.jpeg"; 
		String davideBase64 =convertImage(pathDavide);
		String giacomoBase64 =convertImage(pathGiacomo);
		
        ProfiloUtente pu1= new ProfiloUtente();
        ProfiloUtente pu2= new ProfiloUtente();
        pu2.setNome("Giacomo");
        pu2.setCognome("Sampaoli");
        pu2.setImage(giacomoBase64);
        pu2.setDescrizione("Tomcat");
        pu1.setNome("Davide");
        pu1.setCognome("Provolo");
        pu1.setDescrizione("Scrivi qualsiasi cosa");
        pu1.setImage(davideBase64);
        Animale a1 = new Animale();
        Animale a2 = new Animale();
        a2.setDescrizione("Travis Spot");
        a2.setImage(dogBase64);
        a2.setNome("Spot");
        a2.setSex(Sesso.Maschio);
        a2.setSpecie("Cane");
        a2.setRazza("Maltese");
        a1.setDescrizione("Gatto arancione satanico");
        a1.setImage(catBase64);
        a1.setNome("Lock");
        a1.setSex(Sesso.Maschio);
        a1.setRazza("Arancione");
        a1.setSpecie("Gatto");
        PostAnimale post2 = new PostAnimale();
        Set<Animale> animali2 = new HashSet<>();
        animali2.add(a2);
        PostAnimale post1 = new PostAnimale();
        Set<Animale> animali = new HashSet<>();
        animali.add(a1);
        post2.setAnimali(animali2);
        post2.setDescrizione("Bau bau");
        post2.setBase64(dogBase64);
        post1.setAnimali(animali);
        post1.setDescrizione("Miao Miao");
        post1.setBase64(catBase64);
        java.util.Date current = new java.util.Date();
        Date date = new Date(current.getTime());
        post1.setDataCreazione(date);
        post2.setDataCreazione(date);
        List<PostAnimale> posts1 = new ArrayList<>();
        List<PostAnimale> posts2 = new ArrayList<>();
        List<Animale> a1list = new ArrayList<>();
        List<Animale> a2list = new ArrayList<>();
        a1list.add(a1);
        a2list.add(a2);
        posts2.add(post2);
        posts1.add(post1);
        pu1.setAnimali(a1list);
        pu2.setAnimali(a2list);
        a2.setPosts(posts2);
        utente2.setProfilo(pu2);
        a1.setPosts(posts1);
        utente1.setProfilo(pu1);
        
	this.getServletContext().setAttribute(utente1.getUsername(), utente1);
	this.getServletContext().setAttribute(utente2.getUsername(), utente2);
	
	
}
private String convertImage(String path) {
		File imageFile = new File(path);
		  byte[] imageBytes = null;

	      try (FileInputStream fis = new FileInputStream(imageFile)) {
	          imageBytes = fis.readAllBytes();
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	      String base64Image = Base64.getEncoder().encodeToString(imageBytes);

	      String mimeType = "image/jpeg"; // Modifica il tipo MIME in base al formato dell'immagine
	      String urlBase64 = "data:" + mimeType + ";base64," + base64Image;
	      return urlBase64;
	}

	
public void doPost(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {
	
	UtenteStandard u1 = (UtenteStandard) this.getServletContext().getAttribute("davide");
	UtenteStandard u2 = (UtenteStandard) this.getServletContext().getAttribute("giacomo");

try
{	 
     String username = request.getParameter("username");
     String password = request.getParameter("password");
     String contextPath = request.getContextPath();
	   		    
     //if (user.isValid())
	if (u1.getUsername().compareTo(username)==0 && u1.getPassword().compareTo(password)==0)
     {
	        
          HttpSession session = request.getSession();
          System.out.println("1");
          session.setAttribute("currentSessionUser",u1); 
          System.out.println("2");
          //this.getServletContext().getRequestDispatcher("/homeProva.jsp").forward(request, response);
          response.sendRedirect(request.getContextPath() + "/HomeFeed");
     }
	        
     else if (u2.getUsername().compareTo(username)==0 && u2.getPassword().compareTo(password)==0)
     {
	        
         HttpSession session = request.getSession();	    
         session.setAttribute("currentSessionUser",u2); 
         response.sendRedirect(request.getContextPath() + "/HomeFeed");
    }else
    {
         response.sendRedirect(request.getContextPath() + "/invalidLogin.jsp");
    }
} 
		
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
       }
	}
