package org.nop.ms.employee.web;

import org.nop.ms.employee.domain.Employee;
import org.nop.ms.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee get(@PathVariable String id) {
        return employeeRepository.findOne(id);
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        employeeRepository.delete(id);
    }
}
