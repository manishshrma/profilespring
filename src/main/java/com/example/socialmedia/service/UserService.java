package com.example.socialmedia.service;

import com.example.socialmedia.model.User;
import com.example.socialmedia.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService  {

    List<User> getallusers();
    User save(User user);
    void delete(Integer id);
    List<User> getallusers_sort();
    User update(Integer id);



}
