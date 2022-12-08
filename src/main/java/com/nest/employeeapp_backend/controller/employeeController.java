package com.nest.employeeapp_backend.controller;

import com.nest.employeeapp_backend.dao.EmployeeDao;
import com.nest.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
        public HashMap<String, String> AddEmployee(@RequestBody Employee e){
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getCompanyName().toString());
        dao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");

        return  map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
        public List<Employee>SearchPage(@RequestBody Employee e){
        String empcode = String.valueOf(e.getEmpcode());
        System.out.println(empcode);
        return (List<Employee>) dao.SearchEmployee(e.getEmpcode());

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
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> DeletePage(@RequestBody Employee e){
        String id = String.valueOf(e.getId());
        System.out.println(id);
        dao.deleteEmployee(e.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;


    }
}
