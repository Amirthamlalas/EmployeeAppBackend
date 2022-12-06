package com.nest.employeeapp_backend.controller;

import com.nest.employeeapp_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

    @GetMapping("/")
        public String HomePage(){
            return "welocome to employee app";
        }


    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
        public  String AddEmployee(@RequestBody Employee e){
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getCompanyName().toString());
        return  "Employee added successfully";
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
