package com.kz.employeecrud.DAO;

import com.kz.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll ();

    public Employee findById (int theId);

    public void save (Employee theEmployee);

    public void deleteById (int theId);
}
