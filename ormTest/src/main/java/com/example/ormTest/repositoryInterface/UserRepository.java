package com.example.ormTest.repositoryInterface;

import com.example.ormTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByName(String name);
}