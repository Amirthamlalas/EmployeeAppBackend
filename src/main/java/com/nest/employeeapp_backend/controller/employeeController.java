package com.nest.employeeapp_backend.controller;

import com.nest.employeeapp_backend.dao.EmployeeDao;
import com.nest.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class employeeController {
    @Autowired
    private EmployeeDao dao;

    @GetMapping("/")
        public String HomePage(){
            return "welocome to employee app";
        }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
        public  String AddEmployee(@RequestBody Employee e){
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getCompanyName().toString());
        dao.save(e);
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
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee>view(){
        return (List<Employee>) dao.findAll();
    }
    @PostMapping("/Delete")
    public  String DeletePage(){
        return "This is Delete page";
    }
}
