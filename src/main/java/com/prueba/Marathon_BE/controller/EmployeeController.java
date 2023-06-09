package com.prueba.Marathon_BE.controller;

import com.prueba.Marathon_BE.models.Employee;
import com.prueba.Marathon_BE.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> listar() {
        return employeeService.listar();
    }

    @PostMapping
    public Employee agregar(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }

    @GetMapping(path = {"/{id}"})
    public Employee listarID(@PathVariable("id") int id) {
        return employeeService.listarId(id);
    }

    @PutMapping(path = {"/{id}"})
    public Employee editar(@RequestBody Employee employee, @PathVariable("id") int id) {
        employee.setId(id);
        return employeeService.edit(employee);
    }

    @DeleteMapping(path = {"/{id}"})
    public Employee delete(@PathVariable("id") int id) {
        return employeeService.delete(id);
    }
}
