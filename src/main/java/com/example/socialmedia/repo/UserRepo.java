package com.example.socialmedia.repo;

import com.example.socialmedia.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {



}
