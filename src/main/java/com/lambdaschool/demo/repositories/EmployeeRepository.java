package com.lambdaschool.demo.repositories;

import com.lambdaschool.demo.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>
{

}
