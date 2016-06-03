package com.example.jpa.Service;

import com.example.jpa.Entity.User;
import com.example.jpa.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by tanglemo on 16/6/3.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EntityManager entityManager;

    public User findOne(Integer id){
        return userRepository.findOne(id);
    }

    public User findByName(String username){
        String sql = "select u from User u where username = :username";
        Query query = entityManager.createQuery(sql);
        query = query.setParameter("username", username);
        List<User> list  = (List<User>) query.getResultList();

        return list.get(0);
    }
}
