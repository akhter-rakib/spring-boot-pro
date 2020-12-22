package com.rakib.springbootpro.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.rakib.springbootpro.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        Session session = entityManager.unwrap(Session.class);
        Query<Employee> employeeQuery = session.createQuery("from Employee", Employee.class);
        List<Employee> employeeList = employeeQuery.getResultList();
        return employeeList;

    }
}
