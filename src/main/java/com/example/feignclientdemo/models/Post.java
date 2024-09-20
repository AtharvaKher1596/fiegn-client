package com.example.feignclientdemo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @JsonProperty("id")
    private int postId;
    private int userId;
    private String title;
    private String body;
}
