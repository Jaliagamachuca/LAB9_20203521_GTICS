package com.example.lab9_20203521_gtics.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("")
    public String index(){
        return "index1";
    }
}
