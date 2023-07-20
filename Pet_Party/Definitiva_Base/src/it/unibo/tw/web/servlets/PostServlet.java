package it.unibo.tw.web.servlets;

import java.io.InputStream;
import java.sql.Date;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import it.unibo.tw.web.beans.Animale;
import it.unibo.tw.web.beans.PostAnimale;
import it.unibo.tw.web.beans.UtenteStandard;

public class PostServlet extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, java.io.IOException {



	try
	{
		HttpSession session = request.getSession();
		boolean isPro=false;
		UtenteStandard user = (UtenteStandard) session.getAttribute("currentSessionUser");
		if (isPro)
		{

		}
		else
		{
			PostAnimale p= new PostAnimale();
			java.util.Date curr= new java.util.Date();
			p.setDataCreazione(new Date(curr.getTime()));
			p.setDescrizione(request.getParameter("descrizione"));
			 // Crea un'istanza di FileItemFactory
	        FileItemFactory factory = new DiskFileItemFactory();

	        // Crea un'istanza di ServletFileUpload
	        ServletFileUpload upload = new ServletFileUpload(factory);

	        try {
	            // Analizza la richiesta per ottenere i FileItem
	            List<FileItem> items = upload.parseRequest(request);
	            //String[] selected = request.getParameterValues("checkbox");
	            // Itera attraverso i FileItem
	            Set<Animale> raffigurati= new HashSet<>();
	            for (FileItem item : items) {
	                // Verifica se l'elemento è un campo di input o un file
	                if (item.isFormField()) {
	                    // Campo di input (non un file)
	                    String fieldName = item.getFieldName();
	                    String fieldValue = item.getString();
	                    if (fieldName.equals("descrizione")) p.setDescrizione(fieldValue);
	                    else
	                    {

	                    	for (Animale a : user.getProfilo().getAnimali())
	                    	{
	                    		if(fieldValue.equals(a.getNome()))
	                    		{
	                    			raffigurati.add(a);
	                    		}
	                    	}
	                    }
	                } 
	                else {
	                    // File (immagine)
	                    InputStream imageStream = item.getInputStream();
	                    byte[] imageBytes = imageStream.readAllBytes();
	                    String base64Image = Base64.getEncoder().encodeToString(imageBytes);
	                    String mimeType = "image/jpeg"; // Modifica il tipo MIME in base al formato dell'immagine
	          	        String urlBase64 = "data:" + mimeType + ";base64," + base64Image;
	                    p.setBase64(urlBase64);
	                }
	            }
	            p.setAnimali(raffigurati);
	            for(Animale a: raffigurati)
	            {
	            	a.condividiPost(p);
	            }
	            this.getServletContext().setAttribute(user.getUsername(),user );
	            session.setAttribute("currentSessionUser", user);
	            response.sendRedirect("HomeProva.jsp");
		}

	        catch (Throwable theException)
	        {
	        	System.out.println(theException);
	        }
		}
	}
	catch(Throwable theException)
	{

	}

}
}