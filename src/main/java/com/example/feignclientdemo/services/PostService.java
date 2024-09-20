package com.example.feignclientdemo.services;

import com.example.feignclientdemo.interfaces.FeignClient;
import com.example.feignclientdemo.models.Post;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PostService {

    private final FeignClient feignClient;

    public PostService(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    public Post getPosts(int id){
        Post post = feignClient.getPostById(id);
        if(Objects.nonNull(post)){
            return post;
        }
        throw new RuntimeException("Post not found");
    }
}
