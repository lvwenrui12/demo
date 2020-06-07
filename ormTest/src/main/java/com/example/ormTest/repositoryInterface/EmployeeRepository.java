package com.example.ormTest.repositoryInterface;

import com.example.ormTest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 
import java.util.List;
import java.util.Map;
 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee> {

    @Query(value = "SELECT e.name,e.age,d.name AS department FROM employee e LEFT JOIN department d on e.dept_id=d.id ", nativeQuery = true)
    List<Map<String, Object>> findAllEmployee();
}