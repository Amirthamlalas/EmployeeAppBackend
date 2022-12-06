package com.nest.employeeapp_backend.dao;

import com.nest.employeeapp_backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
