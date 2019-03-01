package souro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import souro.models.Post;
import souro.services.PostService;

import java.util.ArrayList;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("posts")
    public String getUserPosts(Model model){

        ArrayList<Post> onePost = postService.getOnePost();
        model.addAttribute("posts",onePost);
        return "posts";
    }
}
