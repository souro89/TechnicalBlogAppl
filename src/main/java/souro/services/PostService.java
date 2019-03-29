package souro.services;

import org.springframework.stereotype.Service;
import souro.models.Post;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    public ArrayList<Post> getAllPosts(){

        ArrayList<souro.models.Post> posts = new ArrayList<>();

//        Post post1 = new souro.models.Post();
//        post1.setTitle("Post 1");
//        post1.setBody("Post Body 1");
//        post1.setDate(new Date());
//
//        Post post2 = new souro.models.Post();
//        post2.setTitle("Post 2");
//        post2.setBody("Post Body 2");
//        post2.setDate(new Date());
//
//        Post post3 = new souro.models.Post();
//        post3.setTitle("Post 3");
//        post3.setBody("Post Body 3");
//        post3.setDate(new Date());
//
//        posts.add(post1);
//        posts.add(post2);
//        posts.add(post3);

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TechnicalBlog","postgres","admin");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from posts");
            while(rs.next()){
                Post ps = new Post();
                ps.setTitle(rs.getString("title"));
                ps.setBody(rs.getString("body"));
                posts.add(ps);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


        return posts;
    }

    public ArrayList<Post> getOnePost(){

        ArrayList<Post> posts = new ArrayList<>();

//        Post post1 = new souro.models.Post();
//        post1.setTitle("First Post");
//        post1.setBody("This is your post");
//        post1.setDate(new Date());
//
//        posts.add(post1);

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TechnicalBlog","postgres","admin");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from posts where id=4");
            while(rs.next()){
                Post ps = new Post();
                ps.setTitle(rs.getString("title"));
                ps.setBody(rs.getString("body"));
                posts.add(ps);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }



        return posts;


    }


}
