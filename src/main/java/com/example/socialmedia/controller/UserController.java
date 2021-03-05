package com.example.socialmedia.controller;

import com.example.socialmedia.model.User;
import com.example.socialmedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
// get home page
    @GetMapping(value = "/")
    public String gethomepage()
    {
        return "/view/user";
    }

    @GetMapping(value = "/register")
    public String register(@ModelAttribute User user, RedirectAttributes redirectAttributes, Model model)
    {
        return "/view/Register";
    }
// post user
    @PostMapping(value = "/form")
    public String getformdata(@ModelAttribute User user, RedirectAttributes redirectAttributes, Model model)
    {
        User userdb= userService.save(user);

        model.addAttribute("myformdata",user);

        return "redirect:/";
    }
    // get all the users(list)
    @GetMapping(value = "/userdata")
    public String showdata(@ModelAttribute User user,Model model)
    {
        List<User> allusers= userService.getallusers();

        System.out.println(allusers);
        model.addAttribute("myformdata",allusers);

        return "/view/userdata";
    }
    // delete user
    @GetMapping(value = "/delete/{myid}")
    public String deleteuser(@PathVariable("myid") Integer id)
    {
        userService.delete(id);
        return "redirect:/userdata";

    }
    // get profile page
    @GetMapping(value = "/profileview/{id}")
    public String profile_view(@PathVariable("id") Integer id)
    {
        System.out.println(id+"and");

        return "/view/profile1";

    }
    //update the existing user
    @GetMapping(value = "/update/{myid}")
    public String updateuser(@PathVariable("myid") Integer id)
    {
        userService.update(id);
        return "redirect:/userdata";
    }

}
