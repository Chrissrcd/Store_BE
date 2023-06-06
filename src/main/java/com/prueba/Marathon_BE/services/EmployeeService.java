package com.prueba.Marathon_BE.services;

import com.prueba.Marathon_BE.models.Employee;
import java.util.List;

public interface EmployeeService {
    // Obtener todos los registros de employees
    List<Employee> listar();

    // Obtener un registro de employee por su id
    Employee listarId(int id);

    // Agregar un nuevo registro de employee
    Employee add(Employee employee);

    // Editar un registro de employee existente
    Employee edit(Employee employee);

    // Eliminar un registro de employee por su id
    Employee delete(int id);
}
