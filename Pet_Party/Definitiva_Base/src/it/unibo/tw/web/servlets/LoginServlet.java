

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
import it.unibo.tw.web.beans.Professionista;
import it.unibo.tw.web.beans.ProfiloProfessionista;
import it.unibo.tw.web.beans.ProfiloUtente;
import it.unibo.tw.web.beans.Sesso;
import it.unibo.tw.web.beans.UtenteStandard;

/**
 * Servlet implementation class LoginServlet
*/

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		List<UtenteStandard> followers1 = new ArrayList<>();
		List<UtenteStandard> followers3 = new ArrayList<>();
		List<UtenteStandard> followed1 = new ArrayList<>();
		List<UtenteStandard> followers2 = new ArrayList<>();
		List<UtenteStandard> followed2 = new ArrayList<>();
		List<UtenteStandard> followed3 = new ArrayList<>();
		UtenteStandard utente1 = new UtenteStandard();
		UtenteStandard utente2 = new UtenteStandard();
		Professionista utente3 = new Professionista();
		followed1.add(utente2);
		followed1.add(utente3);
		followers1.add(utente2);
		followers1.add(utente3);
		utente1.setUsername("davide");
		utente1.setPassword("provolo");
		utente2.setUsername("giacomo");
		utente2.setPassword("sampaoli");
		utente3.setUsername("giorgio");
		utente3.setPassword("ianniciello");
		followed2.add(utente1);
		followed2.add(utente3);
		followers2.add(utente3);
		followers2.add(utente1);
		followed3.add(utente1);
		followed3.add(utente2);
		followers3.add(utente2);
		followers3.add(utente1);
		utente1.setFollowed(followed1);
		utente1.setFollowers(followers1);
		utente2.setFollowed(followed2);
		utente2.setFollowers(followers2);
		utente3.setFollowed(followed3);
		utente3.setFollowers(followers3);
		utente3.setProfessione("Dogsitter");
		utente3.setSpecializzazione("Chihuahua");
		String pathDogGiorgio="C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\dogGiorgio.jpg";
		String pathCatImage= "C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\catDavide.jpeg";
		String pathDogImage= "C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\dogGiacomo.jpeg";
		String dog2Base64 = convertImage(pathDogGiorgio);
		String catBase64 = convertImage(pathCatImage);
		String dogBase64 = convertImage(pathDogImage);
		String pathGiorgio = "C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\giorgio.jpeg";
		String pathDavide ="C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\davide.jpg";
		String pathGiacomo ="C:\\Users\\giorg\\OneDrive - Alma Mater Studiorum Università di Bologna\\Desktop\\Pet-Party\\Pet_Party\\Definitiva_Base\\web\\giacomo.jpeg";
		String davideBase64 =convertImage(pathDavide);
		String giacomoBase64 =convertImage(pathGiacomo);
		String giorgioBase64 = convertImage(pathGiorgio);

        ProfiloUtente pu1= new ProfiloUtente();
        ProfiloUtente pu2= new ProfiloUtente();
        ProfiloProfessionista pu3 = new ProfiloProfessionista();
        pu3.setNome("Giorgio");
        pu3.setCognome("Ianniciello");
        pu3.setImage(giorgioBase64);
        pu3.setDescrizione("King della trap");
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
        Animale a3 = new Animale();
        a3.setDescrizione("Labracadrabrador");
        a3.setNome("Mario");
        a3.setSex(Sesso.Maschio);
        a3.setSpecie("Cane");
        a3.setRazza("Labrador");
        a3.setImage(dog2Base64);
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
        PostAnimale post3 = new PostAnimale();
        Set<Animale> animali3 = new HashSet<>();
        animali3.add(a3);
        PostAnimale post2 = new PostAnimale();
        Set<Animale> animali2 = new HashSet<>();
        animali2.add(a2);
        PostAnimale post1 = new PostAnimale();
        Set<Animale> animali = new HashSet<>();
        animali.add(a1);
        post3.setAnimali(animali3);
        post3.setDescrizione("Woof Woof");
        post3.setBase64(dog2Base64);
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
        post3.setDataCreazione(date);
        List<PostAnimale> posts3 = new ArrayList<>();
        List<PostAnimale> posts1 = new ArrayList<>();
        List<PostAnimale> posts2 = new ArrayList<>();
        List<Animale> a1list = new ArrayList<>();
        List<Animale> a2list = new ArrayList<>();
        List<Animale> a3list = new ArrayList<>();
        a3list.add(a3);
        a1list.add(a1);
        a2list.add(a2);
        posts2.add(post2);
        posts1.add(post1);
        posts3.add(post3);
        pu1.setAnimali(a1list);
        pu2.setAnimali(a2list);
        pu3.setAnimali(a3list);
        a2.setPosts(posts2);
        a3.setPosts(posts3);
        a1.setPosts(posts1);
        utente2.setProfilo(pu2);
        utente3.setProfilo(pu3);
        utente1.setProfilo(pu1);

	this.getServletContext().setAttribute(utente1.getUsername(), utente1);
	this.getServletContext().setAttribute(utente2.getUsername(), utente2);
	this.getServletContext().setAttribute(utente3.getUsername(), utente3);


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


@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
			           throws ServletException, java.io.IOException {

	UtenteStandard u1 = (UtenteStandard) this.getServletContext().getAttribute("davide");
	UtenteStandard u2 = (UtenteStandard) this.getServletContext().getAttribute("giacomo");
	Professionista u3 = (Professionista) this.getServletContext().getAttribute("giorgio");

try
{
     String username = request.getParameter("username");
     String password = request.getParameter("password");
     String contextPath = request.getContextPath();

     //if (user.isValid())
	if (u1.getUsername().compareTo(username)==0 && u1.getPassword().compareTo(password)==0)
     {

          HttpSession session = request.getSession();
          session.setAttribute("currentSessionUser",u1);
          //this.getServletContext().getRequestDispatcher("/homeProva.jsp").forward(request, response);
          response.sendRedirect(request.getContextPath() + "/HomeFeed");
     }

     else if (u2.getUsername().compareTo(username)==0 && u2.getPassword().compareTo(password)==0)
     {

         HttpSession session = request.getSession();
         session.setAttribute("currentSessionUser",u2);
         response.sendRedirect(request.getContextPath() + "/HomeFeed");
    }
     else if (u3.getUsername().compareTo(username)==0 && u3.getPassword().compareTo(password)==0)
     {

         HttpSession session = request.getSession();
         session.setAttribute("currentSessionUser",u3);
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
