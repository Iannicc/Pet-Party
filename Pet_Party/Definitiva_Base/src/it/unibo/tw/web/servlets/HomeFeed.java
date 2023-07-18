
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
        List<Post> posts = generateRandomPosts();
        HttpSession session = request.getSession();
        session.setAttribute("posts", posts);
        request.setAttribute("posts", posts);
        // Inoltra alla pagina JSP per visualizzare i post
        // Assumi che la pagina JSP sia chiamata "home.jsp"
        try {
            request.getRequestDispatcher("HomeProva.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Post> generateRandomPosts() {
        List<Post> posts = new ArrayList<>();
        List<Commento> commenti = new ArrayList<>();
        Set<Like> likes = new TreeSet<>();
        Set<Animale> animals = new TreeSet<>();
        Random random = new Random();
        String descrizione = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum gravida, nibh in viverra facilisis, tortor tellus facilisis ex, eget feugiat nulla leo sed mi. Ut vel vestibulum eros. Nulla sapien augue, faucibus et ligula id, rhoncus pellentesque velit. Nulla vulputate diam vitae lacus elementum, et rhoncus lectus vulputate. Sed ut elementum metus. In pretium accumsan magna, sed consequat est molestie ut. Maecenas lacinia porttitor nisi, sit amet vehicula lacus consectetur ac. Vivamus leo ipsum, varius in ultrices non, tincidunt et odio.";
        
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("C:\\Users\\giorg\\Downloads\\PuppyBoy.jpg"));
        } catch (IOException e) {
            System.out.println("non funziona la immagine");

        }
        
        File imageFile = new File("C:\\Users\\giorg\\Downloads\\PuppyBoy.jpg"); // Sostituisci con il percorso del tuo file immagine
        byte[] imageBytes = null;

        try (FileInputStream fis = new FileInputStream(imageFile)) {
            imageBytes = fis.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String base64Image = Base64.getEncoder().encodeToString(imageBytes);
        
        String mimeType = "image/jpeg"; // Modifica il tipo MIME in base al formato dell'immagine
        String urlBase64 = "data:" + mimeType + ";base64," + base64Image;
        
        int numPosts = random.nextInt(10) + 5; // Lunghezza casuale tra 5 e 14 post

        for (int i = 0; i < numPosts; i++) {
            //String author = authors.get(random.nextInt(authors.size()));
            //String text = postTexts.get(random.nextInt(postTexts.size()));
        	java.util.Date current = new java.util.Date();
            Date date = new Date(current.getTime()); // Puoi personalizzare le date casuali se necessario
            Post post = new PostAnimale(date, img, descrizione, commenti, likes,  animals, urlBase64);
            posts.add(post);
        }

        return posts;
    }
}
