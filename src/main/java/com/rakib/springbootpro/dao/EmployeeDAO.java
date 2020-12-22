package com.rakib.springbootpro.dao;

import com.rakib.springbootpro.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
}
