package com.example.postsapi.controller;

import com.example.postsapi.model.Post;
import com.example.postsapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {

    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public Iterable<Post> getAll() {
        return postService.getAll();
    }

    @PostMapping("/create")
    public HttpStatus createPost(@RequestBody Post Post, @RequestHeader("userid") long userId, @RequestHeader("userName") String userName) {
        return postService.createPost(Post, userId, userName);
    }

    @GetMapping("/view/{id}")
    public Post searchById(@PathVariable long id) {
        return postService.searchById(id);
    }

    @GetMapping("/view/user")
    public List<Post> listPostByUser(@RequestHeader("userid") long userId) {
        return postService.listPostByUser(userId);
    }

    @PatchMapping("/update/{id}")
    public HttpStatus updatePost(@PathVariable long id, @RequestBody Post postRequest) {
        return postService.updatePost(id, postRequest);
    }

    @DeleteMapping("/delete/{id}")
    public HttpStatus deletePost(@PathVariable long id) {
        return postService.deletePost(id);
    }

}