package com.example.feignclientdemo.interfaces;

import com.example.feignclientdemo.models.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.cloud.openfeign.FeignClient(name = "feignClient", url = "${feign.url}")
public interface FeignClient {

    @GetMapping("/posts/{id}")
    Post getPostById(@PathVariable("id") int id);
}
