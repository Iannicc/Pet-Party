<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="it.unibo.tw.web.beans.Post" %>

<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    
   <style>
        body {
            display: flex;
            flex-direction: column;
            height: 100vh;
            margin: 0;
            padding: 0;
        }
        header {
            padding: 20px;
            background-color: #f0f0f0;
            text-align: center
        }
        ul {
            list-style: none;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            flex-grow: 1;
        }
        li {
            margin-bottom: 20px;
            margin-top: 70px;
        }
    </style>
    
</head>
<body>
    <h1>Home di Pet Party</h1>
    <ul>
        <% List<Post> posts = (List<Post>) request.getAttribute("posts");
           if (posts != null) {
               for (Post post : posts) { %>
                   <li>
                       <img src=<%= post.getBase64() %> alt="Immagine base64"  width="250" height="250">
                       <p><%= post.getDescrizione() %></p>
                       <i><%= post.getDataCreazione() %></i>
                   </li>
        <%     }
           } %>
    </ul>
</body>
</html>
