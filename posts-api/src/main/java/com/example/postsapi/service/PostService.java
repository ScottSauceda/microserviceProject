package com.example.postsapi.service;

import com.example.postsapi.model.Post;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public interface PostService {

    public Iterable<Post> getAll();

    public Post searchById(long id);

    public Iterable<Post> searchByText(String text);

    public HttpStatus createPost(Post Post, long userId, String userName);

//    public List<Post> searchByLength(int min, int max);
//
//    public List<Post> searchByContent(String content);

    public HttpStatus deletePost(long id);


    public HttpStatus updatePost(long id, Post PostRequest);

    List<Post> listPostByUser(long userId);
}