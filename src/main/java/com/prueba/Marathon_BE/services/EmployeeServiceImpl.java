package com.prueba.Marathon_BE.services;

import com.prueba.Marathon_BE.models.Employee;
import com.prueba.Marathon_BE.repository.EmployeeRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> listar() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee listarId(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee add(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee edit(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee delete(int id) {
        Employee employee = employeeRepository.findById(id);
        if (employee != null) {
            employeeRepository.delete(employee);
        }
        return employee;
    }
}
