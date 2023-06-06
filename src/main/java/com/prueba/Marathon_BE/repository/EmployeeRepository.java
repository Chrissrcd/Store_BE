
package com.prueba.Marathon_BE.repository;

import com.prueba.Marathon_BE.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Encontrar un empleado por su id
    Employee findById(int id);
}
