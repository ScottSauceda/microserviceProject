package com.example.commentsapi.service;

import com.example.commentsapi.model.Comment;
import com.example.commentsapi.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Iterable<Comment> getAll() {

        return commentRepository.findAll();
    }

    @Override
    public Comment searchById(long id) {

        return commentRepository.findById(id).get();
    }

    @Override
    public Iterable<Comment> searchByText(String text) {

        return commentRepository.findByTextContaining(text);
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
    public HttpStatus deleteComment(long id) {
        commentRepository.deleteById(id);
        return HttpStatus.OK;
    }


//    @Override
////    public HttpStatus createPost(Post post, long userId) {
////        post.setUserId(userId);
////        postRepository.save(post);
////        return HttpStatus.OK;
////    }

    @Override
    public HttpStatus createComment(Comment comment, long userId, String userName, long postId) {
        comment.setUserId(userId);
        comment.setUsername(userName);
        comment.setPostId(postId);
        commentRepository.save(comment);
        return HttpStatus.OK;
    }

    @Override
    public HttpStatus updateComment(long id, Comment CommentRequest) {
        Comment Comment = commentRepository.findById(id).get();
        Comment.setText(CommentRequest.getText());
//        Post.setTitle(PostRequest.getTitle());
//        Post.setLength(PostRequest.getLength());
//        Post.setContent(PostRequest.getContent());
        commentRepository.save(Comment);
        return HttpStatus.OK;
    }

    @Override
    public List<Comment> listCommentsByUser(long userId) {
        return commentRepository.findByUserId(userId);
    }

    @Override
    public List<Comment> listCommentsByPost(long postId) {
        return commentRepository.findByPostId(postId);
    }
}