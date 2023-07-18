
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
            request.getRequestDispatcher("feed.jsp").forward(request, response);
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
            Date date = new Date(20091); // Puoi personalizzare le date casuali se necessario

            Post post = new PostAnimale(date, img, "weee babby how are youu", commenti, likes,  animals, urlBase64);
            posts.add(post);
        }

        return posts;
    }
}
