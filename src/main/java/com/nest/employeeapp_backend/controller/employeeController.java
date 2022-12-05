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

}
