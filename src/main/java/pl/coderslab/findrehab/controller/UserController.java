package pl.coderslab.findrehab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.findrehab.entity.User;
import pl.coderslab.findrehab.service.UserService;


@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/register")
    public String userRegisterForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
    return "register";
}
    @PostMapping(path ="/register")
    public String addNewUser(User user){
        userService.save(user);
        return "redirect:/home";

    }



}
