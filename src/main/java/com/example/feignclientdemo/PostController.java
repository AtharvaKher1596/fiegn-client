package com.example.feignclientdemo;

import com.example.feignclientdemo.models.Post;
import com.example.feignclientdemo.services.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class PostController {

    private final PostService postService;
    public PostController(PostService postService) { this.postService = postService; }

    @GetMapping("/{id}/post")
    public ResponseEntity<Post> getPosts(@PathVariable("id") int id) {
        Post post = postService.getPosts(id);
        return ResponseEntity.ok(post);
    }

}
