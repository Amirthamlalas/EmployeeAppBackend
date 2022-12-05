package com.nest.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

    @GetMapping("/")
        public String HomePage(){
            return "welocome to employee app";
        }


    @GetMapping("/add")
        public  String AddPage(){
        return  "This is add employee page";
    }

    @GetMapping("/search")
        public  String SerachPage(){
        return "This is search page";
    }
    @GetMapping("/edit")
    public  String EditPage(){
        return "This is Edit page";
    }
    @GetMapping("/view")
    public  String ViewPage(){
        return "This is View page";
    }
}
