package souro.services;

import org.springframework.stereotype.Service;
import souro.models.Post;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    public ArrayList<Post> getAllPosts(){

        ArrayList<souro.models.Post> posts = new ArrayList<>();

        Post post1 = new souro.models.Post();
        post1.setTitle("Post 1");
        post1.setBody("Post Body 1");
        post1.setDate(new Date());

        Post post2 = new souro.models.Post();
        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Post post3 = new souro.models.Post();
        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }
}
