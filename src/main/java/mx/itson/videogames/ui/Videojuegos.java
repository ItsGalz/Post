/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.videogames.ui;


import mx.itson.videogames.Comments;
import mx.itson.videogames.Post;
import mx.itson.videogames.User;
import mx.itson.videogames.enums.Category;

/**
 *
 * @author javier
 */
public class Videojuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        User user = new User ();
        user.setName("Gael viveros");
        user.setEmail("Galz@gmail.com");
        user.setNumber("6221052648"); 
        user.setPassword("galz768");
        
        Comments comments = new Comments ();
        comments.setComment("agg @handeiims987");
        comments.setDislike(10);
        comments.setLike(16);
        comments.setWords(17);
        
         Post post = new Post ();
         post.setAutor("@Galz");
         post.setCategory(Category.COMIC);
         post.setComments(99);
         post.setDate("10/09/23");
         post.setDescripcion("Mi rampage en LOL");
         post.setDislike(7);
         post.setLike(60);
         post.setPhoto("");
         post.setAnswer("7");
         
         System.out.println(user.getName());
         System.out.println(user.getEmail());
         System.out.println(user.getNumber());
         System.out.println(user.getPassword());
         
         System.out.println("-----------------------------------------");
         System.out.println("Fecha: "+post.getDate());
         System.out.println("Descripcion: "+post.getDescripcion());
         System.out.println("/"
                 + "/"
                 + "/"
                 + "/"
                 + "/"
                 + "/"
                 + "/");
         
         System.out.println("Dislikes: "+post.getDislike());
         System.out.println("Likes: "+post.getLike());
         System.out.println("Categoria: "+post.getCategory());
         System.out.println("Autor: "+post.getAutor());

         System.out.println("-----------------------------------------");
         


         System.out.println("Comentarios: "+post.getComments());
         System.out.println("Respuesta: "+comments.getComment());
         System.out.println("Caracteres:"+comments.getWords());
         System.out.println("Dislikes: "+comments.getDislike());
         System.out.println("Likes: "+comments.getLike());
         System.out.println(""+post.getPhoto());
         
         

        
        
    }
    
}
