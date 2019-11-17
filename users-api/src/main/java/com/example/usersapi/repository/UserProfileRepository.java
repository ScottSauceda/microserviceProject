package com.example.usersapi.repository;

import com.example.usersapi.model.User;
import com.example.usersapi.model.UserProfile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, Long> {

//    UserProfile findByProfileId(long profileId);

    UserProfile findByUsername(String userName);

}





//    @Query("FROM User u WHERE u.email = ?1")
//    public User login(String email);
//
//    public User findByUsername(String username);
//}