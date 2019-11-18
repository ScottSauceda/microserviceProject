package com.example.usersapi.service;

import com.example.usersapi.model.UserProfile;
import com.example.usersapi.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public HttpStatus createProfile(UserProfile userProfile, String userName) {
        userProfile.setUsername(userName);
        userProfileRepository.save(userProfile);
        return HttpStatus.OK;
    }

    public UserProfile listProfileByUser(String userName) {
        return userProfileRepository.findByUsername(userName);
    }

    public HttpStatus updateProfile(String userName, UserProfile userProfileRequest) {
        UserProfile userProfile = userProfileRepository.findByUsername(userName);
        userProfile.setAddress(userProfileRequest.getAddress());
        userProfile.setMobile(userProfileRequest.getMobile());
        userProfile.setEmail(userProfileRequest.getEmail());
        userProfileRepository.save(userProfile);
        return HttpStatus.OK;
    }

}