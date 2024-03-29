package com.example.postsapi.service;

import com.example.postsapi.model.Post;
import com.example.postsapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public Iterable<Post> getAll() {

        return postRepository.findAll();
    }

    @Override
    public Post searchById(long id) {

        return postRepository.findById(id).get();
    }

    @Override
    public Iterable<Post> searchByText(String text) {

        return postRepository.findByTitleContaining(text);
    }

//    @Override
//    public List<Post> searchByLength(int min, int max) {
//
//        return postRepository.findByLengthBetween(min, max);
//    }
//
//    @Override
//    public List<Post> searchByContent(String content) {
//
//        return postRepository.findByContentContaining(content);
//    }

    @Override
    public HttpStatus deletePost(long id) {
        postRepository.deleteById(id);
        return HttpStatus.OK;
    }

    @Override
    public HttpStatus createPost(Post post, long userId, String userName) {
        post.setUserId(userId);
        post.setUsername(userName);
        postRepository.save(post);
        return HttpStatus.OK;
    }

    @Override
    public HttpStatus updatePost(long id, Post PostRequest) {
        Post Post = postRepository.findById(id).get();
        Post.setTitle(PostRequest.getTitle());
        Post.setDescription(PostRequest.getDescription());
//        Post.setLength(PostRequest.getLength());
//        Post.setContent(PostRequest.getContent());
        postRepository.save(Post);
        return HttpStatus.OK;
    }

    @Override
    public List<Post> listPostByUser(long userId) {
        return postRepository.findByUserId(userId);
    }
}