package souro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import souro.models.Post;
import souro.services.PostService;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model){

        ArrayList<Post> posts = postService.getAllPosts();

        model.addAttribute("posts",posts);

        return "index";
    }
}
