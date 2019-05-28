package tnSpringHibernate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tnSpringHibernate.dao.UserDao;
import tnSpringHibernate.models.User;

/**
 * TODO: realization
 */

@Controller
public class RegController {

    @Autowired
    private UserDao userDao;

    @GetMapping(value = "/registration")
    public String getLogin() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Model model) {
        userDao.save(user);

        model.addAttribute("message", "User created");

        return "redirect:/login";
    }

}
