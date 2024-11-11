package org.example.firstdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/home")                                //http://localhost:8080/home?color=blue&name=Jane
    public String home(
        @RequestParam (required = false)String name,
        @RequestParam (required = false)String color, Model page){
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }
}
