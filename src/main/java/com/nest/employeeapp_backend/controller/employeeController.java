package com.nest.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

    @GetMapping("/")
        public String HomePage(){
            return "welocome to employee app";
        }


    @PostMapping("/add")
        public  String AddPage(){
        return  "This is add employee page";
    }

    @PostMapping("/search")
        public  String SerachPage(){
        return "This is search page";
    }
    @PostMapping("/edit")
    public  String EditPage(){
        return "This is Edit page";
    }
    @GetMapping("/view")
    public  String ViewPage(){
        return "This is View page";
    }
    @PostMapping("/Delete")
    public  String DeletePage(){
        return "This is Delete page";
    }
}
