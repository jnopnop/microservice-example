package org.nop.ms.employee.repository;


import org.nop.ms.employee.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
