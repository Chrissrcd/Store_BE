
package com.prueba.Marathon_BE.repository;

import com.prueba.Marathon_BE.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    // Encontrar un departamento por su id
    Department findById(int id);
}