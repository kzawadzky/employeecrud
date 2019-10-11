package com.kz.employeecrud.REST;

import com.kz.employeecrud.DAO.EmployeeDAO;
import com.kz.employeecrud.entity.Employee;
import com.kz.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestControler {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestControler (EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }


}
