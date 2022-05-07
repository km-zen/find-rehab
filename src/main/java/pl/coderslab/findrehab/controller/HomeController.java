package pl.coderslab.findrehab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.findrehab.entity.Filia;
import pl.coderslab.findrehab.service.FiliaService;




@Controller
public class HomeController {


    @GetMapping(path = "/home")
    public String showHomePage(){
        return "home";
    }





}
