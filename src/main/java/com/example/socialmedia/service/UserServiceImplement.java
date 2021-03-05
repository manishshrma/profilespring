package com.example.socialmedia.service;

import com.example.socialmedia.model.User;
import com.example.socialmedia.repo.UserRepo;
import com.example.socialmedia.repo.User_page_and_sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    public UserRepo userRepo;
    @Autowired
    public User_page_and_sort user_page_and_sort;

    @Override
    public List<User> getallusers() {
        return (List<User>)userRepo.findAll();
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepo.deleteById(id);

    }

    @Override
    public List<User> getallusers_sort() {
        return null;
    }

    @Override
    public User update(Integer id) {
        List<User> list= (List<User>) userRepo.findAll();
        Optional<User> myuser= userRepo.findById(id);
        String mail=  myuser.get().getEmail();
        String name=  myuser.get().getEmail();

        System.out.println(mail+"////////////////////////////////////////////////////////");

        int count= (int) list.stream().filter(user->user.getEmail().equals(mail))
                .filter(user->user.getName().equals(name)).count();
        return null;
    }

    public List<User> getallusers_sort(Integer pageno, Integer pagesize,String sortby) {
        Pageable paging= (Pageable) PageRequest.of(pageno,pagesize, Sort.by(sortby));
        return (List<User>)user_page_and_sort.findAll();

    }
    /////////////////////////////////////////////////////////////////////////////


}
