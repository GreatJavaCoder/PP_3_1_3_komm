package ru.komm.pp_3_1_3_komm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.komm.pp_3_1_3_komm.model.User;
import ru.komm.pp_3_1_3_komm.repository.RoleRepository;
import ru.komm.pp_3_1_3_komm.service.RoleService;
import ru.komm.pp_3_1_3_komm.service.UserService;

import java.security.Principal;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) { this.userService = userService; }

    @GetMapping("/user")
    public String showUserPage(Model model, Principal principal) {
        model.addAttribute("name", principal.getName());
        return "userpage";
    }

}
