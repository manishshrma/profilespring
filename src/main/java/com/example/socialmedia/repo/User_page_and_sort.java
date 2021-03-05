package com.example.socialmedia.repo;

import com.example.socialmedia.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_page_and_sort extends PagingAndSortingRepository<User,Integer> {
}
