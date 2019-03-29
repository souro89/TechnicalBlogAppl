package souro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import souro.models.Post;
import souro.services.PostService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("posts")
    public String getUserPosts(Model model){

        ArrayList<Post> posts = new ArrayList<>();
        Post latestPost = postService.getLatestPost();
        posts.add(latestPost);
        model.addAttribute("posts",posts);
        return "posts";
    }
}
