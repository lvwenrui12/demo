package com.example.ormTest.servcie;


import com.example.ormTest.entity.Employee;
import com.example.ormTest.repositoryInterface.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
 
@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public List<Map<String, Object>> findAllEmployee() {
        return employeeRepository.findAllEmployee();
    }
}