package com.ssu.wonki.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssu.wonki.model.User;
import com.ssu.wonki.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

//    Optional<User> findByEmail(String email);
    Optional<UserDetails> findByUserId(int userId);
}