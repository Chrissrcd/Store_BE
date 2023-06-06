package com.prueba.Marathon_BE.services;

import com.prueba.Marathon_BE.models.Department;
import com.prueba.Marathon_BE.repository.DepartmentRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> listar() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public Department listarId(int id) {
        return departmentRepository.findById(id);
    }

    @Override
    public Department add(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department edit(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department delete(int id) {
        Department department = departmentRepository.findById(id);
        if (department != null) {
            departmentRepository.delete(department);
        }
        return department;
    }
}
