package com.prueba.Marathon_BE.controller;

import com.prueba.Marathon_BE.models.Department;
import com.prueba.Marathon_BE.services.DepartmentService;
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
@RequestMapping("/departments")
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;
    
    @GetMapping
    public List<Department> listar(){
        return departmentService.listar();
    }
    
    @PostMapping
    public Department agregar(@RequestBody Department department){
        return departmentService.add(department);
    }
    
    @GetMapping(path = {"/{id}"})
    public Department listarID(@PathVariable("id") int id) {
        return departmentService.listarId(id);
    }

    @PutMapping(path = {"/{id}"})
    public Department editar(@RequestBody Department department, @PathVariable("id") int id) {
        department.setId(id);
        return departmentService.edit(department);
    }

    @DeleteMapping(path = {"/{id}"})
    public Department delete(@PathVariable("id") int id) {
        return departmentService.delete(id);
    }
}