package com.example.usersapi.service;

    import com.example.usersapi.model.UserProfile;
    import com.example.usersapi.model.User;
    import org.springframework.http.HttpStatus;

public interface UserProfileService {

        public HttpStatus createProfile(UserProfile userProfile, String userName);

        public UserProfile listProfileByUser(String userName);

        public HttpStatus updateProfile(String userName, UserProfile userProfileRequest);


}





//    public User searchById(long id);
//
//    public User getUserByUsername(String name);
//
//    public HttpStatus deleteUser(long id);
//
//    public JwtResponse createUser(User user);
//
//    public JwtResponse login(User user);
//
//    public HttpStatus updateUser(long id, User userRequest);
//}