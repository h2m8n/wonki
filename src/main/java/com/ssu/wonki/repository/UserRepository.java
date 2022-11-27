package com.ssu.wonki.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssu.wonki.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findById(int id);
}