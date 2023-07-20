
package it.unibo.tw.web.servlets;
import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.unibo.tw.web.beans.Animale;
import it.unibo.tw.web.beans.Like;
import it.unibo.tw.web.beans.PostAnimale;
import it.unibo.tw.web.beans.ProfiloUtente;
import it.unibo.tw.web.beans.UtenteStandard;


public class LikeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    	 // Recupera il corpo della richiesta come testo semplice
        BufferedReader reader = request.getReader();
        StringBuilder requestData = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            requestData.append(line);
        }
        reader.close();

        // Ora puoi utilizzare la variabile requestData per ottenere i dati inviati
        String datiInviati = requestData.toString();

        // Dividi la stringa in base al separatore (virgola in questo caso)
        String[] datiSeparatimale = datiInviati.split("=");
        String id = datiSeparatimale[2];
        String usernameRozzo = datiSeparatimale[1];
        datiSeparatimale = usernameRozzo.split("&");

        // Ora puoi memorizzare i dati separati nelle variabili appropriate
        String username = datiSeparatimale[0];
        
        UtenteStandard utenteLoggato = (UtenteStandard) request.getSession().getAttribute("currentSessionUser");
        String userLog = utenteLoggato.getUsername();
        
        UtenteStandard u1 = (UtenteStandard) this.getServletContext().getAttribute(username.trim());
        ProfiloUtente p1 = u1.getProfilo();
        
        
        for ( Animale a : p1.getAnimali()) {
        	for (PostAnimale pa : a.getPosts()) {
        		if (pa.getId() == Integer.parseInt(id)) {
        			Like like = new Like(userLog, pa);
        			if (pa.getLikes().add(like)) {
        				break;
        			}
        			else {
        				pa.getLikes().remove(like);
        				break;
        			}
        		}
        	}
        }
        response.setContentType("text/plain; charset=UTF-8");
        response.getWriter().append("That is my response");
        
         
         // Invia la risposta come JSON
    }
    
    @Override
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	{
    		doPost(request, response);
    	}

    }
}
