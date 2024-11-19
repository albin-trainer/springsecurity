package com.cg.secure.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import com.cg.secure.model.User;
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}