package com.example.usersapi.controller;

import com.example.usersapi.model.UserProfile;
import com.example.usersapi.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping("/profile")
    public HttpStatus createProfile(@RequestBody UserProfile userProfile, @RequestHeader("userName") String userName) {
        return userProfileService.createProfile(userProfile, userName);
    }

    @GetMapping("/profile")
    public UserProfile listProfileByUser(@RequestHeader("userName") String userName) {
        return userProfileService.listProfileByUser(userName);
    }

    @PatchMapping("/update/profile")
    public HttpStatus updatePost( @RequestHeader("userName") String userName, @RequestBody UserProfile userProfileRequest) {
        return userProfileService.updateProfile(userName, userProfileRequest);
    }

//    @PatchMapping("/update/profile")
//    public HttpStatus createProfile(@RequestBody UserProfile userProfile, @RequestHeader("userName") String userName) {
//        return userProfileService.createProfile(userProfile, userName);
//    }


}
