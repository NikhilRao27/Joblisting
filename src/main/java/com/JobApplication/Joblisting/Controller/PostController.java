package com.JobApplication.Joblisting.Controller;

import com.JobApplication.Joblisting.repository.PostRepository;
import com.JobApplication.Joblisting.model.Post;
import com.JobApplication.Joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;
    @ApiIgnore
    @RequestMapping(value = "/hello")
    public void redirect (HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){

        return repo.findAll();


    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text) {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    // here it is post mapping and parameter is just job post
    public Post addPost(@RequestBody Post  post){

       return repo.save(post);
    }

}
