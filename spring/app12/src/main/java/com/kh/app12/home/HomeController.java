package com.kh.app12.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        System.out.println("homeController.home");
        return "home";
    }

    @GetMapping("/err")
    public String err(){
        return "errorPage";
    }
}
