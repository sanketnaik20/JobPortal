package com.telusko.spring_boot_rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.spring_boot_rest.model.User;
import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
