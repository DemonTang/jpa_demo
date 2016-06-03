package com.example.jpa.Repository;

import com.example.jpa.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tanglemo on 16/6/3.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
